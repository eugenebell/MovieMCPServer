# MovieMCPServer 🎬

A high-performance Model Context Protocol (MCP) server built with **Spring Boot** and **Spring AI**. This project provides a bridge between LLMs and a movie library, allowing AI agents to query, search, and retrieve movie information using standardized MCP tools.

## 🚀 Overview

`MovieMCPServer` implements the Model Context Protocol to expose a movie database as a set of tools. It leverages **Spring AI's MCP Server** capabilities to communicate via STDIO, making it compatible with MCP clients like Claude Desktop or other MCP-compliant orchestrators.

## ✨ Features

- **MCP Tool Integration**: Exposes movie library operations as executable tools for LLMs.
- **Fast Retrieval**: Powered by Spring Data JPA and an H2 in-memory database.
- **Standardized Communication**: Uses the MCP STDIO transport layer for seamless integration.
- **Search Capabilities**: Full-text keyword search for movie titles.

## 🛠️ Tech Stack

- **Language**: Java 17
- **Framework**: Spring Boot 3.4.5
- **AI Integration**: Spring AI MCP Server
- **Database**: H2 (In-Memory)
- **Persistence**: Spring Data JPA
- **Build Tool**: Maven

## 📋 Available Tools

The server exposes the following tools to the MCP client:

| Tool Name | Description | Input |
| :--- | :--- | :--- |
| `eb_get_movies` | Retrieves a complete list of all movies in the library. | None |
| `eb_get_movie_by_title` | Fetches a specific movie by its exact title. | `title` (String) |
| `eb_search_movies` | Searches for movies containing specific keywords in the title. | `query` (String) |
| `eb_get_old_movie_by_title` | Retrieves archived/old movie data (currently mocked). | `title` (String) |

## 🏁 Getting Started

### Prerequisites

- **JDK 17** or higher
- **Maven** 3.6+

### Build and Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/eugenebell/MovieMCPServer.git
   cd MovieMCPServer
   ```

2. **Build the project:**
   ```bash
   ./mvnw clean package
   ```

3. **Run the server:**
   ```bash
   java -jar target/mcp-0.0.1-SNAPSHOT.jar
   ```

## ⚙️ Configuration

To use this server with an MCP client (e.g., Claude Desktop), add the following to your `claude_desktop_config.json`:

```json
{
  "mcpServers": {
    "movie-library": {
      "command": "java",
      "args": [
        "-jar",
        "C:/Users/Eugen/Harry Workspace/git/MovieMCPServer/target/mcp-0.0.1-SNAPSHOT.jar"
      ]
    }
  }
}
```

## 📄 License

This project is licensed under the terms specified in the `LICENSE` file.

package com.eugene.mcp.repo;

import org.springframework.data.repository.*;
import com.eugene.mcp.model.Actor;

public interface ActorRepository extends Repository<Actor, Integer> {
    // Add custom queries if needed
}

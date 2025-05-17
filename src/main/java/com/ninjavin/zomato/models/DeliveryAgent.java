package com.ninjavin.zomato.models;

import com.ninjavin.zomato.enums.DeliveryAgentStatus;
import com.ninjavin.zomato.utils.IdGenerator;

public class DeliveryAgent {
    private Long agentId;
    private String name;
    private DeliveryAgentStatus status;

    public DeliveryAgent(String name) {
        this.name = name;
        this.agentId  = IdGenerator.generateId();
        this.status = DeliveryAgentStatus.AVAILABLE;
    }

    public Long getAgentId() {
        return agentId;
    }
}

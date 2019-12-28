package io.crdb.tools.hsd;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class NodeStatusWrapper {

    @JsonProperty
    private List<Node> nodes;

    public List<Node> getNodes() {
        return nodes;
    }
}

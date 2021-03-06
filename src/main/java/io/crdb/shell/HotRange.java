package io.crdb.shell;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = HotRangeDeserializer.class)
public class HotRange {

    private final int rangeId;
    private final String startKey;
    private final String endKey;
    private final float queriesPerSecond;

    public HotRange(int rangeId, String startKey, String endKey, float queriesPerSecond) {
        this.rangeId = rangeId;
        this.startKey = startKey;
        this.endKey = endKey;
        this.queriesPerSecond = queriesPerSecond;
    }

    public int getRangeId() {
        return rangeId;
    }

    public String getStartKey() {
        return startKey;
    }

    public String getEndKey() {
        return endKey;
    }

    public float getQueriesPerSecond() {
        return queriesPerSecond;
    }
}

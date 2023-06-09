package com.fable.assignment.dto;

import lombok.Data;

@Data
public class LoggerApiInput {
    Long logId;
    Long unixTs;
    Long userId;
    String eventName;

    @Override
    public String toString() {
        return new StringBuffer("{").append(" id : ").append(this.logId)
                .append(" , unixTs : ").append(this.unixTs).append(" , userId : ").append(this.userId)
                .append(" , eventName : ").append(this.eventName).append("}").toString();
    }
}

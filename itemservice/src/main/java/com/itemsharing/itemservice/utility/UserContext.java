package com.itemsharing.itemservice.utility;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class UserContext {
    public static final String CORRELATION_ID="is-correlation-id";
    public static final String AUTH_TOKEN="Authorization";
    public static final String USER_ID="is-user-id";

    private String correlationId=new String();
    private String authToken=new String();
    private String userId=new String();
}

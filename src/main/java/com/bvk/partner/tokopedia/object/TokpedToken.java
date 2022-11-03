package com.bvk.partner.tokopedia.object;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class TokpedToken {

	@JsonProperty("access_token") 
	public String accessToken;
	
	@JsonProperty("event_code") 
    public String eventCode;
	
	@JsonProperty("expires_in")
    public Integer expiresIn;
	
	@JsonProperty("last_login_type")
    public String lastLoginType;
	
	@JsonProperty("sq_check")
    public Boolean sqCheck;
	
	@JsonProperty("token_type")
    public String tokenType;
	
}

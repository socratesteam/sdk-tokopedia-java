package com.bvk.partner.tokopedia.object;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class TokpedResponse<T> {
	
	@Setter @Getter
	public static class Header {

		@JsonProperty("process_time")
		private BigDecimal processTime;	
		
		private String messages;
		
		private String reason;	
		
		@JsonProperty("error_code")
		private String errorCode;
		
		public Header() {
			this(null, null);
		}
		
		public Header(String errorCode, String reason) {
			this.errorCode = errorCode;
			this.reason = reason;
		}
		
	}
	
	private Header header;	
	private T data;	
	private byte[] body;
	
}

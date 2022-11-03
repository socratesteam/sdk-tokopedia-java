package com.bvk.partner.tokopedia.object;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import okhttp3.RequestBody;

@Getter
public class TokpedRequest {
	
	public enum Method {
		GET 	(false),
		POST	(true),
		PUT		(true),
		PATCH	(true),
		DELETE	(false),
		;
		private final boolean mandatoryBody;
		Method(boolean mandatoryBody) {
			this.mandatoryBody = mandatoryBody;
		}
		public boolean isMandatoryBody() {
			return mandatoryBody;
		}
	}

	private String path;
	private Method method;
	private Map<String, String> headers;
	private RequestBody body;
	
	private Boolean onlyResponseBody; // Flag untuk ambil hanya response body / html
	
	private TokpedRequest() {}
	
	public TokpedRequest path(String path) {
		this.path = path;
		return this;
	}
	
	public TokpedRequest method(Method method) {
		this.method = method;
		return this;
	}
	
	public TokpedRequest header(String name, String value) {
		if (this.headers == null) {
			this.headers = new HashMap<String, String>();
		}
		this.headers.put(name, value);
		return this;
	}
	
	public TokpedRequest body(RequestBody body) {
		this.body = body;
		return this;
	}
	
	public TokpedRequest onlyResponseBody(Boolean onlyResponseBody) {
		this.onlyResponseBody = onlyResponseBody;
		return this;
	}
	
	public static TokpedRequest create() {
		return new TokpedRequest();
	}
	
}

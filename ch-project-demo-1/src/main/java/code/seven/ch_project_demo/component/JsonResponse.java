package code.seven.ch_project_demo.component;

public class JsonResponse<T> {

	Integer code;

	String message;
	
	T data;
	
	public enum Message {
		SUCCESS("success"), FAIL("fail");
		private final String value;

		private Message(final String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return value;
		}
	}

	public JsonResponse() {
	}

	public JsonResponse(Integer code) {
		this.code = code;
	}
	
	public JsonResponse(T data){
		this.data = data;
	}

	public JsonResponse(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public JsonResponse(Integer code, T data) {
		this.code = code;
		this.data = data;
	}

	public JsonResponse(Integer code, String message, T data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

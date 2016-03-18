package geek.nekad.barcodescanner.app;

public class AppConfig {
	public static String URL_LOCAL = "http://192.168.43.238:9080/";
	public static String URL_PUBLIC = "http://119.110.72.19:9080/";
	public static String URL_LOCAL2 = "http://192.29.92.113:9080/";

	// Server user login url
	public static String URL_LOGIN_AUTH = URL_PUBLIC + "com.core.pundi.service.rest-1.0.0/rest/pundi/login";

	// Server user register url
	public static String URL_REGISTER = URL_PUBLIC + "com.core.pundi.service.rest-1.0.0/rest/pundi/registration";

	// Server validate polis url
	public static String URL_VALIDATEPOLIS_AUTH = URL_PUBLIC + "com.core.pundi.service.rest-1.0.0/rest/pundi/update/redeempoint";

	// Server surprise box url
	public static String URL_VALIDATE_SURPRISE_BOX_AUTH = URL_PUBLIC + "com.core.pundi.service.rest-1.0.0/rest/pundi/update/point";

	// Server check point url
	public static String URL_CHECKPOINT_AUTH = URL_PUBLIC + "com.core.pundi.service.rest-1.0.0/rest/pundi/getpoint";

	public static String URL_RESET_PASS = URL_PUBLIC + "com.core.pundi.service.rest-1.0.0/rest/pundi/resetpasswordbyotp";

	public static String URL_GET_OTP = URL_PUBLIC + "com.core.pundi.service.rest-1.0.0/rest/pundi/getotp";
}

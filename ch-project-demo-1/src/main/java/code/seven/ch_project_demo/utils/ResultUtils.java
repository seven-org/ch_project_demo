package code.seven.ch_project_demo.utils;

public class ResultUtils {
	public static final String data = "data";
	public static final String code = "code";
	public static final String msg = "message";
	
	public static final Integer AUTHORIZATION_FAIL = 401;
	public static final String AUTHORIZATION_FAIL_MSG = "登录已过期，请重新登录";
	
	public static final Integer success = 200;
	public static final String successMsg = "成功";
	
	public static final Integer fail = 201;
	public static final String failMsg = "失败";
	
	public static final Integer noSupportBank = 499;
	public static final String noSupportBankMsg = "不支持的银行";
	
	public static final Integer confirmBank = 497;
	public static final String confirmBankMsg = "请填写正确银行卡信息"; 
	
	public static final Integer userLoginExist = 21;
	public static final String userLoginExistMsg = "配送端用户已存在"; 
	
	public static final Integer noRegisterExist = 22;
	public static final String noRegisterExistMsg = "登录信息已过期"; 
	
	public static final Integer userpwd = 23;
	public static final String userpwdMsg = "密码不对";
	
	public static final Integer SHIPPINGACCOUNTLOCKED = 25;
	public static final String SHIPPINGACCOUNTLOCKEDMSG = "配送账户被禁用,请联系管理员"; 
	
	public static final Integer SHIPPINGACCOUNTNOTEXIST = 26;
	public static final String SHIPPINGACCOUNTNOTEXISTMSG = "配送人员不存在"; 
	
	public static final Integer SHIPPINGASSETSOPERATIONFAIL = 27;
	public static final String SHIPPINGASSETSOPERATIONFAILMSG = "资产操作失败,请重试"; 
	
	public static final Integer TASKFINISHEDOREXCEPTION = 28;
	public static final String TASKFINISHEDOREXCEPTIONMSG = "任务不存在或已结束"; 
	
	public static final Integer BANKCARDALREADYEXISTS = 29;
	public static final String BANKCARDALREADYEXISTSMSG = "卡号已存在"; 
	
	public static final Integer BALANCENOTENOUGH = 30;
	public static final String BALANCENOTENOUGHMSG = "余额不足"; 
	
	public static final Integer VALIDATIONCODEVALIDATEFAIL = 31;
	public static final String VALIDATIONCODEVALIDATEFAILMSG = "验证失败"; 
	
	public static final Integer BANKCARDNOTEXISTS = 32;
	public static final String BANKCARDNOTEXISTSMSG = "银行卡不存在"; 
	
	public static final Integer SHIPPINGACCOUNTAUDITING = 33;
	public static final String SHIPPINGACCOUNTAUDITINGMSG = "配送账户在审核中"; 
	
	public static final String SHIPPING_LONGTITUDE_NOT_EMPTYMSG = "配送人员位置不为空";
	
	public static final Integer ORDERNOTEXISTSORNOTAVALIABLE = 77;
	public static final String ORDERNOTEXISTSORNOTAVALIABLEMSG = "订单不存在或不可用";
	
	public static final Integer ORDERFINISHEDOREXCEPTION = 78;
	public static final String ORDERFINISHEDOREXCEPTIONMSG = "订单结束或异常";
	
	public static final Integer unOneMinute = 490;
	public static final String unOneMinuteMsg = "不足一分钟";
	
	public static final Integer unFiveMinute = 492;
	public static final String unFiveMinuteMsg = "超过5分钟";
	
	public static final Integer PASSWORDNOTEQUAL = 13;
	public static final String PASSWORDNOTEQUALMSG = "两次输入密码不匹配";
	
	public static final Integer NO_VERIFYCODE_AVALIABLE = 110;
	public static final String NO_VERIFYCODE_AVALIABLE_MSG = "请先获取验证码";
	
	public static final Integer VERIFYCODE_TIME_OUT = 111;
	public static final String VERIFYCODE_TIME_OUT_MSG = "验证码已过期,请重新获取";
	
	public static final Integer VERIFYCODE_FAIL = 112;
	public static final String VERIFYCODE_FAIL_MSG = "验证码错误";
	
	public static final String BAD_REQUEST_TO_OBSERVER = "操作失败，请重试";
	public static final String ERROR_CONNECT_TO_OBSERVER = "未知错误，请稍后再试";
	
	/*
	 * 请求外部资源失败, 可能为服务器网络问题, 需要重试
	 */
	public static final Integer REQUEST_FAIL_TRY_AGAIN_LATER = 12;
	public static final String REQUEST_FAIL_TRY_AGAIN_LATER_MSG = "请求失败，请稍后重试";
	
	public static final Integer REQUEST_FAIL_DATA_FORMAT_NOT_SUPPORT = 13;
	public static final String REQUEST_FAIL_DATA_FORMAT_NOT_SUPPORT_MSG = "请求失败，请联系系统管理员";
	
	public static final Integer WECHAT_GET_SIGN_FAIL = 14;
	public static final String WECHAT_GET_SIGN_FAIL_MSG = "获取sign失败,来源错误";
	
	public static final Integer WECHAT_USER_NOT_EXISTS = 15;
	public static final String WECHAT_USER_NOT_EXISTS_MSG = "微信用户不存在";
	
	public static final Integer WECHAT_USER_UNIONID_NOT_EXISTS = 16;
	public static final String WECHAT_USER_UNIONID_NOT_EXISTS_MSG = "无法获取微信unionId或openid, 操作失败";
	
	public static final Integer WECHAT_USER_ALREADY_EXISTS = 17;
	public static final String WECHAT_USER_ALREADY_EXISTS_MSG = "微信用户已存在";
	
	public static final String CLIENT_NEED_UPDATE = "客户端需要更新,请更新后使用";
	
//	public static JSONObject getResultData(Object data,Integer code,String msg){
//		JSONObject jo = new JSONObject();
//		jo.put(ResultUtils.data, data);
//		jo.put(ResultUtils.code, code);
//		jo.put(ResultUtils.msg, msg);
//		return jo;
//	}
}

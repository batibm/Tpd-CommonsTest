package com.ibm.tpd.primarydb.exception;

public class PrimaryDBException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
		private String errCode;
	private String errMsg;
	
	public PrimaryDBException(String errMsg) {
		super(errMsg);
	}
	
	public PrimaryDBException(String errCode, String errMsg) {
		super(errMsg);
		this.errCode = errCode;
		this.errMsg = errMsg;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
	

}

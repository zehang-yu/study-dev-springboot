package com.scut.demo.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 是一个用于封装返回结果的类，统一规定了返回结果的格式
 */
public class Result {

	private Boolean success;

	private Integer code;

	private String message;

	private Map<String, Object> data = new HashMap<String, Object>();

	private Result(){}

	public static Result ok(){
		Result r = new Result();
		r.setSuccess(true);
		r.setCode(ResultCodeEnum.SUCCESS.getCode());
		r.setMessage(ResultCodeEnum.SUCCESS.getMsg());
		return r;
	}

	public static Result error(){
		Result r = new Result();
		r.setSuccess(false);
		r.setCode(ResultCodeEnum.ERROR.getCode());
		r.setMessage(ResultCodeEnum.ERROR.getMsg());
		return r;
	}

	public Result success(Boolean success){
		this.setSuccess(success);
		return this;
	}
	public Result message(String message){
		this.setMessage(message);
		return this;
	}
	public Result code(Integer code){
		this.setCode(code);
		return this;
	}

	public Result put(String key, Object value){
		this.data.put(key, value);
		return this;
	}
	public Result put(Map<String, Object> map){
		this.setData(map);
		return this;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}
}
package com.yfc.hotel.manage.global;

/**
 * <p>description:统一结果封装,code用来封装状态码，msg用来封装消息，data用来封装数据</p>
 *
 * @author yfc
 * @see #success(),#success(Object),#error(int, String)
 * @since 1.0.0
 */
public class ResultBean<T> {
    private int code;
    private String msg;
    private T data;

    public ResultBean() {
    }

    /**
     * 使用code和msg用来构造结果
     * @param code 状态码
     * @param msg 消息
     */
    public ResultBean(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 请求成功，不带数据
     * @return 结果对象
     */
    public static ResultBean success(){return new ResultBean();}
    public int getCode() {
        return code;
    }

    /**
     * 请求成功，返回数据
     * @param data 从数据库中或处理后获取的数据
     * @param <V> 泛型数据
     * @return 结果对象
     */
    public static <V> ResultBean<V> success(V data){
        ResultBean<V> resultBean = new ResultBean<>();
        resultBean.setData(data);
        return resultBean;
    }

    /**
     * 出现异常时返回结果
     * @param code 出错状态码
     * @param msg 出错消息
     * @return 结果对象
     */
    public static ResultBean error(int code,String msg){
        return new ResultBean(code,msg);
    }
    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

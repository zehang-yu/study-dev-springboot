package com.scut.demo.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 吾托帮调用工具类
 */
public class BandCore {

    private final static Logger log = LoggerFactory.getLogger(BandCore.class);

    public static String userName = "qq1020224260";
    public static String passWord = "qq1020224260";

    public static String getAccessToken() throws Exception {
        String accessToken = null;
        String getAccessTokenUrl =
            "https://www.wetoband.com/core//core/v4/authc/user?aid=21419389378723787447&format=json&gid=1";
        String param = "name=" + userName + "&password=" + passWord;
        HttpURLConnection connection = null;
        InputStream is = null;
        OutputStream os = null;
        BufferedReader br = null;
        String result = null;
        try {
            URL url = new URL(getAccessTokenUrl);
            // 通过远程url连接对象打开连接
            connection = (HttpURLConnection)url.openConnection();
            // 设置连接请求方式
            connection.setRequestMethod("POST");
            // 设置连接主机服务器超时时间：15000毫秒
            connection.setConnectTimeout(15000);
            // 设置读取主机服务器返回数据超时时间：60000毫秒
            connection.setReadTimeout(60000);
            // 默认值为：false，当向远程服务器传送数据/写数据时，需要设置为true
            connection.setDoOutput(true);
            // 默认值为：true，当前向远程服务读取数据时，设置为true，该参数可有可无
            connection.setDoInput(true);
            // 设置传入参数的格式:请求参数应该是 name1=value1&name2=value2 的形式。
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            // 设置鉴权信息：Authorization: Bearer da3efcbf-0845-4fe3-8aba-ee040be542c0
            connection.setRequestProperty("Authorization", "Bearer da3efcbf-0845-4fe3-8aba-ee040be542c0");
            // 通过连接对象获取一个输出流
            os = connection.getOutputStream();
            // 通过输出流对象将参数写出去/传输出去,它是通过字节数组写出的
            os.write(param.getBytes());
            // 通过连接对象获取一个输入流，向远程读取
            if (connection.getResponseCode() == 200) {
                is = connection.getInputStream();
                Map headers = connection.getHeaderFields();
                Set<String> keys = headers.keySet();
                if (keys.contains("Set-Cookie")) {
                    String val = connection.getHeaderField("Set-Cookie");
                    String[] s1 = val.split("=");

                    String[] s2 = s1[1].split(";");
                    accessToken = s2[0];

                }
                // 对输入流对象进行包装:charset根据工作项目组的要求来设置
                br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                StringBuffer sbf = new StringBuffer();
                String temp = null;
                // 循环遍历一行一行读取数据
                while ((temp = br.readLine()) != null) {
                    sbf.append(temp);
                    sbf.append("\r\n");
                }
                result = sbf.toString();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != os) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            // 断开与远程地址url的连接
            connection.disconnect();
        }
        return accessToken;
    }

    public static String getAccessToken(String userName, String passWord) throws Exception {
        String accessToken = null;
        String getAccessTokenUrl =
            "https://www.wetoband.com/core//core/v4/authc/user?aid=21419389378723787447&format=json&gid=1";
        String param = "name=" + userName + "&password=" + passWord;
        HttpURLConnection connection = null;
        InputStream is = null;
        OutputStream os = null;
        BufferedReader br = null;
        String result = null;
        try {
            URL url = new URL(getAccessTokenUrl);
            // 通过远程url连接对象打开连接
            connection = (HttpURLConnection)url.openConnection();
            // 设置连接请求方式
            connection.setRequestMethod("POST");
            // 设置连接主机服务器超时时间：15000毫秒
            connection.setConnectTimeout(15000);
            // 设置读取主机服务器返回数据超时时间：60000毫秒
            connection.setReadTimeout(60000);
            // 默认值为：false，当向远程服务器传送数据/写数据时，需要设置为true
            connection.setDoOutput(true);
            // 默认值为：true，当前向远程服务读取数据时，设置为true，该参数可有可无
            connection.setDoInput(true);
            // 设置传入参数的格式:请求参数应该是 name1=value1&name2=value2 的形式。
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            // 设置鉴权信息：Authorization: Bearer da3efcbf-0845-4fe3-8aba-ee040be542c0
            connection.setRequestProperty("Authorization", "Bearer da3efcbf-0845-4fe3-8aba-ee040be542c0");
            // 通过连接对象获取一个输出流
            os = connection.getOutputStream();
            // 通过输出流对象将参数写出去/传输出去,它是通过字节数组写出的
            os.write(param.getBytes());
            // 通过连接对象获取一个输入流，向远程读取
            if (connection.getResponseCode() == 200) {
                is = connection.getInputStream();
                Map headers = connection.getHeaderFields();
                Set<String> keys = headers.keySet();

                if (keys.contains("Set-Cookie")) {
                    String val = connection.getHeaderField("Set-Cookie");
                    String[] s1 = val.split("=");

                    String[] s2 = s1[1].split(";");
                    accessToken = s2[0];

                }
                // 对输入流对象进行包装:charset根据工作项目组的要求来设置
                br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                StringBuffer sbf = new StringBuffer();
                String temp = null;
                // 循环遍历一行一行读取数据
                while ((temp = br.readLine()) != null) {
                    sbf.append(temp);
                    sbf.append("\r\n");
                }
                result = sbf.toString();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != os) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            // 断开与远程地址url的连接
            connection.disconnect();
        }
        return accessToken;
    }

    public static String doGetWithAccessToken(String httpurl, String accessToken) {
        HttpURLConnection connection = null;
        InputStream is = null;
        BufferedReader br = null;
        String result = null;// 返回结果字符串
        try {
            // 创建远程url连接对象
            URL url = new URL(httpurl);
            // 通过远程url连接对象打开一个连接，强转成httpURLConnection类
            connection = (HttpURLConnection)url.openConnection();
            connection.setRequestProperty("Cookie", "access_token=" + accessToken);
            // 设置连接方式：get
            connection.setRequestMethod("GET");
            // 设置连接主机服务器的超时时间：15000毫秒
            connection.setConnectTimeout(15000);
            // 设置读取远程返回的数据时间：60000毫秒
            connection.setReadTimeout(60000);
            // 发送请求
            connection.connect();

            // 通过connection连接，获取输入流
            if (connection.getResponseCode() == 200) {
                is = connection.getInputStream();
                // 封装输入流is，并指定字符集
                br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                // 存放数据
                StringBuffer sbf = new StringBuffer();
                String temp = null;
                while ((temp = br.readLine()) != null) {
                    sbf.append(temp);
                    sbf.append("\r\n");
                }
                result = sbf.toString();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            connection.disconnect();// 关闭远程连接
        }

        return result;
    }

    public static String doPostWithAccessToken(String httpurl, String accessToken, Map<String, String> param) {

        String paramString = "";
        // "name=" + userName + "&password=" + passWord;
        for (Map.Entry<String, String> e : param.entrySet()) {
            // System.out.println("data:"+e.getKey());
            paramString += e.getKey() + "=" + e.getValue() + "&";
        }
        HttpURLConnection connection = null;
        InputStream is = null;
        OutputStream os = null;
        BufferedReader br = null;
        String result = null;
        try {
            URL url = new URL(httpurl);
            // 通过远程url连接对象打开连接
            connection = (HttpURLConnection)url.openConnection();
            // 设置连接请求方式
            connection.setRequestMethod("POST");
            // 设置连接主机服务器超时时间：15000毫秒
            connection.setConnectTimeout(15000);
            // 设置读取主机服务器返回数据超时时间：60000毫秒
            connection.setReadTimeout(60000);
            // 默认值为：false，当向远程服务器传送数据/写数据时，需要设置为true
            connection.setDoOutput(true);
            // 默认值为：true，当前向远程服务读取数据时，设置为true，该参数可有可无
            connection.setDoInput(true);
            connection.setRequestProperty("Cookie", "access_token=" + accessToken);
            // 设置传入参数的格式:请求参数应该是 name1=value1&name2=value2 的形式。
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            // 设置鉴权信息：Authorization: Bearer da3efcbf-0845-4fe3-8aba-ee040be542c0
            connection.setRequestProperty("Authorization", "Bearer da3efcbf-0845-4fe3-8aba-ee040be542c0");
            // 通过连接对象获取一个输出流
            os = connection.getOutputStream();
            // 通过输出流对象将参数写出去/传输出去,它是通过字节数组写出的
            if (null != paramString) {
                log.info("工具请求参数： {}", paramString);
//                System.out.println("paramString:" + paramString);
                os.write(paramString.getBytes("UTF-8"));
            }

            // 通过连接对象获取一个输入流，向远程读取
            if (connection.getResponseCode() == 200) {
                is = connection.getInputStream();

                // 对输入流对象进行包装:charset根据工作项目组的要求来设置
                br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                StringBuffer sbf = new StringBuffer();
                String temp = null;
                // 循环遍历一行一行读取数据
                while ((temp = br.readLine()) != null) {
                    sbf.append(temp);
                    sbf.append("\r\n");
                }
                result = sbf.toString();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != os) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            // 断开与远程地址url的连接
            connection.disconnect();
        }
        return result;

    }

    public static String doPost(String httpUrl, Object param) {

        HttpURLConnection connection = null;

        InputStream is = null;

        OutputStream out = null;

        BufferedReader br = null;

        String result = null;

        try {

            URL url = new URL(httpUrl);

            // 通过远程url连接对象打开连接

            connection = (HttpURLConnection)url.openConnection();

            // 设置连接请求方式

            connection.setRequestMethod("POST");

            // 设置连接主机服务器超时时间：15000毫秒

            connection.setConnectTimeout(15000);

            // 设置读取主机服务器返回数据超时时间：60000毫秒

            connection.setReadTimeout(60000);

            // 默认值为：false，当向远程服务器传送数据/写数据时，需要设置为true

            connection.setDoOutput(true);

            // 默认值为：true，当前向远程服务读取数据时，设置为true，该参数可有可无

            connection.setDoInput(true);

            // 设置传入参数的格式:请求参数应该是 name1=value1&name2=value2 的形式。

            connection.setRequestProperty("Content-Type", "application/json");

            // 设置鉴权信息：Authorization: Bearer da3efcbf-0845-4fe3-8aba-ee040be542c0

            // connection.setRequestProperty("Authorization", "Bearer da3efcbf-0845-4fe3-8aba-ee040be542c0");

            // 通过连接对象获取一个输出流

            out = connection.getOutputStream();

            // 通过输出流对象将参数写出去/传输出去,它是通过字节数组写出的

            // os.write(param.getBytes());

            // JSONObject obj = new JSONObject();

            // java.net.URLEncoder.encode 编码之后会有%多余%的问题，在传输的过程中无法被解析

            // String json = java.net.URLEncoder.encode(obj.toString(), "utf-8");

            Object o = JSONObject.toJSON(param);

            Object jsonObject = JSONObject.parse(o.toString());

            out.write(jsonObject.toString().getBytes());

            // 通过连接对象获取一个输入流，向远程读取

            if (connection.getResponseCode() == 200) {

                is = connection.getInputStream();

                // 对输入流对象进行包装:charset根据工作项目组的要求来设置

                br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

                StringBuffer sbf = new StringBuffer();

                String temp = null;

                // 循环遍历一行一行读取数据

                while ((temp = br.readLine()) != null) {

                    sbf.append(temp);

                    sbf.append("\r\n");

                }

                result = sbf.toString();

            }

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            // 关闭资源

            if (null != br) {

                try {

                    br.close();

                } catch (IOException e) {

                    e.printStackTrace();

                }

            }

            if (null != out) {

                try {

                    out.close();

                } catch (IOException e) {

                    e.printStackTrace();

                }

            }

            if (null != is) {

                try {

                    is.close();

                } catch (IOException e) {

                    e.printStackTrace();

                }

            }

            // 断开与远程地址url的连接

            connection.disconnect();

        }

        return result;

    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        HashMap<String,String >map =new HashMap<>();
        map.put("deviceSerial","F95752970");
        map.put("words","中文字体");

        String s = "中文字体";
        String username = URLEncoder.encode("你好，漂砾", "UTF-8");
        doPostWithAccessToken("https://www.wetoband.com/tre//runToolWithToolShopToolID?accessToken=bc00eaaa0785e512e9370c62e66ae6a3d2e3df7f779230ca7cd0a5603729ecb7ca430933b5ddb1aa982f162da6fdec03e515f5e47c1f61d66a40be6cb6255fb9&gid=7600023726&toolID=4389331&bandID=7600023726&param=&action=playWords&url_route=playWords&returnType=value&deviceSerial=F95752970&words="+username,
                "bc00eaaa0785e512e9370c62e66ae6a3d2e3df7f779230ca7cd0a5603729ecb7ca430933b5ddb1aa982f162da6fdec03e515f5e47c1f61d66a40be6cb6255fb9",
                map);
    }

    public static Result runTool(){
        String result = null;
        try {
            String accessToken = getAccessToken();
            long bandId = 405347562l;
            long toolId = 4389293l;
            String action = "get_image_from_history";
            String urlRoute = action;
            StringBuilder url = new StringBuilder("https://www.wetoband.com/tre//runToolWithToolShopToolID?"
                            + "accessToken=" + accessToken
                            + "&gid=" + bandId
                            + "&toolID=" + toolId
                            + "&bandID=" + bandId
                            + "&param="
                            + "&action=" + action
                            + "&url_route=" + urlRoute // 同action
                            + "&returnType=value");

            Map<String, String> params = new HashMap<>();
            params.put("device_id", "1");
            for (Map.Entry<String, String> entry : params.entrySet()) {
                try {
                    url.append("&").append(entry.getKey()).append("=").append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            result = BandCore.doPostWithAccessToken(url.toString(), accessToken, params);

        } catch (Exception e) {
            log.info(ResultCodeEnum.RUN_TOOL_ERROR.getMsg());
            return Result.error().code(ResultCodeEnum.RUN_TOOL_ERROR.getCode()).message(ResultCodeEnum.RUN_TOOL_ERROR.getMsg());
        }
        return Result.ok().code(ResultCodeEnum.RUN_TOOL_SUCCESS.getCode()).message(ResultCodeEnum.RUN_TOOL_SUCCESS.getMsg()).put((Map<String, Object>) JSON.parse(result));
    }
}
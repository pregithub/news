package by.util;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class JsonHelper {

	/**
	 * 以Json方式返回获取最新的数据
	 * 
	 * @return
	 * @throws Exception
	 */
	public static String getJsonStringByUrl(String path) throws Exception {
		// 建立一个URL对象
		URL url = new URL(path);
		// 得到打开的链接对象
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		// 设置请求超时与请求方式
		conn.setReadTimeout(5 * 100000);
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-Type",
				"application/x-www-form-urlencoded");
		conn.setRequestProperty("Charset", "utf-8");
		InputStream inStream = null;
		try {
			// 从链接中获取一个输入流对象
			inStream = conn.getInputStream();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 调用数据流处理方法
		byte[] data = StreamTool.readInputStream(inStream);
		return new String(data, "UTF-8");
	}

	public static String getJsonStringByUrl(String path, String ifgzip)
			throws Exception {
		// 建立一个URL对象
		URL url = new URL(path);
		// 得到打开的链接对象
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		// 设置请求超时与请求方式
		conn.setReadTimeout(5 * 100000);
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-Type",
				"application/x-www-form-urlencoded");
		conn.setRequestProperty("Charset", "utf-8");
		InputStream inStream = null;
		try {
			// 从链接中获取一个输入流对象
			inStream = conn.getInputStream();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 调用数据流处理方法
		byte[] data = null;
		if (ifgzip.equals("true")) {
			data = StreamTool.readInputStreamGzip(inStream);
		} else {
			data = StreamTool.readInputStream(inStream);
		}
		return new String(data, "UTF-8");
	}

	public static String getJsonStringByUrlUsePost(String path, String params)
			throws Exception {
		// 建立一个URL对象
		URL url = new URL(path);
		// 得到打开的链接对象
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		// 设置请求超时与请求方式
		conn.setDoOutput(true);// 是否输入参数
		conn.setDoInput(true);
		conn.setRequestMethod("POST");// 提交模式
		conn.setUseCaches(false);// 禁用缓存
		conn.setInstanceFollowRedirects(true);
		conn.setRequestProperty("Content-Type",
				"application/x-www-form-urlencoded");
		conn.setRequestProperty("Charset", "utf-8");
		conn.connect();

		byte[] bypes = params.toString().getBytes("utf-8");
		conn.getOutputStream().write(bypes);// 输入参数
		InputStream inStream = null;
		try {
			// 从链接中获取一个输入流对象
			inStream = conn.getInputStream();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 调用数据流处理方法
		byte[] data = StreamTool.readInputStream(inStream);
		String str = new String(data, "UTF-8");
		return str;
	}

	public static void main(String[] args) {

		// String path = "http://api.3g.ifeng.com/iosNews?id=YL53&page=1";
		String p = "";
		// String p = "http://api.baiyue.baidu.com/sn/api/recommendlist";
		String pa = "";
		// String pa = "topic=社会&ln=200&ts=0&type=info&mid=222009319889063_0E:28:E1:74:2D:56";
		try {
			String json = new JsonHelper().getJsonStringByUrlUsePost(p, pa);
			// 构建JSON数组对象
			// JSONArray array = new JSONArray(json).getJSONObject(0).getJSONObject("body").getJSONArray("item");
			// System.out.println(json);
			// 从JSON数组对象读取数据
			// ////System.out.println( array.length());
			// List<JSONObject> newsJsonObjectList = new ArrayList<JSONObject>(20);
			// for (int i = 0; i < array.length(); i++) {
			// 获取各个属性的值
			// JSONObject news = (JSONObject) array.get(i);
			// //System.out.println(news.getString("title") );

			// 构造的对象加入集合当中
			// newsJsonObjectList.add(news);
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
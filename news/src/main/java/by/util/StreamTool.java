package by.util;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public class StreamTool 
{
	/**
	 * 从输入流中获取数据
	 * @param inStream 输入流
	 * @return
	 * @throws Exception
	 */
	public static byte[] readInputStream(InputStream inStream) throws Exception{
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int len = 0;
		while( (len=inStream.read(buffer)) != -1 ){
			outStream.write(buffer, 0, len);
		}
		inStream.close();
		return outStream.toByteArray();
	}
	
	public static byte[] readInputStreamGzip(InputStream inStream){
		  byte[] b = null;
		  try {
		   GZIPInputStream gzip = new GZIPInputStream(inStream);
		   byte[] buf = new byte[1024];
		   int num = -1;
		   ByteArrayOutputStream baos = new ByteArrayOutputStream();
		   while ((num = gzip.read(buf, 0, buf.length)) != -1) {
		    baos.write(buf, 0, num);
		   }
		   b = baos.toByteArray();
		   baos.flush();
		   baos.close();
		   gzip.close();
		  } catch (Exception ex) {
		   ex.printStackTrace();
		  }
		  return b;
	}
}
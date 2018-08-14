package cn.hl.util;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

public class SessionFactory {
	/**
	 * 创建一个SQLSession对象
	 * @return
	 * @throws IOException
	 */
	public static SqlSession create() throws IOException{
		//默认情况下是开启事物的，需要调用commit()方法对所执行操作进行提交
		//false	：不进行自动提交；true ：执行自动提交
		return FactoryBuilder.build().openSession(true);
	}
	
	/**
	 * 创建一个SqlSession对象
	 * @param mode	：true--开启自动提交模式；false--关闭自动提交模式
	 * @return
	 * @throws IOException
	 */
	public static SqlSession create(boolean mode) throws IOException{
		//默认情况下是开启事物的，需要调用commit()方法对所执行操作进行提交
		//false	：不进行自动提交；true ：执行自动提交
		return FactoryBuilder.build().openSession(mode);
	}
}

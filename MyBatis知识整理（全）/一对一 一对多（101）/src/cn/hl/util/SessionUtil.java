package cn.hl.util;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

/**
 * SqlSession工具类
 * @author X230
 *
 */
public class SessionUtil {
	/**
	 * 获取SqlSession
	 * SqlSession默认为自动提交方式
	 * @return
	 * @throws IOException
	 */
	public SqlSession create() throws IOException{
		return FactoryBuilder.build().openSession(true);
	}
	
	/**
	 * 获取SqlSession对象
	 * @param mode	：true--自动提交；false--手动提交
	 * @return
	 * @throws IOException
	 */
	public SqlSession create(boolean mode) throws IOException{
		return FactoryBuilder.build().openSession(mode);
	}
}

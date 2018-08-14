package cn.hl.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 获取SqlSessionFactory对象
 * @author X230
 *
 */
class FactoryBuilder {
	//存储资源文件位置
	private static String res = "conf.xml";
	
	//SqlSessionFactory对象
	private static SqlSessionFactory factory = null;
	
	/**
	 * 获取SqlSessionFactory对象
	 * @return
	 * @throws IOException 
	 */
	public static SqlSessionFactory build() throws IOException{
		if(factory == null){
			//加载资源对象
			Reader reader = Resources.getResourceAsReader(res);
			//获取SqlSessionFactory对象
			factory =new SqlSessionFactoryBuilder().build(reader);
		}
		
		return factory;
	}
	
	/**
	 * 初始化资源对象的位置
	 * @param path
	 */
	public static void initResource(String path){
		res = path;
	}
}

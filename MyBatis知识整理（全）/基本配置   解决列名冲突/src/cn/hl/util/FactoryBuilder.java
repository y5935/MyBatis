package cn.hl.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 工具类，提供用于获取SqlSessionFactory对象的方法
 * @author Terry
 *
 */
public class FactoryBuilder {
	//存储资源文件的位置
	private static String res = "conf.xml";
	
	//声明SQLSessionFactory对象
	private static SqlSessionFactory fac = null;
	
	/**
	 * 获取SqlsessionFactory对象
	 * 单例方式获取SqlSessionFactory对象
	 * @return
	 * @throws IOException 
	 */
	public static SqlSessionFactory build() throws IOException{
		//判断fac对象是否为null
		if(fac == null){
			//线程锁
			synchronized (FactoryBuilder.class) {
				//读取资源文件
				Reader reader = Resources.getResourceAsReader(res);
				//获取SqlSessionFactory对象
				fac = new SqlSessionFactoryBuilder().build(reader);
			}
		}
		
		return fac;
	}
}

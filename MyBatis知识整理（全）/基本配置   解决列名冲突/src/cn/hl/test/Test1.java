package cn.hl.test;



import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.hl.vo.ClassRoom;

public class Test1 {
	/**
	 * 执行查询功能
	 * @throws IOException 
	 */
	@Test
	public void test1() throws IOException{
		//1、加载配置文件
		Reader reader = Resources.getResourceAsReader("conf.xml");
		//2、获取SQLSessionFactory（通过SQLSessionFactory可以获取到SqlSession）
		SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(reader);
		//3、获取Session对象
		SqlSession session = fac.openSession();
		//4、执行查询功能
		List<ClassRoom> list = session.selectList("cn.hl.vo.ClassRoom.getAll");
		//5、关闭Session
		session.close();
		
		//6、处理数据
		System.out.println(list);
	}
}

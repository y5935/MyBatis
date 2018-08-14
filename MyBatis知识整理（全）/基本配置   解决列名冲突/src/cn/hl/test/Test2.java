package cn.hl.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.hl.vo.User;

public class Test2 {
	@Test
	public void test1() throws IOException{
		//1、加载配置文件
		Reader reader = Resources.getResourceAsReader("conf.xml");
		//2、获取SqlSessionFactory对象
		SqlSessionFactory fac =new SqlSessionFactoryBuilder().build(reader);
		//3、获取SqlSession对象
		SqlSession session = fac.openSession();
		
		List<User> list = session.selectList("cn.hl.vo.User.getAll");
		session.close();
		
		System.out.println(list);
		
	}
	
	@Test
	public void test2() throws IOException{
		//1、加载配置文件
		Reader reader = Resources.getResourceAsReader("conf.xml");
		//2、获取SqlSessionFactory对象
		SqlSessionFactory fac =new SqlSessionFactoryBuilder().build(reader);
		//3、获取SqlSession对象
		SqlSession session = fac.openSession();
		
		List<User> list = session.selectList("cn.hl.vo.User.getAll1");
		session.close();
		
		System.out.println(list);
		
	}
	
	@Test
	public void test3() throws IOException{
		//1、加载配置文件
		Reader reader = Resources.getResourceAsReader("conf.xml");
		//2、获取SqlSessionFactory对象
		SqlSessionFactory fac =new SqlSessionFactoryBuilder().build(reader);
		//3、获取SqlSession对象
		SqlSession session = fac.openSession();
		
		List<User> list = session.selectList("cn.hl.vo.User.getAll2");
		session.close();
		
		System.out.println(list);
		
	}
}

package cn.hl.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.hl.util.SessionFactory;
import cn.hl.vo.Users;

public class TestLevelOne {
	/**
	 * 测试一级缓存
	 * 1、同一条语句只执行一次
	 * 	以后执行从缓存直接读取数据（第二次就是直接读取）
	 */
	@Test
	public void testCache1(){
		String mapper = "cn.hl.vo.User.getById";
		//声明SqlSession对象
		SqlSession session = null;
		
		
		try {
			//获取Session对象
			session = SessionFactory.create();
			Users user1 = session.selectOne(mapper, 1);
			System.out.println(user1);
			
			System.out.println("\n==============================================\n");
			
			//Sql语句没有被发送给数据库
			Users user2 = session.selectOne(mapper, 1);
			System.out.println(user2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	
	/**
	 * 测试一级缓存
	 * 2、执行CUD操作后缓存将被清空
	 */
	@Test
	public void testCache2(){
		String mapper = "cn.hl.vo.User.getById";
		//声明SqlSession对象
		SqlSession session = null;
		
		
		try {
			//获取Session对象
			session = SessionFactory.create();
			Users user1 = session.selectOne(mapper, 1);
			System.out.println(user1);
			
			System.out.println("\n==============================================\n");
			session.update("cn.hl.vo.User.update");
			System.out.println("\n==============================================\n");
			
			//Sql语句没有被发送给数据库
			Users user2 = session.selectOne(mapper, 1);
			System.out.println(user2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	
	/**
	 * 测试一级缓存
	 * 3、不同的Session对象无法共享缓存
	 */
	@Test
	public void testCache3(){
		String mapper = "cn.hl.vo.User.getById";
		//声明SqlSession对象
		SqlSession session1 = null;
		SqlSession session2 = null;
		
		
		try {
			//获取Session对象
			session1 = SessionFactory.create();
			Users user1 = session1.selectOne(mapper, 1);
			System.out.println(user1);
			
			System.out.println("\n==============================================\n");
			
			//Sql语句没有被发送给数据库
			session2 = SessionFactory.create();
			Users user2 = session2.selectOne(mapper, 1);
			System.out.println(user2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session1.close();
			session2.close();
		}
	}
	
	/**
	 * 测试一级缓存
	 * 4、语句发生改变时缓存将失效
	 * 
	 */
	@Test
	public void testCache4(){
		String mapper = "cn.hl.vo.User.getById";
		//声明SqlSession对象
		SqlSession session = null;
		
		
		try {
			//获取Session对象
			session = SessionFactory.create();
			Users user1 = session.selectOne(mapper, 1);  
			System.out.println(user1);
			
			System.out.println("\n==============================================\n");
			
			//Sql语句没有被发送给数据库
			Users user2 = session.selectOne(mapper, 2); 
			System.out.println(user2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	
	/**
	 * 测试一级缓存
	 * 5、调用clearCache()后缓存将失效
	 * 
	 */
	@Test
	public void testCache5(){
		String mapper = "cn.hl.vo.User.getById";
		//声明SqlSession对象
		SqlSession session = null;
		
		
		try {
			//获取Session对象
			session = SessionFactory.create();
			Users user1 = session.selectOne(mapper, 1);
			System.out.println(user1);
			
			System.out.println("\n==============================================\n");
			//清除缓存
			session.clearCache();
			System.out.println("\n==============================================\n");
			
			//Sql语句没有被发送给数据库
			Users user2 = session.selectOne(mapper, 1);
			System.out.println(user2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
}

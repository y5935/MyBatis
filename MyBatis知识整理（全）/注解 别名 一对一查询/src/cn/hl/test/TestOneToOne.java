package cn.hl.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.hl.util.SessionFactory;
import cn.hl.vo.Person;

public class TestOneToOne {
	/**
	 * 执行多表连接查询：一对一方式
	 * 
	 */
	@Test
	public void getById1(){
		//声明Session对象
		SqlSession session = null;
		
		
		try {
			//获取Session对象
			session = SessionFactory.create();
			Person p = session.selectOne("cn.hl.vo.Person.getById", 2);
			
			System.out.println(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	
	/**
	 * 执行多表连接查询：一对一方式
	 * 
	 */
	@Test
	public void getById2(){
		//声明Session对象
		SqlSession session = null;
		
		
		try {
			//获取Session对象
			session = SessionFactory.create();
			Person p = session.selectOne("cn.hl.vo.Person.getById2", 2);
			
			System.out.println(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
}

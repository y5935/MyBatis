package cn.hl.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.hl.util.SessionUtil;
import cn.hl.vo.Department;
import cn.hl.vo.Person;
import cn.hl.vo.Person2;
import cn.hl.vo.Role;

public class Tester {
	@Test
	public void testProperties() throws IOException{
		SessionUtil util = new SessionUtil();
		SqlSession session = util.create();
	}
	
	/**
	 * 按Id获取角色信息
	 * @throws IOException
	 */
	@Test
	public void testRole() throws IOException{
		//获取Session对象
		SessionUtil util = new SessionUtil();
		SqlSession session= util.create();
		
		//执行查询命令
		Role role = session.selectOne("cn.hl.vo.role.mapper.getById",1);
		
		//关闭session
		session.close();
		
		System.out.println(role);
		
	}
	
	@Test
	public void testDepartment() throws IOException{
		//获取Session对象
		SessionUtil util = new SessionUtil();
		SqlSession session= util.create();
		
		//执行查询命令
		Department dept = session.selectOne("cn.hl.vo.department.mapper.getById",1);
		
		//关闭session
		session.close();
		
		System.out.println(dept);
		
	}
	
	/**
	 * 测试一对一关联查询
	 * @throws IOException
	 */
	@Test
	public void testOneToOne() throws IOException{
		//获取Session对象
		SessionUtil util = new SessionUtil();
		SqlSession session= util.create();
		
		//执行查询命令
		Person p = session.selectOne("cn.hl.vo.person.mapper.getById",1);
		
		//关闭session
		session.close();
		
		System.out.println(p);
		
	}
	
	/**
	 * 测试一对一关联查询
	 * @throws IOException
	 */
	@Test
	public void testOneToOne2() throws IOException{
		//获取Session对象
		SessionUtil util = new SessionUtil();
		SqlSession session= util.create();
		
		//执行查询命令
		Person p = session.selectOne("cn.hl.vo.person.mapper.getPerson",1);
		
		//关闭session
		session.close();
		
		System.out.println(p);
		
	}
	
	/**
	 * 测试一对多关联查询
	 * @throws IOException
	 */
	@Test
	public void testOneToMore() throws IOException{
		//获取Session对象
		SessionUtil util = new SessionUtil();
		SqlSession session= util.create();
		
		//执行查询命令
		Person2 p = session.selectOne("cn.hl.vo.person2.mapper.oneToMore1",1);
		
		//关闭session
		session.close();
		
		System.out.println(p);
		
	}
	
	/**
	 * 测试一对多关联查询
	 * @throws IOException
	 */
	@Test
	public void testOneToMore2() throws IOException{
		//获取Session对象
		SessionUtil util = new SessionUtil();
		SqlSession session= util.create();
		
		//执行查询命令
		Person2 p = session.selectOne("cn.hl.vo.person2.mapper.oneToMore2",1);
		
		//关闭session
		session.close();
		
		System.out.println(p);
		
	}
}

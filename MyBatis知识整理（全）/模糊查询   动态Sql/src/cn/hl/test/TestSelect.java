package cn.hl.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.hl.util.SessionFactory;
import cn.hl.vo.Exp;
import cn.hl.vo.User;

public class TestSelect {
	/**
	 * 执行区间模糊查询
	 */
	@Test
	public void testBetween(){
		//声明SqlSession对象
		SqlSession session = null;
		Exp exp = new Exp(2,10);
		
		try {
			//获取SQLSession对象
			session = SessionFactory.create();
			//调用映射
			List<User> list = session.selectList("cn.hl.vo.User.testBetween", exp);
			//打印查询结果
			System.out.println(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 执行Like模糊查询
	 */
	@Test
	public void testLike(){
		//声明SqlSession对象
		SqlSession session = null;
		Exp exp = new Exp(2,10,"%o%");
		
		try {
			//获取SQLSession对象
			session = SessionFactory.create();
			//调用映射
			List<User> list = session.selectList("cn.hl.vo.User.testLike", exp);
			//打印查询结果
			System.out.println(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 执行Like模糊查询
	 */
	@Test
	public void testIf(){
		//声明SqlSession对象
		SqlSession session = null;
		//Exp exp = new Exp(2,10,"%o%");
		Exp exp = new Exp(2,10);
		
		System.out.println(exp);
		System.out.println(exp.getAccount() == null);
		
		try {
			//获取SQLSession对象
			session = SessionFactory.create();
			//调用映射
			List<User> list = session.selectList("cn.hl.vo.User.testIf", exp);
			//打印查询结果
			System.out.println(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

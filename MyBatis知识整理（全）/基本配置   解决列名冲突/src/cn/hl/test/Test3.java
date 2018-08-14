package cn.hl.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.hl.util.SessionFactory;
import cn.hl.vo.ClassRoom;

public class Test3 {
	/**
	 * 执行添加操作
	 */
	@Test
	public void add(){
		//声明Session对象
		SqlSession session=null;
		ClassRoom cr = new ClassRoom(0,"UUUUU","uuuu",0);
		
		try {
			//通过工具类SessionFactory构建session对象
			session = SessionFactory.create();
			//执行添加映射
			int result = session.insert("cn.hl.vo.ClassRoom.add", cr);
			//手动调用commit()方法对操作进行提交
			//session.commit();
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	/**
	 * 执行修改操作
	 */
	@Test
	public void update(){
		//声明Session对象
		SqlSession session = null;
		ClassRoom cr = new ClassRoom(21,"OOOO","oooo",1);
		
		try {
			//通过工具类sessionFactory构建session对象
			session = SessionFactory.create();
			//执行映射
			int result = session.update("cn.hl.vo.ClassRoom.edit", cr);
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	
	/**
	 * 执行删除操作
	 */
	@Test
	public void delete(){
		//声明Session对象
		SqlSession session = null;
		
		try {
			//通过工具类sessionFactory构建session对象
			session = SessionFactory.create();
			//执行映射
			int result= session.delete("cn.hl.vo.ClassRoom.del", 20);
			System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}		
	}
	
	/**
	 * 按Id执行查询语句
	 */
	@Test
	public void selectOne(){
		//声明Session对象
		SqlSession session = null;
		
		try {
			//通过工具类sessionFactory构建session对象
			session = SessionFactory.create();
			//执行映射
			ClassRoom cr = session.selectOne("cn.hl.vo.ClassRoom.getById", 210);
			System.out.println(cr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}	
	}
	
	/**
	 * 按所有数据集
	 */
	@Test
	public void selectAll(){
		//声明Session对象
		SqlSession session = null;
		
		try {
			//通过工具类sessionFactory构建session对象
			session = SessionFactory.create();
			//执行映射
			List<ClassRoom> list = session.selectList("cn.hl.vo.ClassRoom.getAll");
			System.out.println(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}	
	}
}

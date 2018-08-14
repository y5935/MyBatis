package cn.hl.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.hl.mapper.CityMapper;
import cn.hl.util.SessionFactory;
import cn.hl.vo.City;

public class TestAnno {
	/**
	 * 添加城市信息到数据库
	 */
	@Test
	public void add(){
		//声明SqlSession对象
		SqlSession session = null;
		
		try {
			//获取SqlSession对象
			session = SessionFactory.create();
			//获取映射器（接口实例）
			CityMapper mapper = session.getMapper(CityMapper.class);
			//调用映射器（接口）的add()方法
			int result = mapper.add(new City(0,"西宁",0));
			System.out.println("result = " + result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	
	/**
	 * 修改数据
	 */
	@Test
	public void edit(){
		//声明SqlSession对象
		SqlSession session = null;
		
		try {
			//获取SqlSession对象
			session = SessionFactory.create();
			//获取映射器（接口实例）
			CityMapper mapper = session.getMapper(CityMapper.class);
			//调用映射器（接口）的add()方法
			int result = mapper.update(new City(16,"ddd",0));
			System.out.println("result = " + result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	
	/**
	 * 按照Id删除数据
	 */
	@Test
	public void del(){
		//声明SqlSession对象
		SqlSession session = null;
		
		try {
			//获取SqlSession对象
			session = SessionFactory.create();
			//获取映射器（接口实例）
			CityMapper mapper = session.getMapper(CityMapper.class);
			//调用映射器（接口）的add()方法
			int result = mapper.delete(16);
			System.out.println("result = " + result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	
	/**
	 * 按Id查询数据
	 */
	@Test
	public void findById(){
		//声明SqlSession对象
		SqlSession session = null;
		
		try {
			//获取SqlSession对象
			session = SessionFactory.create();
			//获取映射器（接口实例）
			CityMapper mapper = session.getMapper(CityMapper.class);
			//调用映射器（接口）的add()方法
			City city = mapper.getById(15);
			System.out.println(city);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
}

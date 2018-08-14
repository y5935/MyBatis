package cn.hl.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.hl.util.SessionFactory;
import cn.hl.vo.City;

public class TestAlise {
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
			int result = session.insert("cn.hl.vo.City.add", new City(0,"ttttt",0));

			System.out.println("result = " + result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
}

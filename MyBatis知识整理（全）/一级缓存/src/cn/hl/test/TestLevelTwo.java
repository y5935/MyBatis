package cn.hl.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import cn.hl.util.SessionFactory;
import cn.hl.vo.City;
import cn.hl.vo.Users;

public class TestLevelTwo {

	public static void main(String[] args) {
		String mapper = "cn.hl.vo.City.getById";
		//声明SqlSession对象
		SqlSession session = null;
		
		
		try {
			//获取Session对象
			session = SessionFactory.create();
			City city = session.selectOne(mapper, 1);
			System.out.println(city);
			
			System.out.println("\n==============================================\n");
			//清除缓存
			session.clearCache();
			System.out.println("\n==============================================\n");
			
			//Sql语句没有被发送给数据库
			City city2 = session.selectOne(mapper, 1);
			System.out.println(city2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}

	}

}

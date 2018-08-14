package cn.hl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.hl.vo.City;

public interface CityMapper {
	/**
	 * 添加数据到数据库
	 * @param city
	 * @return
	 */
	@Insert("insert into city values(default,#{cityName},#{pId})")
	public int add(City city);
	
	/**
	 * 按Id修改数据
	 * @param city
	 * @return
	 */
	@Update("update city set cityName=#{cityName},pid=#{pId} where cityId=#{cityId}")
	public int update(City city);
	
	/**
	 * 按Id删除数据
	 * @param id
	 * @return
	 */
	@Delete("delete from city where cityId=#{id}")
	public int delete(int id);
	
	/**
	 * 按Id查询数据
	 * @param id
	 * @return
	 */
	@Select("select * from city where cityId=#{id}")
	public City getById(int id);
	
	/**
	 * 查询所有数据
	 * @return
	 */
	@Select("select * from city")
	public List<City> getAll();
}

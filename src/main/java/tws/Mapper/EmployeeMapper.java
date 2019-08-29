package tws.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import tws.domain.Employee;

@Mapper
public interface EmployeeMapper {
	@Insert("insert into employee values(#{employee.id},#{employee.name},#{employee.age})")
	void insertEmployee(@Param("employee") Employee employee);

	@Select("select * from employee")
	public List<Employee> searchEmployees();

	@Update("update employee set name=#{employee.name},age=#{employee.age} where id=#{employee.id}")
	void updateEmployee(@Param("employee") Employee employee);

	@Delete("delete from employee where id = #{id}")
	void deleteEmployee(@Param("id") int id);
}

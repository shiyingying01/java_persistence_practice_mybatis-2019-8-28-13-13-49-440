package tws.Mapper;

import java.util.List;

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

	@Update("update employee set id=#{employee.id},name=#{employee.name},age=#{employee.age}")
	void updateEmployee(@Param("employee")Employee employee);

}

package com.quest.dao;

import com.quest.domain.Employees;
import com.quest.model.RowBounds;

import java.util.List;
import java.util.Optional;

/**
 * @author Jason Park
 * @since v1.0.0
 */
public interface EmployeesDao {

  Optional<List<Employees>> findEmployees(RowBounds rowBounds);

  Optional<Employees> findEmployeesByEmpNo(Integer empNo);

  void save(Employees employees);

  Optional<Employees> merge(Employees employees);

  void delete(Employees employees);
}

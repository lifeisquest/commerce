package com.quest.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author Jason Park
 * @since v
 */
public class DeptManagerPK implements Serializable {
  private String deptNo;
  private Long empNo;

  @Column(name = "dept_no", nullable = false, length = 4)
  @Id
  public String getDeptNo() {
    return deptNo;
  }

  public void setDeptNo(String deptNo) {
    this.deptNo = deptNo;
  }

  @Column(name = "emp_no", nullable = false)
  @Id
  public Long getEmpNo() {
    return empNo;
  }

  public void setEmpNo(Long empNo) {
    this.empNo = empNo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    DeptManagerPK that = (DeptManagerPK) o;

    if (deptNo != null ? !deptNo.equals(that.deptNo) : that.deptNo != null) return false;
    if (empNo != null ? !empNo.equals(that.empNo) : that.empNo != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = deptNo != null ? deptNo.hashCode() : 0;
    result = 31 * result + (empNo != null ? empNo.hashCode() : 0);
    return result;
  }
}

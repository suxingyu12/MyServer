package com.bdqn.dao.impl;

import com.bdqn.dao.BaseDao;
import com.bdqn.dao.StudentDao;
import com.bdqn.entity.Result;
import com.bdqn.entity.Student;
import com.bdqn.util.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentImpl extends BaseDao implements StudentDao {
    public StudentImpl(Connection conn) {
        super(conn);
    }

    public List<Student> getAll() {
        List<Student> list=null;
        ResultSet rs=null;
        try {
            rs=ExecuteQuery("select StudentNo, LoginPwd, StudentName, Sex, GradeId, Phone, Address, BornDate, Email from myschool.student");
            if (rs != null) {
                list=new ArrayList<Student>();
                while (rs.next()){
                    Student s=new Student();
                    s.setStudentNo(rs.getString("StudentNo"));
                    s.setLoginPwd(rs.getString("LoginPwd"));
                    s.setStudentName(rs.getString("StudentName"));
                    s.setSex(rs.getString("Sex"));
                    s.setGradeId(rs.getInt("GradeId"));
                    s.setPhone(rs.getString("Phone"));
                    s.setAddress(rs.getString("Address"));
                    s.setBornDate(rs.getDate("BornDate"));
                    s.setEmail(rs.getString("Email"));
                    list.add(s);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeAll(null,null,rs);
        }

        return list;
    }
}

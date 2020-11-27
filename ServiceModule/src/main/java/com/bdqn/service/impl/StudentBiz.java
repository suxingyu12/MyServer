package com.bdqn.service.impl;

import com.bdqn.dao.impl.StudentImpl;
import com.bdqn.entity.Student;
import com.bdqn.service.StudentService;
import com.bdqn.util.DBUtil;

import java.sql.Connection;
import java.util.List;

public class StudentBiz implements StudentService {
    public List<Student> getAll() {
        List<Student> list=null;
        Connection conn=null;
        try {
            conn= DBUtil.getConn();
            if (conn != null) {
                list=new StudentImpl(conn).getAll();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeAll(conn,null,null);
        }
        return list;
    }
}

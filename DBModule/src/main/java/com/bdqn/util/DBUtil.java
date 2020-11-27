package com.bdqn.util;

import java.sql.*;

//数据库工具类
public class DBUtil {
    private static  String DRIVER=ConfigManager.getProperty("driver");
    private static  String URL=ConfigManager.getProperty("url");
    private static  String UNAME=ConfigManager.getProperty("uname");
    private static  String PWD=ConfigManager.getProperty("pwd");
    //注册驱动
    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //获得连接
    public  static Connection getConn(){
        Connection conn=null;
        try {
            conn= DriverManager.getConnection(URL,UNAME,PWD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  conn;
    }
    //关闭连接
    public  static  void closeAll(Connection conn, PreparedStatement pstmt, ResultSet rs){
        try {
            if(rs!=null && !rs.isClosed()){
                rs.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            if(pstmt!=null && !pstmt.isClosed()){
                pstmt.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            if(conn!=null && !conn.isClosed()){
                conn.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

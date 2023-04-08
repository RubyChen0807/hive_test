package com.nmu.hive;

import java.sql.*;

public class HiveDemoTest {
    //类成员
    //1 url
    public static final String URL="jdbc:hive2://bigdata01:10000";
    //2 user
    public static final String USER="root";
    //3 password
    public static final String PASS="root";
    public static void main(String[] args) throws SQLException {
        //1.创建连接
        Connection conn= DriverManager.getConnection(URL,USER,PASS);
        //2.SQL
        String sql="select * from test2";
        //3.SQL执行器
        Statement stmt=conn.createStatement();
        //4.执行SQL-->得到一个结果集（多行）
        ResultSet rs=stmt.executeQuery(sql);
        //5.处理结果集
        System.out.println("编号\t"+"姓名\t"+"年龄");
        while (rs.next()){
            int id=rs.getInt("id");
            String name=rs.getString("name");
            int age=rs.getInt("age");
            System.out.println(id+"\t\t"+name+"\t"+age);
        }



        // password
    }
}

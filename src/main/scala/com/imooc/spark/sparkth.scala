package com.imooc.spark

import java.sql.DriverManager

object sparkth {
  def main(args: Array[String]): Unit = {
    Class.forName("org.apache.hive.jdbc.HiveDriver")
    val con =DriverManager.getConnection("jdbc:hive2://hadoop-1:10000","hadoop_1","941314")
    val c= con.prepareStatement("select * from emp")
    val ss = c.executeQuery();
    while (ss.next()){println(ss.getInt("sid"))}
    print("111")
    ss.close()
    c.close()
    con.close()

  }
}

package Dao;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Created by Sall on 2019-1-9.
 */
public class BaseDao {
    private static String driver="";
    private static String url="";
    private static String username="";
    private static String pwd="";

    public Connection conn=null;
    public PreparedStatement pstmt = null;
    public ResultSet rs=null;

    static {
        try {
            Properties properties = new Properties();
            InputStream is = BaseDao.class.getClassLoader().getResourceAsStream("BaseDao.properties");
            properties.load(is);
            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            username = properties.getProperty("user");
            pwd = properties.getProperty("password");
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Connection connections() {
            try {
                conn = DriverManager.getConnection(url, username, pwd);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return conn;
    }
    public void closeAll() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public int executeUpdate(String sql,Object[] pm){
        int num=0;
        conn=connections();
        try {
            pstmt=conn.prepareStatement(sql);
            if (pm!=null){
                for (int i=0;i<pm.length;i++){
                    pstmt.setObject(i+1,pm[i]);
                }
            }
            num=pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return num;
    }
}

package kty.basic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class JDBCUtil {


    private ResourceBundle rb = null;
    private String DRV;
    private String URL;
    private String USR;
    private String PWD;

    public JDBCUtil() {
        String pkpath = "kty.basic.jdbc.jdbc";
        // kty.basic.jdbc : 패키지 경로
        // jdbc : properyies 파일명
        rb = ResourceBundle.getBundle(pkpath);
        DRV = rb.getString("mardrv");
        URL = rb.getString("marurl");
        USR = rb.getString("marusr");
        PWD = rb.getString("marpwd");
    }
    public Connection openConn () {
        Connection conn = null;

        try {

            Class.forName(DRV);
            conn = DriverManager.getConnection(URL, USR, PWD);

        } catch (Exception ex) {
            ex.printStackTrace();
        } // catch

        return conn;

    } // pCoC


} // clsJU

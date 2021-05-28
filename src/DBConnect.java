import java.sql.*;
public class DBConnect {
    private Connection conn;
    private Statement st;
    private String url = "jdbc:mysql://localhost:3306/bluezocurry?rewriteBatchedStatements=true";
    private String user = "root";
    private String password = "";
    //DB:bluezocurry
    
    public ResultSet getResult(String query) {
        ResultSet rs;
        try {
            conn = DriverManager.getConnection(url, user, password);
            st = conn.createStatement();
            rs = st.executeQuery(query);
        } catch(Exception e) {
            rs = null;
        }
        return rs;
    }
    
    public boolean execute(String query) {
        boolean rs;
        try {
            conn = DriverManager.getConnection(url, user, password);
            st = conn.createStatement();
            st.execute(query);
            rs = true;
        } catch(Exception e) {
            rs = false;
        }
        return rs;
    }
    
    public void close() {
        try {
            conn.close();
        } catch(Exception e) {
            //Not doing
        }
    }
}
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = helper.getConnection();
            System.out.println("Bağlantı oluştu");

            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from actor");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("last_name"));
            }

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);

        } finally {
            connection.close();
        }


    }
}
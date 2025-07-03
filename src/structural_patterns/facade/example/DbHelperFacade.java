package structural_patterns.facade.example;

import java.sql.Connection;

public class DbHelperFacade {
    public static void generateReport(DbTypes dbType, ReportTypes reportType, String tableOrCollectionName) {
        Connection connection;
        switch (dbType) {
            case MYSQL -> {
                connection = MySqlHelper.getMySqlDBConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch (reportType) {
                    case HTML -> mySqlHelper.generateMySqlHTMLReport(tableOrCollectionName, connection);
                    case PDF -> mySqlHelper.generateMySqlPDFReport(tableOrCollectionName, connection);
                }
            }
            case MONGODB -> {
                connection = MongoDbHelper.getMongoDBConnection();
                switch (reportType) {
                    case HTML -> MongoDbHelper.generateMongoHTMLReport(tableOrCollectionName, connection);
                    case PDF -> MongoDbHelper.generateMongoPDFReport(tableOrCollectionName, connection);
                }
            }
        }

    }

    public enum DbTypes {
        MYSQL, MONGODB
    }

    public enum ReportTypes {
        PDF, HTML;
    }
}

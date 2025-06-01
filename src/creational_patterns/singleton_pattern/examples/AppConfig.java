package creational_patterns.singleton_pattern.examples;

public enum AppConfig {
    INSTANCE;
  private final String databaseUrl;
  private final String databaseUsername;

    AppConfig() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/mydb";
        this.databaseUsername = "root";
    }


    public String getDatabaseUrl() {
        return databaseUrl;
    }
    public String getDatabaseUsername() {
        return databaseUsername;
    }

}

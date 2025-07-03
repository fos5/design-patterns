package structural_patterns.facade.example;

public class HelperFacadeRunner {
    public static void main(String[] args) {
        DbHelperFacade.generateReport(DbHelperFacade.DbTypes.MYSQL, DbHelperFacade.ReportTypes.PDF, "Employee");
        DbHelperFacade.generateReport(DbHelperFacade.DbTypes.MYSQL, DbHelperFacade.ReportTypes.HTML, "Employee");
        DbHelperFacade.generateReport(DbHelperFacade.DbTypes.MONGODB, DbHelperFacade.ReportTypes.PDF, "Employee");
        DbHelperFacade.generateReport(DbHelperFacade.DbTypes.MONGODB, DbHelperFacade.ReportTypes.HTML, "Employee");
    }
}

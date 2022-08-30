package steps;


import pages.LoginPage;

public class PageInitializer {

    public static LoginPage login;

    public static AddEmployeePage addEmployeePage;

    public static DashboardPage dash;

    public static void initializePageObjects() {

        login = new LoginPage();
        addEmployeePage = new AddEmployeePage();
        dash=new DashboardPage();
    }
}
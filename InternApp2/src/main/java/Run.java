import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Run {
    public static void main(String[] args) {
        Application app = new Application();

        app.setUpdatedDate("1-1-1");
        app.setStudentFirstName("aaa");
        app.setStudentLastName("aaa");
        app.setMiddleInitial("aaa");
        app.setId("aaa");
        app.setInternshipYear("aaa");
        app.setPhoneNum("aaa");
        app.setCurrentAddress("aaa");
        app.setCurrentCity("aaa");
        app.setCurrentState("aaa");
        app.setCurrentZip("aaa");
        app.setPermAddress("aaa");
        app.setPermCity("aaa");
        app.setPermState("aaa");
        app.setPermZip("aaa");
        app.setLocalPhone("aaa");
        app.setPermPhone("aaa");
        app.setGradDate("aaa");
        app.setEmail("aaa");
        app.setDegree("aaa");
        app.setMajor("aaa");
        app.setSelfDisclosure("aaa");
        app.setHandicapped("aaa");
        app.setCompany("aaa");
        app.setSiteSupervisor("aaa");
        app.setSupervisorEmail("aaa");
        app.setSupervisorPhone("aaa");
        app.setHoursPerWeek("aaa");
        app.setNumOfWeeks("aaa");
        app.setIsPaid("aaa");
        app.setInternshipStartDate("aaa");
        app.setInternshipTitle("aaa");
        app.setReasonUnpaid("aaa");
        app.setCompensation("aaa");
        app.setCompanyAddress("aaa");
        app.setCompanyCity("aaa");
        app.setCompanyState("aaa");
        app.setCompanyZip("aaa");
        app.setCompanyPhone("aaa");
        app.setCompanyFax("aaa");
        app.setCompanyContact("aaa");
        app.setContactTitle("aaa");
        app.setContactEmail("aaa");
        app.setCompanyEmail("aaa");
        app.setForProfit("aaa");
        app.setCompanyDesc("aaa");
        app.setNumOfEmployees("aaa");
        app.setObjectiveThree("aaa");
        app.setObjectiveFour("aaa");
        app.setLancerMail("aaa");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        app.setISODate(df.format(new Date()));

        try {
            FillForm.populateInternshipForm(app);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

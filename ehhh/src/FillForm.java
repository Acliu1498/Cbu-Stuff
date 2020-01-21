import java.io.File;
import java.io.IOException;

public class FillForm {
    private static PDDocument internshipForm;
    private static String emptyForm = "./CBUInternApp/Registration Packet Template.pdf";

    public static String populateInternshipForm(Application app) throws IOException {
        String populatedForm = "./" + app.getStudentFirstName() + app.getStudentLastName() + app.getInternshipYear() + ".pdf";
        internshipForm = PDDocument.load(new File(emptyForm));
        //Student info
        setField("studentFirstName", app.getStudentFirstName());
        setField("middleInitial", app.getMiddleInitial());
        setField("studentLastName", app.getStudentLastName());
        setField("studentName", app.getStudentFirstName() + " " + app.getMiddleInitial() + " " + app.getStudentLastName());
        setField("date", app.getUpdatedDate());
        setField("id", app.getId());
        setField("email", app.getEmail());
        setField("semesterAndYear",  app.getInternshipYear());
        setField("phoneNumber", app.getPhoneNum());
        setField("major", app.getDegree());
        setField("currentAddress", app.getCurrentAddress());
        setField("currentCity", app.getCurrentCity());
        setField("currentState", app.getCurrentState());
        setField("currentZip", app.getCurrentZip());
        setField("permAddress", app.getPermAddress());
        setField("permCity", app.getPermCity());
        setField("permState", app.getPermState());
        setField("permZip", app.getPermZip());
        setField("gradDate", app.getGradDate());
        setField("studentAddress", app.getCurrentAddress());

        setField("permPhone", app.getPermPhone());
        //Internship Info
        setField("hoursPerWeek", app.getHoursPerWeek());
        setField("numOfWeeks", app.getNumOfWeeks());
        setField("compensation", app.getCompensation());
        setField("internshipTitle", app.getInternshipTitle());
        setField("employerName", app.getCompany());
        setField("internshipStartDate", app.getInternshipStartDate());

        //Company contact info
        setField("companyContact", app.getCompanyContact());
        setField("contactTitle", app.getContactTitle());
        setField("contactEmail", app.getContactEmail());
        //Supervisor info
        setField("siteSupervisor", app.getSiteSupervisor());
        setField("supervisorEmail", app.getSupervisorEmail());
        setField("supervisorPhone", app.getSupervisorPhone());

        //Company info
        setField("company", app.getCompany());
        setField("companyAddress", app.getCompanyAddress());
        setField("companyCity", app.getCompanyCity());
        setField("companyZip", app.getCompanyZip());
        setField("companyPhone", app.getCompanyPhone());
        setField("companyFax", app.getCompanyFax());
        setField("companyWebsite", app.getCompanyWebsite());
        setField("numOfEmployees", app.getNumOfEmployees());
        setField("permPhone", app.getPermPhone());
        setField("companyDesc", app.getCompanyDesc());
        setField("objectiveThree", app.getObjectiveThree());
        setField("objectiveFour", app.getObjectiveFour());
        //boolean values
        //Change to checkbox?
        if (app.isForProfit()) {
            setField("forProfit", "x");
        } else {
            setField("notForProfit", "x");
        }

        if (app.isHandicapped()) {
            setField("isHandicapped", "x");  // LOOK AT GITHUB
        }

        if (app.getDegree().equals("BmE")) {
            setField("bioMajor", "[Yes]");
        } else if (app.getDegree().equals("ChE")) {
            setField("chemMajor", "[Yes]");
        } else if (app.getDegree().equals("CE")) {
            setField("civilMajor", "[Yes]");
        } else if (app.getDegree().equals("CM")) {
            setField("consMajor", "[Yes]");
        } else if (app.getDegree().equals("ECE")) {
            setField("eceMajor", "[Yes]");
        } else if (app.getDegree().equals("E")) {
            setField("engMajor", "[Yes]");
        } else if (app.getDegree().equals("ISE")) {
            setField("indMajor", "[Yes]");
        } else if (app.getDegree().equals("ME")) {
            setField("mechMajor", "[Yes]");
        } else if (app.getDegree().equals("SE")) {
            setField("softMajor", "[Yes]");
        } else {
            setField("compMajor", "[Yes]");
        }

        if(app.getSelfDisclosure().equals("African American")) {
            setField("selfDisclosure", "A");
        }
        else if(app.getSelfDisclosure().equals("Asian or Pacific Islander")) {
            setField("selfDisclosure", "B");
        }
        else if(app.getSelfDisclosure().equals("Native American")) {
            setField("selfDisclosure", "C");
        }
        else if(app.getSelfDisclosure().equals("Hispanic/Mexican/Spanish/Latin")) {
            setField("selfDisclosure", "D");
        }
        else if(app.getSelfDisclosure().equals("Anglo/White/Caucasian")) {
            setField("selfDisclosure","E");
        }
        else {
            setField("selfDisclosure", "F");
        }

        internshipForm.save(populatedForm);
        internshipForm.close();

        return populatedForm;
    }

    private static void setField(String fieldName, String fieldValue) throws IOException {
        PDDocumentCatalog documentCatalog = internshipForm.getDocumentCatalog();
        PDAcroForm fillableForm = documentCatalog.getAcroForm();
        PDField field = fillableForm.getField(fieldName);
        try {
            if (field != null) {
                field.setValue(fieldValue);
            } else {
                System.err.println("No field found with name:" + fieldName);
            }

        } catch(IllegalArgumentException e) {
            ((PDCheckBox) field).check();
        }
    }
}

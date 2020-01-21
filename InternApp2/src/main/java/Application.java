public class Application {
    //Very long list of current attributes.
    private String studentFirstName, middleInitial, studentLastName, id, internshipYear, phoneNum, major,
            courseNum, units, instructor, currentAddress, currentCity, currentState, currentZip,
            permAddress, permCity, permState, permZip, localPhone, permPhone, gradDate, email, degree, selfDisclosure, siteSupervisor, supervisorEmail,
            supervisorPhone, supervisorOtherPhone, hoursPerWeek, numOfWeeks, compensation, compensationDesc, internshipStartDate, internshipEndDate, internshipTitle,
            company, companyAddress, companyCity, companyZip, companyPhone, companyFax, companyWebsite, companyContact, contactTitle, contactEmail,
            companyEmail, companyDesc, numOfEmployees, isPaid, reasonUnpaid, companyState, objectiveThree, objectiveFour, lancerMail, updatedDate, ISODate;

    private boolean isHandicapped, forProfit, deanApproved;



    //Getters and Setters for the variables.

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInternshipYear() {
        return internshipYear;
    }

    public void setInternshipYear(String intershipYear) {
        this.internshipYear = intershipYear;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {

        int parenthIdx =  major.indexOf("(");
        if ( parenthIdx > 0) {
            major = major.substring(0, major.indexOf("("));
        }
        this.major = major;
    }

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }


    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public String getCurrentZip() {
        return currentZip;
    }

    public void setCurrentZip(String currentZip) {
        this.currentZip = currentZip;
    }

    public String getPermAddress() {
        return permAddress;
    }

    public void setPermAddress(String permAddress) {
        this.permAddress = permAddress;
    }

    public String getPermCity() {
        return permCity;
    }

    public void setPermCity(String permCity) {
        this.permCity = permCity;
    }

    public String getPermState() {
        return permState;
    }

    public void setPermState(String permState) {
        this.permState = permState;
    }

    public String getPermZip() {
        return permZip;
    }

    public void setPermZip(String permZip) {
        this.permZip = permZip;
    }

    public String getLocalPhone() { return localPhone; }

    public void setLocalPhone(String localPhone) { this.localPhone = localPhone; }

    public String getPermPhone() { return permPhone; }

    public void setPermPhone(String permPhone) { this.permPhone = permPhone; }

    public String getGradDate() { return gradDate; }

    public void setGradDate(String gradDate) { this.gradDate = gradDate; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        int parenthIdx1 = degree.indexOf("(");
        int parenthIdx2 = degree.indexOf(")");

        if (parenthIdx1 > 0 && parenthIdx1 < parenthIdx2) {
            degree = degree.substring(degree.indexOf("(") + 1, degree.indexOf(")"));
        }
        this.degree = degree;
    }

    public String getSelfDisclosure() {
        return selfDisclosure;
    }

    public void setSelfDisclosure(String selfDisclosure) {
        this.selfDisclosure = selfDisclosure;
    }

    public String getSiteSupervisor() {
        return siteSupervisor;
    }

    public void setSiteSupervisor(String siteSupervisor) {
        this.siteSupervisor = siteSupervisor;
    }

    public String getSupervisorEmail() {
        return supervisorEmail;
    }

    public void setSupervisorEmail(String supervisorEmail) {
        this.supervisorEmail = supervisorEmail;
    }

    public String getSupervisorPhone() {
        return supervisorPhone;
    }

    public void setSupervisorPhone(String supervisorPhone) {
        this.supervisorPhone = supervisorPhone;
    }

    public String getSupervisorOtherPhone() { return supervisorOtherPhone; }

    public void setSupervisorOtherPhone(String supervisorOtherPhone) { this.supervisorOtherPhone = supervisorOtherPhone; }

    public String getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(String hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public String getNumOfWeeks() {
        return numOfWeeks;
    }

    public void setNumOfWeeks(String numOfWeeks) {
        this.numOfWeeks = numOfWeeks;
    }

    public String getCompensation() {
        return compensation;
    }

    public void setCompensation(String compensation) {
        this.compensation = compensation;
    }

    public String getCompensationDesc() {
        return compensationDesc;
    }

    public void setCompensationDesc(String compensationDesc) {
        this.compensationDesc = compensationDesc;
    }

    public String getInternshipStartDate() {
        return internshipStartDate;
    }

    public void setInternshipStartDate(String internshipStartDate) {
        this.internshipStartDate = internshipStartDate;
    }

    public String getInternshipEndDate() { return internshipEndDate; }

    public void setInternshipEndDate(String internshipEndDate) { this.internshipEndDate = internshipEndDate; }

    public String getInternshipTitle() {
        return internshipTitle;
    }

    public void setInternshipTitle(String internshipTitle) {
        this.internshipTitle = internshipTitle;
    }

    public boolean isDeanApproved() {
        return deanApproved;
    }

    public void setDeanApproved(boolean deanApproved) {
        this.deanApproved = deanApproved;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    public String getCompanyZip() {
        return companyZip;
    }

    public void setCompanyZip(String companyZip) {
        this.companyZip = companyZip;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyFax() {
        return companyFax;
    }

    public void setCompanyFax(String companyFax) {
        this.companyFax = companyFax;
    }

    public String getCompanyWebsite() { return companyWebsite; }

    public String getCompanyContact() {
        return companyContact;
    }

    public void setCompanyContact(String companyContact) {
        this.companyContact = companyContact;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getContactEmail() { return contactEmail; }

    public void setContactEmail(String contactEmail) { this.contactEmail = contactEmail; }

    public boolean isForProfit() {
        return forProfit;
    }

    public void setForProfit(String forProfit) {

        this.forProfit = (forProfit == "Government/Non-Profit");
    }

    public boolean isHandicapped() { return isHandicapped; }

    public void setHandicapped(String handicapped) {
        if(handicapped.isEmpty()){
            this.isHandicapped = false;
        }
        else{
            this.isHandicapped = true;
        }
    }

    public String getCompanyEmail() { return companyEmail; }

    public void setCompanyEmail(String companyEmail) { this.companyEmail = companyEmail; }

    public String getCompanyDesc() {
        return companyDesc;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc;
    }

    public String getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setNumOfEmployees(String numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    public String getIsPaid() { return isPaid; }

    public void setIsPaid(String isPaid) { this.isPaid = isPaid; }

    public void setCompanyWebsite(String companyWebsite) { this.companyWebsite = companyWebsite; }

    public String getReasonUnpaid() { return reasonUnpaid; }

    public void setReasonUnpaid(String reasonUnpaid) { this.reasonUnpaid = reasonUnpaid; }

    public String getCompanyState() { return companyState; }

    public void setCompanyState(String companyState) { this.companyState = companyState; }

    public String getObjectiveThree() {
        return objectiveThree;
    }

    public void setObjectiveThree(String objectiveThree) {
        this.objectiveThree = objectiveThree;
    }

    public String getObjectiveFour() {
        return objectiveFour;
    }

    public void setObjectiveFour(String objectiveFour) {
        this.objectiveFour = objectiveFour;
    }

    public String getLancerMail() {
        return lancerMail;
    }

    public void setLancerMail(String lancerMail) {
        this.lancerMail = lancerMail;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        int spaceIdx = updatedDate.indexOf(" ");
        if (spaceIdx > -1) {
            updatedDate = updatedDate.substring(0, spaceIdx);
        }
        this.updatedDate = updatedDate;
    }

    public String getISODate() {
        return ISODate;
    }

    public void setISODate(String ISODate) {
        this.ISODate = ISODate;
    }

    public void printApplication(){
        System.out.println(studentFirstName + " " + middleInitial + " " + studentLastName + " " + id + " " +
                internshipYear + " " + phoneNum + " " + major + " " + courseNum  + " " + units
                + " " + instructor + " " + currentAddress + " " + currentCity + " " + currentState + " " +
                currentZip + " " + permAddress + " " + permCity + " " + permState + " " + permZip + " " + localPhone + " " +
                permPhone + " " + gradDate + " " + email + " " + degree + " " + selfDisclosure + " " + siteSupervisor + " " +
                supervisorEmail + " " + supervisorPhone + " " + hoursPerWeek + " " + numOfWeeks + " " + compensation + " " +
                compensationDesc + " " + internshipStartDate + " " + internshipTitle + " " + company + " " + companyAddress + " " +
                companyCity + " " + companyZip + " " + companyPhone + " " + companyFax + " " + companyContact + " " + contactTitle
                + " " + contactEmail + " " + companyEmail + " " + companyDesc + " " + numOfEmployees + " " + objectiveThree + " "
                + objectiveFour + " " + lancerMail);
    }
}

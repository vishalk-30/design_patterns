package prototypeAndRegistry;

public class Student implements Prototype {
    private int id;
    private String name;
    private int psp;
    private String batchName;
    private String moduleName;
    private String track;
    private int year;
    private String instructorName;
    private int completionYear;
    private String paymentPartner;

    public Student(int id, String name, int psp, String batchName, String moduleName, String track, int year, String instructorName, int completionYear, String paymentPartner) {
        this.id = id;
        this.name = name;
        this.psp = psp;
        this.batchName = batchName;
        this.moduleName = moduleName;
        this.track = track;
        this.year = year;
        this.instructorName = instructorName;
        this.completionYear = completionYear;
        this.paymentPartner = paymentPartner;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public int getCompletionYear() {
        return completionYear;
    }

    public void setCompletionYear(int completionYear) {
        this.completionYear = completionYear;
    }

    @Override
    public Student clone() {
        Student student = new Student();
        student.setId(this.id);
        student.setName(this.name);
        student.setPsp(this.psp);
        student.setBatchName(this.batchName);
        student.setModuleName(this.moduleName);
        student.setTrack(this.track);
        student.setCompletionYear(this.completionYear);
        student.setYear(this.year);
        student.paymentPartner = this.paymentPartner;
        student.setInstructorName(this.instructorName);
        return student;
    }
}

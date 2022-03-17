import java.util.Vector;
import java.util.Enumeration;


public class Course {
    private String title;
    private Vector courseRecords;

    Course() {
        courseRecords = new Vector();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void addCourseRecord(CourseRecord cr) {
        courseRecords.addElement(cr);
    }

    public Enumeration getCourseRecords() {
        return courseRecords.elements();
    }

    public void printCourseStudents() {
        for (Object courseRecord : courseRecords ) {
            CourseRecord temp = (CourseRecord) courseRecord;

            System.out.println(temp.getStudent());
        }
    }

    public void printBestStudent() {
        CourseRecord bestStudentRecord = (CourseRecord) courseRecords.get(0);

        for (int i = 1; i < courseRecords.size(); i++) {
            CourseRecord temp = (CourseRecord) courseRecords.get(i);
            if (temp.average() > bestStudentRecord.average()) {
                bestStudentRecord = temp;
            }
            System.out.println(bestStudentRecord.getStudent());
        }
    }

    public void printFinalExamStudents() {
        for (Object courseRecord : courseRecords) {
            CourseRecord record = (CourseRecord) courseRecord;
            if (record.canTakeFinalExam()) {
                System.out.println(record.getStudent());
            }
        }

    }

}

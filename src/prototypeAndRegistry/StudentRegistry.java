package prototypeAndRegistry;

import java.util.HashMap;

public class StudentRegistry {

    private HashMap<String, Student> studentRegistry ;

    public StudentRegistry() {
        this.studentRegistry  = new HashMap<>();
    }

    public void addToRegistry(Student student) throws Exception {
        if(studentRegistry.containsKey(student.getBatchName())){
            throw new Exception("Student object is already present");
        } else{
            studentRegistry.put(student.getBatchName(),student);
        }
    }
    public Student getFromRegistry(String key) throws Exception {
        if(! studentRegistry.containsKey(key)){
            throw new Exception("Student key is not present");
        } else{
            return studentRegistry.get(key);
        }
    }
}

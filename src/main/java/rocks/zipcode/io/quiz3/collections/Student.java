package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private List<Lab> labs;

    public Student() {
        this.labs = new LinkedList<Lab>();
//        this(null);
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for (Lab lab : labs) {
            if (lab.getName().equals(labName)) return lab;
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) throws UnsupportedOperationException {
        if (labs.contains(getLab(labName))) getLab(labName).setStatus(labStatus);
        else throw new UnsupportedOperationException("naughty");
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = labs.size()-1; i >= 0; i--) {

            output.append(labs.get(i).toString());
            if (i != 0) output.append("\n");
        }
        return output.toString();
    }
}

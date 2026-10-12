package fr.edyp.epims.json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CellenOneImportJson implements Serializable {
    private String manipulation;
    private int study;
    private List<Assignment> assignments = new ArrayList<>();
    private List<PlateAssignment> plateAssignments = new ArrayList<>();

    public CellenOneImportJson() {
    }

    public CellenOneImportJson(String manipulation, int study, List<Assignment> assignments) {
        this.manipulation = manipulation;
        this.study = study;
        setAssignments(assignments);
    }

    public CellenOneImportJson(String manipulation, int study, List<Assignment> assignments,
                               List<PlateAssignment> plateAssignments) {
        this(manipulation, study, assignments);
        setPlateAssignments(plateAssignments);
    }

    public String getManipulation() { return manipulation; }
    public void setManipulation(String manipulation) { this.manipulation = manipulation; }
    public int getStudy() { return study; }
    public void setStudy(int study) { this.study = study; }
    public List<Assignment> getAssignments() { return assignments; }
    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments == null ? new ArrayList<>() : assignments;
    }

    public List<PlateAssignment> getPlateAssignments() { return plateAssignments; }
    public void setPlateAssignments(List<PlateAssignment> plateAssignments) {
        this.plateAssignments = plateAssignments == null ? new ArrayList<>() : plateAssignments;
    }

    public static class Assignment implements Serializable {
        private String run;
        private String source;
        private String sample;

        public Assignment() {
        }

        public Assignment(String run, String source, String sample) {
            this.run = run;
            this.source = source;
            this.sample = sample;
        }

        public String getRun() { return run; }
        public void setRun(String run) { this.run = run; }
        public String getSource() { return source; }
        public void setSource(String source) { this.source = source; }
        public String getSample() { return sample; }
        public void setSample(String sample) { this.sample = sample; }
    }

    public static class PlateAssignment implements Serializable {
        private String run;
        private String plate;

        public PlateAssignment() {
        }

        public PlateAssignment(String run, String plate) {
            this.run = run;
            this.plate = plate;
        }

        public String getRun() { return run; }
        public void setRun(String run) { this.run = run; }
        public String getPlate() { return plate; }
        public void setPlate(String plate) { this.plate = plate; }
    }
}
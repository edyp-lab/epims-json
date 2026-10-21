package fr.edyp.epims.json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CellenOneImportJson implements Serializable {
    private String manipulation;
    private int study;
    private int robot;
    private List<Assignment> assignments = new ArrayList<>();
    private List<PlateAssignment> plateAssignments = new ArrayList<>();

    public CellenOneImportJson() {
    }


    public CellenOneImportJson(String manipulation, int study, int robot, List<Assignment> assignments, List<PlateAssignment> plateAssignments) {
        this.manipulation = manipulation;
        this.study = study;
        this.robot = robot;
        setAssignments(assignments);
        setPlateAssignments(plateAssignments);
    }

    public String getManipulation() { return manipulation; }
    public void setManipulation(String manipulation) { this.manipulation = manipulation; }
    public int getStudy() { return study; }
    public void setStudy(int study) { this.study = study; }
    public int getRobot() { return  robot; }
    public void setRobot(int robot) { this.robot = robot; }
    public List<Assignment> getAssignments() { return assignments; }
    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments == null ? new ArrayList<>() : assignments;
    }

    public List<PlateAssignment> getPlateAssignments() {
        return plateAssignments;
    }

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
        private String sourcePlate;
        private boolean newPlate;

        public PlateAssignment() {
        }

        public PlateAssignment(String run, String plate, String srcPlate) {
            this(run, plate, srcPlate, false);
        }

        public PlateAssignment(String run, String plate, String srcPlate, boolean newPlate) {
            this.run = run;
            this.plate = plate;
            this.sourcePlate = srcPlate;
            this.newPlate = newPlate;
        }

        public String getRun() { return run; }
        public void setRun(String run) { this.run = run; }
        public String getPlate() { return plate; }
        public void setPlate(String plate) { this.plate = plate; }

        public String getSourcePlate() {
            return sourcePlate;
        }

        public PlateAssignment setSourcePlate(String sourcePlate) {
            this.sourcePlate = sourcePlate;
            return this;
        }

        public boolean isNewPlate() { return newPlate; }
        public void setNewPlate(boolean newPlate) { this.newPlate = newPlate; }
    }
}
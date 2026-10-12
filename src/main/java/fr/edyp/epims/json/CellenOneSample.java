/*
 * Copyright (C) 2024
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the CeCILL FREE SOFTWARE LICENSE AGREEMENT
 * ; either version 2.1 of the License, or (at your option) any later version.
 */

package fr.edyp.epims.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * CellenOne samples grouped by plate and plate coordinate.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CellenOneSample implements Serializable {

    private String plate;
    private Point plateCoordinate;
    private String source;
    private ArrayList<DropSamples> dropSamples = new ArrayList<>();

    public CellenOneSample() {
    }

    public CellenOneSample(String plate, Point plateCoordinate, String source, ArrayList<DropSamples> dropSamples) {
        this.plate = plate;
        this.plateCoordinate = plateCoordinate;
        this.source = source;
        this.dropSamples = dropSamples != null ? dropSamples : new ArrayList<>();
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Point getPlateCoordinate() {
        return plateCoordinate;
    }

    public void setPlateCoordinate(Point plateCoordinate) {
        this.plateCoordinate = plateCoordinate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ArrayList<DropSamples> getDropSamples() {
        return dropSamples;
    }

    public void setDropSamples(ArrayList<DropSamples> dropSamples) {
        this.dropSamples = dropSamples != null ? dropSamples : new ArrayList<>();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DropSamples implements Serializable {

        private Integer dropId;
        private String imageFilePath;

        public DropSamples() {
        }

        public DropSamples(Integer dropId, String imagefile) {
            this.dropId = dropId;
            this.imageFilePath = imagefile;
        }

        public Integer getDropId() {
            return dropId;
        }

        public void setDropId(Integer dropId) {
            this.dropId = dropId;
        }

        public String getImageFilePath() {
            return imageFilePath;
        }

        public void setImageFilePath(String imageFilePath) {
            this.imageFilePath = imageFilePath;
        }

        @JsonIgnore
        public String getImageFile() {
            return imageFilePath;
        }

        @JsonIgnore
        public void setImageFile(String imageFile) {
            this.imageFilePath = imageFile;
        }
    }
}
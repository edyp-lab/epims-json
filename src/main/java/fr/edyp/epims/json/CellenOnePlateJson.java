/*
 * Copyright (C) 2024
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the CeCILL FREE SOFTWARE LICENSE AGREEMENT
 * ; either version 2.1 of the License, or (at your option) any later version.
 */

package fr.edyp.epims.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.awt.Point;
import java.io.Serializable;

/** CellenOne plate definition with its name and size. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CellenOnePlateJson implements Serializable {

    private String name;
    private Point size;

    public CellenOnePlateJson() {
    }

    public CellenOnePlateJson(String name, Point size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getSize() {
        return size;
    }

    public void setSize(Point size) {
        this.size = size;
    }
}
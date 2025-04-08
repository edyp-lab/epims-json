/*
 * Copyright (C) 2021
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the CeCILL FREE SOFTWARE LICENSE AGREEMENT
 * ; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * CeCILL License V2.1 for more details.
 *
 * You should have received a copy of the CeCILL License
 * along with this program; If not, see <http://www.cecill.info/licences/Licence_CeCILL_V2.1-en.html>.
 */

package fr.edyp.epims.json;

public class FtpConfigurationJson implements java.io.Serializable {

    private String m_host;
    private String m_login;
    private String m_password;

    private String m_startPath;
    private String[] m_subDirs;

    public FtpConfigurationJson() {

    }

    public FtpConfigurationJson(String host, String login, String password, String startPath, String[] subDirs) {
        m_host = host;
        m_login = login;
        m_password = password;
        m_startPath = startPath;
        m_subDirs = subDirs;
    }

    public String getHost() {
        return m_host;
    }
    public void setHost(String host) {
        this.m_host = host;
    }

    public String getLogin() {
        return m_login;
    }
    public void setLogin(String login) {
        this.m_login = login;
    }

    public String getPassword() {
        return m_password;
    }
    public void setPassword(String password) {
        this.m_password = password;
    }

    public String getStartPath() {
        return m_startPath;
    }
    public void setStartPath(String startPath) {
        this.m_startPath = startPath;
    }

    public String getStartPathDirectoryName() {
        int index = m_startPath.indexOf('/');
        if (index == -1) {
            return m_startPath;
        }
        return m_startPath.substring(index+1);
    }

    public String[] getSubDirs() {
        return m_subDirs;
    }

    public void setSubDirs(String[] subDirs) {
        m_subDirs = subDirs;
    }

}

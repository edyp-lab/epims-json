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




public class ActorJson  implements java.io.Serializable, Comparable<ActorJson> {

    private String login;
    private ContactJson contact;
    private String role;
    private String passwd;


    public ActorJson() {
    }

    public ActorJson(String login, ContactJson contact, String role, String passwd) {
        this.login = login;
        this.contact = contact;
        this.role = role;
        this.passwd = passwd;
    }


    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public ContactJson getContact() {
        return this.contact;
    }

    public void setContact(ContactJson contact) {
        this.contact = contact;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPasswd() {
        return this.passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return login;
    }

    @Override
    public int compareTo(ActorJson o) {
        return contact.getLastName().compareToIgnoreCase(o.contact.getLastName());
    }
}
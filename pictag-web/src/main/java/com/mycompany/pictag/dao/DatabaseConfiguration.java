/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.pictag.dao;

/**
 *
 * @author User
 */
public class DatabaseConfiguration {
    private String databaseDriverName;
    private String databaseUrl;
    private String databaseUsername;
    private String databasePassword;


    public String getDatabaseDriverName() {
        return databaseDriverName;
    }

    public void setDatabaseDriverName(String databaseDriverName) {
        this.databaseDriverName = databaseDriverName;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public String getDatabaseUsername() {
        return databaseUsername;
    }

    public void setDatabaseUsername(String databaseUsername) {
        this.databaseUsername = databaseUsername;
    }

    public String getDatabasePassword() {
        return databasePassword;
    }

    public void setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
    }
}

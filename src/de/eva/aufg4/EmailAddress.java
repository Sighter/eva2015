package de.eva.aufg4;

public class EmailAddress {

    private String user;
    private String domain;
    private String lang;

    public EmailAddress(String user, String domain, String lang) {
        this.user = user;
        this.domain = domain;
        this.lang = lang;
    }

    public boolean equals(EmailAddress email) {
        if (this.user != email.getUser()) {
            return false;
        }
        if (this.domain != email.getDomain()) {
            return false;
        }
        if (this.lang != email.getLang()) {
            return false;
        }

        return true;
    }

    public String getUser() { return this.user; }
    public String getDomain() { return this.domain; }
    public String getLang() { return this.lang; }
}

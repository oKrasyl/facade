package org.example;

class User {

    long id;

    User referal = new User();

    public void setReferalId(long referalId) {
        this.referal.id = referalId;
    }
}

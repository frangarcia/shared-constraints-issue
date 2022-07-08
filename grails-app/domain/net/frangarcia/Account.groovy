package net.frangarcia

class Account {

    String name

    static constraints = {
        name(shared:'basicString')
    }
}

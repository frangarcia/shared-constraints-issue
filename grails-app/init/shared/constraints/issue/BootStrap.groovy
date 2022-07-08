package shared.constraints.issue

import net.frangarcia.Account

class BootStrap {

    def init = { servletContext ->
        Account account = new Account(name:"my account name").save()
        println "*"*100
        println "account id = ${account.id}"
        println "*"*100
    }
    def destroy = {
    }
}

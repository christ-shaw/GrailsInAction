package com.xzb.Hubbub

class User {

     String loginId
     String password
     String homepage
     Date dateCreated
     static hasOne=[profile: Profile]



    static constraints = {
        loginId size:3..20, unique:true,nullable:false
        password size:6..8,nullable:false,validator:{ passwd,user ->
            passwd != user.loginId
        }
        homepage url:true,nullable:true
        profile nullable:true
    }
}

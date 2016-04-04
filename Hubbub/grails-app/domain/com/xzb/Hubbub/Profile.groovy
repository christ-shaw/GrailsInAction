package com.xzb.Hubbub

class Profile {
    User user
    byte[] photo
    String fullName
    String bio
    String email
    String timeZone
    String country
    String jabberAddress
    String homepage


    static constraints = {
        fullName     blank : false
        bio          nullable : true, maxSize:1000
        homepage     url : true, nullable : true
        email        email:true,blank:false
        photo        nullable:true, maxsize: 2 * 1024 * 1024
        country      nullable:true
        timeZone     nullable:true
        jabberAddress email:true,nullable:true
    }
}

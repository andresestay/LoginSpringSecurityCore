package com.LoginSpringSecurityCore.auth

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'])
class PrivateController {

    def index() {
        render "hello from private.index"
    }
}

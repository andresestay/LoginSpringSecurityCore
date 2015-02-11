import com.LoginSpringSecurityCore.*
import com.LoginSpringSecurityCore.auth.Role
import com.LoginSpringSecurityCore.auth.User
import com.LoginSpringSecurityCore.auth.UserRole;

class BootStrap {

    def init = { servletContext ->

        def adminRole = Role.findOrSaveWhere(authority: 'ROLE_ADMIN')
        def user = User.findOrSaveWhere(username: 'andres', password: 'password', firstName: 'andres', lastName: 'Estay', emailAddress: 'andres.estay.e@gmail.com')

        if(!user.authorities.contains(adminRole)){
            UserRole.create(user,adminRole,true)
        }
    }


    def destroy = {
    }
}

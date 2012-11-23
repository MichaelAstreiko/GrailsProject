package racetrack

class UserController {
    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index = {
        redirect(action: "login", params: params)
    }

    def list = {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [userInstanceList: User.list(params),
                userInstanceTotal: User.count()]
    }

    def create = {
        def userInstance = new User()
        userInstance.properties = params
        return [userInstance: userInstance]
    }

    def show = {
        def userInstance = User.get(params.id)
        if (!userInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'user.label', default: 'User'), params.id])}"
        } else {
            [userInstance: userInstance]
        }
    }


    def save = {}
    def edit = {}
    def update = {}
    def delete = {}
    def login = {}
    def logout = {
        flash.message = "Goodbye, ${session.user.login}"
        session.user = null
        redirect(action: "login")

    }
    def authenticate = {
        def user = User.findByLoginAndPassword(params.login, params.password)
        if (user) {
            session.user = user
            flash.message = "Hello ${user.login}!".toString().encodeAsUnderscore()
            redirect(controller: "race", action: list)
        } else {
            flash.message = "Sorry, ${params.login}. Please, try again."
            redirect(action: "login")
        }
    }
}

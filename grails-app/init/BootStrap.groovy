class BootStrap {

    def init = { servletContext ->
        log.warn "BootStrap init{} ran"
    }
    def destroy = {
        log.warn "BootStrap destroy{} ran"
    }
}

package de.connect2x.tammy.screenshot

expect object PlatformResource {
    fun resource(path: String): ByteArray?
}
package de.connect2x.tammy.screenshot

import de.connect2x.trixnity.messenger.util.toByteArray
import platform.Foundation.NSBundle
import platform.Foundation.NSData
import platform.Foundation.dataWithContentsOfFile

actual object PlatformResource {
    actual fun resource(path: String): ByteArray? {
        val bundle = NSBundle.mainBundle
        val path = bundle.pathForResource(path.split(".")[0], path.split(".")[1]) ?: error("Unable to locate resource")
        return NSData.dataWithContentsOfFile(path)?.toByteArray() ?: error("Unable to read resource")
    }
}
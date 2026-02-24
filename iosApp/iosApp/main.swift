import TammyUI

if let value = ProcessInfo.processInfo.environment["SCREENSHOTS"] {
    if (value == "YES") {
        print("Special runner for making screenshots!")
        // TODO special version
        try MainKt.main(args: CommandLine.arguments)
    } else {
        try MainKt.main(args: CommandLine.arguments)
    }
}

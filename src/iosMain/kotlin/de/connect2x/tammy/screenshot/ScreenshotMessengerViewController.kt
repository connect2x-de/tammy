package de.connect2x.tammy.screenshot

import androidx.compose.ui.window.ComposeUIViewController
import com.arkivanov.essenty.lifecycle.Lifecycle
import de.connect2x.lognity.api.logger.Logger
import kotlinx.coroutines.flow.MutableStateFlow
import platform.UIKit.UIViewController

private val log: Logger = Logger("de.connect2x.tammy.screenshot.ScreenshotMessengerViewControllerKt")

fun ScreenshotMessengerViewController(lifecycle: Lifecycle, showRoom: MutableStateFlow<Boolean>): UIViewController {
    log.info { "Starting iOS client with SCREENSHOTS" }

    return ComposeUIViewController(
        configure = { enforceStrictPlistSanityCheck = false }
    ) {
        ScreenshotView(
//            when ((LocaleUtil.getTestLocale() ?: "en-US").substringBefore("-")) {
//                "de" -> Locale.GERMAN
//                else -> Locale.ENGLISH
//            }
            Locale.GERMAN, // FIXME
            showRoom,
        )
    }
}
package com.shasin.notificationbanner.util

import android.app.Activity
import android.content.Context
import android.graphics.Point
import android.view.Display

/**
 * Created by Pedro Torres on 11/13/2020
 */

/**
 * Returns the width of the current device.
 */
fun Activity.screenWidth(): Int {
    val display: Display = this.windowManager.defaultDisplay
    val size = Point()
    display.getSize(size)
    return size.x
}

/**
 * Converts dps [this] into pixels.
 */
fun Int.pixels(context: Context) = (this * context.resources.displayMetrics.density).toInt()
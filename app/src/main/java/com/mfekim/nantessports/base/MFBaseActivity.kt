package com.mfekim.nantessports.base

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity

/**
 * Base activity.
 */
abstract class MFBaseActivity : AppCompatActivity() {
    /**
     * Adds a new function to the FragmentManager class (Extension function).
     *
     * @see https://kotlinlang.org/docs/reference/extensions.html
     * @see https://kotlinlang.org/docs/reference/lambdas.html
     */
    inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
        beginTransaction().func().commit()
    }
}
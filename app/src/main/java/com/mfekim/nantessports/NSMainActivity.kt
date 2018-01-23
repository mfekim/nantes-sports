package com.mfekim.nantessports

import android.os.Bundle
import com.mfekim.nantessports.base.MFBaseActivity

/**
 * Main/Home screen.
 */
class NSMainActivity : MFBaseActivity() {
    /** Fragment tags. */
    private val MAIN_FRAGMENT_TAG = "main_fragment_tag";

    /**
     * @inheritDoc
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ns_activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.inTransaction {
                add(R.id.main_fragment_container, NSMainFragment.newInstance(), MAIN_FRAGMENT_TAG)
            }
        }
    }
}
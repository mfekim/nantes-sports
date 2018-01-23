package com.mfekim.nantessports

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Main/Home fragment.
 */
class NSMainFragment : Fragment() {
    /**
     *
     */
    companion object {
        fun newInstance() = NSMainFragment().apply {
            arguments = Bundle()
        }
    }

    /**
     * @inheritDoc
     */
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.ns_fragment_main, container, false)
    }
}
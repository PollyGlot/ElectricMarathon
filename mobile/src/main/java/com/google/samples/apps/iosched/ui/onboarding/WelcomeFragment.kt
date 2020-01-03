package com.google.samples.apps.iosched.ui.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.core.view.doOnLayout
import androidx.fragment.app.Fragment
import com.airbnb.lottie.LottieAnimationView
import com.google.samples.apps.iosched.R

/**
 * First page of onboarding showing a welcome message & branding animation.
 */
class WelcomeFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }
}

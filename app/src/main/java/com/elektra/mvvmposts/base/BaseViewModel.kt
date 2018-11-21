package com.elektra.mvvmposts.base

import android.arch.lifecycle.ViewModel
import com.elektra.mvvmposts.injection.component.DaggerViewModelInjector
import com.elektra.mvvmposts.injection.component.ViewModelInjector
import com.elektra.mvvmposts.injection.module.NetworkModule
import com.elektra.mvvmposts.ui.post.PostListViewModel
import com.elektra.mvvmposts.ui.post.PostViewModel

abstract class BaseViewModel:ViewModel() {
    private val injector:ViewModelInjector= DaggerViewModelInjector
            .builder()
            .networkModule(NetworkModule)
            .build()

    init {
        inject()
    }
    /**
     * Injects the required dependencies
     */

    private fun inject(){
        when(this){
            is PostListViewModel ->injector.inject(this)
            is PostViewModel ->injector.inject(this)
        }
    }
}
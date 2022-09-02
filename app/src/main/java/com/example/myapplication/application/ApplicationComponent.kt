package com.example.myapplication.application

import android.content.Context
import com.example.myapplication.di.FireBaseModule
import com.example.myapplication.di.NetWorkModule
import com.example.myapplication.ui.LoginActivity
import com.example.myapplication.ui.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [FireBaseModule::class,NetWorkModule::class])
interface ApplicationComponent {

    fun inject(loginActivity: LoginActivity)
    fun inject(mainActivity: MainActivity)
   @Component.Factory
   interface factory{
       fun create(@BindsInstance context: Context) : ApplicationComponent
   }


}
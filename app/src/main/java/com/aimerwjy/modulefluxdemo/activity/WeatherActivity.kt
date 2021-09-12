package com.aimerwjy.modulefluxdemo.activity;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aimerwjy.modulefluxdemo.R
import com.aimerwjy.modulefluxdemo.module.IntentModule
import com.aimerwjy.modulefluxdemo.module.NetModule
import com.aimerwjy.modulefluxdemo.state.WeatherActivityState

class WeatherActivity : AppCompatActivity() {

  lateinit var intentModule: IntentModule
  lateinit var netModule: NetModule
  lateinit var firstActivityState: WeatherActivityState

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
 
    intentModule = IntentModule(intent)
    netModule = NetModule()

  }
}

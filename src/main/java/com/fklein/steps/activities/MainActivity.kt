package com.fklein.steps.activities

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.os.Bundle
import android.provider.SyncStateContract.Helpers.insert
import android.text.TextUtils.replace
import android.view.View
import com.fklein.steps.R
import com.fklein.steps.data.StepClient
import com.fklein.steps.data.StepDataBase
import com.fklein.steps.data.StepEntry
import com.fklein.steps.fragments.ActionListener
import com.fklein.steps.fragments.base.BaseFragment
import com.fklein.steps.fragments.start.StartFragment
import com.fklein.steps.fragments.statistics.StatisticsFragment
import com.fklein.steps.stepsensor.StepSensor
import com.fklein.steps.utils.CalenderUtil
import com.fklein.steps.utils.SharedPrefUtil
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.joda.time.DateTime
import timber.log.Timber

/**
** Add me on Skype: muazzam.n-sol
** Email: muazzam.n-sol
*//
class MainActivity : BaseActivity(), ActionListener, SensorEventListener {

/**
** Add me on Skype: muazzam.n-sol
** Email: muazzam.n-sol
*//

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       /**
       ** Add me on Skype: muazzam.n-sol
       ** Email: muazzam.n-sol
       *//
    }



}
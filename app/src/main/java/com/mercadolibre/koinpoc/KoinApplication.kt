package com.mercadolibre.koinpoc

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

/**
 * Koin application
 *
 * @constructor Create empty Koin application
 */
class KoinApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@KoinApplication)
            modules(appModules)
        }
    }
}

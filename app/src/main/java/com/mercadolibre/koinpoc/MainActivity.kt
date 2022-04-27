package com.mercadolibre.koinpoc

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.logger.Level

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        observeCryptoCurrency()
    }

    private fun observeCryptoCurrency() {
        viewModel.cryptoCurrency.observe(this) {
            viewModel.cryptoCurrency.observe(this) {
                val cryptocurrencyList = findViewById<RecyclerView>(R.id.cryptocurrency_list)
                cryptocurrencyList.layoutManager = LinearLayoutManager(this)
                cryptocurrencyList.adapter = CryptocurrencyAdapter(it)
            }
        }
    }
}


package com.mercadolibre.koinpoc

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Main view model
 *
 * @property cryptocurrencyRepository
 * @constructor Create empty Main view model
 */
class MainViewModel constructor(
    private val cryptocurrencyRepository: CryptocurrencyRepository,
) : ViewModel() {
    private val cryptocurrencyEmitter = MutableLiveData<List<Cryptocurrency>>()
    val cryptoCurrency: LiveData<List<Cryptocurrency>> = cryptocurrencyEmitter

    init {
        loadCryptocurrency()
    }

    private fun loadCryptocurrency() {
        cryptocurrencyEmitter.value = cryptocurrencyRepository.getCryptoCurrency()
    }
}

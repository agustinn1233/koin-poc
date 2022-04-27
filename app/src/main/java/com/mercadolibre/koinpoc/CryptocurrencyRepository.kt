package com.mercadolibre.koinpoc

interface CryptocurrencyRepository {
    fun getCryptoCurrency(): List<Cryptocurrency>
}

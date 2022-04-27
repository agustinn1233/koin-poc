package com.mercadolibre.koinpoc

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModules = module {
    viewModel { MainViewModel(get<CryptocurrencyRepository>()) }
    single<CryptocurrencyRepository>(createdAtStart = true) { CryptocurrencyRepositoryImpl() }
}

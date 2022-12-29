package com.dacoding.stockmarketapp.di

import com.dacoding.stockmarketapp.data.csv.CSVParser
import com.dacoding.stockmarketapp.data.csv.CompanyListingsParser
import com.dacoding.stockmarketapp.data.csv.IntradayInfoParser
import com.dacoding.stockmarketapp.data.repository.StockRepositoryImpl
import com.dacoding.stockmarketapp.domain.model.CompanyListing
import com.dacoding.stockmarketapp.domain.model.IntradayInfo
import com.dacoding.stockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}
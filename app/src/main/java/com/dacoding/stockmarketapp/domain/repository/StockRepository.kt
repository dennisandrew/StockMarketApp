package com.dacoding.stockmarketapp.domain.repository

import com.dacoding.stockmarketapp.domain.model.CompanyInfo
import com.dacoding.stockmarketapp.domain.model.CompanyListing
import com.dacoding.stockmarketapp.domain.model.IntradayInfo
import com.dacoding.stockmarketapp.presentation.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {
    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}
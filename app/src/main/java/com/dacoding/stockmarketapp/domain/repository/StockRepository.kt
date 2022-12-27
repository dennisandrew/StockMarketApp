package com.dacoding.stockmarketapp.domain.repository

import com.dacoding.stockmarketapp.domain.model.CompanyListing
import com.dacoding.stockmarketapp.presentation.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {
    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}
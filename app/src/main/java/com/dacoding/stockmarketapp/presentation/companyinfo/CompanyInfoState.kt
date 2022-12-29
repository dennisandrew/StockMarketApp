package com.dacoding.stockmarketapp.presentation.companyinfo

import com.dacoding.stockmarketapp.domain.model.CompanyInfo
import com.dacoding.stockmarketapp.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)

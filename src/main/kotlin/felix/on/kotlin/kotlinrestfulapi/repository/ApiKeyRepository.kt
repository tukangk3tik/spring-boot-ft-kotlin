package felix.on.kotlin.kotlinrestfulapi.repository

import felix.on.kotlin.kotlinrestfulapi.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository: JpaRepository<ApiKey, String>
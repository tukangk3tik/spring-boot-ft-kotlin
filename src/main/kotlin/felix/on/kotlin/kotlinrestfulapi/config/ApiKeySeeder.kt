package felix.on.kotlin.kotlinrestfulapi.config

import felix.on.kotlin.kotlinrestfulapi.entity.ApiKey
import felix.on.kotlin.kotlinrestfulapi.repository.ApiKeyRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class ApiKeySeeder(val apiKeyRepository: ApiKeyRepository): ApplicationRunner {

    val apiKey = "SECRET"

    override fun run(args: ApplicationArguments?) {
        if (!apiKeyRepository.existsById(apiKey)) {
            val key = ApiKey(id = apiKey)
            apiKeyRepository.save(key)
        }
    }
}
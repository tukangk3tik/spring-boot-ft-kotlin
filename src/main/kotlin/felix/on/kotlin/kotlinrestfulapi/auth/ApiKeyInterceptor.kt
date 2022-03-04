package felix.on.kotlin.kotlinrestfulapi.auth

import felix.on.kotlin.kotlinrestfulapi.error.UnauthorizedException
import felix.on.kotlin.kotlinrestfulapi.repository.ApiKeyRepository
import org.springframework.stereotype.Component
import org.springframework.ui.ModelMap
import org.springframework.web.context.request.WebRequest
import org.springframework.web.context.request.WebRequestInterceptor
import java.lang.Exception

@Component
class ApiKeyInterceptor(val apiKeyRepository: ApiKeyRepository): WebRequestInterceptor {
    override fun preHandle(request: WebRequest) {
        val apiKey = request.getHeader("X-Api-Key") ?: throw UnauthorizedException()

        if (!apiKeyRepository.existsById(apiKey)) {
            throw UnauthorizedException( )
        }

        //if passed,   valid
    }

    override fun postHandle(request: WebRequest, model: ModelMap?) {
        // nothing
    }

    override fun afterCompletion(request: WebRequest, ex: Exception?) {
        // nothing
    }
}
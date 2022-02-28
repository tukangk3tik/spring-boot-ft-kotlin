package felix.on.kotlin.kotlinrestfulapi.service

import felix.on.kotlin.kotlinrestfulapi.model.CreateProductRequest
import felix.on.kotlin.kotlinrestfulapi.model.ProductResponse

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

}
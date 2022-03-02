package felix.on.kotlin.kotlinrestfulapi.service

import felix.on.kotlin.kotlinrestfulapi.model.CreateProductRequest
import felix.on.kotlin.kotlinrestfulapi.model.ProductResponse
import felix.on.kotlin.kotlinrestfulapi.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)

}
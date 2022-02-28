package felix.on.kotlin.kotlinrestfulapi.service.impl

import felix.on.kotlin.kotlinrestfulapi.entity.Product
import felix.on.kotlin.kotlinrestfulapi.model.CreateProductRequest
import felix.on.kotlin.kotlinrestfulapi.model.ProductResponse
import felix.on.kotlin.kotlinrestfulapi.repository.ProductRepository
import felix.on.kotlin.kotlinrestfulapi.service.ProductService
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl(val productRepository: ProductRepository): ProductService {

    override fun create(createProductRequest: CreateProductRequest): ProductResponse {
        val product = Product(
            id = createProductRequest.id,
            name = createProductRequest.name,
            price = createProductRequest.price,
            quantity = createProductRequest.quantity,
            createdAt = Date(),
            updatedAt = null
        )

        productRepository.save(product)

        return ProductResponse(
            id = product.id,
            name = product.name,
            price = product.price,
            quantity = product.quantity,
            createdAt = product.createdAt,
            updatedAt = product.updatedAt
        )
    }
}
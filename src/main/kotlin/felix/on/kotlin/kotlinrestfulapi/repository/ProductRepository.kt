package felix.on.kotlin.kotlinrestfulapi.repository

import felix.on.kotlin.kotlinrestfulapi.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository <Product, String> {}
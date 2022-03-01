package felix.on.kotlin.kotlinrestfulapi.controller

import felix.on.kotlin.kotlinrestfulapi.model.CreateProductRequest
import felix.on.kotlin.kotlinrestfulapi.model.ProductResponse
import felix.on.kotlin.kotlinrestfulapi.model.WebResponse
import felix.on.kotlin.kotlinrestfulapi.service.ProductService
import org.springframework.web.bind.annotation.*

@RestController
class ProductController(val productService: ProductService) {

    @PostMapping(
        value = ["/api/products"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createProduct(@RequestBody body: CreateProductRequest) : WebResponse<ProductResponse> {
        val productResponse = productService.create(body)

        return WebResponse(
            code = 200,
            status = "OK",
            data = productResponse
        )
    }

    @GetMapping(
        value = ["/api/products/{idProduct}"],
        produces = ["application/json"]
    )
    fun getProduct(@PathVariable("idProduct") id: String): WebResponse<ProductResponse> {
        val productResponse = productService.get(id)
        return WebResponse(
            code = 200,
            status = "OK",
            data = productResponse
        )
    }

}
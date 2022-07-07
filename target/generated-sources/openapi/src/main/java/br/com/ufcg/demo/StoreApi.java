/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package br.com.ufcg.demo;

import java.util.Map;
import br.com.ufcg.demo.model.Order;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-07T09:22:51.708616300-03:00[America/Sao_Paulo]")
@Validated
@Api(value = "store", description = "the store API")
public interface StoreApi {

    default StoreApiDelegate getDelegate() {
        return new StoreApiDelegate() {};
    }

    /**
     * DELETE /store/order/{orderId} : Delete purchase order by ID
     * For valid response try integer IDs with positive integer value.\\ \\ Negative or non-integer values will generate API errors
     *
     * @param orderId ID of the order that needs to be deleted (required)
     * @return Invalid ID supplied (status code 400)
     *         or Order not found (status code 404)
     */
    @ApiOperation(value = "Delete purchase order by ID", nickname = "deleteOrder", notes = "For valid response try integer IDs with positive integer value.\\ \\ Negative or non-integer values will generate API errors", tags={ "store", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Order not found") })
    @DeleteMapping(
        value = "/store/order/{orderId}"
    )
    default ResponseEntity<Void> deleteOrder(@Min(1L)@ApiParam(value = "ID of the order that needs to be deleted",required=true) @PathVariable("orderId") Long orderId) {
        return getDelegate().deleteOrder(orderId);
    }


    /**
     * GET /store/inventory : Returns pet inventories by status
     * Returns a map of status codes to quantities
     *
     * @return successful operation (status code 200)
     */
    @ApiOperation(value = "Returns pet inventories by status", nickname = "getInventory", notes = "Returns a map of status codes to quantities", response = Integer.class, responseContainer = "Map", authorizations = {
        
        @Authorization(value = "api_key")
         }, tags={ "store", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Map.class, responseContainer = "Map") })
    @GetMapping(
        value = "/store/inventory",
        produces = { "application/json" }
    )
    default ResponseEntity<Map<String, Integer>> getInventory() {
        return getDelegate().getInventory();
    }


    /**
     * GET /store/order/{orderId} : Find purchase order by ID
     * For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10.\\ \\ Other values will generated exceptions
     *
     * @param orderId ID of pet that needs to be fetched (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Order not found (status code 404)
     */
    @ApiOperation(value = "Find purchase order by ID", nickname = "getOrderById", notes = "For valid response try integer IDs with value >= 1 and <= 10.\\ \\ Other values will generated exceptions", response = Order.class, tags={ "store", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Order.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Order not found") })
    @GetMapping(
        value = "/store/order/{orderId}",
        produces = { "application/json", "application/xml" }
    )
    default ResponseEntity<Order> getOrderById(@Min(1L) @Max(10L) @ApiParam(value = "ID of pet that needs to be fetched",required=true) @PathVariable("orderId") Long orderId) {
        return getDelegate().getOrderById(orderId);
    }


    /**
     * POST /store/order : Place an order for a pet
     *
     * @param body order placed for purchasing the pet (required)
     * @return successful operation (status code 200)
     *         or Invalid Order (status code 400)
     */
    @ApiOperation(value = "Place an order for a pet", nickname = "placeOrder", notes = "", response = Order.class, tags={ "store", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Order.class),
        @ApiResponse(code = 400, message = "Invalid Order") })
    @PostMapping(
        value = "/store/order",
        produces = { "application/json", "application/xml" }
    )
    default ResponseEntity<Order> placeOrder(@ApiParam(value = "order placed for purchasing the pet" ,required=true )  @Valid @RequestBody Order body) {
        return getDelegate().placeOrder(body);
    }

}

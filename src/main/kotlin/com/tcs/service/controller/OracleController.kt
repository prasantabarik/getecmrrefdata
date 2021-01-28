package com.tcs.service.controller

import com.tcs.service.model.ASN2
import com.tcs.service.model.AuthCode
import com.tcs.service.model.ServiceResponse
import com.tcs.service.service.OracleService
import org.springframework.http.*
import org.springframework.http.converter.FormHttpMessageConverter
import org.springframework.util.LinkedMultiValueMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import java.nio.charset.StandardCharsets.UTF_8
import javax.persistence.EntityManager


@RestController
class OracleController(private val serv: OracleService, private val em: EntityManager) {

//    @GetMapping("/asn")
//    fun getASN(): ResponseEntity<MutableList<ASN2>> {
//        return ResponseEntity.ok().body(serv.getAll())
//    }

    @GetMapping("/depId/{departmentId}")
    fun getBy(@PathVariable departmentId: String): ResponseEntity<ServiceResponse> {
      var result = serv.findByQuery(departmentId)

        return ResponseEntity.ok(ServiceResponse("200",
                "SUCCESS", result))
    }


}
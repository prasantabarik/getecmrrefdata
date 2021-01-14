package com.tcs.service.controller

import com.tcs.service.model.ASN2
import com.tcs.service.model.ServiceResponse
import com.tcs.service.service.OracleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.repository.Query
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory

@RestController
class OracleController(private val serv: OracleService,private val em: EntityManager) {




    @GetMapping("/asn")
    fun getASN(): ResponseEntity<MutableList<ASN2>> {
        return ResponseEntity.ok().body(serv.getAll())
    }

    @GetMapping("/depId/{departmentId}")
    fun getBy(@PathVariable departmentId: String): ResponseEntity<ServiceResponse> {
      var result = serv.findByQuery(departmentId)

        return ResponseEntity.ok(ServiceResponse("200",
                "SUCCESS", result))
    }


}
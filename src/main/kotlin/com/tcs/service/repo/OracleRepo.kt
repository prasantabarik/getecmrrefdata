package com.tcs.service.repo

//import com.tcs.service.model.ASN
import com.tcs.service.model.ASN2
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository


@Repository
interface OracleRepo  : JpaRepository<ASN2, String> {

    fun findByDepartureId(id:String):MutableList<ASN2>


}
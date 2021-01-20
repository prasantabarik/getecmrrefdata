package com.tcs.service.service

//import com.tcs.service.model.ASN

import com.tcs.service.model.*
import com.tcs.service.repo.OracleRepo
import org.springframework.http.*
import org.springframework.stereotype.Service
import java.io.UnsupportedEncodingException
import java.net.URLEncoder
import java.util.*
import java.util.stream.Collectors


@Service
class OracleService(private val repo: OracleRepo) {

    fun getAll(): MutableList<ASN2> {
        return repo.findAll()
    }

  fun  findByQuery(depId: String) :MutableList<ASN2> {
        return repo.findByDepartureId(depId)
    }








}



package com.tcs.service.model

import java.io.Serializable
import java.util.*
import javax.persistence.*

@Entity
@IdClass(ASN2::class)
@Table(name = "ASN")
//@org.springframework.data.relational.core.mapping.Table
data class ASN2(

// @Id
// @GeneratedValue(strategy= GenerationType.AUTO)
// var Id:Int,
 @Id
 @Column(name = "DEPARTUREID")
 var departureId:String = "",
 @Id
 @Column(name = "GLNSHIPFROM")
 var glnshipfrom:String = "",
 @Id
 @Column(name = "GLNSHIPTO")
 var glnshipto:String = "",
 @Id
 @Column(name = "REFERENCENUMBEROFTRIP")
 var referencenumberoftrip:String = "",
 @Id
 @Column(name = "FINISHEDLOADINGDATETIME")
 var finishedloadingdatetime: Date = Date(),
 @Id
 @Column(name = "CONTAINERTYPEGTINPRIMARYCONTAI")
 var containertypegtinprimarycontai:String = "",
 @Id
 @Column(name = "SHIPUNITSSCC")
 var shipunitsscc:String = "",
 @Id
 @Column(name = "REFNUMBERPOINTOFDESTINATION")
 var refnumberpointofdestination:String = "",
 @Id
 @Column(name = "TOTALLOADWEIGHT")
 var totalloadweight:Int = 0,
 @Id
 @Column(name = "UOMWEIGHT")
 var uomweight:String = "",
 @Id
 @Column(name = "NUMBEROFPRIMARYCONTAINERS")
 var numberofprimarycontainers:Int = 0,
 @Id
 @Column(name = "CONTAINERTYPEGTIN")
 var containertypegtin:String = "",
 @Id
 @Column(name="NUMBEROFCONTAINERS")
        var numberofcontainers:Int = 0
        ) : Serializable

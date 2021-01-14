package com.tcs.service.model

import java.util.*


data class ECMR (

        var shipmentId: String = "",
        var messageNo: String,
        var messageCreationDateTime: String,
        var testIndicator: String?,
        var glnShipFrom: String = "",
        var glnShipTo: String = "",
        var referenceNumberOfTrip: String,
        var yearOfTrip: String,
        var finishedLoadingDateTime: Date,
        var freightDocumentId: String?,
        var arcCode: String? ,
        var arcCodeNeeded: Boolean = false,
        var orderInShipment: MutableList<OrderInShipment>?
)

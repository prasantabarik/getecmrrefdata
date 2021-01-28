package com.tcs.service.component


import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.skyscreamer.jsonassert.JSONAssert
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.*
import java.io.File

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension::class, MockitoExtension::class)
class ControllerTest: BaseTest() {


    @Autowired
    lateinit var mockMvc: MockMvc



    /**
     * Preparing Mock Stub For service class
     **/
    @BeforeEach
    fun setup() {

//        whenever(service.getById(id = dataId)).thenAnswer { getModel() }
//        whenever(service.getById(id = dataId)).thenAnswer { getModel() }

    }

    /**
     * Test Method  for Controller Get Endpoint
     * Service call is mocked
     **/


    @Test
    fun `verify get by id`() {

        val sampleStore = "./src/test/resources/contracts/jsons/getById.json"
        val expected = File(sampleStore).readText(Charsets.UTF_8)
        val result: MvcResult =
                mockMvc.get("/depId/{departmentId}", "106175")
                {
                    contentType = MediaType.APPLICATION_JSON
                }.andExpect { status { isOk } }.andReturn()

        JSONAssert.assertEquals(expected, result.response.contentAsString, false)
    }


}
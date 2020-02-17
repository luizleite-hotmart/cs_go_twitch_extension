package com.luizleite.csgowheretogo.entity

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MapPlaces {

    @Test
    fun `create map place from scratch`() {
        val mapPlace = MapPlace(name = "key.name", description = "key.description")
    }
}

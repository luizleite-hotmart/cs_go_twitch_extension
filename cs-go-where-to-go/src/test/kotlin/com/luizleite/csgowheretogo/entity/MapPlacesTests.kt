package com.luizleite.csgowheretogo.entity

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class MapPlacesTests {

    @Test
    fun `create map place from scratch`() {
        val mapPlace = MapPlace(name = "key.name", description = "key.description")
        assertEquals("key.name", mapPlace.name)
        assertEquals("key.description", mapPlace.description)
    }
}

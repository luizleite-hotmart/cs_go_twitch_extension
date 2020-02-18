package com.luizleite.csgowheretogo.entity

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class MapCSgoTest {


    @Test
    fun `createMap will create a map from CS GO`() {
        val map = MapCSgo(name = "map.name", competitive = true)
        assertEquals("map.name", map.name)
        assertTrue(map.competitive)
        val mapPlace = MapPlace(name = "name", description = "description")
        map.mapPlaces = listOf(mapPlace)
        assertFalse(map.mapPlaces!!.isEmpty())
    }
}
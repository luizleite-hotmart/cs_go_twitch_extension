package com.luizleite.csgowheretogo.repository

import com.luizleite.csgowheretogo.entity.MapPlace
import org.springframework.data.repository.CrudRepository

interface MapPlaceRepository : CrudRepository<MapPlace, Long> {
}
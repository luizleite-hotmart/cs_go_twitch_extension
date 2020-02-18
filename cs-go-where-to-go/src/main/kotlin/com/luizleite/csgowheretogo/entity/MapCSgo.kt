package com.luizleite.csgowheretogo.entity

import javax.persistence.*

@Entity
data class MapCSgo(var name: String = "", var competitive: Boolean = false) {


    @Id
    @GeneratedValue
    var id: Long = 0

    @Column
    @OneToMany(cascade = arrayOf(CascadeType.ALL))
    var mapPlaces: List<MapPlace>? = null
}

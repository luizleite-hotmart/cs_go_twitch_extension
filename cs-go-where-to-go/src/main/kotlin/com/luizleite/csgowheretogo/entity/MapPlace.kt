package com.luizleite.csgowheretogo.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class MapPlace(var name: String = "", var description: String = "") {

    @Id
    @GeneratedValue
    var id: Long = 0;
}

package com.example.repasodaniroom.modelo.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName="region")
data class Region(@ColumnInfo(name="nombre")
                   var nombre:String,
                    @ColumnInfo(name="longitud")
                    var longitud:Double,
                    @ColumnInfo(name="descripcion")
                    var descripcion:String) : Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name ="idRegion")
    var idRegion: Int = 0

}
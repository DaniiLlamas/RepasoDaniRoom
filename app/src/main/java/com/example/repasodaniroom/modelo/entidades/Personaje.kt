package com.example.repasodaniroom.modelo.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "personaje",
    foreignKeys = [
        ForeignKey(
            entity = Region::class,
            parentColumns = ["idRegion"],
            childColumns = ["idRegion"]
        )
    ])
data class Personaje(
    @ColumnInfo(name="nombre")
    var nombrePersonaje:String,
    @ColumnInfo(name="nivel")
    var nivel:Int,
    @ColumnInfo(name="idRegion")
    var idRegion: Int) : Serializable {

        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name ="idPersonaje")
        var idPersonaje=0

}
package com.example.repasodaniroom.modelo.interfaces

import androidx.room.*
import com.example.repasodaniroom.modelo.entidades.Personaje

@Dao
interface InterfaceDaoPersonaje {
    @Insert
    fun addPersonaje(pj:Personaje)

    @Query("SELECT * FROM personaje")
    fun getPersonaje():MutableList<Personaje>

    @Query("SELECT * FROM personaje WHERE nombre LIKE :nombre")
    fun getPersonajeNombre(nombre:String):Personaje

    @Query("SELECT * FROM personaje WHERE idRegion LIKE :idRegion")
    fun getPersonajesRegion(idRegion:Int):MutableList<Personaje>

    @Query("SELECT * FROM personaje WHERE nivel >= :lvlMin AND nivel <= :lvlMax")
    fun getPersonajesPorNivel(lvlMin : Int, lvlMax : Int):MutableList<Personaje>

    @Update
    fun updatePersonaje(pj:Personaje)

    @Delete
    fun deletePersonaje(pj:Personaje)


}
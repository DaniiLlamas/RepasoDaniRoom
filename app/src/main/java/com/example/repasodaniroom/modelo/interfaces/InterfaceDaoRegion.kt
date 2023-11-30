package com.example.repasodaniroom.modelo.interfaces

import androidx.room.*
import com.example.repasodaniroom.modelo.entidades.Region

@Dao
interface InterfaceDaoRegion {

    @Insert
    fun addRegion(rg:Region)

    @Query("SELECT * FROM region")
    fun getRegion():MutableList<Region>

    @Query("SELECT * FROM region where nombre Like :nombre")
    fun getRegion(nombre:String):Region

    @Query("SELECT * FROM region WHERE idRegion LIKE :idRegion")
    fun getRegionById(idRegion:Int):Region

    @Update
    fun updateRegion(rg:Region)

    @Delete
    fun deleteRegion(rg:Region)


}
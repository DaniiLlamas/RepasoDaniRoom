package com.example.repasodaniroom.modelo.conexion

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.repasodaniroom.modelo.entidades.Personaje
import com.example.repasodaniroom.modelo.entidades.Region
import com.example.repasodaniroom.modelo.interfaces.InterfaceDaoPersonaje
import com.example.repasodaniroom.modelo.interfaces.InterfaceDaoRegion

class BDRoom {
    @Database(entities = [Personaje::class, Region::class], version = 1)
    abstract class BaseDatos : RoomDatabase() {
        abstract fun daoPersonaje(): InterfaceDaoPersonaje
        abstract fun daoRegion(): InterfaceDaoRegion

        companion object {
            private lateinit var INSTANCE: BaseDatos
            fun getBaseDatos(context: Context): BaseDatos {
                if (!::INSTANCE.isInitialized) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        BaseDatos::class.java,
                        "personajesDB"
                    )
                        .allowMainThreadQueries()
                        .build()
                }
                return INSTANCE
            }
        }
    }
}
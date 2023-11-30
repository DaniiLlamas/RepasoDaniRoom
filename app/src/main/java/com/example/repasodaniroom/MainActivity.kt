package com.example.repasodaniroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.repasodaniroom.modelo.conexion.BDRoom
import com.example.repasodaniroom.modelo.entidades.Personaje
import com.example.repasodaniroom.modelo.entidades.Region
import com.example.repasodaniroom.modelo.interfaces.InterfaceDaoPersonaje
import com.example.repasodaniroom.modelo.interfaces.InterfaceDaoRegion

class MainActivity : AppCompatActivity() {
    lateinit var daoRegion: InterfaceDaoRegion
    lateinit var daoPersonaje: InterfaceDaoPersonaje


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val conexion = BDRoom.BaseDatos.getBaseDatos(this)
        daoRegion = conexion.daoRegion()
        daoPersonaje = conexion.daoPersonaje()
        /*  var reg1 = Region("Inazuma", 9982.02, "Nación del rayo")
        var reg2 = Region("Liyue", 9982.02, "Nación de la tierra")
        daoRegion.addRegion(reg1)
        daoRegion.addRegion(reg2)

        var pj1 = Personaje("Arataki Itto", 80, daoRegion.getRegion("Inazuma").idRegion)
        var pj2 = Personaje("Zhongli", 90, daoRegion.getRegion("Liyue").idRegion)

        daoPersonaje.addPersonaje(pj1)
        daoPersonaje.addPersonaje(pj2)

INSERT MASIVO 1*/

/*
        var rg3 = Region("Mondstadt", 39340.29, "Region del viento")
        daoRegion.addRegion(rg3)
        //--------------
        var regionc=daoRegion.getRegion("Paco")
        regionc.nombre = "Inazuma"
        daoRegion.updateRegion(regionc)

        var pj2 = Personaje("Hu Tao", 90, daoRegion.getRegion("Liyue").idRegion)
        var pj3 = Personaje("Kazuha", 88, daoRegion.getRegion("Inazuma").idRegion)
        var pj4 = Personaje("Ganyu", 85, daoRegion.getRegion("Liyue").idRegion)
        var pj6 = Personaje("Diluc", 80, daoRegion.getRegion("Mondstadt").idRegion);
        var pj7 = Personaje("Jean", 85, daoRegion.getRegion("Mondstadt").idRegion);
        var pj8 = Personaje("Xiao", 90, daoRegion.getRegion("Liyue").idRegion);
        var pj9 = Personaje("Ayaka", 88, daoRegion.getRegion("Inazuma").idRegion);
        var pj10 = Personaje("Eula", 87, daoRegion.getRegion("Mondstadt").idRegion);

        daoPersonaje.addPersonaje(pj2)
        daoPersonaje.addPersonaje(pj3)
        daoPersonaje.addPersonaje(pj4)
        daoPersonaje.addPersonaje(pj9)
        daoPersonaje.addPersonaje(pj6)
        daoPersonaje.addPersonaje(pj7)
        daoPersonaje.addPersonaje(pj8)
        daoPersonaje.addPersonaje(pj10)


 /*
        var pjRecogido = daoPersonaje.getPersonajeNombre("Arataki Itto")
        Log.d("PersonajeRecogido", pjRecogido.nombrePersonaje)

        var rgRecogida = daoRegion.getRegion("Inazuma")
        Log.d("Region recogida",rgRecogida.nombre)

*/
INSERT MASIVO 2


        var  lista=daoPersonaje.getPersonaje()

        for(v in lista){
            Log.d("personaje",v.toString())
        }
*/
        var listaInazuma = daoPersonaje.getPersonajesRegion(daoRegion.getRegion("Inazuma").idRegion)
        var listaMondstadt = daoPersonaje.getPersonajesRegion(daoRegion.getRegion("Mondstadt").idRegion)

        for( pi in listaInazuma){
            Log.d("PersonajeInazuma", "La region de ${daoRegion.getRegionById(pi.idRegion).nombre} cuenta con: ${pi.nombrePersonaje}")
        }

        for( pm in listaMondstadt){
            Log.d("PersonajeMonds", "La region de ${daoRegion.getRegionById(pm.idRegion).nombre} cuenta con: ${pm.nombrePersonaje}")
        }




    }
}
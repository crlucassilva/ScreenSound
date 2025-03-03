package br.com.alura.musicasBD.dados

import javax.persistence.EntityManager
import javax.persistence.Persistence

object Banco {
    fun getEntity(): EntityManager {
        val factory = Persistence.createEntityManagerFactory("screensound")
        return factory.createEntityManager()
    }
}
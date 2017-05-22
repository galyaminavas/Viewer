package model

import view.*

interface Observable {
    fun addObserver(observer: Observer)

    fun deleteObserver(observer: Observer)

    fun alertObservers()
}

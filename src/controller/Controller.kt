package controller

import java.io.File

interface Controller {
    fun validateFormat(file: File)
}

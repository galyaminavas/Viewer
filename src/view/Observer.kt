package view

import java.awt.image.BufferedImage

interface Observer {
    fun eventChange(image: BufferedImage)
}

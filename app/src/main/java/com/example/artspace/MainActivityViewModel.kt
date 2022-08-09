package com.example.artspace

class MainActivityViewModel {
    val allImages = setupImages()
    fun loadImageAndDetails(image: Int): ImageAndDetails {
        return allImages[image]
    }
}

fun setupImages(): List<ImageAndDetails> {
    return listOf(
        ImageAndDetails(R.drawable.first, R.string.first_image),
        ImageAndDetails(R.drawable.second, R.string.second_image),
        ImageAndDetails(R.drawable.third, R.string.third_image),
        ImageAndDetails(R.drawable.fourth, R.string.forth_image)
    )
}
package Classes.Annotations

import kotlin.reflect.full.findAnnotation

@ImAPlant
class Plant {
    fun trim() {}
    fun fertilize() {}

    @get:OnGet
    val isGrowing: Boolean = true

    //TODO: @set:OnSet
    val needsFood = false
}

annotation class ImAPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet

@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

fun reflections() {
    val classObj = Plant::class
    for (annotation in classObj.annotations) {
        println(annotation.annotationClass.simpleName)
    }

    val annotated = classObj.findAnnotation<ImAPlant>()

    annotated?.apply {
        println("Found a plant annotation!")
    }
}
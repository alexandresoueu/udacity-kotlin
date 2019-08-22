package Classes.Annotations

fun labels() {

    loop@ for (i: Int in 1..100) {
        for (j: Int in 1..100) {
            if (i > 10) break@loop
        }
    }
}
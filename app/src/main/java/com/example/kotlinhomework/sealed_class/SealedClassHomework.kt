package com.example.kotlinhomework.sealed_class

fun main() {
    getPurchaseStatus(PurchaseStatus.InProgress)
}

/**
 * Первый вариант решения
 */
fun getPurchaseStatus(status: PurchaseStatus) {
    when (status) {
        PurchaseStatus.InProgress -> println("доставка в процессе")
        PurchaseStatus.Ready -> println("доставка готова")
        is PurchaseStatus.Canceled -> {
            println("Доставка отменена, причина: ${status.reason}")
        }
    }
}

/**
 * Второй вариант решения
 */
fun getPurchaseStatus2(status: PurchaseStatus) = when (status) {
    PurchaseStatus.InProgress -> println("доставка в процессе")
    PurchaseStatus.Ready -> println("доставка готова")
    is PurchaseStatus.Canceled -> {
        println("Доставка отменена, причина: ${status.reason}")
    }

    else -> {
        println("Статус не доступен")
    }
}

/**
 * В качестве третьего варианта решения нужно класс PurchaseStatus переделать в sealed класс.
 * А для этого нужно поменять модификатор open на sealed. В таком случае, тело метода из исходного задания менять не нужно будет.
 * Для проверки решения, выполните изменения, описанные выше, раскомментите код, и вызовите метод getPurchaseStatus3 в методе main.
 */
//fun getPurchaseStatus3(status: PurchaseStatus) = when (status) {
//    PurchaseStatus.InProgress -> println("доставка в процессе")
//    PurchaseStatus.Ready -> println("доставка готова")
//    is PurchaseStatus.Canceled -> {
//        println("Доставка отменена, причина: ${status.reason}")
//    }
//}

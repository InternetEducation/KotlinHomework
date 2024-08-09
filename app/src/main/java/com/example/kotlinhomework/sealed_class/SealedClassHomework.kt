package com.example.kotlinhomework.sealed_class

fun main() {
    getPurchaseStatus(PurchaseStatus.InProgress)
}

/**
 * Первый вариант работы с sealed классами
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
 * Второй вариант работы с sealed классами
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

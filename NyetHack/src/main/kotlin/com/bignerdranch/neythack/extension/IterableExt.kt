package com.bignerdranch.neythack.extension

fun <T> Iterable<T>.random(): T = this.shuffled().first()
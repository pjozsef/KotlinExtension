package com.github.pjozsef.extension.core.integer

inline infix fun Int.times(action: (index: Int) -> Unit){
    for(i in 1..this){
        action(i)
    }
}
package com.github.pjozsef.extension.core.bool

inline operator fun Boolean.invoke(action: () -> Unit): Boolean{
    if(this){
        action()
    }
    return this
}

inline infix fun Boolean.otherwise(action: () -> Unit): Boolean{
    if(!this) {
        action()
    }
    return this
}

inline infix fun Boolean.then(action: ()->Unit): Boolean{
    if(this){
        action()
    }
    return this
}

inline fun ifNot(bool: Boolean, action: ()->Unit){
    if(!bool){
        action()
    }
}
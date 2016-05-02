package com.github.pjozsef.extension.core.bool

operator fun Boolean.invoke(action: () -> Unit): Boolean{
    if(this){
        action()
    }
    return this
}

infix fun Boolean.otherwise(action: () -> Unit): Boolean{
    if(!this) {
        action()
    }
    return this
}

infix fun Boolean.then(action: ()->Unit): Boolean{
    if(this){
        action()
    }
    return this
}
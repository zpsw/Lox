package com.craftinginterpreters.lox;

/**
 * @author: zpsw
 * @date: 2023/6/5
 * @description:
 */
class Return extends RuntimeException {

    final Object value;

    public Return(Object value) {
        super(null, null, false, false);
        this.value = value;
    }
}

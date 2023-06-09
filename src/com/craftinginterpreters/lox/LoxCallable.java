package com.craftinginterpreters.lox;

import java.util.List;

/**
 * @author: zpsw
 * @date: 2023/6/5
 * @description:
 */
interface LoxCallable {

    int arity();

    Object call(Interpreter interpreter, List<Object> arguments);
}

package com.github.nscuro.bradamsang.command;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.github.nscuro.bradamsang.command.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExecutionResult_getStdoutOutput_20404896686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83;

    public ExecutionResult_getStdoutOutput_20404896686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83 = newInstance(Class.forName("com.github.nscuro.bradamsang.command.ExecutionResult"));
        setIntField(term83, term83.getClass(), "exitCode", 0);
        setField(term83, term83.getClass(), "stdoutOutput", null);
        setField(term83, term83.getClass(), "stderrOutput", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nscuro.bradamsang.command.ExecutionResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStdoutOutput", argTypes, term83, args);
    }

};



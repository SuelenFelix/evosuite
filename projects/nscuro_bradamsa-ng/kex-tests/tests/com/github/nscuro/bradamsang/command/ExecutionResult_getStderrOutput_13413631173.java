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

public class ExecutionResult_getStderrOutput_13413631173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;

    public ExecutionResult_getStderrOutput_13413631173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = newInstance(Class.forName("com.github.nscuro.bradamsang.command.ExecutionResult"));
        byte[] term61 = (byte[]) newByteArray(2);
        byte[] term64 = (byte[]) newByteArray(6);
        setIntField(term59, term59.getClass(), "exitCode", 391863371);
        setByteElement(term61, 0, (byte) -16);
        setByteElement(term61, 1, (byte) -112);
        setField(term59, term59.getClass(), "stdoutOutput", term61);
        setByteElement(term64, 0, (byte) -111);
        setByteElement(term64, 1, (byte) 23);
        setByteElement(term64, 2, (byte) -15);
        setByteElement(term64, 3, (byte) 36);
        setByteElement(term64, 4, (byte) 118);
        setByteElement(term64, 5, (byte) 106);
        setField(term59, term59.getClass(), "stderrOutput", term64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nscuro.bradamsang.command.ExecutionResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStderrOutput", argTypes, term59, args);
    }

};



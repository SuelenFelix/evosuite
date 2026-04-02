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

public class ExecutionResult_getExitCode_8639661711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public ExecutionResult_getExitCode_8639661711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("com.github.nscuro.bradamsang.command.ExecutionResult"));
        byte[] term25 = (byte[]) newByteArray(3);
        byte[] term29 = (byte[]) newByteArray(4);
        setIntField(term23, term23.getClass(), "exitCode", 1162663216);
        setByteElement(term25, 0, (byte) 79);
        setByteElement(term25, 1, (byte) -119);
        setByteElement(term25, 2, (byte) -66);
        setField(term23, term23.getClass(), "stdoutOutput", term25);
        setByteElement(term29, 0, (byte) 83);
        setByteElement(term29, 1, (byte) 74);
        setByteElement(term29, 2, (byte) -71);
        setByteElement(term29, 3, (byte) 49);
        setField(term23, term23.getClass(), "stderrOutput", term29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nscuro.bradamsang.command.ExecutionResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExitCode", argTypes, term23, args);
    }

};



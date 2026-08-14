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

public class ExecutionResult_getStdoutOutput_20404896682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41;

    public ExecutionResult_getStdoutOutput_20404896682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41 = newInstance(Class.forName("com.github.nscuro.bradamsang.command.ExecutionResult"));
        byte[] term43 = (byte[]) newByteArray(1);
        byte[] term45 = (byte[]) newByteArray(6);
        setIntField(term41, term41.getClass(), "exitCode", 1484323161);
        setByteElement(term43, 0, (byte) -54);
        setField(term41, term41.getClass(), "stdoutOutput", term43);
        setByteElement(term45, 0, (byte) 67);
        setByteElement(term45, 1, (byte) 78);
        setByteElement(term45, 2, (byte) 87);
        setByteElement(term45, 3, (byte) 121);
        setByteElement(term45, 4, (byte) -99);
        setByteElement(term45, 5, (byte) -2);
        setField(term41, term41.getClass(), "stderrOutput", term45);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nscuro.bradamsang.command.ExecutionResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStdoutOutput", argTypes, term41, args);
    }

};



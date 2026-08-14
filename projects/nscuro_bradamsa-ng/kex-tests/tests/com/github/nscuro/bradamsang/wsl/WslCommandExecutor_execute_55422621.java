package com.github.nscuro.bradamsang.wsl;

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
import static com.github.nscuro.bradamsang.wsl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class WslCommandExecutor_execute_55422621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165;
     Object term178;
     Object term223;

    public WslCommandExecutor_execute_55422621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165 = newInstance(Class.forName("com.github.nscuro.bradamsang.wsl.WslCommandExecutor"));
        setField(term165, term165.getClass(), "delegateCommandExecutor", null);
        setField(term165, term165.getClass(), "distributionName", "SzjVpOQTyS");
        term178 = new LinkedList();
        ((LinkedList) term178).add("MjGYSRKTNF");
        ((LinkedList) term178).add("hRNSzYYIrc");
        ((LinkedList) term178).add("");
        ((LinkedList) term178).add((Object)null);
        ((LinkedList) term178).add((Object)null);
        term223 = (byte[]) newByteArray(9);
        setByteElement(term223, 0, (byte) 47);
        setByteElement(term223, 1, (byte) 48);
        setByteElement(term223, 2, (byte) 89);
        setByteElement(term223, 3, (byte) 75);
        setByteElement(term223, 4, (byte) 18);
        setByteElement(term223, 5, (byte) -58);
        setByteElement(term223, 6, (byte) -29);
        setByteElement(term223, 7, (byte) -54);
        setByteElement(term223, 8, (byte) -10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nscuro.bradamsang.wsl.WslCommandExecutor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term178;
        args[1] = term223;
        callMethod(klass, "execute", argTypes, term165, args);
    }

};



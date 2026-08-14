package net.alenzen.a2l;

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
import static net.alenzen.a2l.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class A2LWriter_write_17094074317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23335;

    public A2LWriter_write_17094074317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23335 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23336 = (byte[]) newByteArray(9);
        byte[] term23346 = (byte[]) newByteArray(3);
        setByteElement(term23336, 0, (byte) 103);
        setByteElement(term23336, 1, (byte) -63);
        setByteElement(term23336, 2, (byte) 39);
        setByteElement(term23336, 3, (byte) -54);
        setByteElement(term23336, 4, (byte) 9);
        setByteElement(term23336, 5, (byte) 19);
        setByteElement(term23336, 6, (byte) -103);
        setByteElement(term23336, 7, (byte) 61);
        setByteElement(term23336, 8, (byte) -90);
        setField(term23335, term23335.getClass(), "lineBreak", term23336);
        setByteElement(term23346, 0, (byte) -27);
        setByteElement(term23346, 1, (byte) 119);
        setByteElement(term23346, 2, (byte) -125);
        setField(term23335, term23335.getClass(), "indentation", term23346);
        setField(term23335, term23335.getClass(), "charset", null);
        setField(term23335, term23335.getClass(), "os", null);
        setIntField(term23335, term23335.getClass(), "indentationDepth", -1888585309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iIRsCSYqXH";
        callMethod(klass, "write", argTypes, term23335, args);
    }

};



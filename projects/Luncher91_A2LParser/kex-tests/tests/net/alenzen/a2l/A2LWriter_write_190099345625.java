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

public class A2LWriter_write_190099345625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23901;

    public A2LWriter_write_190099345625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23901 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23902 = (byte[]) newByteArray(9);
        byte[] term23912 = (byte[]) newByteArray(6);
        setByteElement(term23902, 0, (byte) -34);
        setByteElement(term23902, 1, (byte) 73);
        setByteElement(term23902, 2, (byte) 10);
        setByteElement(term23902, 3, (byte) 36);
        setByteElement(term23902, 4, (byte) 103);
        setByteElement(term23902, 5, (byte) -64);
        setByteElement(term23902, 6, (byte) -107);
        setByteElement(term23902, 7, (byte) 119);
        setByteElement(term23902, 8, (byte) -109);
        setField(term23901, term23901.getClass(), "lineBreak", term23902);
        setByteElement(term23912, 0, (byte) 87);
        setByteElement(term23912, 1, (byte) 97);
        setByteElement(term23912, 2, (byte) 51);
        setByteElement(term23912, 3, (byte) 24);
        setByteElement(term23912, 4, (byte) -14);
        setByteElement(term23912, 5, (byte) 74);
        setField(term23901, term23901.getClass(), "indentation", term23912);
        setField(term23901, term23901.getClass(), "charset", null);
        setField(term23901, term23901.getClass(), "os", null);
        setIntField(term23901, term23901.getClass(), "indentationDepth", 906181092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.alenzen.a2l.IA2LDimensionWriteable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "SIODFGaQhr";
        callMethod(klass, "write", argTypes, term23901, args);
    }

};



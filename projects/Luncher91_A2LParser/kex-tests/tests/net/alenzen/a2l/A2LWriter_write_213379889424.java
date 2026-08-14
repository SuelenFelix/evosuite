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
import java.util.LinkedList;

public class A2LWriter_write_213379889424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23880;
     Object term23891;

    public A2LWriter_write_213379889424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23880 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23881 = (byte[]) newByteArray(1);
        byte[] term23883 = (byte[]) newByteArray(6);
        setByteElement(term23881, 0, (byte) -120);
        setField(term23880, term23880.getClass(), "lineBreak", term23881);
        setByteElement(term23883, 0, (byte) -55);
        setByteElement(term23883, 1, (byte) 91);
        setByteElement(term23883, 2, (byte) 55);
        setByteElement(term23883, 3, (byte) -5);
        setByteElement(term23883, 4, (byte) -4);
        setByteElement(term23883, 5, (byte) -61);
        setField(term23880, term23880.getClass(), "indentation", term23883);
        setField(term23880, term23880.getClass(), "charset", null);
        setField(term23880, term23880.getClass(), "os", null);
        setIntField(term23880, term23880.getClass(), "indentationDepth", -1963434938);
        term23891 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term23891;
        callMethod(klass, "write", argTypes, term23880, args);
    }

};



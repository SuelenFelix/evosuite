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

public class A2LWriter_writeA2LString_166340743512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23597;

    public A2LWriter_writeA2LString_166340743512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23597 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23598 = (byte[]) newByteArray(4);
        byte[] term23603 = (byte[]) newByteArray(7);
        setByteElement(term23598, 0, (byte) 114);
        setByteElement(term23598, 1, (byte) 110);
        setByteElement(term23598, 2, (byte) 70);
        setByteElement(term23598, 3, (byte) -46);
        setField(term23597, term23597.getClass(), "lineBreak", term23598);
        setByteElement(term23603, 0, (byte) -78);
        setByteElement(term23603, 1, (byte) 109);
        setByteElement(term23603, 2, (byte) 17);
        setByteElement(term23603, 3, (byte) -126);
        setByteElement(term23603, 4, (byte) 35);
        setByteElement(term23603, 5, (byte) -46);
        setByteElement(term23603, 6, (byte) -14);
        setField(term23597, term23597.getClass(), "indentation", term23603);
        setField(term23597, term23597.getClass(), "charset", null);
        setField(term23597, term23597.getClass(), "os", null);
        setIntField(term23597, term23597.getClass(), "indentationDepth", -663691365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WVRMUmrljA";
        callMethod(klass, "writeA2LString", argTypes, term23597, args);
    }

};



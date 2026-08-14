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

public class A2LWriter_setLineBreak_162526286621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23809;
     Object term23825;

    public A2LWriter_setLineBreak_162526286621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23809 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23810 = (byte[]) newByteArray(7);
        byte[] term23818 = (byte[]) newByteArray(5);
        setByteElement(term23810, 0, (byte) -41);
        setByteElement(term23810, 1, (byte) -70);
        setByteElement(term23810, 2, (byte) -5);
        setByteElement(term23810, 3, (byte) 119);
        setByteElement(term23810, 4, (byte) 81);
        setByteElement(term23810, 5, (byte) -28);
        setByteElement(term23810, 6, (byte) -18);
        setField(term23809, term23809.getClass(), "lineBreak", term23810);
        setByteElement(term23818, 0, (byte) -61);
        setByteElement(term23818, 1, (byte) 70);
        setByteElement(term23818, 2, (byte) 89);
        setByteElement(term23818, 3, (byte) -99);
        setByteElement(term23818, 4, (byte) 59);
        setField(term23809, term23809.getClass(), "indentation", term23818);
        setField(term23809, term23809.getClass(), "charset", null);
        setField(term23809, term23809.getClass(), "os", null);
        setIntField(term23809, term23809.getClass(), "indentationDepth", 890669485);
        term23825 = (byte[]) newByteArray(4);
        setByteElement(term23825, 0, (byte) -99);
        setByteElement(term23825, 1, (byte) 61);
        setByteElement(term23825, 2, (byte) 100);
        setByteElement(term23825, 3, (byte) 55);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term23825;
        callMethod(klass, "setLineBreak", argTypes, term23809, args);
    }

};



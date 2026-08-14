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

public class A2LWriter_dedent_84917131518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23745;

    public A2LWriter_dedent_84917131518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23745 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23746 = (byte[]) newByteArray(2);
        byte[] term23749 = (byte[]) newByteArray(3);
        setByteElement(term23746, 0, (byte) -119);
        setByteElement(term23746, 1, (byte) 94);
        setField(term23745, term23745.getClass(), "lineBreak", term23746);
        setByteElement(term23749, 0, (byte) -52);
        setByteElement(term23749, 1, (byte) -33);
        setByteElement(term23749, 2, (byte) 16);
        setField(term23745, term23745.getClass(), "indentation", term23749);
        setField(term23745, term23745.getClass(), "charset", null);
        setField(term23745, term23745.getClass(), "os", null);
        setIntField(term23745, term23745.getClass(), "indentationDepth", -341962980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "dedent", argTypes, term23745, args);
    }

};



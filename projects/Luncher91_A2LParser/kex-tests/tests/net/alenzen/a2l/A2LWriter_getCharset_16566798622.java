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

public class A2LWriter_getCharset_16566798622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23846;

    public A2LWriter_getCharset_16566798622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23846 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23847 = (byte[]) newByteArray(1);
        byte[] term23849 = (byte[]) newByteArray(5);
        setByteElement(term23847, 0, (byte) -111);
        setField(term23846, term23846.getClass(), "lineBreak", term23847);
        setByteElement(term23849, 0, (byte) -127);
        setByteElement(term23849, 1, (byte) 19);
        setByteElement(term23849, 2, (byte) 83);
        setByteElement(term23849, 3, (byte) -57);
        setByteElement(term23849, 4, (byte) 103);
        setField(term23846, term23846.getClass(), "indentation", term23849);
        setField(term23846, term23846.getClass(), "charset", null);
        setField(term23846, term23846.getClass(), "os", null);
        setIntField(term23846, term23846.getClass(), "indentationDepth", 691577392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharset", argTypes, term23846, args);
    }

};



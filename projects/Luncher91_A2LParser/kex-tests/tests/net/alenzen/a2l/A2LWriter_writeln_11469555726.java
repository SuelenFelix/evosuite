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

public class A2LWriter_writeln_11469555726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23309;

    public A2LWriter_writeln_11469555726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23309 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23310 = (byte[]) newByteArray(6);
        byte[] term23317 = (byte[]) newByteArray(5);
        setByteElement(term23310, 0, (byte) -27);
        setByteElement(term23310, 1, (byte) 120);
        setByteElement(term23310, 2, (byte) -25);
        setByteElement(term23310, 3, (byte) 114);
        setByteElement(term23310, 4, (byte) 105);
        setByteElement(term23310, 5, (byte) -95);
        setField(term23309, term23309.getClass(), "lineBreak", term23310);
        setByteElement(term23317, 0, (byte) -6);
        setByteElement(term23317, 1, (byte) 51);
        setByteElement(term23317, 2, (byte) 122);
        setByteElement(term23317, 3, (byte) 84);
        setByteElement(term23317, 4, (byte) -36);
        setField(term23309, term23309.getClass(), "indentation", term23317);
        setField(term23309, term23309.getClass(), "charset", null);
        setField(term23309, term23309.getClass(), "os", null);
        setIntField(term23309, term23309.getClass(), "indentationDepth", -1347665717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "writeln", argTypes, term23309, args);
    }

};



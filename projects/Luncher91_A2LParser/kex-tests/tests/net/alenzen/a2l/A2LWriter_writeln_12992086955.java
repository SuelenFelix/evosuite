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

public class A2LWriter_writeln_12992086955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23261;

    public A2LWriter_writeln_12992086955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23261 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23262 = (byte[]) newByteArray(2);
        byte[] term23265 = (byte[]) newByteArray(9);
        setByteElement(term23262, 0, (byte) -10);
        setByteElement(term23262, 1, (byte) -106);
        setField(term23261, term23261.getClass(), "lineBreak", term23262);
        setByteElement(term23265, 0, (byte) -124);
        setByteElement(term23265, 1, (byte) -71);
        setByteElement(term23265, 2, (byte) 113);
        setByteElement(term23265, 3, (byte) -77);
        setByteElement(term23265, 4, (byte) -12);
        setByteElement(term23265, 5, (byte) 58);
        setByteElement(term23265, 6, (byte) 12);
        setByteElement(term23265, 7, (byte) 79);
        setByteElement(term23265, 8, (byte) -4);
        setField(term23261, term23261.getClass(), "indentation", term23265);
        setField(term23261, term23261.getClass(), "charset", null);
        setField(term23261, term23261.getClass(), "os", null);
        setIntField(term23261, term23261.getClass(), "indentationDepth", 304775596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pJbnHTYrxn";
        callMethod(klass, "writeln", argTypes, term23261, args);
    }

};



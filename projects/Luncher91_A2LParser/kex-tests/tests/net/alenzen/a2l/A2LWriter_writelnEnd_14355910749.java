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

public class A2LWriter_writelnEnd_14355910749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23480;

    public A2LWriter_writelnEnd_14355910749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23480 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23481 = (byte[]) newByteArray(8);
        byte[] term23490 = (byte[]) newByteArray(2);
        setByteElement(term23481, 0, (byte) 33);
        setByteElement(term23481, 1, (byte) 109);
        setByteElement(term23481, 2, (byte) -54);
        setByteElement(term23481, 3, (byte) -85);
        setByteElement(term23481, 4, (byte) 81);
        setByteElement(term23481, 5, (byte) -113);
        setByteElement(term23481, 6, (byte) 90);
        setByteElement(term23481, 7, (byte) 10);
        setField(term23480, term23480.getClass(), "lineBreak", term23481);
        setByteElement(term23490, 0, (byte) 87);
        setByteElement(term23490, 1, (byte) -35);
        setField(term23480, term23480.getClass(), "indentation", term23490);
        setField(term23480, term23480.getClass(), "charset", null);
        setField(term23480, term23480.getClass(), "os", null);
        setIntField(term23480, term23480.getClass(), "indentationDepth", 1596213415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rYbtIDVdnd";
        callMethod(klass, "writelnEnd", argTypes, term23480, args);
    }

};



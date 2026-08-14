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
import java.lang.Long;

public class A2LWriter_write_186166346811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23571;
     Object term23585;

    public A2LWriter_write_186166346811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23571 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        byte[] term23572 = (byte[]) newByteArray(7);
        byte[] term23580 = (byte[]) newByteArray(3);
        setByteElement(term23572, 0, (byte) 49);
        setByteElement(term23572, 1, (byte) 114);
        setByteElement(term23572, 2, (byte) -81);
        setByteElement(term23572, 3, (byte) 127);
        setByteElement(term23572, 4, (byte) -24);
        setByteElement(term23572, 5, (byte) -89);
        setByteElement(term23572, 6, (byte) -35);
        setField(term23571, term23571.getClass(), "lineBreak", term23572);
        setByteElement(term23580, 0, (byte) -59);
        setByteElement(term23580, 1, (byte) 73);
        setByteElement(term23580, 2, (byte) 94);
        setField(term23571, term23571.getClass(), "indentation", term23580);
        setField(term23571, term23571.getClass(), "charset", null);
        setField(term23571, term23571.getClass(), "os", null);
        setIntField(term23571, term23571.getClass(), "indentationDepth", -1210583429);
        term23585 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term23585;
        callMethod(klass, "write", argTypes, term23571, args);
    }

};



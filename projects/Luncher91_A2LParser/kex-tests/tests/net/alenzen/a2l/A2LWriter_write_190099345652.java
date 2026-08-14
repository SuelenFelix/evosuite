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

public class A2LWriter_write_190099345652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24045;

    public A2LWriter_write_190099345652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24045 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        setField(term24045, term24045.getClass(), "lineBreak", null);
        setField(term24045, term24045.getClass(), "indentation", null);
        setField(term24045, term24045.getClass(), "charset", null);
        setField(term24045, term24045.getClass(), "os", null);
        setIntField(term24045, term24045.getClass(), "indentationDepth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.alenzen.a2l.IA2LDimensionWriteable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "write", argTypes, term24045, args);
    }

};



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

public class A2LWriter_write_186166346838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24013;
     Object term24015;

    public A2LWriter_write_186166346838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24013 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        setField(term24013, term24013.getClass(), "lineBreak", null);
        setField(term24013, term24013.getClass(), "indentation", null);
        setField(term24013, term24013.getClass(), "charset", null);
        setField(term24013, term24013.getClass(), "os", null);
        setIntField(term24013, term24013.getClass(), "indentationDepth", 0);
        term24015 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term24015;
        callMethod(klass, "write", argTypes, term24013, args);
    }

};



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

public class A2LWriter_writelnBeginSpaced_103960395035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24007;

    public A2LWriter_writelnBeginSpaced_103960395035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24007 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        setField(term24007, term24007.getClass(), "lineBreak", null);
        setField(term24007, term24007.getClass(), "indentation", null);
        setField(term24007, term24007.getClass(), "charset", null);
        setField(term24007, term24007.getClass(), "os", null);
        setIntField(term24007, term24007.getClass(), "indentationDepth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "writelnBeginSpaced", argTypes, term24007, args);
    }

};



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

public class A2LWriter_getIndentationDepth_155984893543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24025;

    public A2LWriter_getIndentationDepth_155984893543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24025 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        setField(term24025, term24025.getClass(), "lineBreak", null);
        setField(term24025, term24025.getClass(), "indentation", null);
        setField(term24025, term24025.getClass(), "charset", null);
        setField(term24025, term24025.getClass(), "os", null);
        setIntField(term24025, term24025.getClass(), "indentationDepth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIndentationDepth", argTypes, term24025, args);
    }

};



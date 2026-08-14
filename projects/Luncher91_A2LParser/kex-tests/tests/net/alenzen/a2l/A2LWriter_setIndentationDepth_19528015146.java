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
import java.lang.Integer;

public class A2LWriter_setIndentationDepth_19528015146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24031;
     Object term24033;

    public A2LWriter_setIndentationDepth_19528015146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24031 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        setField(term24031, term24031.getClass(), "lineBreak", null);
        setField(term24031, term24031.getClass(), "indentation", null);
        setField(term24031, term24031.getClass(), "charset", null);
        setField(term24031, term24031.getClass(), "os", null);
        setIntField(term24031, term24031.getClass(), "indentationDepth", 0);
        term24033 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term24033;
        callMethod(klass, "setIndentationDepth", argTypes, term24031, args);
    }

};



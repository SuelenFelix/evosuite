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

public class IdentReferenceList_toA2lAsBlock_9697873782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18391;

    public IdentReferenceList_toA2lAsBlock_9697873782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18391 = newInstance(Class.forName("net.alenzen.a2l.IdentReferenceList"));
        setField(term18391, term18391.getClass(), "elementData", null);
        setIntField(term18391, term18391.getClass(), "size", 0);
        setIntField(term18391, term18391.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.IdentReferenceList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.alenzen.a2l.A2LWriter");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "toA2lAsBlock", argTypes, term18391, args);
    }

};



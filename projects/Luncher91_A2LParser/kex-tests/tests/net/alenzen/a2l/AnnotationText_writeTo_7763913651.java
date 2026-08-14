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

public class AnnotationText_writeTo_7763913651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34024;

    public AnnotationText_writeTo_7763913651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34024 = newInstance(Class.forName("net.alenzen.a2l.AnnotationText"));
        setField(term34024, term34024.getClass(), "elementData", null);
        setIntField(term34024, term34024.getClass(), "size", 0);
        setIntField(term34024, term34024.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.AnnotationText");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.alenzen.a2l.A2LWriter");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "writeTo", argTypes, term34024, args);
    }

};



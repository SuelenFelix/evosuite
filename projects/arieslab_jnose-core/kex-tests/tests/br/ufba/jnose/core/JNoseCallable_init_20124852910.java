package br.ufba.jnose.core;

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
import static br.ufba.jnose.core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JNoseCallable_init_20124852910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term611;

    public JNoseCallable_init_20124852910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term611 = newInstance(Class.forName("br.ufba.jnose.core.JNoseCore"));
        setField(term611, term611.getClass(), "threadpool", null);
        setField(term611, term611.getClass(), "config", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.JNoseCallable");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.nio.file.Path");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.nio.file.Path");
        argTypes[3] = Class.forName("br.ufba.jnose.core.JNoseCore");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "eZFUvlxvGV";
        args[2] = null;
        args[3] = term611;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



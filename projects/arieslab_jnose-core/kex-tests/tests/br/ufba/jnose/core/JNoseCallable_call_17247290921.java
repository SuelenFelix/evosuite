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
import java.lang.Object;

public class JNoseCallable_call_17247290921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term622;

    public JNoseCallable_call_17247290921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term622 = newInstance(Class.forName("br.ufba.jnose.core.JNoseCallable"));
        Object term635 = newInstance(Class.forName("br.ufba.jnose.core.JNoseCore"));
        setField(term622, term622.getClass(), "filePath", null);
        setField(term622, term622.getClass(), "projectName", "BYqFIqCKAV");
        setField(term622, term622.getClass(), "startDir", null);
        setField(term635, term635.getClass(), "threadpool", null);
        setField(term635, term635.getClass(), "config", null);
        setField(term622, term622.getClass(), "jNoseCore", term635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.JNoseCallable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "call", argTypes, term622, args);
    }

};



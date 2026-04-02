package br.ufba.jnose.dto;

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
import static br.ufba.jnose.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TestSmell_setTestClass_118229801823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6373;

    public TestSmell_setTestClass_118229801823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6373 = newInstance(Class.forName("br.ufba.jnose.dto.TestSmell"));
        setField(term6373, term6373.getClass(), "name", null);
        setField(term6373, term6373.getClass(), "method", null);
        setField(term6373, term6373.getClass(), "range", null);
        setField(term6373, term6373.getClass(), "testClass", null);
        setField(term6373, term6373.getClass(), "code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestSmell");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.ufba.jnose.dto.TestClass");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTestClass", argTypes, term6373, args);
    }

};



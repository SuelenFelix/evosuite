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

public class TestSmell_getName_131962443019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6369;

    public TestSmell_getName_131962443019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6369 = newInstance(Class.forName("br.ufba.jnose.dto.TestSmell"));
        setField(term6369, term6369.getClass(), "name", null);
        setField(term6369, term6369.getClass(), "method", null);
        setField(term6369, term6369.getClass(), "range", null);
        setField(term6369, term6369.getClass(), "testClass", null);
        setField(term6369, term6369.getClass(), "code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestSmell");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term6369, args);
    }

};



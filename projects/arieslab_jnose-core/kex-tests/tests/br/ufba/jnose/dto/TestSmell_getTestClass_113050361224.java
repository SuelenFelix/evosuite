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

public class TestSmell_getTestClass_113050361224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6374;

    public TestSmell_getTestClass_113050361224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6374 = newInstance(Class.forName("br.ufba.jnose.dto.TestSmell"));
        setField(term6374, term6374.getClass(), "name", null);
        setField(term6374, term6374.getClass(), "method", null);
        setField(term6374, term6374.getClass(), "range", null);
        setField(term6374, term6374.getClass(), "testClass", null);
        setField(term6374, term6374.getClass(), "code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestSmell");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTestClass", argTypes, term6374, args);
    }

};



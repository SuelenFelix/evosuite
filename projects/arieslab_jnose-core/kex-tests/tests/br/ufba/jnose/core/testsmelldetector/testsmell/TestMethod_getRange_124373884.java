package br.ufba.jnose.core.testsmelldetector.testsmell;

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
import static br.ufba.jnose.core.testsmelldetector.testsmell.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class TestMethod_getRange_124373884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175;

    public TestMethod_getRange_124373884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term189 = new Integer(-1955890973);
        Integer term191 = new Integer(-2038273078);
        term175 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestMethod"));
        setField(term175, term175.getClass(), "methodName", "MjGYSRKTNF");
        setBooleanField(term175, term175.getClass(), "hasSmell", true);
        setField(term175, term175.getClass(), "begin", term189);
        setField(term175, term175.getClass(), "end", term191);
        setField(term175, term175.getClass(), "range", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRange", argTypes, term175, args);
    }

};



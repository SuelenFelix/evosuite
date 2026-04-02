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

public class TestFile_addSmell_116886141613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1821;

    public TestFile_addSmell_116886141613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1821 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile"));
        setField(term1821, term1821.getClass(), "testFilePath", null);
        setField(term1821, term1821.getClass(), "productionFilePath", null);
        setField(term1821, term1821.getClass(), "testSmells", null);
        setField(term1821, term1821.getClass(), "loc", null);
        setField(term1821, term1821.getClass(), "qtdMethods", null);
        setField(term1821, term1821.getClass(), "app", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.AbstractSmell");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addSmell", argTypes, term1821, args);
    }

};



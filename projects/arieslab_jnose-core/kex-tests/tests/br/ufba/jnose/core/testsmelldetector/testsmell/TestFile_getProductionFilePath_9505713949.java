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

public class TestFile_getProductionFilePath_9505713949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1818;

    public TestFile_getProductionFilePath_9505713949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1818 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile"));
        setField(term1818, term1818.getClass(), "testFilePath", null);
        setField(term1818, term1818.getClass(), "productionFilePath", null);
        setField(term1818, term1818.getClass(), "testSmells", null);
        setField(term1818, term1818.getClass(), "loc", null);
        setField(term1818, term1818.getClass(), "qtdMethods", null);
        setField(term1818, term1818.getClass(), "app", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProductionFilePath", argTypes, term1818, args);
    }

};



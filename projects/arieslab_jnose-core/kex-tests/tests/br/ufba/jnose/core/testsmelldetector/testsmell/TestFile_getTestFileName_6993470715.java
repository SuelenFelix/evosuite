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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class TestFile_getTestFileName_6993470715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1518;

    public TestFile_getTestFileName_6993470715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1543 = new ArrayList();
        ((ArrayList) term1543).add((Object)null);
        Integer term1547 = new Integer(-203030934);
        Integer term1549 = new Integer(-1179120542);
        term1518 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile"));
        setField(term1518, term1518.getClass(), "testFilePath", "dEnhdmILtU");
        setField(term1518, term1518.getClass(), "productionFilePath", "hoicvmsovO");
        setField(term1518, term1518.getClass(), "testSmells", term1543);
        setField(term1518, term1518.getClass(), "loc", term1547);
        setField(term1518, term1518.getClass(), "qtdMethods", term1549);
        setField(term1518, term1518.getClass(), "app", "eqJfYWRaEL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTestFileName", argTypes, term1518, args);
    }

};



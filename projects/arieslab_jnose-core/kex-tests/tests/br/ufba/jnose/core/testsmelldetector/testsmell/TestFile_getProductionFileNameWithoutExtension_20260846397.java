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

public class TestFile_getProductionFileNameWithoutExtension_20260846397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1668;

    public TestFile_getProductionFileNameWithoutExtension_20260846397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1693 = new ArrayList();
        ((ArrayList) term1693).add((Object)null);
        ((ArrayList) term1693).add((Object)null);
        Integer term1697 = new Integer(1193880199);
        Integer term1699 = new Integer(-1087774327);
        term1668 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile"));
        setField(term1668, term1668.getClass(), "testFilePath", "TJmVBGfTML");
        setField(term1668, term1668.getClass(), "productionFilePath", "tPlsykYBqO");
        setField(term1668, term1668.getClass(), "testSmells", term1693);
        setField(term1668, term1668.getClass(), "loc", term1697);
        setField(term1668, term1668.getClass(), "qtdMethods", term1699);
        setField(term1668, term1668.getClass(), "app", "bLPjGVBhlX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProductionFileNameWithoutExtension", argTypes, term1668, args);
    }

};



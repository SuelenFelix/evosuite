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

public class TestFile_getProductionFileName_8931016728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1743;

    public TestFile_getProductionFileName_8931016728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1768 = new ArrayList();
        ((ArrayList) term1768).add((Object)null);
        ((ArrayList) term1768).add((Object)null);
        ((ArrayList) term1768).add((Object)null);
        ((ArrayList) term1768).add((Object)null);
        ((ArrayList) term1768).add((Object)null);
        ((ArrayList) term1768).add((Object)null);
        Integer term1772 = new Integer(-1530420153);
        Integer term1774 = new Integer(-469968304);
        term1743 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile"));
        setField(term1743, term1743.getClass(), "testFilePath", "whBvTVIIlC");
        setField(term1743, term1743.getClass(), "productionFilePath", "IgRJUzaCwW");
        setField(term1743, term1743.getClass(), "testSmells", term1768);
        setField(term1743, term1743.getClass(), "loc", term1772);
        setField(term1743, term1743.getClass(), "qtdMethods", term1774);
        setField(term1743, term1743.getClass(), "app", "JUmudUmaaV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProductionFileName", argTypes, term1743, args);
    }

};



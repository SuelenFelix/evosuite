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

public class TestFile_getTestFilePath_6418773491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1223;

    public TestFile_getTestFilePath_6418773491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1248 = new ArrayList();
        ((ArrayList) term1248).add((Object)null);
        ((ArrayList) term1248).add((Object)null);
        ((ArrayList) term1248).add((Object)null);
        ((ArrayList) term1248).add((Object)null);
        Integer term1252 = new Integer(-2068769794);
        Integer term1254 = new Integer(-117576464);
        term1223 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile"));
        setField(term1223, term1223.getClass(), "testFilePath", "jDtqGUpnZN");
        setField(term1223, term1223.getClass(), "productionFilePath", "nGKItKLYNC");
        setField(term1223, term1223.getClass(), "testSmells", term1248);
        setField(term1223, term1223.getClass(), "loc", term1252);
        setField(term1223, term1223.getClass(), "qtdMethods", term1254);
        setField(term1223, term1223.getClass(), "app", "UiUYnPrcCi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTestFilePath", argTypes, term1223, args);
    }

};



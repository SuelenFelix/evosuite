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

public class TestSmellDetector_detectSmells_10937905134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2054;
     Object term2059;

    public TestSmellDetector_detectSmells_10937905134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2055 = new ArrayList();
        ((ArrayList) term2055).add((Object)null);
        ((ArrayList) term2055).add((Object)null);
        ((ArrayList) term2055).add((Object)null);
        ((ArrayList) term2055).add((Object)null);
        ((ArrayList) term2055).add((Object)null);
        ((ArrayList) term2055).add((Object)null);
        term2054 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestSmellDetector"));
        setField(term2054, term2054.getClass(), "testSmells", term2055);
        setField(term2054, term2054.getClass(), "config", null);
        ArrayList term2084 = new ArrayList();
        ((ArrayList) term2084).add((Object)null);
        ((ArrayList) term2084).add((Object)null);
        ((ArrayList) term2084).add((Object)null);
        ((ArrayList) term2084).add((Object)null);
        ((ArrayList) term2084).add((Object)null);
        Integer term2088 = new Integer(-1145578966);
        Integer term2090 = new Integer(679763016);
        term2059 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile"));
        setField(term2059, term2059.getClass(), "testFilePath", "jUbSRrkrYZ");
        setField(term2059, term2059.getClass(), "productionFilePath", "bWWfajKbEX");
        setField(term2059, term2059.getClass(), "testSmells", term2084);
        setField(term2059, term2059.getClass(), "loc", term2088);
        setField(term2059, term2059.getClass(), "qtdMethods", term2090);
        setField(term2059, term2059.getClass(), "app", "cAPeiZHKGJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestSmellDetector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile");
        Object[] args = new Object[1];
        args[0] = term2059;
        callMethod(klass, "detectSmells", argTypes, term2054, args);
    }

};



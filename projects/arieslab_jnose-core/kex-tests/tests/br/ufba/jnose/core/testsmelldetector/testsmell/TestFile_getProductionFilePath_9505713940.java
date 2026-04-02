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

public class TestFile_getProductionFilePath_9505713940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1148;

    public TestFile_getProductionFilePath_9505713940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1173 = new ArrayList();
        ((ArrayList) term1173).add((Object)null);
        ((ArrayList) term1173).add((Object)null);
        ((ArrayList) term1173).add((Object)null);
        ((ArrayList) term1173).add((Object)null);
        ((ArrayList) term1173).add((Object)null);
        Integer term1177 = new Integer(-655067527);
        Integer term1179 = new Integer(-6029667);
        term1148 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile"));
        setField(term1148, term1148.getClass(), "testFilePath", "tShwQLRGNe");
        setField(term1148, term1148.getClass(), "productionFilePath", "LvtrsXUliU");
        setField(term1148, term1148.getClass(), "testSmells", term1173);
        setField(term1148, term1148.getClass(), "loc", term1177);
        setField(term1148, term1148.getClass(), "qtdMethods", term1179);
        setField(term1148, term1148.getClass(), "app", "xLbjWUgOIL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProductionFilePath", argTypes, term1148, args);
    }

};



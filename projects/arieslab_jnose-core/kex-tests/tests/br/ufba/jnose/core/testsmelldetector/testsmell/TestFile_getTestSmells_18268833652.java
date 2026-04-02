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

public class TestFile_getTestSmells_18268833652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1298;

    public TestFile_getTestSmells_18268833652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1323 = new ArrayList();
        ((ArrayList) term1323).add((Object)null);
        ((ArrayList) term1323).add((Object)null);
        ((ArrayList) term1323).add((Object)null);
        Integer term1327 = new Integer(-1007160944);
        Integer term1329 = new Integer(1135664017);
        term1298 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile"));
        setField(term1298, term1298.getClass(), "testFilePath", "UoYtihxVaS");
        setField(term1298, term1298.getClass(), "productionFilePath", "JDswTTCZHV");
        setField(term1298, term1298.getClass(), "testSmells", term1323);
        setField(term1298, term1298.getClass(), "loc", term1327);
        setField(term1298, term1298.getClass(), "qtdMethods", term1329);
        setField(term1298, term1298.getClass(), "app", "onpbIeEKoi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTestSmells", argTypes, term1298, args);
    }

};



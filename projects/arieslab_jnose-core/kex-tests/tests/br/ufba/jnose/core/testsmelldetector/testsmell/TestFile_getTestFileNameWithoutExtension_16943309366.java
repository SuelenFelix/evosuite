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

public class TestFile_getTestFileNameWithoutExtension_16943309366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1593;

    public TestFile_getTestFileNameWithoutExtension_16943309366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1618 = new ArrayList();
        ((ArrayList) term1618).add((Object)null);
        ((ArrayList) term1618).add((Object)null);
        ((ArrayList) term1618).add((Object)null);
        ((ArrayList) term1618).add((Object)null);
        ((ArrayList) term1618).add((Object)null);
        ((ArrayList) term1618).add((Object)null);
        Integer term1622 = new Integer(-73683645);
        Integer term1624 = new Integer(-226514366);
        term1593 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile"));
        setField(term1593, term1593.getClass(), "testFilePath", "fhkbdRViHi");
        setField(term1593, term1593.getClass(), "productionFilePath", "uWHnvSvaPl");
        setField(term1593, term1593.getClass(), "testSmells", term1618);
        setField(term1593, term1593.getClass(), "loc", term1622);
        setField(term1593, term1593.getClass(), "qtdMethods", term1624);
        setField(term1593, term1593.getClass(), "app", "kBdSllIBVz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTestFileNameWithoutExtension", argTypes, term1593, args);
    }

};



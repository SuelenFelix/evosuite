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

public class TestFile_addSmell_11688614164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1443;

    public TestFile_addSmell_11688614164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1468 = new ArrayList();
        ((ArrayList) term1468).add((Object)null);
        ((ArrayList) term1468).add((Object)null);
        ((ArrayList) term1468).add((Object)null);
        ((ArrayList) term1468).add((Object)null);
        Integer term1472 = new Integer(-1275173084);
        Integer term1474 = new Integer(-244121226);
        term1443 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile"));
        setField(term1443, term1443.getClass(), "testFilePath", "ytSBIKXogI");
        setField(term1443, term1443.getClass(), "productionFilePath", "nHXjMycHlU");
        setField(term1443, term1443.getClass(), "testSmells", term1468);
        setField(term1443, term1443.getClass(), "loc", term1472);
        setField(term1443, term1443.getClass(), "qtdMethods", term1474);
        setField(term1443, term1443.getClass(), "app", "ieCtQFdkii");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.AbstractSmell");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addSmell", argTypes, term1443, args);
    }

};



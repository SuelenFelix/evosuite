package br.ufba.jnose.dto;

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
import static br.ufba.jnose.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.String;
import java.util.HashMap;

public class TestSmell_setMethod_1379217648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3260;

    public TestSmell_setMethod_1379217648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3346 = new Integer(-6029667);
        Integer term3348 = new Integer(-2068769794);
        ArrayList term3362 = new ArrayList();
        Class<? extends Object> term3491 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term3490 = ((Class) term3491).getDeclaredField((String) "JUnit4");
        ((Field) term3490).setAccessible(true);
        Object enum7 = ((Field) term3490).get((Object) null);
        HashMap term3376 = new HashMap();
        term3260 = newInstance(Class.forName("br.ufba.jnose.dto.TestSmell"));
        Object term3297 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term3260, term3260.getClass(), "name", "KoyGrUJeJW");
        setField(term3260, term3260.getClass(), "method", "HqBOwkVqjD");
        setField(term3260, term3260.getClass(), "range", "MAcUBcBckh");
        setField(term3297, term3297.getClass(), "projectName", "oVgzLbrsFr");
        setField(term3297, term3297.getClass(), "pathFile", "vQVyKLdtaz");
        setField(term3297, term3297.getClass(), "name", "OWKQODBLzb");
        setField(term3297, term3297.getClass(), "fullName", "wGmYcqUkgE");
        setField(term3297, term3297.getClass(), "numberMethods", term3346);
        setField(term3297, term3297.getClass(), "numberLine", term3348);
        setField(term3297, term3297.getClass(), "productionFile", "idgaQsnJpQ");
        setField(term3297, term3297.getClass(), "listTestSmell", term3362);
        setField(term3297, term3297.getClass(), "junitVersion", enum7);
        setField(term3297, term3297.getClass(), "lineSumTestSmells", term3376);
        setField(term3260, term3260.getClass(), "testClass", term3297);
        setField(term3260, term3260.getClass(), "code", "jUbSRrkrYZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestSmell");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bWWfajKbEX";
        callMethod(klass, "setMethod", argTypes, term3260, args);
    }

};



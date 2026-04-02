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

public class TestSmell_toString_184358512713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5912;

    public TestSmell_toString_184358512713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5998 = new Integer(679763016);
        Integer term6000 = new Integer(1962444399);
        ArrayList term6014 = new ArrayList();
        Class<? extends Object> term6131 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term6130 = ((Class) term6131).getDeclaredField((String) "JUnit5");
        ((Field) term6130).setAccessible(true);
        Object enum13 = ((Field) term6130).get((Object) null);
        HashMap term6028 = new HashMap();
        term5912 = newInstance(Class.forName("br.ufba.jnose.dto.TestSmell"));
        Object term5949 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term5912, term5912.getClass(), "name", "OJJtVNPyKZ");
        setField(term5912, term5912.getClass(), "method", "AKNapTAfmD");
        setField(term5912, term5912.getClass(), "range", "xJgPlLxpgC");
        setField(term5949, term5949.getClass(), "projectName", "EYtfuJaxiM");
        setField(term5949, term5949.getClass(), "pathFile", "gCWtLVKVVe");
        setField(term5949, term5949.getClass(), "name", "fWKJoSoCwE");
        setField(term5949, term5949.getClass(), "fullName", "wfaXBpWAUH");
        setField(term5949, term5949.getClass(), "numberMethods", term5998);
        setField(term5949, term5949.getClass(), "numberLine", term6000);
        setField(term5949, term5949.getClass(), "productionFile", "VMeAzAHwZj");
        setField(term5949, term5949.getClass(), "listTestSmell", term6014);
        setField(term5949, term5949.getClass(), "junitVersion", enum13);
        setField(term5949, term5949.getClass(), "lineSumTestSmells", term6028);
        setField(term5912, term5912.getClass(), "testClass", term5949);
        setField(term5912, term5912.getClass(), "code", "ZzIujlwVsw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestSmell");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5912, args);
    }

};



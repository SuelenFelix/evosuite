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

public class TestSmell_getMethod_19838355807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2807;

    public TestSmell_getMethod_19838355807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2893 = new Integer(1622346318);
        Integer term2895 = new Integer(1048535127);
        ArrayList term2909 = new ArrayList();
        Class<? extends Object> term3026 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term3025 = ((Class) term3026).getDeclaredField((String) "JUnit4");
        ((Field) term3025).setAccessible(true);
        Object enum6 = ((Field) term3025).get((Object) null);
        HashMap term2923 = new HashMap();
        term2807 = newInstance(Class.forName("br.ufba.jnose.dto.TestSmell"));
        Object term2844 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term2807, term2807.getClass(), "name", "eqJfYWRaEL");
        setField(term2807, term2807.getClass(), "method", "fhkbdRViHi");
        setField(term2807, term2807.getClass(), "range", "uWHnvSvaPl");
        setField(term2844, term2844.getClass(), "projectName", "kBdSllIBVz");
        setField(term2844, term2844.getClass(), "pathFile", "TJmVBGfTML");
        setField(term2844, term2844.getClass(), "name", "tPlsykYBqO");
        setField(term2844, term2844.getClass(), "fullName", "bLPjGVBhlX");
        setField(term2844, term2844.getClass(), "numberMethods", term2893);
        setField(term2844, term2844.getClass(), "numberLine", term2895);
        setField(term2844, term2844.getClass(), "productionFile", "whBvTVIIlC");
        setField(term2844, term2844.getClass(), "listTestSmell", term2909);
        setField(term2844, term2844.getClass(), "junitVersion", enum6);
        setField(term2844, term2844.getClass(), "lineSumTestSmells", term2923);
        setField(term2807, term2807.getClass(), "testClass", term2844);
        setField(term2807, term2807.getClass(), "code", "JUmudUmaaV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestSmell");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethod", argTypes, term2807, args);
    }

};



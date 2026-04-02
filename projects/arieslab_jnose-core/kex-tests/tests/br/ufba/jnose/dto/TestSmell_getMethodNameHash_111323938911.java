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

public class TestSmell_getMethodNameHash_111323938911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5006;

    public TestSmell_getMethodNameHash_111323938911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5092 = new Integer(-226514366);
        Integer term5094 = new Integer(1193880199);
        ArrayList term5108 = new ArrayList();
        Class<? extends Object> term5225 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term5224 = ((Class) term5225).getDeclaredField((String) "JUnit5");
        ((Field) term5224).setAccessible(true);
        Object enum11 = ((Field) term5224).get((Object) null);
        HashMap term5122 = new HashMap();
        term5006 = newInstance(Class.forName("br.ufba.jnose.dto.TestSmell"));
        Object term5043 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term5006, term5006.getClass(), "name", "eVpkWxjuki");
        setField(term5006, term5006.getClass(), "method", "SJiQaLvSKv");
        setField(term5006, term5006.getClass(), "range", "OEXDRUKcFl");
        setField(term5043, term5043.getClass(), "projectName", "RYdKCNNMBR");
        setField(term5043, term5043.getClass(), "pathFile", "yGtHPyvYiQ");
        setField(term5043, term5043.getClass(), "name", "MvRIxilFMJ");
        setField(term5043, term5043.getClass(), "fullName", "iNwOJRBEjp");
        setField(term5043, term5043.getClass(), "numberMethods", term5092);
        setField(term5043, term5043.getClass(), "numberLine", term5094);
        setField(term5043, term5043.getClass(), "productionFile", "XylxrMBraH");
        setField(term5043, term5043.getClass(), "listTestSmell", term5108);
        setField(term5043, term5043.getClass(), "junitVersion", enum11);
        setField(term5043, term5043.getClass(), "lineSumTestSmells", term5122);
        setField(term5006, term5006.getClass(), "testClass", term5043);
        setField(term5006, term5006.getClass(), "code", "mXGCWJDOqA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestSmell");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethodNameHash", argTypes, term5006, args);
    }

};



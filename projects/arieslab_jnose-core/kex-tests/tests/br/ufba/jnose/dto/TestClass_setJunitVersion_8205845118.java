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
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class TestClass_setJunitVersion_8205845118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13249;
     Object enum33;

    public TestClass_setJunitVersion_8205845118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13298 = new Integer(304775596);
        Integer term13300 = new Integer(-1347665717);
        ArrayList term13314 = new ArrayList();
        Class<? extends Object> term13390 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term13389 = ((Class) term13390).getDeclaredField((String) "JUnit5");
        ((Field) term13389).setAccessible(true);
        enum33 = ((Field) term13389).get((Object) null);
        HashMap term13328 = new HashMap();
        term13249 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term13249, term13249.getClass(), "projectName", "ypEdrstygY");
        setField(term13249, term13249.getClass(), "pathFile", "sNQFlATEeQ");
        setField(term13249, term13249.getClass(), "name", "ZKMLioamsY");
        setField(term13249, term13249.getClass(), "fullName", "WVbxuoDBcn");
        setField(term13249, term13249.getClass(), "numberMethods", term13298);
        setField(term13249, term13249.getClass(), "numberLine", term13300);
        setField(term13249, term13249.getClass(), "productionFile", "pvDEABOxLt");
        setField(term13249, term13249.getClass(), "listTestSmell", term13314);
        setField(term13249, term13249.getClass(), "junitVersion", enum33);
        setField(term13249, term13249.getClass(), "lineSumTestSmells", term13328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.ufba.jnose.dto.TestClass$JunitVersion");
        Object[] args = new Object[1];
        args[0] = enum33;
        callMethod(klass, "setJunitVersion", argTypes, term13249, args);
    }

};



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

public class TestSmell_setName_12554662986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2332;

    public TestSmell_setName_12554662986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2418 = new Integer(597278769);
        Integer term2420 = new Integer(-1685132342);
        ArrayList term2434 = new ArrayList();
        Class<? extends Object> term2563 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term2562 = ((Class) term2563).getDeclaredField((String) "JUnit5");
        ((Field) term2562).setAccessible(true);
        Object enum5 = ((Field) term2562).get((Object) null);
        HashMap term2448 = new HashMap();
        term2332 = newInstance(Class.forName("br.ufba.jnose.dto.TestSmell"));
        Object term2369 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term2332, term2332.getClass(), "name", "UoYtihxVaS");
        setField(term2332, term2332.getClass(), "method", "JDswTTCZHV");
        setField(term2332, term2332.getClass(), "range", "onpbIeEKoi");
        setField(term2369, term2369.getClass(), "projectName", "YRHGsAkhxb");
        setField(term2369, term2369.getClass(), "pathFile", "ffYhPOzlUs");
        setField(term2369, term2369.getClass(), "name", "MLqYREekMl");
        setField(term2369, term2369.getClass(), "fullName", "ytSBIKXogI");
        setField(term2369, term2369.getClass(), "numberMethods", term2418);
        setField(term2369, term2369.getClass(), "numberLine", term2420);
        setField(term2369, term2369.getClass(), "productionFile", "nHXjMycHlU");
        setField(term2369, term2369.getClass(), "listTestSmell", term2434);
        setField(term2369, term2369.getClass(), "junitVersion", enum5);
        setField(term2369, term2369.getClass(), "lineSumTestSmells", term2448);
        setField(term2332, term2332.getClass(), "testClass", term2369);
        setField(term2332, term2332.getClass(), "code", "dEnhdmILtU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestSmell");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hoicvmsovO";
        callMethod(klass, "setName", argTypes, term2332, args);
    }

};



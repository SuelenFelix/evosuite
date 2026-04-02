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

public class TestClass_getName_8605222737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9091;

    public TestClass_getName_8605222737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9140 = new Integer(97029295);
        Integer term9142 = new Integer(-1371869594);
        ArrayList term9156 = new ArrayList();
        Class<? extends Object> term9232 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term9231 = ((Class) term9232).getDeclaredField((String) "JUnit5");
        ((Field) term9231).setAccessible(true);
        Object enum22 = ((Field) term9231).get((Object) null);
        HashMap term9170 = new HashMap();
        term9091 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term9091, term9091.getClass(), "projectName", "DyiXbeYIaN");
        setField(term9091, term9091.getClass(), "pathFile", "VGizxZnyHX");
        setField(term9091, term9091.getClass(), "name", "kVEZMHmRtR");
        setField(term9091, term9091.getClass(), "fullName", "ekxGuOYIwi");
        setField(term9091, term9091.getClass(), "numberMethods", term9140);
        setField(term9091, term9091.getClass(), "numberLine", term9142);
        setField(term9091, term9091.getClass(), "productionFile", "RbVQXSpxXy");
        setField(term9091, term9091.getClass(), "listTestSmell", term9156);
        setField(term9091, term9091.getClass(), "junitVersion", enum22);
        setField(term9091, term9091.getClass(), "lineSumTestSmells", term9170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term9091, args);
    }

};



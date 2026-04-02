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

public class TestClass_setName_17145684558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9456;

    public TestClass_setName_17145684558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9505 = new Integer(1225272962);
        Integer term9507 = new Integer(1324040357);
        ArrayList term9521 = new ArrayList();
        Class<? extends Object> term9609 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term9608 = ((Class) term9609).getDeclaredField((String) "JUnit5");
        ((Field) term9608).setAccessible(true);
        Object enum23 = ((Field) term9608).get((Object) null);
        HashMap term9535 = new HashMap();
        term9456 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term9456, term9456.getClass(), "projectName", "JppkknKVOw");
        setField(term9456, term9456.getClass(), "pathFile", "iljANwuEjk");
        setField(term9456, term9456.getClass(), "name", "kNqaJKIATy");
        setField(term9456, term9456.getClass(), "fullName", "vKQukfbJUd");
        setField(term9456, term9456.getClass(), "numberMethods", term9505);
        setField(term9456, term9456.getClass(), "numberLine", term9507);
        setField(term9456, term9456.getClass(), "productionFile", "lFRJFUMVbx");
        setField(term9456, term9456.getClass(), "listTestSmell", term9521);
        setField(term9456, term9456.getClass(), "junitVersion", enum23);
        setField(term9456, term9456.getClass(), "lineSumTestSmells", term9535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OqbwYQfvAe";
        callMethod(klass, "setName", argTypes, term9456, args);
    }

};



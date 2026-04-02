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

public class TestClass_setNumberMethods_167932932610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10208;
     Object term10298;

    public TestClass_setNumberMethods_167932932610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10257 = new Integer(287287233);
        Integer term10259 = new Integer(962840079);
        ArrayList term10273 = new ArrayList();
        Class<? extends Object> term10351 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term10350 = ((Class) term10351).getDeclaredField((String) "JUnit5");
        ((Field) term10350).setAccessible(true);
        Object enum25 = ((Field) term10350).get((Object) null);
        HashMap term10287 = new HashMap();
        term10208 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term10208, term10208.getClass(), "projectName", "HDaezxQfQR");
        setField(term10208, term10208.getClass(), "pathFile", "iikZEapDlu");
        setField(term10208, term10208.getClass(), "name", "nhoHrZfnIN");
        setField(term10208, term10208.getClass(), "fullName", "ZkMALXpEAZ");
        setField(term10208, term10208.getClass(), "numberMethods", term10257);
        setField(term10208, term10208.getClass(), "numberLine", term10259);
        setField(term10208, term10208.getClass(), "productionFile", "tXfQjSqDzN");
        setField(term10208, term10208.getClass(), "listTestSmell", term10273);
        setField(term10208, term10208.getClass(), "junitVersion", enum25);
        setField(term10208, term10208.getClass(), "lineSumTestSmells", term10287);
        term10298 = new Integer(1265463001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term10298;
        callMethod(klass, "setNumberMethods", argTypes, term10208, args);
    }

};



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

public class TestClass_getFullName_103161764819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13614;

    public TestClass_getFullName_103161764819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13663 = new Integer(683666002);
        Integer term13665 = new Integer(1596213415);
        ArrayList term13679 = new ArrayList();
        Class<? extends Object> term13755 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term13754 = ((Class) term13755).getDeclaredField((String) "JUnit3");
        ((Field) term13754).setAccessible(true);
        Object enum34 = ((Field) term13754).get((Object) null);
        HashMap term13693 = new HashMap();
        term13614 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term13614, term13614.getClass(), "projectName", "uSUvKAyuvd");
        setField(term13614, term13614.getClass(), "pathFile", "onQLVONGuf");
        setField(term13614, term13614.getClass(), "name", "SOrEHbcbmn");
        setField(term13614, term13614.getClass(), "fullName", "bnsyeQXFdu");
        setField(term13614, term13614.getClass(), "numberMethods", term13663);
        setField(term13614, term13614.getClass(), "numberLine", term13665);
        setField(term13614, term13614.getClass(), "productionFile", "BwtdjiefJn");
        setField(term13614, term13614.getClass(), "listTestSmell", term13679);
        setField(term13614, term13614.getClass(), "junitVersion", enum34);
        setField(term13614, term13614.getClass(), "lineSumTestSmells", term13693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullName", argTypes, term13614, args);
    }

};



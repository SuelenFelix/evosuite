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

public class TestClass_getPathFile_3734567275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8347;

    public TestClass_getPathFile_3734567275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8396 = new Integer(292681826);
        Integer term8398 = new Integer(458147407);
        ArrayList term8412 = new ArrayList();
        Class<? extends Object> term8488 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term8487 = ((Class) term8488).getDeclaredField((String) "JUnit3");
        ((Field) term8487).setAccessible(true);
        Object enum20 = ((Field) term8487).get((Object) null);
        HashMap term8426 = new HashMap();
        term8347 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term8347, term8347.getClass(), "projectName", "XYtryyobou");
        setField(term8347, term8347.getClass(), "pathFile", "OYbzXylRWW");
        setField(term8347, term8347.getClass(), "name", "DSNsTGYXDF");
        setField(term8347, term8347.getClass(), "fullName", "sQvGcVjdEx");
        setField(term8347, term8347.getClass(), "numberMethods", term8396);
        setField(term8347, term8347.getClass(), "numberLine", term8398);
        setField(term8347, term8347.getClass(), "productionFile", "rLHAoqXgPh");
        setField(term8347, term8347.getClass(), "listTestSmell", term8412);
        setField(term8347, term8347.getClass(), "junitVersion", enum20);
        setField(term8347, term8347.getClass(), "lineSumTestSmells", term8426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathFile", argTypes, term8347, args);
    }

};



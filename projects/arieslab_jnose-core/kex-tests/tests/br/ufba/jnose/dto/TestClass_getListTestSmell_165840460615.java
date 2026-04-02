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

public class TestClass_getListTestSmell_165840460615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12043;

    public TestClass_getListTestSmell_165840460615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12092 = new Integer(1442160736);
        Integer term12094 = new Integer(1114000454);
        ArrayList term12108 = new ArrayList();
        Class<? extends Object> term12184 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term12183 = ((Class) term12184).getDeclaredField((String) "JUnit4");
        ((Field) term12183).setAccessible(true);
        Object enum30 = ((Field) term12183).get((Object) null);
        HashMap term12122 = new HashMap();
        term12043 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term12043, term12043.getClass(), "projectName", "aSkmSwTnEw");
        setField(term12043, term12043.getClass(), "pathFile", "xvkbvaEGYd");
        setField(term12043, term12043.getClass(), "name", "HBGNxdNURv");
        setField(term12043, term12043.getClass(), "fullName", "mfCpTPPQQm");
        setField(term12043, term12043.getClass(), "numberMethods", term12092);
        setField(term12043, term12043.getClass(), "numberLine", term12094);
        setField(term12043, term12043.getClass(), "productionFile", "OcJCIDNIXA");
        setField(term12043, term12043.getClass(), "listTestSmell", term12108);
        setField(term12043, term12043.getClass(), "junitVersion", enum30);
        setField(term12043, term12043.getClass(), "lineSumTestSmells", term12122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getListTestSmell", argTypes, term12043, args);
    }

};



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

public class TestClass_getNumberMethods_17980994169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9843;

    public TestClass_getNumberMethods_17980994169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9892 = new Integer(-93135961);
        Integer term9894 = new Integer(-112921587);
        ArrayList term9908 = new ArrayList();
        Class<? extends Object> term9984 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term9983 = ((Class) term9984).getDeclaredField((String) "JUnit4");
        ((Field) term9983).setAccessible(true);
        Object enum24 = ((Field) term9983).get((Object) null);
        HashMap term9922 = new HashMap();
        term9843 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term9843, term9843.getClass(), "projectName", "tRxZafjqIx");
        setField(term9843, term9843.getClass(), "pathFile", "DhjNLmRMCu");
        setField(term9843, term9843.getClass(), "name", "PgPzMSEjjX");
        setField(term9843, term9843.getClass(), "fullName", "wzsPSPcRdj");
        setField(term9843, term9843.getClass(), "numberMethods", term9892);
        setField(term9843, term9843.getClass(), "numberLine", term9894);
        setField(term9843, term9843.getClass(), "productionFile", "kGMQdqJYyB");
        setField(term9843, term9843.getClass(), "listTestSmell", term9908);
        setField(term9843, term9843.getClass(), "junitVersion", enum24);
        setField(term9843, term9843.getClass(), "lineSumTestSmells", term9922);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumberMethods", argTypes, term9843, args);
    }

};



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

public class TestClass_getNumberLine_13058349611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10575;

    public TestClass_getNumberLine_13058349611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10624 = new Integer(335112684);
        Integer term10626 = new Integer(1551099402);
        ArrayList term10640 = new ArrayList();
        Class<? extends Object> term10716 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term10715 = ((Class) term10716).getDeclaredField((String) "JUnit5");
        ((Field) term10715).setAccessible(true);
        Object enum26 = ((Field) term10715).get((Object) null);
        HashMap term10654 = new HashMap();
        term10575 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term10575, term10575.getClass(), "projectName", "vGiuZVPJNH");
        setField(term10575, term10575.getClass(), "pathFile", "tlzpzIjMib");
        setField(term10575, term10575.getClass(), "name", "AZdLeSugwv");
        setField(term10575, term10575.getClass(), "fullName", "RMsXuyzKJV");
        setField(term10575, term10575.getClass(), "numberMethods", term10624);
        setField(term10575, term10575.getClass(), "numberLine", term10626);
        setField(term10575, term10575.getClass(), "productionFile", "FwPbDZcHmB");
        setField(term10575, term10575.getClass(), "listTestSmell", term10640);
        setField(term10575, term10575.getClass(), "junitVersion", enum26);
        setField(term10575, term10575.getClass(), "lineSumTestSmells", term10654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumberLine", argTypes, term10575, args);
    }

};



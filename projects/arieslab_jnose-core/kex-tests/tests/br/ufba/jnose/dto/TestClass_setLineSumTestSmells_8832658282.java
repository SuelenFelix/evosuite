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
import java.util.LinkedHashMap;

public class TestClass_setLineSumTestSmells_8832658282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7215;
     Object term7303;

    public TestClass_setLineSumTestSmells_8832658282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7264 = new Integer(-817164822);
        Integer term7266 = new Integer(-1016503459);
        ArrayList term7280 = new ArrayList();
        Class<? extends Object> term7377 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term7376 = ((Class) term7377).getDeclaredField((String) "None");
        ((Field) term7376).setAccessible(true);
        Object enum17 = ((Field) term7376).get((Object) null);
        HashMap term7292 = new HashMap();
        term7215 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term7215, term7215.getClass(), "projectName", "FPvxVzzSvD");
        setField(term7215, term7215.getClass(), "pathFile", "WHcwFgsGFC");
        setField(term7215, term7215.getClass(), "name", "HzqpegHiRq");
        setField(term7215, term7215.getClass(), "fullName", "jwsfVjMoJT");
        setField(term7215, term7215.getClass(), "numberMethods", term7264);
        setField(term7215, term7215.getClass(), "numberLine", term7266);
        setField(term7215, term7215.getClass(), "productionFile", "ZfdXfCCFDf");
        setField(term7215, term7215.getClass(), "listTestSmell", term7280);
        setField(term7215, term7215.getClass(), "junitVersion", enum17);
        setField(term7215, term7215.getClass(), "lineSumTestSmells", term7292);
        term7303 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term7303;
        callMethod(klass, "setLineSumTestSmells", argTypes, term7215, args);
    }

};



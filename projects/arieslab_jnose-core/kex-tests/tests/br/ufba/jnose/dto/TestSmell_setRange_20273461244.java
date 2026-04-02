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

public class TestSmell_setRange_20273461244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1412;

    public TestSmell_setRange_20273461244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1498 = new Integer(-1339778481);
        Integer term1500 = new Integer(1725571209);
        ArrayList term1514 = new ArrayList();
        Class<? extends Object> term1641 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term1640 = ((Class) term1641).getDeclaredField((String) "None");
        ((Field) term1640).setAccessible(true);
        Object enum3 = ((Field) term1640).get((Object) null);
        HashMap term1526 = new HashMap();
        term1412 = newInstance(Class.forName("br.ufba.jnose.dto.TestSmell"));
        Object term1449 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term1412, term1412.getClass(), "name", "dWRymuLBtr");
        setField(term1412, term1412.getClass(), "method", "AijpHYOFuy");
        setField(term1412, term1412.getClass(), "range", "SbAoxhfrkn");
        setField(term1449, term1449.getClass(), "projectName", "kuTXqwMtDB");
        setField(term1449, term1449.getClass(), "pathFile", "Ghbwtircqb");
        setField(term1449, term1449.getClass(), "name", "xrwlQZdwCp");
        setField(term1449, term1449.getClass(), "fullName", "IDCWpPLRkE");
        setField(term1449, term1449.getClass(), "numberMethods", term1498);
        setField(term1449, term1449.getClass(), "numberLine", term1500);
        setField(term1449, term1449.getClass(), "productionFile", "nyiiPDVjAc");
        setField(term1449, term1449.getClass(), "listTestSmell", term1514);
        setField(term1449, term1449.getClass(), "junitVersion", enum3);
        setField(term1449, term1449.getClass(), "lineSumTestSmells", term1526);
        setField(term1412, term1412.getClass(), "testClass", term1449);
        setField(term1412, term1412.getClass(), "code", "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestSmell");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UlajhuVLaP";
        callMethod(klass, "setRange", argTypes, term1412, args);
    }

};



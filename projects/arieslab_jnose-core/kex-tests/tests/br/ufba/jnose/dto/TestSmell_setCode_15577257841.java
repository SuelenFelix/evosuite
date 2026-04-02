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

public class TestSmell_setCode_15577257841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public TestSmell_setCode_15577257841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term87 = new Integer(568599855);
        Integer term89 = new Integer(1162663216);
        ArrayList term103 = new ArrayList();
        Class<? extends Object> term268 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term267 = ((Class) term268).getDeclaredField((String) "None");
        ((Field) term267).setAccessible(true);
        Object enum0 = ((Field) term267).get((Object) null);
        HashMap term115 = new HashMap();
        term1 = newInstance(Class.forName("br.ufba.jnose.dto.TestSmell"));
        Object term38 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "method", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "range", "MuLcgQHgqz");
        setField(term38, term38.getClass(), "projectName", "xxtlPwDYFs");
        setField(term38, term38.getClass(), "pathFile", "jJCZpVmanW");
        setField(term38, term38.getClass(), "name", "EGtDIRbSSb");
        setField(term38, term38.getClass(), "fullName", "SzjVpOQTyS");
        setField(term38, term38.getClass(), "numberMethods", term87);
        setField(term38, term38.getClass(), "numberLine", term89);
        setField(term38, term38.getClass(), "productionFile", "MjGYSRKTNF");
        setField(term38, term38.getClass(), "listTestSmell", term103);
        setField(term38, term38.getClass(), "junitVersion", enum0);
        setField(term38, term38.getClass(), "lineSumTestSmells", term115);
        setField(term1, term1.getClass(), "testClass", term38);
        setField(term1, term1.getClass(), "code", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestSmell");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NRdvgJlhkX";
        callMethod(klass, "setCode", argTypes, term1, args);
    }

};



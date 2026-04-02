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

public class TestClass_getProjectName_19524405583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7595;

    public TestClass_getProjectName_19524405583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7644 = new Integer(-14890619);
        Integer term7646 = new Integer(1632125673);
        ArrayList term7660 = new ArrayList();
        Class<? extends Object> term7736 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term7735 = ((Class) term7736).getDeclaredField((String) "JUnit4");
        ((Field) term7735).setAccessible(true);
        Object enum18 = ((Field) term7735).get((Object) null);
        HashMap term7674 = new HashMap();
        term7595 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term7595, term7595.getClass(), "projectName", "XkIoWJRNwN");
        setField(term7595, term7595.getClass(), "pathFile", "aNWLJdrZMq");
        setField(term7595, term7595.getClass(), "name", "HHmNoYxIGj");
        setField(term7595, term7595.getClass(), "fullName", "PtirvZmsGt");
        setField(term7595, term7595.getClass(), "numberMethods", term7644);
        setField(term7595, term7595.getClass(), "numberLine", term7646);
        setField(term7595, term7595.getClass(), "productionFile", "HWkpTmtlrc");
        setField(term7595, term7595.getClass(), "listTestSmell", term7660);
        setField(term7595, term7595.getClass(), "junitVersion", enum18);
        setField(term7595, term7595.getClass(), "lineSumTestSmells", term7674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectName", argTypes, term7595, args);
    }

};



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
import java.util.LinkedList;

public class TestClass_setListTestSmell_131099662816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12408;
     Object term12498;

    public TestClass_setListTestSmell_131099662816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12457 = new Integer(-1772434990);
        Integer term12459 = new Integer(-1845499264);
        ArrayList term12473 = new ArrayList();
        Class<? extends Object> term12620 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term12619 = ((Class) term12620).getDeclaredField((String) "JUnit5");
        ((Field) term12619).setAccessible(true);
        Object enum31 = ((Field) term12619).get((Object) null);
        HashMap term12487 = new HashMap();
        term12408 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term12408, term12408.getClass(), "projectName", "MHGKyEnwKc");
        setField(term12408, term12408.getClass(), "pathFile", "ShIELyuULw");
        setField(term12408, term12408.getClass(), "name", "IpQuOGMgmj");
        setField(term12408, term12408.getClass(), "fullName", "pJbnHTYrxn");
        setField(term12408, term12408.getClass(), "numberMethods", term12457);
        setField(term12408, term12408.getClass(), "numberLine", term12459);
        setField(term12408, term12408.getClass(), "productionFile", "iIRsCSYqXH");
        setField(term12408, term12408.getClass(), "listTestSmell", term12473);
        setField(term12408, term12408.getClass(), "junitVersion", enum31);
        setField(term12408, term12408.getClass(), "lineSumTestSmells", term12487);
        Integer term12543 = new Integer(-344842608);
        Integer term12545 = new Integer(941650513);
        ArrayList term12548 = new ArrayList();
        HashMap term12551 = new HashMap();
        Object term12501 = newInstance(Class.forName("br.ufba.jnose.dto.TestSmell"));
        Object term12538 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term12501, term12501.getClass(), "name", "WBAOTqErtm");
        setField(term12501, term12501.getClass(), "method", "PqtVXXZMqK");
        setField(term12501, term12501.getClass(), "range", "rYbtIDVdnd");
        setField(term12538, term12538.getClass(), "projectName", "");
        setField(term12538, term12538.getClass(), "pathFile", "");
        setField(term12538, term12538.getClass(), "name", "");
        setField(term12538, term12538.getClass(), "fullName", "");
        setField(term12538, term12538.getClass(), "numberMethods", term12543);
        setField(term12538, term12538.getClass(), "numberLine", term12545);
        setField(term12538, term12538.getClass(), "productionFile", "");
        setField(term12538, term12538.getClass(), "listTestSmell", term12548);
        setField(term12538, term12538.getClass(), "junitVersion", enum31);
        setField(term12538, term12538.getClass(), "lineSumTestSmells", term12551);
        setField(term12501, term12501.getClass(), "testClass", term12538);
        setField(term12501, term12501.getClass(), "code", "bxrCBbrrct");
        term12498 = new LinkedList();
        ((LinkedList) term12498).add(term12501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term12498;
        callMethod(klass, "setListTestSmell", argTypes, term12408, args);
    }

};



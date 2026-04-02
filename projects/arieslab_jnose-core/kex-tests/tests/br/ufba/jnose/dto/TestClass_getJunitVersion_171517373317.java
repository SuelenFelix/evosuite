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

public class TestClass_getJunitVersion_171517373317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12884;

    public TestClass_getJunitVersion_171517373317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12933 = new Integer(-1034506028);
        Integer term12935 = new Integer(-1263114719);
        ArrayList term12949 = new ArrayList();
        Class<? extends Object> term13025 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term13024 = ((Class) term13025).getDeclaredField((String) "JUnit4");
        ((Field) term13024).setAccessible(true);
        Object enum32 = ((Field) term13024).get((Object) null);
        HashMap term12963 = new HashMap();
        term12884 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term12884, term12884.getClass(), "projectName", "CKWpJaaaxX");
        setField(term12884, term12884.getClass(), "pathFile", "UBRmXJmfrt");
        setField(term12884, term12884.getClass(), "name", "WZzvmIHhzZ");
        setField(term12884, term12884.getClass(), "fullName", "doQLHkjpNm");
        setField(term12884, term12884.getClass(), "numberMethods", term12933);
        setField(term12884, term12884.getClass(), "numberLine", term12935);
        setField(term12884, term12884.getClass(), "productionFile", "lCyLIcSuom");
        setField(term12884, term12884.getClass(), "listTestSmell", term12949);
        setField(term12884, term12884.getClass(), "junitVersion", enum32);
        setField(term12884, term12884.getClass(), "lineSumTestSmells", term12963);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJunitVersion", argTypes, term12884, args);
    }

};



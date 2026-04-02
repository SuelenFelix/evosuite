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

public class TestSmell_getMethodNameFullURIHash_207258916212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5459;

    public TestSmell_getMethodNameFullURIHash_207258916212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5545 = new Integer(-1530420153);
        Integer term5547 = new Integer(-469968304);
        ArrayList term5561 = new ArrayList();
        Class<? extends Object> term5678 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term5677 = ((Class) term5678).getDeclaredField((String) "JUnit3");
        ((Field) term5677).setAccessible(true);
        Object enum12 = ((Field) term5677).get((Object) null);
        HashMap term5575 = new HashMap();
        term5459 = newInstance(Class.forName("br.ufba.jnose.dto.TestSmell"));
        Object term5496 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term5459, term5459.getClass(), "name", "dpNsDgfPso");
        setField(term5459, term5459.getClass(), "method", "hCWPJQKpdc");
        setField(term5459, term5459.getClass(), "range", "WzMEhMXkKx");
        setField(term5496, term5496.getClass(), "projectName", "XOiDvlDhdc");
        setField(term5496, term5496.getClass(), "pathFile", "AdxvLJhNLe");
        setField(term5496, term5496.getClass(), "name", "lHfTrWKMPk");
        setField(term5496, term5496.getClass(), "fullName", "JDaAnsVTGV");
        setField(term5496, term5496.getClass(), "numberMethods", term5545);
        setField(term5496, term5496.getClass(), "numberLine", term5547);
        setField(term5496, term5496.getClass(), "productionFile", "mLUZFTfjle");
        setField(term5496, term5496.getClass(), "listTestSmell", term5561);
        setField(term5496, term5496.getClass(), "junitVersion", enum12);
        setField(term5496, term5496.getClass(), "lineSumTestSmells", term5575);
        setField(term5459, term5459.getClass(), "testClass", term5496);
        setField(term5459, term5459.getClass(), "code", "SdCKLMIYnX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestSmell");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethodNameFullURIHash", argTypes, term5459, args);
    }

};



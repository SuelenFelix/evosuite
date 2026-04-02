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

public class TestClass_setPathFile_12128857136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8712;

    public TestClass_setPathFile_12128857136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8761 = new Integer(493620644);
        Integer term8763 = new Integer(1328271830);
        ArrayList term8777 = new ArrayList();
        Class<? extends Object> term8863 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term8862 = ((Class) term8863).getDeclaredField((String) "None");
        ((Field) term8862).setAccessible(true);
        Object enum21 = ((Field) term8862).get((Object) null);
        HashMap term8789 = new HashMap();
        term8712 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term8712, term8712.getClass(), "projectName", "vwbEQQNQrx");
        setField(term8712, term8712.getClass(), "pathFile", "xtftXXMbem");
        setField(term8712, term8712.getClass(), "name", "cudZvLMQon");
        setField(term8712, term8712.getClass(), "fullName", "lihXWlGDxk");
        setField(term8712, term8712.getClass(), "numberMethods", term8761);
        setField(term8712, term8712.getClass(), "numberLine", term8763);
        setField(term8712, term8712.getClass(), "productionFile", "JmcmxoGhIK");
        setField(term8712, term8712.getClass(), "listTestSmell", term8777);
        setField(term8712, term8712.getClass(), "junitVersion", enum21);
        setField(term8712, term8712.getClass(), "lineSumTestSmells", term8789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "igCAtimmYB";
        callMethod(klass, "setPathFile", argTypes, term8712, args);
    }

};



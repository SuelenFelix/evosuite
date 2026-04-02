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

public class TestClass_getProductionFile_160458250713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11307;

    public TestClass_getProductionFile_160458250713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11356 = new Integer(1655935355);
        Integer term11358 = new Integer(-481533957);
        ArrayList term11372 = new ArrayList();
        Class<? extends Object> term11446 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term11445 = ((Class) term11446).getDeclaredField((String) "None");
        ((Field) term11445).setAccessible(true);
        Object enum28 = ((Field) term11445).get((Object) null);
        HashMap term11384 = new HashMap();
        term11307 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term11307, term11307.getClass(), "projectName", "GrqozDKFOk");
        setField(term11307, term11307.getClass(), "pathFile", "CFyoseFGLF");
        setField(term11307, term11307.getClass(), "name", "SFqCrhEWLm");
        setField(term11307, term11307.getClass(), "fullName", "GZdcJyZntS");
        setField(term11307, term11307.getClass(), "numberMethods", term11356);
        setField(term11307, term11307.getClass(), "numberLine", term11358);
        setField(term11307, term11307.getClass(), "productionFile", "OIHoJeysUi");
        setField(term11307, term11307.getClass(), "listTestSmell", term11372);
        setField(term11307, term11307.getClass(), "junitVersion", enum28);
        setField(term11307, term11307.getClass(), "lineSumTestSmells", term11384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProductionFile", argTypes, term11307, args);
    }

};



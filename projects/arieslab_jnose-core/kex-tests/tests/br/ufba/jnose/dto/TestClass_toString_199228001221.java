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

public class TestClass_toString_199228001221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14366;

    public TestClass_toString_199228001221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14415 = new Integer(-615654495);
        Integer term14417 = new Integer(-1476117762);
        ArrayList term14431 = new ArrayList();
        Class<? extends Object> term14507 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term14506 = ((Class) term14507).getDeclaredField((String) "JUnit4");
        ((Field) term14506).setAccessible(true);
        Object enum36 = ((Field) term14506).get((Object) null);
        HashMap term14445 = new HashMap();
        term14366 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term14366, term14366.getClass(), "projectName", "OcfNzHYdki");
        setField(term14366, term14366.getClass(), "pathFile", "uPuCVuZYOI");
        setField(term14366, term14366.getClass(), "name", "TweMFhxNdj");
        setField(term14366, term14366.getClass(), "fullName", "NBrvVzvQHe");
        setField(term14366, term14366.getClass(), "numberMethods", term14415);
        setField(term14366, term14366.getClass(), "numberLine", term14417);
        setField(term14366, term14366.getClass(), "productionFile", "FjOiNAfBOc");
        setField(term14366, term14366.getClass(), "listTestSmell", term14431);
        setField(term14366, term14366.getClass(), "junitVersion", enum36);
        setField(term14366, term14366.getClass(), "lineSumTestSmells", term14445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term14366, args);
    }

};



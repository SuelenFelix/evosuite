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

public class TestClass_getLineSumTestSmells_8004513141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6850;

    public TestClass_getLineSumTestSmells_8004513141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6899 = new Integer(-602026508);
        Integer term6901 = new Integer(-157887805);
        ArrayList term6915 = new ArrayList();
        Class<? extends Object> term6991 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term6990 = ((Class) term6991).getDeclaredField((String) "JUnit3");
        ((Field) term6990).setAccessible(true);
        Object enum16 = ((Field) term6990).get((Object) null);
        HashMap term6929 = new HashMap();
        term6850 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term6850, term6850.getClass(), "projectName", "yVMkkQhvmN");
        setField(term6850, term6850.getClass(), "pathFile", "mvrkADEgpp");
        setField(term6850, term6850.getClass(), "name", "pXOkjyeIRb");
        setField(term6850, term6850.getClass(), "fullName", "GgZWSjxjyE");
        setField(term6850, term6850.getClass(), "numberMethods", term6899);
        setField(term6850, term6850.getClass(), "numberLine", term6901);
        setField(term6850, term6850.getClass(), "productionFile", "EeBVbzjcCI");
        setField(term6850, term6850.getClass(), "listTestSmell", term6915);
        setField(term6850, term6850.getClass(), "junitVersion", enum16);
        setField(term6850, term6850.getClass(), "lineSumTestSmells", term6929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLineSumTestSmells", argTypes, term6850, args);
    }

};



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

public class TestClass_setNumberLine_25863471412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10940;
     Object term11030;

    public TestClass_setNumberLine_25863471412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10989 = new Integer(1063420942);
        Integer term10991 = new Integer(1375330971);
        ArrayList term11005 = new ArrayList();
        Class<? extends Object> term11083 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term11082 = ((Class) term11083).getDeclaredField((String) "JUnit3");
        ((Field) term11082).setAccessible(true);
        Object enum27 = ((Field) term11082).get((Object) null);
        HashMap term11019 = new HashMap();
        term10940 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term10940, term10940.getClass(), "projectName", "QduALnDSVo");
        setField(term10940, term10940.getClass(), "pathFile", "izPpKDErnQ");
        setField(term10940, term10940.getClass(), "name", "NnpwZBUTvx");
        setField(term10940, term10940.getClass(), "fullName", "tlQSNgTkQX");
        setField(term10940, term10940.getClass(), "numberMethods", term10989);
        setField(term10940, term10940.getClass(), "numberLine", term10991);
        setField(term10940, term10940.getClass(), "productionFile", "PCipZnmBOF");
        setField(term10940, term10940.getClass(), "listTestSmell", term11005);
        setField(term10940, term10940.getClass(), "junitVersion", enum27);
        setField(term10940, term10940.getClass(), "lineSumTestSmells", term11019);
        term11030 = new Integer(972867650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term11030;
        callMethod(klass, "setNumberLine", argTypes, term10940, args);
    }

};



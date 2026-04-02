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

public class TestClass_setProductionFile_199534829136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14744;

    public TestClass_setProductionFile_199534829136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14744 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term14744, term14744.getClass(), "projectName", null);
        setField(term14744, term14744.getClass(), "pathFile", null);
        setField(term14744, term14744.getClass(), "name", null);
        setField(term14744, term14744.getClass(), "fullName", null);
        setField(term14744, term14744.getClass(), "numberMethods", null);
        setField(term14744, term14744.getClass(), "numberLine", null);
        setField(term14744, term14744.getClass(), "productionFile", null);
        setField(term14744, term14744.getClass(), "listTestSmell", null);
        setField(term14744, term14744.getClass(), "junitVersion", null);
        setField(term14744, term14744.getClass(), "lineSumTestSmells", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setProductionFile", argTypes, term14744, args);
    }

};



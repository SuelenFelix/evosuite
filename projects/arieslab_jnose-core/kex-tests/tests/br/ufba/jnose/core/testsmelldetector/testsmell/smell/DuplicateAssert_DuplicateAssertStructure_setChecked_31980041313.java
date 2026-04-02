package br.ufba.jnose.core.testsmelldetector.testsmell.smell;

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
import static br.ufba.jnose.core.testsmelldetector.testsmell.smell.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class DuplicateAssert_DuplicateAssertStructure_setChecked_31980041313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148;
     Object term151;

    public DuplicateAssert_DuplicateAssertStructure_setChecked_31980041313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.smell.DuplicateAssert$DuplicateAssertStructure"));
        setField(term148, term148.getClass(), "text", null);
        setIntField(term148, term148.getClass(), "line", 0);
        setBooleanField(term148, term148.getClass(), "checked", false);
        setField(term148, term148.getClass(), "this$0", null);
        term151 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.smell.DuplicateAssert$DuplicateAssertStructure");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term151;
        callMethod(klass, "setChecked", argTypes, term148, args);
    }

};



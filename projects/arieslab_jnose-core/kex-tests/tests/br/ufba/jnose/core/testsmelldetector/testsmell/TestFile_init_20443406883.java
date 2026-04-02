package br.ufba.jnose.core.testsmelldetector.testsmell;

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
import static br.ufba.jnose.core.testsmelldetector.testsmell.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class TestFile_init_20443406883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1409;
     Object term1411;

    public TestFile_init_20443406883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1409 = new Integer(590364439);
        term1411 = new Integer(865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.Integer");
        argTypes[4] = Class.forName("java.lang.Integer");
        Object[] args = new Object[5];
        args[0] = "YRHGsAkhxb";
        args[1] = "ffYhPOzlUs";
        args[2] = "MLqYREekMl";
        args[3] = term1409;
        args[4] = term1411;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



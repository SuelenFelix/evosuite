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

public class TestSmellDetector_detectSmells_10937905139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2137;

    public TestSmellDetector_detectSmells_10937905139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2137 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestSmellDetector"));
        setField(term2137, term2137.getClass(), "testSmells", null);
        setField(term2137, term2137.getClass(), "config", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestSmellDetector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestFile");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "detectSmells", argTypes, term2137, args);
    }

};



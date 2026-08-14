package tech.jiayezheng.miniJuliaSonar;

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
import static tech.jiayezheng.miniJuliaSonar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TestInference_runAnalysis_4150951581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303848;

    public TestInference_runAnalysis_4150951581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term303848 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.TestInference"));
        setField(term303848, term303848.getClass(), "testFile", "arwgNGuWdv");
        setField(term303848, term303848.getClass(), "expecteRefsFile", "qMURXVkZvu");
        setField(term303848, term303848.getClass(), "missingRefsFile", "OcsyFzRMMM");
        setField(term303848, term303848.getClass(), "wrongTypeFile", "searaDdQeL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.TestInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zVqsalzJmP";
        callMethod(klass, "runAnalysis", argTypes, term303848, args);
    }

};



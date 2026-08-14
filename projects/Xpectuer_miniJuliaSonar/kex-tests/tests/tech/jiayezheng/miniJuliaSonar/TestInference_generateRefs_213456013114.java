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

public class TestInference_generateRefs_213456013114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306038;

    public TestInference_generateRefs_213456013114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306038 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.TestInference"));
        setField(term306038, term306038.getClass(), "testFile", null);
        setField(term306038, term306038.getClass(), "expecteRefsFile", null);
        setField(term306038, term306038.getClass(), "missingRefsFile", null);
        setField(term306038, term306038.getClass(), "wrongTypeFile", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.TestInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.Analyzer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "generateRefs", argTypes, term306038, args);
    }

};



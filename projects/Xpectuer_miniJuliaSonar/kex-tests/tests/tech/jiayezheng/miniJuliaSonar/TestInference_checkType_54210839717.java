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
import java.lang.Integer;

public class TestInference_checkType_54210839717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306045;
     Object term306046;
     Object term306048;

    public TestInference_checkType_54210839717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306045 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.TestInference"));
        setField(term306045, term306045.getClass(), "testFile", null);
        setField(term306045, term306045.getClass(), "expecteRefsFile", null);
        setField(term306045, term306045.getClass(), "missingRefsFile", null);
        setField(term306045, term306045.getClass(), "wrongTypeFile", null);
        term306046 = new Integer(0);
        term306048 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.TestInference");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term306046;
        args[3] = term306048;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "checkType", argTypes, term306045, args);
    }

};



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

public class TestInference_checkExist_19089696616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306040;
     Object term306041;
     Object term306043;

    public TestInference_checkExist_19089696616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306040 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.TestInference"));
        setField(term306040, term306040.getClass(), "testFile", null);
        setField(term306040, term306040.getClass(), "expecteRefsFile", null);
        setField(term306040, term306040.getClass(), "missingRefsFile", null);
        setField(term306040, term306040.getClass(), "wrongTypeFile", null);
        term306041 = new Integer(0);
        term306043 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.TestInference");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term306041;
        args[3] = term306043;
        callMethod(klass, "checkExist", argTypes, term306040, args);
    }

};



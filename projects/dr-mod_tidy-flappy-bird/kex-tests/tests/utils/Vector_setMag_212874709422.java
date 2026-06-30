package utils;

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
import static utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Float;

public class Vector_setMag_212874709422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121;
     Object term124;

    public Vector_setMag_212874709422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121 = newInstance(Class.forName("utils.Vector"));
        setFloatField(term121, term121.getClass(), "x", 0.2946385F);
        setFloatField(term121, term121.getClass(), "y", 0.07802445F);
        term124 = new Float(0.36114347F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utils.Vector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term124;
        callMethod(klass, "setMag", argTypes, term121, args);
    }

};



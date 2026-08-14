package io.github.moacirrf.netbeans.markdown.export;

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
import static io.github.moacirrf.netbeans.markdown.export.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class InputModel_equals_3245047799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5304;
     Object term5343;

    public InputModel_equals_3245047799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5365 = Class.forName((String) "java.io.File$PathStatus");
        Field term5364 = ((Class) term5365).getDeclaredField((String) "CHECKED");
        ((Field) term5364).setAccessible(true);
        Object enum25 = ((Field) term5364).get((Object) null);
        term5304 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term5317 = newInstance(Class.forName("java.io.File"));
        setField(term5304, term5304.getClass(), "name", "xJgPlLxpgC");
        setField(term5317, term5317.getClass(), "path", "EYtfuJaxiM");
        setField(term5317, term5317.getClass(), "status", enum25);
        setIntField(term5317, term5317.getClass(), "prefixLength", 1045657203);
        setField(term5317, term5317.getClass(), "filePath", null);
        setField(term5304, term5304.getClass(), "file", term5317);
        setIntField(term5304, term5304.getClass(), "order", 1386130016);
        term5343 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5343;
        callMethod(klass, "equals", argTypes, term5304, args);
    }

};



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

public class InputModel_hashCode_7731914548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5102;

    public InputModel_hashCode_7731914548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5162 = Class.forName((String) "java.io.File$PathStatus");
        Field term5161 = ((Class) term5162).getDeclaredField((String) "INVALID");
        ((Field) term5161).setAccessible(true);
        Object enum24 = ((Field) term5161).get((Object) null);
        term5102 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term5115 = newInstance(Class.forName("java.io.File"));
        setField(term5102, term5102.getClass(), "name", "OJJtVNPyKZ");
        setField(term5115, term5115.getClass(), "path", "AKNapTAfmD");
        setField(term5115, term5115.getClass(), "status", enum24);
        setIntField(term5115, term5115.getClass(), "prefixLength", -1963434938);
        setField(term5115, term5115.getClass(), "filePath", null);
        setField(term5102, term5102.getClass(), "file", term5115);
        setIntField(term5102, term5102.getClass(), "order", 906181092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5102, args);
    }

};



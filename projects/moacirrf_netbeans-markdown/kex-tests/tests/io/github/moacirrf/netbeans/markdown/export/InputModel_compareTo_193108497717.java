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

public class InputModel_compareTo_193108497717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5523;

    public InputModel_compareTo_193108497717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5523 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        setField(term5523, term5523.getClass(), "name", null);
        setField(term5523, term5523.getClass(), "file", null);
        setIntField(term5523, term5523.getClass(), "order", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "compareTo", argTypes, term5523, args);
    }

};



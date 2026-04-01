package org.openapijsonschematools.codegen.config;

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
import static org.openapijsonschematools.codegen.config.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SpecValidationException_setErrors_87371638017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30884;

    public SpecValidationException_setErrors_87371638017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30884 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.SpecValidationException"));
        setField(term30884, term30884.getClass(), "errors", null);
        setField(term30884, term30884.getClass(), "warnings", null);
        setField(term30884, term30884.getClass(), "backtrace", null);
        setField(term30884, term30884.getClass(), "detailMessage", null);
        setField(term30884, term30884.getClass(), "cause", null);
        setField(term30884, term30884.getClass(), "stackTrace", null);
        setIntField(term30884, term30884.getClass(), "depth", 0);
        setField(term30884, term30884.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.SpecValidationException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setErrors", argTypes, term30884, args);
    }

};



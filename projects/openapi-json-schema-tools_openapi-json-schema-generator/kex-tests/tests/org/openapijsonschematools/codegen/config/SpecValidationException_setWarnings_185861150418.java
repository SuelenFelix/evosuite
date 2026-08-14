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

public class SpecValidationException_setWarnings_185861150418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30886;

    public SpecValidationException_setWarnings_185861150418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30886 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.SpecValidationException"));
        setField(term30886, term30886.getClass(), "errors", null);
        setField(term30886, term30886.getClass(), "warnings", null);
        setField(term30886, term30886.getClass(), "backtrace", null);
        setField(term30886, term30886.getClass(), "detailMessage", null);
        setField(term30886, term30886.getClass(), "cause", null);
        setField(term30886, term30886.getClass(), "stackTrace", null);
        setIntField(term30886, term30886.getClass(), "depth", 0);
        setField(term30886, term30886.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.SpecValidationException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWarnings", argTypes, term30886, args);
    }

};



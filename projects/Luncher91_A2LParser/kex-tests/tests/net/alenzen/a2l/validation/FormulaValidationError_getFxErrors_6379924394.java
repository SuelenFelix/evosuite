package net.alenzen.a2l.validation;

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
import static net.alenzen.a2l.validation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FormulaValidationError_getFxErrors_6379924394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24184;

    public FormulaValidationError_getFxErrors_6379924394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24184 = newInstance(Class.forName("net.alenzen.a2l.validation.FormulaValidationError"));
        setField(term24184, term24184.getClass(), "formula", null);
        setField(term24184, term24184.getClass(), "fxErrors", null);
        setField(term24184, term24184.getClass(), "gxErrors", null);
        setField(term24184, term24184.getClass(), "backtrace", null);
        setField(term24184, term24184.getClass(), "detailMessage", null);
        setField(term24184, term24184.getClass(), "cause", null);
        setField(term24184, term24184.getClass(), "stackTrace", null);
        setIntField(term24184, term24184.getClass(), "depth", 0);
        setField(term24184, term24184.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.validation.FormulaValidationError");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFxErrors", argTypes, term24184, args);
    }

};



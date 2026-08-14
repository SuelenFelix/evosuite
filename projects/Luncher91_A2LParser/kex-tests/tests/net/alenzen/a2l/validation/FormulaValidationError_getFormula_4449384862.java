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

public class FormulaValidationError_getFormula_4449384862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20929;

    public FormulaValidationError_getFormula_4449384862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20929 = newInstance(Class.forName("net.alenzen.a2l.validation.FormulaValidationError"));
        setField(term20929, term20929.getClass(), "formula", null);
        setField(term20929, term20929.getClass(), "fxErrors", null);
        setField(term20929, term20929.getClass(), "gxErrors", null);
        setField(term20929, term20929.getClass(), "backtrace", null);
        setField(term20929, term20929.getClass(), "detailMessage", null);
        setField(term20929, term20929.getClass(), "cause", null);
        setField(term20929, term20929.getClass(), "stackTrace", null);
        setIntField(term20929, term20929.getClass(), "depth", 0);
        setField(term20929, term20929.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.validation.FormulaValidationError");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFormula", argTypes, term20929, args);
    }

};



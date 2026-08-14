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

public class StringValidationError_getValue_18912379379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17503;

    public StringValidationError_getValue_18912379379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17503 = newInstance(Class.forName("net.alenzen.a2l.validation.StringValidationError"));
        setField(term17503, term17503.getClass(), "field", null);
        setField(term17503, term17503.getClass(), "value", null);
        setField(term17503, term17503.getClass(), "target", null);
        setField(term17503, term17503.getClass(), "backtrace", null);
        setField(term17503, term17503.getClass(), "detailMessage", null);
        setField(term17503, term17503.getClass(), "cause", null);
        setField(term17503, term17503.getClass(), "stackTrace", null);
        setIntField(term17503, term17503.getClass(), "depth", 0);
        setField(term17503, term17503.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.validation.StringValidationError");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term17503, args);
    }

};



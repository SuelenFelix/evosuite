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

public class StringValidationError_getMessage_8268454973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8473;

    public StringValidationError_getMessage_8268454973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8473 = newInstance(Class.forName("net.alenzen.a2l.validation.StringValidationError"));
        setField(term8473, term8473.getClass(), "field", null);
        setField(term8473, term8473.getClass(), "value", null);
        setField(term8473, term8473.getClass(), "target", null);
        setField(term8473, term8473.getClass(), "backtrace", null);
        setField(term8473, term8473.getClass(), "detailMessage", null);
        setField(term8473, term8473.getClass(), "cause", null);
        setField(term8473, term8473.getClass(), "stackTrace", null);
        setIntField(term8473, term8473.getClass(), "depth", 0);
        setField(term8473, term8473.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.validation.StringValidationError");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term8473, args);
    }

};



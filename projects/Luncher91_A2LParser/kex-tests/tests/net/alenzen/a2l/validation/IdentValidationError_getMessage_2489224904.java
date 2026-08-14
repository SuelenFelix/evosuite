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

public class IdentValidationError_getMessage_2489224904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34531;

    public IdentValidationError_getMessage_2489224904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34531 = newInstance(Class.forName("net.alenzen.a2l.validation.IdentValidationError"));
        setField(term34531, term34531.getClass(), "field", null);
        setField(term34531, term34531.getClass(), "value", null);
        setField(term34531, term34531.getClass(), "target", null);
        setField(term34531, term34531.getClass(), "backtrace", null);
        setField(term34531, term34531.getClass(), "detailMessage", null);
        setField(term34531, term34531.getClass(), "cause", null);
        setField(term34531, term34531.getClass(), "stackTrace", null);
        setIntField(term34531, term34531.getClass(), "depth", 0);
        setField(term34531, term34531.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.validation.IdentValidationError");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term34531, args);
    }

};



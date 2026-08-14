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

public class IdentValidationError_getMessage_24892249013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55571;

    public IdentValidationError_getMessage_24892249013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55571 = newInstance(Class.forName("net.alenzen.a2l.validation.IdentValidationError"));
        setField(term55571, term55571.getClass(), "field", null);
        setField(term55571, term55571.getClass(), "value", null);
        setField(term55571, term55571.getClass(), "target", null);
        setField(term55571, term55571.getClass(), "backtrace", null);
        setField(term55571, term55571.getClass(), "detailMessage", null);
        setField(term55571, term55571.getClass(), "cause", null);
        setField(term55571, term55571.getClass(), "stackTrace", null);
        setIntField(term55571, term55571.getClass(), "depth", 0);
        setField(term55571, term55571.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.validation.IdentValidationError");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term55571, args);
    }

};



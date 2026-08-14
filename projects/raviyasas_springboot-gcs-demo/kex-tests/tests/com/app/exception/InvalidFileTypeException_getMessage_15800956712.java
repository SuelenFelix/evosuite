package com.app.exception;

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
import static com.app.exception.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class InvalidFileTypeException_getMessage_15800956712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43726;

    public InvalidFileTypeException_getMessage_15800956712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43726 = newInstance(Class.forName("com.app.exception.InvalidFileTypeException"));
        setField(term43726, term43726.getClass(), "message", null);
        setField(term43726, term43726.getClass(), "backtrace", null);
        setField(term43726, term43726.getClass(), "detailMessage", null);
        setField(term43726, term43726.getClass(), "cause", null);
        setField(term43726, term43726.getClass(), "stackTrace", null);
        setIntField(term43726, term43726.getClass(), "depth", 0);
        setField(term43726, term43726.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.InvalidFileTypeException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term43726, args);
    }

};



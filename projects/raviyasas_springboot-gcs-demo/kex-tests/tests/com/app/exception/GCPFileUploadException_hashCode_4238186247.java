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

public class GCPFileUploadException_hashCode_4238186247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25471;

    public GCPFileUploadException_hashCode_4238186247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25471 = newInstance(Class.forName("com.app.exception.GCPFileUploadException"));
        setField(term25471, term25471.getClass(), "message", null);
        setField(term25471, term25471.getClass(), "backtrace", null);
        setField(term25471, term25471.getClass(), "detailMessage", null);
        setField(term25471, term25471.getClass(), "cause", null);
        setField(term25471, term25471.getClass(), "stackTrace", null);
        setIntField(term25471, term25471.getClass(), "depth", 0);
        setField(term25471, term25471.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.GCPFileUploadException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term25471, args);
    }

};



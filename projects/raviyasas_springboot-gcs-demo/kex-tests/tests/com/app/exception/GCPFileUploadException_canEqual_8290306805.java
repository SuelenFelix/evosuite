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

public class GCPFileUploadException_canEqual_8290306805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20796;

    public GCPFileUploadException_canEqual_8290306805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20796 = newInstance(Class.forName("com.app.exception.GCPFileUploadException"));
        setField(term20796, term20796.getClass(), "message", null);
        setField(term20796, term20796.getClass(), "backtrace", null);
        setField(term20796, term20796.getClass(), "detailMessage", null);
        setField(term20796, term20796.getClass(), "cause", null);
        setField(term20796, term20796.getClass(), "stackTrace", null);
        setIntField(term20796, term20796.getClass(), "depth", 0);
        setField(term20796, term20796.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.exception.GCPFileUploadException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term20796, args);
    }

};



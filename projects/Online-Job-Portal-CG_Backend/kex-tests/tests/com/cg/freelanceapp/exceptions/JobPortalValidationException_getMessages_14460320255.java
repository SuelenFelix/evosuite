package com.cg.freelanceapp.exceptions;

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
import static com.cg.freelanceapp.exceptions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JobPortalValidationException_getMessages_14460320255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2955;

    public JobPortalValidationException_getMessages_14460320255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2955 = newInstance(Class.forName("com.cg.freelanceapp.exceptions.JobPortalValidationException"));
        setField(term2955, term2955.getClass(), "messages", null);
        setField(term2955, term2955.getClass(), "backtrace", null);
        setField(term2955, term2955.getClass(), "detailMessage", null);
        setField(term2955, term2955.getClass(), "cause", null);
        setField(term2955, term2955.getClass(), "stackTrace", null);
        setIntField(term2955, term2955.getClass(), "depth", 0);
        setField(term2955, term2955.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.exceptions.JobPortalValidationException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessages", argTypes, term2955, args);
    }

};



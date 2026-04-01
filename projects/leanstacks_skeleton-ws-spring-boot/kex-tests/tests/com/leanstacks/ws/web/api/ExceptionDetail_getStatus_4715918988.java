package com.leanstacks.ws.web.api;

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
import static com.leanstacks.ws.web.api.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExceptionDetail_getStatus_4715918988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3723;

    public ExceptionDetail_getStatus_4715918988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3723 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term3724 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term3724, term3724.getClass(), "seconds", 1775066777L);
        setIntField(term3724, term3724.getClass(), "nanos", 365835000);
        setField(term3723, term3723.getClass(), "timestamp", term3724);
        setField(term3723, term3723.getClass(), "method", "");
        setField(term3723, term3723.getClass(), "path", "");
        setIntField(term3723, term3723.getClass(), "status", -1955890973);
        setField(term3723, term3723.getClass(), "statusText", "");
        setField(term3723, term3723.getClass(), "exceptionClass", "");
        setField(term3723, term3723.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term3723, args);
    }

};



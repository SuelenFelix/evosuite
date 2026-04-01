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
import java.lang.Integer;

public class ExceptionDetail_setStatus_3866393249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3738;
     Object term3753;

    public ExceptionDetail_setStatus_3866393249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3738 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term3739 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term3739, term3739.getClass(), "seconds", 1775066777L);
        setIntField(term3739, term3739.getClass(), "nanos", 400889000);
        setField(term3738, term3738.getClass(), "timestamp", term3739);
        setField(term3738, term3738.getClass(), "method", "");
        setField(term3738, term3738.getClass(), "path", "");
        setIntField(term3738, term3738.getClass(), "status", -2038273078);
        setField(term3738, term3738.getClass(), "statusText", "");
        setField(term3738, term3738.getClass(), "exceptionClass", "");
        setField(term3738, term3738.getClass(), "exceptionMessage", "");
        term3753 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3753;
        callMethod(klass, "setStatus", argTypes, term3738, args);
    }

};



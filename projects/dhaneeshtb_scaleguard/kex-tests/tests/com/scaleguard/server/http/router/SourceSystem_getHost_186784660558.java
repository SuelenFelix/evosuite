package com.scaleguard.server.http.router;

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
import static com.scaleguard.server.http.router.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SourceSystem_getHost_186784660558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21816;

    public SourceSystem_getHost_186784660558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21816 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        setField(term21816, term21816.getClass(), "host", null);
        setBooleanField(term21816, term21816.getClass(), "tunnel", false);
        setField(term21816, term21816.getClass(), "port", null);
        setField(term21816, term21816.getClass(), "scheme", null);
        setField(term21816, term21816.getClass(), "basePath", null);
        setField(term21816, term21816.getClass(), "id", null);
        setField(term21816, term21816.getClass(), "name", null);
        setField(term21816, term21816.getClass(), "groupId", null);
        setField(term21816, term21816.getClass(), "target", null);
        setBooleanField(term21816, term21816.getClass(), "async", false);
        setField(term21816, term21816.getClass(), "asyncEngine", null);
        setField(term21816, term21816.getClass(), "callbackId", null);
        setField(term21816, term21816.getClass(), "jwtKeylookup", null);
        setField(term21816, term21816.getClass(), "certificateId", null);
        setField(term21816, term21816.getClass(), "secappid", null);
        setBooleanField(term21816, term21816.getClass(), "autoProcure", false);
        setField(term21816, term21816.getClass(), "targetSystem", null);
        setField(term21816, term21816.getClass(), "headerLookup", null);
        setField(term21816, term21816.getClass(), "keyLookupMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHost", argTypes, term21816, args);
    }

};



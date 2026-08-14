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

public class SourceSystem_setGroupId_36181693571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21868;

    public SourceSystem_setGroupId_36181693571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21868 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        setField(term21868, term21868.getClass(), "host", null);
        setBooleanField(term21868, term21868.getClass(), "tunnel", false);
        setField(term21868, term21868.getClass(), "port", null);
        setField(term21868, term21868.getClass(), "scheme", null);
        setField(term21868, term21868.getClass(), "basePath", null);
        setField(term21868, term21868.getClass(), "id", null);
        setField(term21868, term21868.getClass(), "name", null);
        setField(term21868, term21868.getClass(), "groupId", null);
        setField(term21868, term21868.getClass(), "target", null);
        setBooleanField(term21868, term21868.getClass(), "async", false);
        setField(term21868, term21868.getClass(), "asyncEngine", null);
        setField(term21868, term21868.getClass(), "callbackId", null);
        setField(term21868, term21868.getClass(), "jwtKeylookup", null);
        setField(term21868, term21868.getClass(), "certificateId", null);
        setField(term21868, term21868.getClass(), "secappid", null);
        setBooleanField(term21868, term21868.getClass(), "autoProcure", false);
        setField(term21868, term21868.getClass(), "targetSystem", null);
        setField(term21868, term21868.getClass(), "headerLookup", null);
        setField(term21868, term21868.getClass(), "keyLookupMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGroupId", argTypes, term21868, args);
    }

};



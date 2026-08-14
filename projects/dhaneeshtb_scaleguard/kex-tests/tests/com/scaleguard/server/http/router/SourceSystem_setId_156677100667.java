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

public class SourceSystem_setId_156677100667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21852;

    public SourceSystem_setId_156677100667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21852 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        setField(term21852, term21852.getClass(), "host", null);
        setBooleanField(term21852, term21852.getClass(), "tunnel", false);
        setField(term21852, term21852.getClass(), "port", null);
        setField(term21852, term21852.getClass(), "scheme", null);
        setField(term21852, term21852.getClass(), "basePath", null);
        setField(term21852, term21852.getClass(), "id", null);
        setField(term21852, term21852.getClass(), "name", null);
        setField(term21852, term21852.getClass(), "groupId", null);
        setField(term21852, term21852.getClass(), "target", null);
        setBooleanField(term21852, term21852.getClass(), "async", false);
        setField(term21852, term21852.getClass(), "asyncEngine", null);
        setField(term21852, term21852.getClass(), "callbackId", null);
        setField(term21852, term21852.getClass(), "jwtKeylookup", null);
        setField(term21852, term21852.getClass(), "certificateId", null);
        setField(term21852, term21852.getClass(), "secappid", null);
        setBooleanField(term21852, term21852.getClass(), "autoProcure", false);
        setField(term21852, term21852.getClass(), "targetSystem", null);
        setField(term21852, term21852.getClass(), "headerLookup", null);
        setField(term21852, term21852.getClass(), "keyLookupMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term21852, args);
    }

};



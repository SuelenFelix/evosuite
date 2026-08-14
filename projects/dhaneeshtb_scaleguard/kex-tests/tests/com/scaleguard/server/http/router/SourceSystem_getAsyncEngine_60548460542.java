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

public class SourceSystem_getAsyncEngine_60548460542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21750;

    public SourceSystem_getAsyncEngine_60548460542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21750 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        setField(term21750, term21750.getClass(), "host", null);
        setBooleanField(term21750, term21750.getClass(), "tunnel", false);
        setField(term21750, term21750.getClass(), "port", null);
        setField(term21750, term21750.getClass(), "scheme", null);
        setField(term21750, term21750.getClass(), "basePath", null);
        setField(term21750, term21750.getClass(), "id", null);
        setField(term21750, term21750.getClass(), "name", null);
        setField(term21750, term21750.getClass(), "groupId", null);
        setField(term21750, term21750.getClass(), "target", null);
        setBooleanField(term21750, term21750.getClass(), "async", false);
        setField(term21750, term21750.getClass(), "asyncEngine", null);
        setField(term21750, term21750.getClass(), "callbackId", null);
        setField(term21750, term21750.getClass(), "jwtKeylookup", null);
        setField(term21750, term21750.getClass(), "certificateId", null);
        setField(term21750, term21750.getClass(), "secappid", null);
        setBooleanField(term21750, term21750.getClass(), "autoProcure", false);
        setField(term21750, term21750.getClass(), "targetSystem", null);
        setField(term21750, term21750.getClass(), "headerLookup", null);
        setField(term21750, term21750.getClass(), "keyLookupMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAsyncEngine", argTypes, term21750, args);
    }

};



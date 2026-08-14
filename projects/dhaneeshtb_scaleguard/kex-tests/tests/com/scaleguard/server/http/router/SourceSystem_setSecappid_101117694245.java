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

public class SourceSystem_setSecappid_101117694245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21762;

    public SourceSystem_setSecappid_101117694245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21762 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        setField(term21762, term21762.getClass(), "host", null);
        setBooleanField(term21762, term21762.getClass(), "tunnel", false);
        setField(term21762, term21762.getClass(), "port", null);
        setField(term21762, term21762.getClass(), "scheme", null);
        setField(term21762, term21762.getClass(), "basePath", null);
        setField(term21762, term21762.getClass(), "id", null);
        setField(term21762, term21762.getClass(), "name", null);
        setField(term21762, term21762.getClass(), "groupId", null);
        setField(term21762, term21762.getClass(), "target", null);
        setBooleanField(term21762, term21762.getClass(), "async", false);
        setField(term21762, term21762.getClass(), "asyncEngine", null);
        setField(term21762, term21762.getClass(), "callbackId", null);
        setField(term21762, term21762.getClass(), "jwtKeylookup", null);
        setField(term21762, term21762.getClass(), "certificateId", null);
        setField(term21762, term21762.getClass(), "secappid", null);
        setBooleanField(term21762, term21762.getClass(), "autoProcure", false);
        setField(term21762, term21762.getClass(), "targetSystem", null);
        setField(term21762, term21762.getClass(), "headerLookup", null);
        setField(term21762, term21762.getClass(), "keyLookupMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSecappid", argTypes, term21762, args);
    }

};



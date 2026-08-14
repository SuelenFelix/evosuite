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

public class SourceSystem_setHost_14797003759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21820;

    public SourceSystem_setHost_14797003759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21820 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        setField(term21820, term21820.getClass(), "host", null);
        setBooleanField(term21820, term21820.getClass(), "tunnel", false);
        setField(term21820, term21820.getClass(), "port", null);
        setField(term21820, term21820.getClass(), "scheme", null);
        setField(term21820, term21820.getClass(), "basePath", null);
        setField(term21820, term21820.getClass(), "id", null);
        setField(term21820, term21820.getClass(), "name", null);
        setField(term21820, term21820.getClass(), "groupId", null);
        setField(term21820, term21820.getClass(), "target", null);
        setBooleanField(term21820, term21820.getClass(), "async", false);
        setField(term21820, term21820.getClass(), "asyncEngine", null);
        setField(term21820, term21820.getClass(), "callbackId", null);
        setField(term21820, term21820.getClass(), "jwtKeylookup", null);
        setField(term21820, term21820.getClass(), "certificateId", null);
        setField(term21820, term21820.getClass(), "secappid", null);
        setBooleanField(term21820, term21820.getClass(), "autoProcure", false);
        setField(term21820, term21820.getClass(), "targetSystem", null);
        setField(term21820, term21820.getClass(), "headerLookup", null);
        setField(term21820, term21820.getClass(), "keyLookupMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHost", argTypes, term21820, args);
    }

};



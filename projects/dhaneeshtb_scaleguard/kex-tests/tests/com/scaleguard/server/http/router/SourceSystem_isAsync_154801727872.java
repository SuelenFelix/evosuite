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

public class SourceSystem_isAsync_154801727872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21872;

    public SourceSystem_isAsync_154801727872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21872 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        setField(term21872, term21872.getClass(), "host", null);
        setBooleanField(term21872, term21872.getClass(), "tunnel", false);
        setField(term21872, term21872.getClass(), "port", null);
        setField(term21872, term21872.getClass(), "scheme", null);
        setField(term21872, term21872.getClass(), "basePath", null);
        setField(term21872, term21872.getClass(), "id", null);
        setField(term21872, term21872.getClass(), "name", null);
        setField(term21872, term21872.getClass(), "groupId", null);
        setField(term21872, term21872.getClass(), "target", null);
        setBooleanField(term21872, term21872.getClass(), "async", false);
        setField(term21872, term21872.getClass(), "asyncEngine", null);
        setField(term21872, term21872.getClass(), "callbackId", null);
        setField(term21872, term21872.getClass(), "jwtKeylookup", null);
        setField(term21872, term21872.getClass(), "certificateId", null);
        setField(term21872, term21872.getClass(), "secappid", null);
        setBooleanField(term21872, term21872.getClass(), "autoProcure", false);
        setField(term21872, term21872.getClass(), "targetSystem", null);
        setField(term21872, term21872.getClass(), "headerLookup", null);
        setField(term21872, term21872.getClass(), "keyLookupMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAsync", argTypes, term21872, args);
    }

};



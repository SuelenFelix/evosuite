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

public class TargetSystem_setHostGroupId_145466301332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35404;

    public TargetSystem_setHostGroupId_145466301332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35404 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term35404, term35404.getClass(), "cachedResources", null);
        setField(term35404, term35404.getClass(), "hostGroups", null);
        setField(term35404, term35404.getClass(), "host", null);
        setField(term35404, term35404.getClass(), "port", null);
        setField(term35404, term35404.getClass(), "hostGroupId", null);
        setField(term35404, term35404.getClass(), "scheme", null);
        setField(term35404, term35404.getClass(), "basePath", null);
        setField(term35404, term35404.getClass(), "id", null);
        setField(term35404, term35404.getClass(), "name", null);
        setField(term35404, term35404.getClass(), "groupId", null);
        setField(term35404, term35404.getClass(), "includeHeaders", null);
        setField(term35404, term35404.getClass(), "excludeHeaders", null);
        setBooleanField(term35404, term35404.getClass(), "enableCache", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHostGroupId", argTypes, term35404, args);
    }

};



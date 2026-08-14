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

public class TargetSystem_setId_51881240847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35436;

    public TargetSystem_setId_51881240847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35436 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term35436, term35436.getClass(), "cachedResources", null);
        setField(term35436, term35436.getClass(), "hostGroups", null);
        setField(term35436, term35436.getClass(), "host", null);
        setField(term35436, term35436.getClass(), "port", null);
        setField(term35436, term35436.getClass(), "hostGroupId", null);
        setField(term35436, term35436.getClass(), "scheme", null);
        setField(term35436, term35436.getClass(), "basePath", null);
        setField(term35436, term35436.getClass(), "id", null);
        setField(term35436, term35436.getClass(), "name", null);
        setField(term35436, term35436.getClass(), "groupId", null);
        setField(term35436, term35436.getClass(), "includeHeaders", null);
        setField(term35436, term35436.getClass(), "excludeHeaders", null);
        setBooleanField(term35436, term35436.getClass(), "enableCache", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term35436, args);
    }

};



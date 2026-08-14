package com.scaleguard.server.http.reverse;

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
import static com.scaleguard.server.http.reverse.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ScaleGuardKeyManager_getClientAliases_3895992671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4188;
     Object term4213;

    public ScaleGuardKeyManager_getClientAliases_3895992671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4188 = newInstance(Class.forName("com.scaleguard.server.http.reverse.ScaleGuardKeyManager"));
        setField(term4188, term4188.getClass(), "keyManager", null);
        setField(term4188, term4188.getClass(), "defaultAlias", "XqgfKFvPSD");
        term4213 = (Object[]) newArray("java.security.Principal", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.reverse.ScaleGuardKeyManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.security.Principal"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "JiVRgTZvKc";
        args[1] = term4213;
        callMethod(klass, "getClientAliases", argTypes, term4188, args);
    }

};



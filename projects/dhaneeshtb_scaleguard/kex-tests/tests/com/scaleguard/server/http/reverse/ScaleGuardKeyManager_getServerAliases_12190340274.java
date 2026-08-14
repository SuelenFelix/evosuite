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

public class ScaleGuardKeyManager_getServerAliases_12190340274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4506;
     Object term4531;

    public ScaleGuardKeyManager_getServerAliases_12190340274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4506 = newInstance(Class.forName("com.scaleguard.server.http.reverse.ScaleGuardKeyManager"));
        setField(term4506, term4506.getClass(), "keyManager", null);
        setField(term4506, term4506.getClass(), "defaultAlias", "fztQhjqwdP");
        term4531 = (Object[]) newArray("java.security.Principal", 3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.reverse.ScaleGuardKeyManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.security.Principal"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "eVpkWxjuki";
        args[1] = term4531;
        callMethod(klass, "getServerAliases", argTypes, term4506, args);
    }

};



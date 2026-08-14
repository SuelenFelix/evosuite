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

public class ScaleGuardKeyManager_chooseEngineClientAlias_6275823023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4459;
     Object term4472;
     Object term4485;

    public ScaleGuardKeyManager_chooseEngineClientAlias_6275823023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4459 = newInstance(Class.forName("com.scaleguard.server.http.reverse.ScaleGuardKeyManager"));
        setField(term4459, term4459.getClass(), "keyManager", null);
        setField(term4459, term4459.getClass(), "defaultAlias", "sEnIVFtZuQ");
        term4472 = (Object[]) newArray("java.lang.String", 1);
        setElement(term4472, 0, "ZVecLZMLHF");
        term4485 = (Object[]) newArray("java.security.Principal", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.reverse.ScaleGuardKeyManager");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.security.Principal"), 0).getClass();
        argTypes[2] = Class.forName("javax.net.ssl.SSLEngine");
        Object[] args = new Object[3];
        args[0] = term4472;
        args[1] = term4485;
        args[2] = null;
        callMethod(klass, "chooseEngineClientAlias", argTypes, term4459, args);
    }

};



package org.openRealmOfStars.ambient.connection;

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
import static org.openRealmOfStars.ambient.connection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BlindTrustManager_parsePrincipal_8868405283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;

    public BlindTrustManager_parsePrincipal_8868405283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137 = newInstance(Class.forName("org.openRealmOfStars.ambient.connection.BlindTrustManager"));
        setField(term137, term137.getClass(), "bridgeId", "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ambient.connection.BlindTrustManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "MjGYSRKTNF";
        args[1] = "hRNSzYYIrc";
        callMethod(klass, "parsePrincipal", argTypes, term137, args);
    }

};



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

public class BridgeHostnameVerifier_verify_4969068561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public BridgeHostnameVerifier_verify_4969068561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.openRealmOfStars.ambient.connection.BridgeHostnameVerifier"));
        setField(term23, term23.getClass(), "bridgeHostName", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ambient.connection.BridgeHostnameVerifier");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("javax.net.ssl.SSLSession");
        Object[] args = new Object[2];
        args[0] = "MuLcgQHgqz";
        args[1] = null;
        callMethod(klass, "verify", argTypes, term23, args);
    }

};



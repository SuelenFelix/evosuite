package com.getindata.connectors.http.internal.security;

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
import static com.getindata.connectors.http.internal.security.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SelfSignedTrustManager_checkClientTrusted_15487186823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416;
     Object term417;

    public SelfSignedTrustManager_checkClientTrusted_15487186823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term416 = newInstance(Class.forName("com.getindata.connectors.http.internal.security.SelfSignedTrustManager"));
        setField(term416, term416.getClass(), "delegate", null);
        term417 = (Object[]) newArray("java.security.cert.X509Certificate", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.security.SelfSignedTrustManager");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.security.cert.X509Certificate"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("javax.net.ssl.SSLEngine");
        Object[] args = new Object[3];
        args[0] = term417;
        args[1] = "LQFpaHEwXR";
        args[2] = null;
        callMethod(klass, "checkClientTrusted", argTypes, term416, args);
    }

};



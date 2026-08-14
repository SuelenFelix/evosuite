package com.dmatik.orefalerts;

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
import static com.dmatik.orefalerts.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SSLUtil_1_checkClientTrusted_6240788322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5642;
     Object term5643;

    public SSLUtil_1_checkClientTrusted_6240788322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5642 = newInstance(Class.forName("com.dmatik.orefalerts.SSLUtil$1"));
        term5643 = (Object[]) newArray("java.security.cert.X509Certificate", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.SSLUtil$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.security.cert.X509Certificate"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term5643;
        args[1] = "SIODFGaQhr";
        callMethod(klass, "checkClientTrusted", argTypes, term5642, args);
    }

};



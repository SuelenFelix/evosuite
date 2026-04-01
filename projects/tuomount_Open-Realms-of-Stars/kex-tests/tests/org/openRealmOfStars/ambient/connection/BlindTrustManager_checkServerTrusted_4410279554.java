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
import java.lang.Object;

public class BlindTrustManager_checkServerTrusted_4410279554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204;
     Object term217;

    public BlindTrustManager_checkServerTrusted_4410279554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204 = newInstance(Class.forName("org.openRealmOfStars.ambient.connection.BlindTrustManager"));
        setField(term204, term204.getClass(), "bridgeId", "RMFIsYGgne");
        term217 = (Object[]) newArray("java.security.cert.X509Certificate", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ambient.connection.BlindTrustManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.security.cert.X509Certificate"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term217;
        args[1] = "NRdvgJlhkX";
        callMethod(klass, "checkServerTrusted", argTypes, term204, args);
    }

};



package com.scaleguard.server.licencing.licensing;

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
import static com.scaleguard.server.licencing.licensing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LicenceRequest_setDeviceId_123543035519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19103;

    public LicenceRequest_setDeviceId_123543035519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19103 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term19103, term19103.getClass(), "email", "MFKjhvLtpe");
        setField(term19103, term19103.getClass(), "name", "xpbLKEsput");
        setField(term19103, term19103.getClass(), "address", "urlyLwPBVn");
        setField(term19103, term19103.getClass(), "phone", "SPQVzOlOzZ");
        setField(term19103, term19103.getClass(), "country", "bOUAgAptAI");
        setField(term19103, term19103.getClass(), "zipPostalCode", "KSZfGbvzPE");
        setField(term19103, term19103.getClass(), "deviceId", "YfgYGgzYER");
        setField(term19103, term19103.getClass(), "plan", "IDClvDZuqE");
        setBooleanField(term19103, term19103.getClass(), "isEvaluation", false);
        setLongField(term19103, term19103.getClass(), "timestamp", 1786470047092L);
        setField(term19103, term19103.getClass(), "passcode", "cMvKxpZOvg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WWBYemIuiK";
        callMethod(klass, "setDeviceId", argTypes, term19103, args);
    }

};



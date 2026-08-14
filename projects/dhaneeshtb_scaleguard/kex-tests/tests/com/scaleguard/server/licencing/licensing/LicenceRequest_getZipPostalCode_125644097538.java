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

public class LicenceRequest_getZipPostalCode_125644097538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19797;

    public LicenceRequest_getZipPostalCode_125644097538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19797 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term19797, term19797.getClass(), "email", null);
        setField(term19797, term19797.getClass(), "name", null);
        setField(term19797, term19797.getClass(), "address", null);
        setField(term19797, term19797.getClass(), "phone", null);
        setField(term19797, term19797.getClass(), "country", null);
        setField(term19797, term19797.getClass(), "zipPostalCode", null);
        setField(term19797, term19797.getClass(), "deviceId", null);
        setField(term19797, term19797.getClass(), "plan", null);
        setBooleanField(term19797, term19797.getClass(), "isEvaluation", false);
        setLongField(term19797, term19797.getClass(), "timestamp", 0L);
        setField(term19797, term19797.getClass(), "passcode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZipPostalCode", argTypes, term19797, args);
    }

};



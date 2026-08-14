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

public class LicenceRequest_setDeviceId_123543035541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19806;

    public LicenceRequest_setDeviceId_123543035541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19806 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term19806, term19806.getClass(), "email", null);
        setField(term19806, term19806.getClass(), "name", null);
        setField(term19806, term19806.getClass(), "address", null);
        setField(term19806, term19806.getClass(), "phone", null);
        setField(term19806, term19806.getClass(), "country", null);
        setField(term19806, term19806.getClass(), "zipPostalCode", null);
        setField(term19806, term19806.getClass(), "deviceId", null);
        setField(term19806, term19806.getClass(), "plan", null);
        setBooleanField(term19806, term19806.getClass(), "isEvaluation", false);
        setLongField(term19806, term19806.getClass(), "timestamp", 0L);
        setField(term19806, term19806.getClass(), "passcode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDeviceId", argTypes, term19806, args);
    }

};



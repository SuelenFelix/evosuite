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

public class LicenceRequest_setCountry_39938462237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19794;

    public LicenceRequest_setCountry_39938462237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19794 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term19794, term19794.getClass(), "email", null);
        setField(term19794, term19794.getClass(), "name", null);
        setField(term19794, term19794.getClass(), "address", null);
        setField(term19794, term19794.getClass(), "phone", null);
        setField(term19794, term19794.getClass(), "country", null);
        setField(term19794, term19794.getClass(), "zipPostalCode", null);
        setField(term19794, term19794.getClass(), "deviceId", null);
        setField(term19794, term19794.getClass(), "plan", null);
        setBooleanField(term19794, term19794.getClass(), "isEvaluation", false);
        setLongField(term19794, term19794.getClass(), "timestamp", 0L);
        setField(term19794, term19794.getClass(), "passcode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCountry", argTypes, term19794, args);
    }

};



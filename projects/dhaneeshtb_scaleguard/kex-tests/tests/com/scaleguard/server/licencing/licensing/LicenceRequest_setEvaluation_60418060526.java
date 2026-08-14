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
import java.lang.Boolean;

public class LicenceRequest_setEvaluation_60418060526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19759;
     Object term19762;

    public LicenceRequest_setEvaluation_60418060526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19759 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term19759, term19759.getClass(), "email", null);
        setField(term19759, term19759.getClass(), "name", null);
        setField(term19759, term19759.getClass(), "address", null);
        setField(term19759, term19759.getClass(), "phone", null);
        setField(term19759, term19759.getClass(), "country", null);
        setField(term19759, term19759.getClass(), "zipPostalCode", null);
        setField(term19759, term19759.getClass(), "deviceId", null);
        setField(term19759, term19759.getClass(), "plan", null);
        setBooleanField(term19759, term19759.getClass(), "isEvaluation", false);
        setLongField(term19759, term19759.getClass(), "timestamp", 0L);
        setField(term19759, term19759.getClass(), "passcode", null);
        term19762 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term19762;
        callMethod(klass, "setEvaluation", argTypes, term19759, args);
    }

};



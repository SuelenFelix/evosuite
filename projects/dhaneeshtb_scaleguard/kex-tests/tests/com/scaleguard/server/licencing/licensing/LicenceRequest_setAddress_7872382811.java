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

public class LicenceRequest_setAddress_7872382811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17407;

    public LicenceRequest_setAddress_7872382811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17407 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term17407, term17407.getClass(), "email", "lzcwhvjdFg");
        setField(term17407, term17407.getClass(), "name", "dfzWTjcjnI");
        setField(term17407, term17407.getClass(), "address", "bsnZXGEvFv");
        setField(term17407, term17407.getClass(), "phone", "osFrHWYeRy");
        setField(term17407, term17407.getClass(), "country", "scpIQUfPKw");
        setField(term17407, term17407.getClass(), "zipPostalCode", "QKYBpCjuYt");
        setField(term17407, term17407.getClass(), "deviceId", "vjiRfoGdkl");
        setField(term17407, term17407.getClass(), "plan", "TwaxeSHvnR");
        setBooleanField(term17407, term17407.getClass(), "isEvaluation", false);
        setLongField(term17407, term17407.getClass(), "timestamp", 1786470046771L);
        setField(term17407, term17407.getClass(), "passcode", "paPzDETzIq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fufeuGfwpN";
        callMethod(klass, "setAddress", argTypes, term17407, args);
    }

};



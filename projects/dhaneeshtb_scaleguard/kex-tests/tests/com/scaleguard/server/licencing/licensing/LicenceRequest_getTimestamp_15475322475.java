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

public class LicenceRequest_getTimestamp_15475322475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16157;

    public LicenceRequest_getTimestamp_15475322475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16157 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term16157, term16157.getClass(), "email", "vYYOYhWMWZ");
        setField(term16157, term16157.getClass(), "name", "FLQJOzEXff");
        setField(term16157, term16157.getClass(), "address", "qlaIVJBSfQ");
        setField(term16157, term16157.getClass(), "phone", "lYvIWBFFsq");
        setField(term16157, term16157.getClass(), "country", "tThwsqWKcE");
        setField(term16157, term16157.getClass(), "zipPostalCode", "bkSgsDrkCN");
        setField(term16157, term16157.getClass(), "deviceId", "hwjlcimgJH");
        setField(term16157, term16157.getClass(), "plan", "TLxQzxvizR");
        setBooleanField(term16157, term16157.getClass(), "isEvaluation", true);
        setLongField(term16157, term16157.getClass(), "timestamp", 1786470046536L);
        setField(term16157, term16157.getClass(), "passcode", "uUgJfKAzDM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimestamp", argTypes, term16157, args);
    }

};



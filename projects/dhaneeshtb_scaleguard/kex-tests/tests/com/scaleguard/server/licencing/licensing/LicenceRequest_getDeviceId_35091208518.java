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

public class LicenceRequest_getDeviceId_35091208518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18902;

    public LicenceRequest_getDeviceId_35091208518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18902 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term18902, term18902.getClass(), "email", "JeyKRznnft");
        setField(term18902, term18902.getClass(), "name", "vQJUCtuYpK");
        setField(term18902, term18902.getClass(), "address", "GHtOeztAdz");
        setField(term18902, term18902.getClass(), "phone", "gSAtqakaLY");
        setField(term18902, term18902.getClass(), "country", "taPBiMFNEZ");
        setField(term18902, term18902.getClass(), "zipPostalCode", "NoAFAfGyYL");
        setField(term18902, term18902.getClass(), "deviceId", "MFtfkBMyOD");
        setField(term18902, term18902.getClass(), "plan", "rdiIyXfRtL");
        setBooleanField(term18902, term18902.getClass(), "isEvaluation", false);
        setLongField(term18902, term18902.getClass(), "timestamp", 1786470047044L);
        setField(term18902, term18902.getClass(), "passcode", "douzkltmiI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeviceId", argTypes, term18902, args);
    }

};



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

public class LicenceRequest_getZipPostalCode_125644097516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18478;

    public LicenceRequest_getZipPostalCode_125644097516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18478 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term18478, term18478.getClass(), "email", "owLqDDnwZA");
        setField(term18478, term18478.getClass(), "name", "eBcTbweeYp");
        setField(term18478, term18478.getClass(), "address", "drcmjfQUDq");
        setField(term18478, term18478.getClass(), "phone", "GjdWUoUSyA");
        setField(term18478, term18478.getClass(), "country", "YEkxWsWaUl");
        setField(term18478, term18478.getClass(), "zipPostalCode", "RINhPkhhct");
        setField(term18478, term18478.getClass(), "deviceId", "vjNPcTSqmS");
        setField(term18478, term18478.getClass(), "plan", "fFhdWuJbdC");
        setBooleanField(term18478, term18478.getClass(), "isEvaluation", false);
        setLongField(term18478, term18478.getClass(), "timestamp", 1786470046965L);
        setField(term18478, term18478.getClass(), "passcode", "JlgLIHPabR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZipPostalCode", argTypes, term18478, args);
    }

};



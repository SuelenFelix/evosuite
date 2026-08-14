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

public class LicenceRequest_getPlan_5780696131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15329;

    public LicenceRequest_getPlan_5780696131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15329 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term15329, term15329.getClass(), "email", "maXrGOGoKA");
        setField(term15329, term15329.getClass(), "name", "zAkgWQVCpM");
        setField(term15329, term15329.getClass(), "address", "yQUDyOroXU");
        setField(term15329, term15329.getClass(), "phone", "xweqkPdyJH");
        setField(term15329, term15329.getClass(), "country", "kwteHWzwcc");
        setField(term15329, term15329.getClass(), "zipPostalCode", "uMsWXqNhln");
        setField(term15329, term15329.getClass(), "deviceId", "MAnhIPOtHL");
        setField(term15329, term15329.getClass(), "plan", "dikKjYjmRO");
        setBooleanField(term15329, term15329.getClass(), "isEvaluation", true);
        setLongField(term15329, term15329.getClass(), "timestamp", 1786470046368L);
        setField(term15329, term15329.getClass(), "passcode", "GJnnMDVnEP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlan", argTypes, term15329, args);
    }

};



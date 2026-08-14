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

public class LicenceRequest_getEmail_7333363326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16358;

    public LicenceRequest_getEmail_7333363326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16358 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term16358, term16358.getClass(), "email", "gZPZNkweEp");
        setField(term16358, term16358.getClass(), "name", "vfennwtmqe");
        setField(term16358, term16358.getClass(), "address", "zZxoNkohbw");
        setField(term16358, term16358.getClass(), "phone", "DQrjPcLysX");
        setField(term16358, term16358.getClass(), "country", "VWPFyrpmmb");
        setField(term16358, term16358.getClass(), "zipPostalCode", "gYYKrIeThw");
        setField(term16358, term16358.getClass(), "deviceId", "UsxeLMVkAK");
        setField(term16358, term16358.getClass(), "plan", "ITrhiKKzcb");
        setBooleanField(term16358, term16358.getClass(), "isEvaluation", true);
        setLongField(term16358, term16358.getClass(), "timestamp", 1786470046575L);
        setField(term16358, term16358.getClass(), "passcode", "qMKmSzOQXg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term16358, args);
    }

};



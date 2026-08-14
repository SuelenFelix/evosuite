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

public class LicenceRequest_getName_5110014238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16782;

    public LicenceRequest_getName_5110014238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16782 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term16782, term16782.getClass(), "email", "GrTaccOQzl");
        setField(term16782, term16782.getClass(), "name", "uuSYOUCVHU");
        setField(term16782, term16782.getClass(), "address", "DfWwbodtVw");
        setField(term16782, term16782.getClass(), "phone", "kTbFMpVWqx");
        setField(term16782, term16782.getClass(), "country", "HegRNsidFg");
        setField(term16782, term16782.getClass(), "zipPostalCode", "udRdJkgXmH");
        setField(term16782, term16782.getClass(), "deviceId", "FBCXbjHVXO");
        setField(term16782, term16782.getClass(), "plan", "dIWAnvmLiC");
        setBooleanField(term16782, term16782.getClass(), "isEvaluation", true);
        setLongField(term16782, term16782.getClass(), "timestamp", 1786470046657L);
        setField(term16782, term16782.getClass(), "passcode", "CuWebzZQjZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term16782, args);
    }

};



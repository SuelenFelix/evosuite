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

public class LicenceRequest_isEvaluation_15969239193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15753;

    public LicenceRequest_isEvaluation_15969239193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15753 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term15753, term15753.getClass(), "email", "jlcBpLoWfd");
        setField(term15753, term15753.getClass(), "name", "oYymmLqbfJ");
        setField(term15753, term15753.getClass(), "address", "YaDWphDOSz");
        setField(term15753, term15753.getClass(), "phone", "nnnmCgFBLw");
        setField(term15753, term15753.getClass(), "country", "hSSCyNEhyH");
        setField(term15753, term15753.getClass(), "zipPostalCode", "jDFNSuvZqm");
        setField(term15753, term15753.getClass(), "deviceId", "pLvkKHqNYX");
        setField(term15753, term15753.getClass(), "plan", "PwqnuJJwjR");
        setBooleanField(term15753, term15753.getClass(), "isEvaluation", false);
        setLongField(term15753, term15753.getClass(), "timestamp", 1786470046454L);
        setField(term15753, term15753.getClass(), "passcode", "NFkbBiPeiw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEvaluation", argTypes, term15753, args);
    }

};



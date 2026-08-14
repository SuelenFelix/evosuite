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

public class LicenceRequest_getPhone_30919533412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17630;

    public LicenceRequest_getPhone_30919533412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17630 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term17630, term17630.getClass(), "email", "XJbkXbljvz");
        setField(term17630, term17630.getClass(), "name", "fuvdkDwBeH");
        setField(term17630, term17630.getClass(), "address", "NTefzwLPhx");
        setField(term17630, term17630.getClass(), "phone", "dirFuhqyNu");
        setField(term17630, term17630.getClass(), "country", "YVLRenzuoR");
        setField(term17630, term17630.getClass(), "zipPostalCode", "JukEMhPWql");
        setField(term17630, term17630.getClass(), "deviceId", "ZdNcodHERG");
        setField(term17630, term17630.getClass(), "plan", "CLHomjAqIM");
        setBooleanField(term17630, term17630.getClass(), "isEvaluation", true);
        setLongField(term17630, term17630.getClass(), "timestamp", 1786470046810L);
        setField(term17630, term17630.getClass(), "passcode", "mzCFLzFuSj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhone", argTypes, term17630, args);
    }

};



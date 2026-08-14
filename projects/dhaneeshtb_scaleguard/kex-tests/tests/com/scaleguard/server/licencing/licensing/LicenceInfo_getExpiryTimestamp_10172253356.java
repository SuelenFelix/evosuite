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

public class LicenceInfo_getExpiryTimestamp_10172253356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14469;

    public LicenceInfo_getExpiryTimestamp_10172253356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14469 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term14469, term14469.getClass(), "email", null);
        setField(term14469, term14469.getClass(), "name", null);
        setField(term14469, term14469.getClass(), "address", null);
        setField(term14469, term14469.getClass(), "phone", null);
        setField(term14469, term14469.getClass(), "country", null);
        setField(term14469, term14469.getClass(), "zipPostalCode", null);
        setField(term14469, term14469.getClass(), "deviceId", null);
        setField(term14469, term14469.getClass(), "activationKey", null);
        setField(term14469, term14469.getClass(), "activationHash", null);
        setField(term14469, term14469.getClass(), "dbKey", null);
        setField(term14469, term14469.getClass(), "passcode", null);
        setLongField(term14469, term14469.getClass(), "timestamp", 0L);
        setLongField(term14469, term14469.getClass(), "activationTimestamp", 0L);
        setLongField(term14469, term14469.getClass(), "approver", 0L);
        setField(term14469, term14469.getClass(), "licenceId", null);
        setLongField(term14469, term14469.getClass(), "expiryTimestamp", 0L);
        setField(term14469, term14469.getClass(), "plan", null);
        setBooleanField(term14469, term14469.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExpiryTimestamp", argTypes, term14469, args);
    }

};



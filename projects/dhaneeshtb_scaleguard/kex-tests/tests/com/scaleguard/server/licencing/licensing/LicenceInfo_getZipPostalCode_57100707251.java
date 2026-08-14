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

public class LicenceInfo_getZipPostalCode_57100707251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14434;

    public LicenceInfo_getZipPostalCode_57100707251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14434 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term14434, term14434.getClass(), "email", null);
        setField(term14434, term14434.getClass(), "name", null);
        setField(term14434, term14434.getClass(), "address", null);
        setField(term14434, term14434.getClass(), "phone", null);
        setField(term14434, term14434.getClass(), "country", null);
        setField(term14434, term14434.getClass(), "zipPostalCode", null);
        setField(term14434, term14434.getClass(), "deviceId", null);
        setField(term14434, term14434.getClass(), "activationKey", null);
        setField(term14434, term14434.getClass(), "activationHash", null);
        setField(term14434, term14434.getClass(), "dbKey", null);
        setField(term14434, term14434.getClass(), "passcode", null);
        setLongField(term14434, term14434.getClass(), "timestamp", 0L);
        setLongField(term14434, term14434.getClass(), "activationTimestamp", 0L);
        setLongField(term14434, term14434.getClass(), "approver", 0L);
        setField(term14434, term14434.getClass(), "licenceId", null);
        setLongField(term14434, term14434.getClass(), "expiryTimestamp", 0L);
        setField(term14434, term14434.getClass(), "plan", null);
        setBooleanField(term14434, term14434.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZipPostalCode", argTypes, term14434, args);
    }

};



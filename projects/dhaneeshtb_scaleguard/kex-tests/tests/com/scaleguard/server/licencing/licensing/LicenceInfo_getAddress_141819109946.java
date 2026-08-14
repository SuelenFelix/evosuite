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

public class LicenceInfo_getAddress_141819109946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14397;

    public LicenceInfo_getAddress_141819109946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14397 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term14397, term14397.getClass(), "email", null);
        setField(term14397, term14397.getClass(), "name", null);
        setField(term14397, term14397.getClass(), "address", null);
        setField(term14397, term14397.getClass(), "phone", null);
        setField(term14397, term14397.getClass(), "country", null);
        setField(term14397, term14397.getClass(), "zipPostalCode", null);
        setField(term14397, term14397.getClass(), "deviceId", null);
        setField(term14397, term14397.getClass(), "activationKey", null);
        setField(term14397, term14397.getClass(), "activationHash", null);
        setField(term14397, term14397.getClass(), "dbKey", null);
        setField(term14397, term14397.getClass(), "passcode", null);
        setLongField(term14397, term14397.getClass(), "timestamp", 0L);
        setLongField(term14397, term14397.getClass(), "activationTimestamp", 0L);
        setLongField(term14397, term14397.getClass(), "approver", 0L);
        setField(term14397, term14397.getClass(), "licenceId", null);
        setLongField(term14397, term14397.getClass(), "expiryTimestamp", 0L);
        setField(term14397, term14397.getClass(), "plan", null);
        setBooleanField(term14397, term14397.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddress", argTypes, term14397, args);
    }

};



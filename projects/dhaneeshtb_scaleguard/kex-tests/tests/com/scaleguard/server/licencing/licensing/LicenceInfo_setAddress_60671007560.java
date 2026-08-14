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

public class LicenceInfo_setAddress_60671007560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14497;

    public LicenceInfo_setAddress_60671007560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14497 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term14497, term14497.getClass(), "email", null);
        setField(term14497, term14497.getClass(), "name", null);
        setField(term14497, term14497.getClass(), "address", null);
        setField(term14497, term14497.getClass(), "phone", null);
        setField(term14497, term14497.getClass(), "country", null);
        setField(term14497, term14497.getClass(), "zipPostalCode", null);
        setField(term14497, term14497.getClass(), "deviceId", null);
        setField(term14497, term14497.getClass(), "activationKey", null);
        setField(term14497, term14497.getClass(), "activationHash", null);
        setField(term14497, term14497.getClass(), "dbKey", null);
        setField(term14497, term14497.getClass(), "passcode", null);
        setLongField(term14497, term14497.getClass(), "timestamp", 0L);
        setLongField(term14497, term14497.getClass(), "activationTimestamp", 0L);
        setLongField(term14497, term14497.getClass(), "approver", 0L);
        setField(term14497, term14497.getClass(), "licenceId", null);
        setLongField(term14497, term14497.getClass(), "expiryTimestamp", 0L);
        setField(term14497, term14497.getClass(), "plan", null);
        setBooleanField(term14497, term14497.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAddress", argTypes, term14497, args);
    }

};



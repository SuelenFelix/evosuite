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

public class LicenceInfo_setPhone_57096082161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14504;

    public LicenceInfo_setPhone_57096082161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14504 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term14504, term14504.getClass(), "email", null);
        setField(term14504, term14504.getClass(), "name", null);
        setField(term14504, term14504.getClass(), "address", null);
        setField(term14504, term14504.getClass(), "phone", null);
        setField(term14504, term14504.getClass(), "country", null);
        setField(term14504, term14504.getClass(), "zipPostalCode", null);
        setField(term14504, term14504.getClass(), "deviceId", null);
        setField(term14504, term14504.getClass(), "activationKey", null);
        setField(term14504, term14504.getClass(), "activationHash", null);
        setField(term14504, term14504.getClass(), "dbKey", null);
        setField(term14504, term14504.getClass(), "passcode", null);
        setLongField(term14504, term14504.getClass(), "timestamp", 0L);
        setLongField(term14504, term14504.getClass(), "activationTimestamp", 0L);
        setLongField(term14504, term14504.getClass(), "approver", 0L);
        setField(term14504, term14504.getClass(), "licenceId", null);
        setLongField(term14504, term14504.getClass(), "expiryTimestamp", 0L);
        setField(term14504, term14504.getClass(), "plan", null);
        setBooleanField(term14504, term14504.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPhone", argTypes, term14504, args);
    }

};



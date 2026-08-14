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
import java.lang.Long;

public class LicenceInfo_setApprover_32459412366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14541;
     Object term14548;

    public LicenceInfo_setApprover_32459412366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14541 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term14541, term14541.getClass(), "email", null);
        setField(term14541, term14541.getClass(), "name", null);
        setField(term14541, term14541.getClass(), "address", null);
        setField(term14541, term14541.getClass(), "phone", null);
        setField(term14541, term14541.getClass(), "country", null);
        setField(term14541, term14541.getClass(), "zipPostalCode", null);
        setField(term14541, term14541.getClass(), "deviceId", null);
        setField(term14541, term14541.getClass(), "activationKey", null);
        setField(term14541, term14541.getClass(), "activationHash", null);
        setField(term14541, term14541.getClass(), "dbKey", null);
        setField(term14541, term14541.getClass(), "passcode", null);
        setLongField(term14541, term14541.getClass(), "timestamp", 0L);
        setLongField(term14541, term14541.getClass(), "activationTimestamp", 0L);
        setLongField(term14541, term14541.getClass(), "approver", 0L);
        setField(term14541, term14541.getClass(), "licenceId", null);
        setLongField(term14541, term14541.getClass(), "expiryTimestamp", 0L);
        setField(term14541, term14541.getClass(), "plan", null);
        setBooleanField(term14541, term14541.getClass(), "isEvaluation", false);
        term14548 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term14548;
        callMethod(klass, "setApprover", argTypes, term14541, args);
    }

};



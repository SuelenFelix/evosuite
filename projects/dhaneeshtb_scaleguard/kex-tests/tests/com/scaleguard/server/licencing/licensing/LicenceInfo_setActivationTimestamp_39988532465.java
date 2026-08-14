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

public class LicenceInfo_setActivationTimestamp_39988532465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14532;
     Object term14539;

    public LicenceInfo_setActivationTimestamp_39988532465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14532 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term14532, term14532.getClass(), "email", null);
        setField(term14532, term14532.getClass(), "name", null);
        setField(term14532, term14532.getClass(), "address", null);
        setField(term14532, term14532.getClass(), "phone", null);
        setField(term14532, term14532.getClass(), "country", null);
        setField(term14532, term14532.getClass(), "zipPostalCode", null);
        setField(term14532, term14532.getClass(), "deviceId", null);
        setField(term14532, term14532.getClass(), "activationKey", null);
        setField(term14532, term14532.getClass(), "activationHash", null);
        setField(term14532, term14532.getClass(), "dbKey", null);
        setField(term14532, term14532.getClass(), "passcode", null);
        setLongField(term14532, term14532.getClass(), "timestamp", 0L);
        setLongField(term14532, term14532.getClass(), "activationTimestamp", 0L);
        setLongField(term14532, term14532.getClass(), "approver", 0L);
        setField(term14532, term14532.getClass(), "licenceId", null);
        setLongField(term14532, term14532.getClass(), "expiryTimestamp", 0L);
        setField(term14532, term14532.getClass(), "plan", null);
        setBooleanField(term14532, term14532.getClass(), "isEvaluation", false);
        term14539 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term14539;
        callMethod(klass, "setActivationTimestamp", argTypes, term14532, args);
    }

};



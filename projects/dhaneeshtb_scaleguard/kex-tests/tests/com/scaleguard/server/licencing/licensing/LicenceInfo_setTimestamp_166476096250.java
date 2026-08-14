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

public class LicenceInfo_setTimestamp_166476096250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14425;
     Object term14432;

    public LicenceInfo_setTimestamp_166476096250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14425 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term14425, term14425.getClass(), "email", null);
        setField(term14425, term14425.getClass(), "name", null);
        setField(term14425, term14425.getClass(), "address", null);
        setField(term14425, term14425.getClass(), "phone", null);
        setField(term14425, term14425.getClass(), "country", null);
        setField(term14425, term14425.getClass(), "zipPostalCode", null);
        setField(term14425, term14425.getClass(), "deviceId", null);
        setField(term14425, term14425.getClass(), "activationKey", null);
        setField(term14425, term14425.getClass(), "activationHash", null);
        setField(term14425, term14425.getClass(), "dbKey", null);
        setField(term14425, term14425.getClass(), "passcode", null);
        setLongField(term14425, term14425.getClass(), "timestamp", 0L);
        setLongField(term14425, term14425.getClass(), "activationTimestamp", 0L);
        setLongField(term14425, term14425.getClass(), "approver", 0L);
        setField(term14425, term14425.getClass(), "licenceId", null);
        setLongField(term14425, term14425.getClass(), "expiryTimestamp", 0L);
        setField(term14425, term14425.getClass(), "plan", null);
        setBooleanField(term14425, term14425.getClass(), "isEvaluation", false);
        term14432 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term14432;
        callMethod(klass, "setTimestamp", argTypes, term14425, args);
    }

};



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

public class LicenceInfo_setDbKey_169441932037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14334;

    public LicenceInfo_setDbKey_169441932037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14334 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term14334, term14334.getClass(), "email", null);
        setField(term14334, term14334.getClass(), "name", null);
        setField(term14334, term14334.getClass(), "address", null);
        setField(term14334, term14334.getClass(), "phone", null);
        setField(term14334, term14334.getClass(), "country", null);
        setField(term14334, term14334.getClass(), "zipPostalCode", null);
        setField(term14334, term14334.getClass(), "deviceId", null);
        setField(term14334, term14334.getClass(), "activationKey", null);
        setField(term14334, term14334.getClass(), "activationHash", null);
        setField(term14334, term14334.getClass(), "dbKey", null);
        setField(term14334, term14334.getClass(), "passcode", null);
        setLongField(term14334, term14334.getClass(), "timestamp", 0L);
        setLongField(term14334, term14334.getClass(), "activationTimestamp", 0L);
        setLongField(term14334, term14334.getClass(), "approver", 0L);
        setField(term14334, term14334.getClass(), "licenceId", null);
        setLongField(term14334, term14334.getClass(), "expiryTimestamp", 0L);
        setField(term14334, term14334.getClass(), "plan", null);
        setBooleanField(term14334, term14334.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDbKey", argTypes, term14334, args);
    }

};



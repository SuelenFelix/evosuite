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

public class LicenceInfo_setZipPostalCode_201144707263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14518;

    public LicenceInfo_setZipPostalCode_201144707263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14518 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term14518, term14518.getClass(), "email", null);
        setField(term14518, term14518.getClass(), "name", null);
        setField(term14518, term14518.getClass(), "address", null);
        setField(term14518, term14518.getClass(), "phone", null);
        setField(term14518, term14518.getClass(), "country", null);
        setField(term14518, term14518.getClass(), "zipPostalCode", null);
        setField(term14518, term14518.getClass(), "deviceId", null);
        setField(term14518, term14518.getClass(), "activationKey", null);
        setField(term14518, term14518.getClass(), "activationHash", null);
        setField(term14518, term14518.getClass(), "dbKey", null);
        setField(term14518, term14518.getClass(), "passcode", null);
        setLongField(term14518, term14518.getClass(), "timestamp", 0L);
        setLongField(term14518, term14518.getClass(), "activationTimestamp", 0L);
        setLongField(term14518, term14518.getClass(), "approver", 0L);
        setField(term14518, term14518.getClass(), "licenceId", null);
        setLongField(term14518, term14518.getClass(), "expiryTimestamp", 0L);
        setField(term14518, term14518.getClass(), "plan", null);
        setBooleanField(term14518, term14518.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setZipPostalCode", argTypes, term14518, args);
    }

};



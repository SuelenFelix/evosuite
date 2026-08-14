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

public class LicenceInfo_setZipPostalCode_201144707228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11426;

    public LicenceInfo_setZipPostalCode_201144707228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11426 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term11426, term11426.getClass(), "email", "BjZQdecXvB");
        setField(term11426, term11426.getClass(), "name", "iUkOOQhEkw");
        setField(term11426, term11426.getClass(), "address", "wmVoFoUVmU");
        setField(term11426, term11426.getClass(), "phone", "lLiSiPCciB");
        setField(term11426, term11426.getClass(), "country", "PsMKIIEwdR");
        setField(term11426, term11426.getClass(), "zipPostalCode", "RbQmXqfXAT");
        setField(term11426, term11426.getClass(), "deviceId", "fcCAsvfBbe");
        setField(term11426, term11426.getClass(), "activationKey", "SrWMUlbtWV");
        setField(term11426, term11426.getClass(), "activationHash", "VePIumgrrU");
        setField(term11426, term11426.getClass(), "dbKey", "DPwIqlszZo");
        setField(term11426, term11426.getClass(), "passcode", "lnvLKbtveE");
        setLongField(term11426, term11426.getClass(), "timestamp", 1786470042933L);
        setLongField(term11426, term11426.getClass(), "activationTimestamp", 1597484336218508869L);
        setLongField(term11426, term11426.getClass(), "approver", -685023850445639859L);
        setField(term11426, term11426.getClass(), "licenceId", "pDqgDbJoFw");
        setLongField(term11426, term11426.getClass(), "expiryTimestamp", -6950146046121430355L);
        setField(term11426, term11426.getClass(), "plan", "mUNcKUxghj");
        setBooleanField(term11426, term11426.getClass(), "isEvaluation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FfrrEhTHzQ";
        callMethod(klass, "setZipPostalCode", argTypes, term11426, args);
    }

};



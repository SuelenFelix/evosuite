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

public class LicenceInfo_setActivationKey_821977766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2448;

    public LicenceInfo_setActivationKey_821977766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2448 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term2448, term2448.getClass(), "email", "mvrkADEgpp");
        setField(term2448, term2448.getClass(), "name", "pXOkjyeIRb");
        setField(term2448, term2448.getClass(), "address", "GgZWSjxjyE");
        setField(term2448, term2448.getClass(), "phone", "EeBVbzjcCI");
        setField(term2448, term2448.getClass(), "country", "UfQtPRyWRC");
        setField(term2448, term2448.getClass(), "zipPostalCode", "FPvxVzzSvD");
        setField(term2448, term2448.getClass(), "deviceId", "WHcwFgsGFC");
        setField(term2448, term2448.getClass(), "activationKey", "wfaXBpWAUH");
        setField(term2448, term2448.getClass(), "activationHash", "VMeAzAHwZj");
        setField(term2448, term2448.getClass(), "dbKey", "PznxWXsZME");
        setField(term2448, term2448.getClass(), "passcode", "jwsfVjMoJT");
        setLongField(term2448, term2448.getClass(), "timestamp", 1786470041686L);
        setLongField(term2448, term2448.getClass(), "activationTimestamp", -2585684163342970173L);
        setLongField(term2448, term2448.getClass(), "approver", 8059786003080744426L);
        setField(term2448, term2448.getClass(), "licenceId", "LWyEaeIyAo");
        setLongField(term2448, term2448.getClass(), "expiryTimestamp", -4365849114644724155L);
        setField(term2448, term2448.getClass(), "plan", "HzqpegHiRq");
        setBooleanField(term2448, term2448.getClass(), "isEvaluation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZfdXfCCFDf";
        callMethod(klass, "setActivationKey", argTypes, term2448, args);
    }

};



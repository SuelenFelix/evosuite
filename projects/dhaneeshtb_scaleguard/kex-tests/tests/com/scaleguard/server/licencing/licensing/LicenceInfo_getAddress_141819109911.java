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

public class LicenceInfo_getAddress_141819109911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4497;

    public LicenceInfo_getAddress_141819109911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4497 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term4497, term4497.getClass(), "email", "WZzvmIHhzZ");
        setField(term4497, term4497.getClass(), "name", "doQLHkjpNm");
        setField(term4497, term4497.getClass(), "address", "lCyLIcSuom");
        setField(term4497, term4497.getClass(), "phone", "CGOpQSZZwI");
        setField(term4497, term4497.getClass(), "country", "ypEdrstygY");
        setField(term4497, term4497.getClass(), "zipPostalCode", "sNQFlATEeQ");
        setField(term4497, term4497.getClass(), "deviceId", "ZKMLioamsY");
        setField(term4497, term4497.getClass(), "activationKey", "vOuMEpOQAg");
        setField(term4497, term4497.getClass(), "activationHash", "SIODFGaQhr");
        setField(term4497, term4497.getClass(), "dbKey", "qYzsiuXOgS");
        setField(term4497, term4497.getClass(), "passcode", "pvDEABOxLt");
        setLongField(term4497, term4497.getClass(), "timestamp", 1786470041941L);
        setLongField(term4497, term4497.getClass(), "activationTimestamp", -2068172595987555756L);
        setLongField(term4497, term4497.getClass(), "approver", -6292278961887936280L);
        setField(term4497, term4497.getClass(), "licenceId", "CKWpJaaaxX");
        setLongField(term4497, term4497.getClass(), "expiryTimestamp", -6645965768855543712L);
        setField(term4497, term4497.getClass(), "plan", "WVbxuoDBcn");
        setBooleanField(term4497, term4497.getClass(), "isEvaluation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddress", argTypes, term4497, args);
    }

};



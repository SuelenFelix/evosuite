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

public class LicenceInfo_setAddress_60671007525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10157;

    public LicenceInfo_setAddress_60671007525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10157 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term10157, term10157.getClass(), "email", "ONcbPCQnHd");
        setField(term10157, term10157.getClass(), "name", "AobDaplFLl");
        setField(term10157, term10157.getClass(), "address", "pDkMNnAGgv");
        setField(term10157, term10157.getClass(), "phone", "PaCpFXGzdX");
        setField(term10157, term10157.getClass(), "country", "FftYCNbnks");
        setField(term10157, term10157.getClass(), "zipPostalCode", "lJoltmsadS");
        setField(term10157, term10157.getClass(), "deviceId", "mvfDtZNEHr");
        setField(term10157, term10157.getClass(), "activationKey", "fhZgTouhCC");
        setField(term10157, term10157.getClass(), "activationHash", "wrikqJwXvL");
        setField(term10157, term10157.getClass(), "dbKey", "UiWhvbypdr");
        setField(term10157, term10157.getClass(), "passcode", "XMHwbfiHRl");
        setLongField(term10157, term10157.getClass(), "timestamp", 1786470042759L);
        setLongField(term10157, term10157.getClass(), "activationTimestamp", 1672578078364590450L);
        setLongField(term10157, term10157.getClass(), "approver", 4949335493504695457L);
        setField(term10157, term10157.getClass(), "licenceId", "ZrchvNGMtd");
        setLongField(term10157, term10157.getClass(), "expiryTimestamp", -5216789073301458893L);
        setField(term10157, term10157.getClass(), "plan", "bvSgmFUDOU");
        setBooleanField(term10157, term10157.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bucTnYicnp";
        callMethod(klass, "setAddress", argTypes, term10157, args);
    }

};



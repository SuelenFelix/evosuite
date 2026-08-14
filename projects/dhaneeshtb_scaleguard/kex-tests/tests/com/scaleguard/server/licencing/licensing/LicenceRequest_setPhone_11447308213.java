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

public class LicenceRequest_setPhone_11447308213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17831;

    public LicenceRequest_setPhone_11447308213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17831 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest"));
        setField(term17831, term17831.getClass(), "email", "WQnMpDlSfA");
        setField(term17831, term17831.getClass(), "name", "aOIvTQtXiv");
        setField(term17831, term17831.getClass(), "address", "IyjDiknqhA");
        setField(term17831, term17831.getClass(), "phone", "IHsXSAFYKi");
        setField(term17831, term17831.getClass(), "country", "KyGbLglqbW");
        setField(term17831, term17831.getClass(), "zipPostalCode", "ZKVeStsSNT");
        setField(term17831, term17831.getClass(), "deviceId", "cqCXYaAnFB");
        setField(term17831, term17831.getClass(), "plan", "UPLNFZHXjw");
        setBooleanField(term17831, term17831.getClass(), "isEvaluation", false);
        setLongField(term17831, term17831.getClass(), "timestamp", 1786470046849L);
        setField(term17831, term17831.getClass(), "passcode", "CwrrJlrGmg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HejzvyejjG";
        callMethod(klass, "setPhone", argTypes, term17831, args);
    }

};



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

public class LicenceInfo_setCountry_108481852527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11003;

    public LicenceInfo_setCountry_108481852527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11003 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term11003, term11003.getClass(), "email", "IkfarsYNJO");
        setField(term11003, term11003.getClass(), "name", "aZKOWhHMEh");
        setField(term11003, term11003.getClass(), "address", "YfkhviKZwl");
        setField(term11003, term11003.getClass(), "phone", "DcOhhAfJTI");
        setField(term11003, term11003.getClass(), "country", "gYTIkBFOoS");
        setField(term11003, term11003.getClass(), "zipPostalCode", "xmzSoVgiED");
        setField(term11003, term11003.getClass(), "deviceId", "pdSvedKgPq");
        setField(term11003, term11003.getClass(), "activationKey", "JdOMfNWgLP");
        setField(term11003, term11003.getClass(), "activationHash", "uWqXrwAsDU");
        setField(term11003, term11003.getClass(), "dbKey", "hgFbWAUtsu");
        setField(term11003, term11003.getClass(), "passcode", "UBPHmOICBs");
        setLongField(term11003, term11003.getClass(), "timestamp", 1786470042874L);
        setLongField(term11003, term11003.getClass(), "activationTimestamp", 2354625302846375590L);
        setLongField(term11003, term11003.getClass(), "approver", 7276637106827860087L);
        setField(term11003, term11003.getClass(), "licenceId", "CwNELDTAPP");
        setLongField(term11003, term11003.getClass(), "expiryTimestamp", -3936701866695933852L);
        setField(term11003, term11003.getClass(), "plan", "epPTwvcoyb");
        setBooleanField(term11003, term11003.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IDJUVPgUJf";
        callMethod(klass, "setCountry", argTypes, term11003, args);
    }

};



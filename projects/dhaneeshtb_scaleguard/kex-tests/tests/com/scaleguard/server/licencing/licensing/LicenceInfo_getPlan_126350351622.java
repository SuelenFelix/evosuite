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

public class LicenceInfo_getPlan_126350351622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8910;

    public LicenceInfo_getPlan_126350351622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8910 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term8910, term8910.getClass(), "email", "GeddnXjHGy");
        setField(term8910, term8910.getClass(), "name", "vLTbaoAxBm");
        setField(term8910, term8910.getClass(), "address", "BXTjEyEZxD");
        setField(term8910, term8910.getClass(), "phone", "oKhVzOKUFW");
        setField(term8910, term8910.getClass(), "country", "mNHyqmOAFy");
        setField(term8910, term8910.getClass(), "zipPostalCode", "UxgSdhxPCH");
        setField(term8910, term8910.getClass(), "deviceId", "DAujxZPHJC");
        setField(term8910, term8910.getClass(), "activationKey", "BYrGukTyof");
        setField(term8910, term8910.getClass(), "activationHash", "jiCGTTzKGB");
        setField(term8910, term8910.getClass(), "dbKey", "MqICFYzDJj");
        setField(term8910, term8910.getClass(), "passcode", "OirVUQhauU");
        setLongField(term8910, term8910.getClass(), "timestamp", 1786470042588L);
        setLongField(term8910, term8910.getClass(), "activationTimestamp", 4474998035090263139L);
        setLongField(term8910, term8910.getClass(), "approver", 2848819812340321742L);
        setField(term8910, term8910.getClass(), "licenceId", "FiYYLuailz");
        setLongField(term8910, term8910.getClass(), "expiryTimestamp", -8876856890348836498L);
        setField(term8910, term8910.getClass(), "plan", "IlBhdrCvHq");
        setBooleanField(term8910, term8910.getClass(), "isEvaluation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlan", argTypes, term8910, args);
    }

};



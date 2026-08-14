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

public class LicenceInfo_setPasscode_6116289198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3272;

    public LicenceInfo_setPasscode_6116289198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3272 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term3272, term3272.getClass(), "email", "iljANwuEjk");
        setField(term3272, term3272.getClass(), "name", "kNqaJKIATy");
        setField(term3272, term3272.getClass(), "address", "vKQukfbJUd");
        setField(term3272, term3272.getClass(), "phone", "lFRJFUMVbx");
        setField(term3272, term3272.getClass(), "country", "sZdUNdggUW");
        setField(term3272, term3272.getClass(), "zipPostalCode", "OqbwYQfvAe");
        setField(term3272, term3272.getClass(), "deviceId", "tRxZafjqIx");
        setField(term3272, term3272.getClass(), "activationKey", "VGizxZnyHX");
        setField(term3272, term3272.getClass(), "activationHash", "kVEZMHmRtR");
        setField(term3272, term3272.getClass(), "dbKey", "ekxGuOYIwi");
        setField(term3272, term3272.getClass(), "passcode", "PgPzMSEjjX");
        setLongField(term3272, term3272.getClass(), "timestamp", 1786470041788L);
        setLongField(term3272, term3272.getClass(), "activationTimestamp", 2120084523938730454L);
        setLongField(term3272, term3272.getClass(), "approver", 6855071767938501807L);
        setField(term3272, term3272.getClass(), "licenceId", "YpJbIgJWWv");
        setLongField(term3272, term3272.getClass(), "expiryTimestamp", -5892135042702373494L);
        setField(term3272, term3272.getClass(), "plan", "DhjNLmRMCu");
        setBooleanField(term3272, term3272.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wzsPSPcRdj";
        callMethod(klass, "setPasscode", argTypes, term3272, args);
    }

};



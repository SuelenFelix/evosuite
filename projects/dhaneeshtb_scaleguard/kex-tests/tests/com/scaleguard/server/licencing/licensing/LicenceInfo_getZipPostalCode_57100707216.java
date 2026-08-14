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

public class LicenceInfo_getZipPostalCode_57100707216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6504;

    public LicenceInfo_getZipPostalCode_57100707216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6504 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term6504, term6504.getClass(), "email", "BDIRCxAWLA");
        setField(term6504, term6504.getClass(), "name", "eOJfbiZLnb");
        setField(term6504, term6504.getClass(), "address", "nKZKnxWYCK");
        setField(term6504, term6504.getClass(), "phone", "JOqQxuzRuZ");
        setField(term6504, term6504.getClass(), "country", "RSaoipUlsg");
        setField(term6504, term6504.getClass(), "zipPostalCode", "cSHGbqKqlN");
        setField(term6504, term6504.getClass(), "deviceId", "pFAfANnxup");
        setField(term6504, term6504.getClass(), "activationKey", "GNEmuHPNcU");
        setField(term6504, term6504.getClass(), "activationHash", "IoSfuKDFRe");
        setField(term6504, term6504.getClass(), "dbKey", "AWYyZiNfsm");
        setField(term6504, term6504.getClass(), "passcode", "mhQDwIyrRi");
        setLongField(term6504, term6504.getClass(), "timestamp", 1786470042232L);
        setLongField(term6504, term6504.getClass(), "activationTimestamp", 2443640364875054177L);
        setLongField(term6504, term6504.getClass(), "approver", -1610676979013636850L);
        setField(term6504, term6504.getClass(), "licenceId", "llRfwANcVF");
        setLongField(term6504, term6504.getClass(), "expiryTimestamp", 2062173786000223358L);
        setField(term6504, term6504.getClass(), "plan", "FbSIUZyBXZ");
        setBooleanField(term6504, term6504.getClass(), "isEvaluation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZipPostalCode", argTypes, term6504, args);
    }

};



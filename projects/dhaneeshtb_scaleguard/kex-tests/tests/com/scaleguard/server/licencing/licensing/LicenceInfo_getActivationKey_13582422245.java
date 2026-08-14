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

public class LicenceInfo_getActivationKey_13582422245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2047;

    public LicenceInfo_getActivationKey_13582422245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2047 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term2047, term2047.getClass(), "email", "dpNsDgfPso");
        setField(term2047, term2047.getClass(), "name", "hCWPJQKpdc");
        setField(term2047, term2047.getClass(), "address", "WzMEhMXkKx");
        setField(term2047, term2047.getClass(), "phone", "XOiDvlDhdc");
        setField(term2047, term2047.getClass(), "country", "AdxvLJhNLe");
        setField(term2047, term2047.getClass(), "zipPostalCode", "lHfTrWKMPk");
        setField(term2047, term2047.getClass(), "deviceId", "JDaAnsVTGV");
        setField(term2047, term2047.getClass(), "activationKey", "yGtHPyvYiQ");
        setField(term2047, term2047.getClass(), "activationHash", "MvRIxilFMJ");
        setField(term2047, term2047.getClass(), "dbKey", "iNwOJRBEjp");
        setField(term2047, term2047.getClass(), "passcode", "xIeFjkHkOe");
        setLongField(term2047, term2047.getClass(), "timestamp", 1786470041636L);
        setLongField(term2047, term2047.getClass(), "activationTimestamp", 5127676408959197577L);
        setLongField(term2047, term2047.getClass(), "approver", -6573104506744284592L);
        setField(term2047, term2047.getClass(), "licenceId", "pORebkoRdD");
        setLongField(term2047, term2047.getClass(), "expiryTimestamp", -4920224193275732920L);
        setField(term2047, term2047.getClass(), "plan", "mLUZFTfjle");
        setBooleanField(term2047, term2047.getClass(), "isEvaluation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActivationKey", argTypes, term2047, args);
    }

};



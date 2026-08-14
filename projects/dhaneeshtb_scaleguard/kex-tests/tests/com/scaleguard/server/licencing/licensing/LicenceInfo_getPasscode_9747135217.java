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

public class LicenceInfo_getPasscode_9747135217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2871;

    public LicenceInfo_getPasscode_9747135217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2871 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term2871, term2871.getClass(), "email", "PapWxkhEWe");
        setField(term2871, term2871.getClass(), "name", "smnHEqRFRx");
        setField(term2871, term2871.getClass(), "address", "XYtryyobou");
        setField(term2871, term2871.getClass(), "phone", "OYbzXylRWW");
        setField(term2871, term2871.getClass(), "country", "DSNsTGYXDF");
        setField(term2871, term2871.getClass(), "zipPostalCode", "sQvGcVjdEx");
        setField(term2871, term2871.getClass(), "deviceId", "rLHAoqXgPh");
        setField(term2871, term2871.getClass(), "activationKey", "hMmaoREuCK");
        setField(term2871, term2871.getClass(), "activationHash", "VeDtgDzGAN");
        setField(term2871, term2871.getClass(), "dbKey", "aWYOWZFyaX");
        setField(term2871, term2871.getClass(), "passcode", "vwbEQQNQrx");
        setLongField(term2871, term2871.getClass(), "timestamp", 1786470041741L);
        setLongField(term2871, term2871.getClass(), "activationTimestamp", 7009926388951271268L);
        setLongField(term2871, term2871.getClass(), "approver", -7672528020740371001L);
        setField(term2871, term2871.getClass(), "licenceId", "DbiCVtPPCT");
        setLongField(term2871, term2871.getClass(), "expiryTimestamp", -4502405999831680926L);
        setField(term2871, term2871.getClass(), "plan", "zUlRdimJtU");
        setBooleanField(term2871, term2871.getClass(), "isEvaluation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPasscode", argTypes, term2871, args);
    }

};



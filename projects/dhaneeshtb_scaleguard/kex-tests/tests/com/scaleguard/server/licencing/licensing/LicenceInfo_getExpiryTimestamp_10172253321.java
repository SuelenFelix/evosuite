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

public class LicenceInfo_getExpiryTimestamp_10172253321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8509;

    public LicenceInfo_getExpiryTimestamp_10172253321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8509 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term8509, term8509.getClass(), "email", "fVdTcjgHdw");
        setField(term8509, term8509.getClass(), "name", "wwAwLLcLPp");
        setField(term8509, term8509.getClass(), "address", "nHpMKOmlpQ");
        setField(term8509, term8509.getClass(), "phone", "fKhrQsJToZ");
        setField(term8509, term8509.getClass(), "country", "wsysQLGFnl");
        setField(term8509, term8509.getClass(), "zipPostalCode", "ckQLZGFjMX");
        setField(term8509, term8509.getClass(), "deviceId", "qphdrqUtNx");
        setField(term8509, term8509.getClass(), "activationKey", "VSaNnhMpRc");
        setField(term8509, term8509.getClass(), "activationHash", "QNjNTLlUaV");
        setField(term8509, term8509.getClass(), "dbKey", "hIYsRyOZxk");
        setField(term8509, term8509.getClass(), "passcode", "JWodNQzjjV");
        setLongField(term8509, term8509.getClass(), "timestamp", 1786470042529L);
        setLongField(term8509, term8509.getClass(), "activationTimestamp", -1983291584002806658L);
        setLongField(term8509, term8509.getClass(), "approver", 5946780097489996391L);
        setField(term8509, term8509.getClass(), "licenceId", "RTTvrwwhou");
        setLongField(term8509, term8509.getClass(), "expiryTimestamp", -8652538484981166496L);
        setField(term8509, term8509.getClass(), "plan", "bwlLFAfNWx");
        setBooleanField(term8509, term8509.getClass(), "isEvaluation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExpiryTimestamp", argTypes, term8509, args);
    }

};



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

public class LicenceInfo_getCountry_189629954913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5299;

    public LicenceInfo_getCountry_189629954913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5299 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term5299, term5299.getClass(), "email", "yUGCjlqgJE");
        setField(term5299, term5299.getClass(), "name", "PXdVZyoJyC");
        setField(term5299, term5299.getClass(), "address", "vLerpqavFM");
        setField(term5299, term5299.getClass(), "phone", "qnvxzwuGKX");
        setField(term5299, term5299.getClass(), "country", "EdPAvpluZg");
        setField(term5299, term5299.getClass(), "zipPostalCode", "DzHVBMqWtE");
        setField(term5299, term5299.getClass(), "deviceId", "THZSpzBRYP");
        setField(term5299, term5299.getClass(), "activationKey", "EKjQdtKxAM");
        setField(term5299, term5299.getClass(), "activationHash", "TXZAIPQJHt");
        setField(term5299, term5299.getClass(), "dbKey", "DIbeDHICho");
        setField(term5299, term5299.getClass(), "passcode", "QSrDQfEsTR");
        setLongField(term5299, term5299.getClass(), "timestamp", 1786470042040L);
        setLongField(term5299, term5299.getClass(), "activationTimestamp", -3842548265506930260L);
        setLongField(term5299, term5299.getClass(), "approver", -5788180182343976541L);
        setField(term5299, term5299.getClass(), "licenceId", "DPskuFUobI");
        setLongField(term5299, term5299.getClass(), "expiryTimestamp", 2936323121573284007L);
        setField(term5299, term5299.getClass(), "plan", "ZfBIVGBQOE");
        setBooleanField(term5299, term5299.getClass(), "isEvaluation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountry", argTypes, term5299, args);
    }

};



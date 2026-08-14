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

public class LicenceInfo_getActivationHash_3516082013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1223;

    public LicenceInfo_getActivationHash_3516082013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1223 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term1223, term1223.getClass(), "email", "MAcUBcBckh");
        setField(term1223, term1223.getClass(), "name", "oVgzLbrsFr");
        setField(term1223, term1223.getClass(), "address", "vQVyKLdtaz");
        setField(term1223, term1223.getClass(), "phone", "OWKQODBLzb");
        setField(term1223, term1223.getClass(), "country", "wGmYcqUkgE");
        setField(term1223, term1223.getClass(), "zipPostalCode", "idgaQsnJpQ");
        setField(term1223, term1223.getClass(), "deviceId", "VgZnGoIFwQ");
        setField(term1223, term1223.getClass(), "activationKey", "bLPjGVBhlX");
        setField(term1223, term1223.getClass(), "activationHash", "whBvTVIIlC");
        setField(term1223, term1223.getClass(), "dbKey", "IgRJUzaCwW");
        setField(term1223, term1223.getClass(), "passcode", "bWWfajKbEX");
        setLongField(term1223, term1223.getClass(), "timestamp", 1786470041538L);
        setLongField(term1223, term1223.getClass(), "activationTimestamp", 6967924379644551255L);
        setLongField(term1223, term1223.getClass(), "approver", -2813493605142626659L);
        setField(term1223, term1223.getClass(), "licenceId", "KoyGrUJeJW");
        setLongField(term1223, term1223.getClass(), "expiryTimestamp", -8885298608300233488L);
        setField(term1223, term1223.getClass(), "plan", "jUbSRrkrYZ");
        setBooleanField(term1223, term1223.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActivationHash", argTypes, term1223, args);
    }

};



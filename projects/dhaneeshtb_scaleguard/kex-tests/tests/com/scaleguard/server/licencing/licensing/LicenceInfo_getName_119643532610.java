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

public class LicenceInfo_getName_119643532610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4096;

    public LicenceInfo_getName_119643532610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4096 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term4096, term4096.getClass(), "email", "HBGNxdNURv");
        setField(term4096, term4096.getClass(), "name", "mfCpTPPQQm");
        setField(term4096, term4096.getClass(), "address", "OcJCIDNIXA");
        setField(term4096, term4096.getClass(), "phone", "XfRABIFVEp");
        setField(term4096, term4096.getClass(), "country", "MHGKyEnwKc");
        setField(term4096, term4096.getClass(), "zipPostalCode", "ShIELyuULw");
        setField(term4096, term4096.getClass(), "deviceId", "IpQuOGMgmj");
        setField(term4096, term4096.getClass(), "activationKey", "AHbZyFOmlo");
        setField(term4096, term4096.getClass(), "activationHash", "TwfWVQGiIj");
        setField(term4096, term4096.getClass(), "dbKey", "gUvcueTURF");
        setField(term4096, term4096.getClass(), "passcode", "iIRsCSYqXH");
        setLongField(term4096, term4096.getClass(), "timestamp", 1786470041890L);
        setLongField(term4096, term4096.getClass(), "activationTimestamp", 1439298019805881866L);
        setLongField(term4096, term4096.getClass(), "approver", -8708192233349544946L);
        setField(term4096, term4096.getClass(), "licenceId", "aSkmSwTnEw");
        setLongField(term4096, term4096.getClass(), "expiryTimestamp", 5907001541142728739L);
        setField(term4096, term4096.getClass(), "plan", "pJbnHTYrxn");
        setBooleanField(term4096, term4096.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term4096, args);
    }

};



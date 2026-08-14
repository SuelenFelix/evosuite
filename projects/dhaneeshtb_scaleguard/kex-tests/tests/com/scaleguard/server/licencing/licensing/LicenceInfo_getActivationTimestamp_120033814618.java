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

public class LicenceInfo_getActivationTimestamp_120033814618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7306;

    public LicenceInfo_getActivationTimestamp_120033814618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7306 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term7306, term7306.getClass(), "email", "IENRuqmwUU");
        setField(term7306, term7306.getClass(), "name", "GsWxOwXvSu");
        setField(term7306, term7306.getClass(), "address", "bKBSncrMEZ");
        setField(term7306, term7306.getClass(), "phone", "yeSXGqQExb");
        setField(term7306, term7306.getClass(), "country", "uXYcXVYJZM");
        setField(term7306, term7306.getClass(), "zipPostalCode", "BJhjdJUhkz");
        setField(term7306, term7306.getClass(), "deviceId", "cdHYQDgUZR");
        setField(term7306, term7306.getClass(), "activationKey", "orEuhCStGM");
        setField(term7306, term7306.getClass(), "activationHash", "HhEaSXWvrY");
        setField(term7306, term7306.getClass(), "dbKey", "CVRGEomOth");
        setField(term7306, term7306.getClass(), "passcode", "UimMMORkzd");
        setLongField(term7306, term7306.getClass(), "timestamp", 1786470042344L);
        setLongField(term7306, term7306.getClass(), "activationTimestamp", -5248475803419977214L);
        setLongField(term7306, term7306.getClass(), "approver", -6723783499250797216L);
        setField(term7306, term7306.getClass(), "licenceId", "UkKvaeJfEC");
        setLongField(term7306, term7306.getClass(), "expiryTimestamp", 41775768178052008L);
        setField(term7306, term7306.getClass(), "plan", "KAORSSPSeV");
        setBooleanField(term7306, term7306.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActivationTimestamp", argTypes, term7306, args);
    }

};



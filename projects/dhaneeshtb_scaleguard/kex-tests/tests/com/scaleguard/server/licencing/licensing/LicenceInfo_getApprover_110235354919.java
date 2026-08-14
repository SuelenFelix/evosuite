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

public class LicenceInfo_getApprover_110235354919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7707;

    public LicenceInfo_getApprover_110235354919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7707 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term7707, term7707.getClass(), "email", "dwlZSxlXOo");
        setField(term7707, term7707.getClass(), "name", "lKrEAkypza");
        setField(term7707, term7707.getClass(), "address", "KtuuNAqGCQ");
        setField(term7707, term7707.getClass(), "phone", "OGQsfjmReM");
        setField(term7707, term7707.getClass(), "country", "YsUtbngnRO");
        setField(term7707, term7707.getClass(), "zipPostalCode", "JisaWUxcNb");
        setField(term7707, term7707.getClass(), "deviceId", "NxgmYPzWCI");
        setField(term7707, term7707.getClass(), "activationKey", "tJzmOfcUnY");
        setField(term7707, term7707.getClass(), "activationHash", "TKlccZUpjz");
        setField(term7707, term7707.getClass(), "dbKey", "GGzwMoHZXC");
        setField(term7707, term7707.getClass(), "passcode", "XjDhvToxJy");
        setLongField(term7707, term7707.getClass(), "timestamp", 1786470042410L);
        setLongField(term7707, term7707.getClass(), "activationTimestamp", 682356318767179819L);
        setLongField(term7707, term7707.getClass(), "approver", -7291743527973326814L);
        setField(term7707, term7707.getClass(), "licenceId", "tIpkeYIezR");
        setLongField(term7707, term7707.getClass(), "expiryTimestamp", -5963439350418910964L);
        setField(term7707, term7707.getClass(), "plan", "SqjyKmayBx");
        setBooleanField(term7707, term7707.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getApprover", argTypes, term7707, args);
    }

};



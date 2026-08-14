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
import java.lang.Long;

public class LicenceInfo_setExpiryTimestamp_50557265733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13501;
     Object term13772;

    public LicenceInfo_setExpiryTimestamp_50557265733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13501 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term13501, term13501.getClass(), "email", "JptuwlirlS");
        setField(term13501, term13501.getClass(), "name", "TKOMaGswbU");
        setField(term13501, term13501.getClass(), "address", "YcTbglHiUq");
        setField(term13501, term13501.getClass(), "phone", "TiUqHrjoEU");
        setField(term13501, term13501.getClass(), "country", "eoEvZbdLjL");
        setField(term13501, term13501.getClass(), "zipPostalCode", "BkIxsyPkGy");
        setField(term13501, term13501.getClass(), "deviceId", "mrMGwoRgVY");
        setField(term13501, term13501.getClass(), "activationKey", "xVFgeyYxZS");
        setField(term13501, term13501.getClass(), "activationHash", "iQiGTulJiH");
        setField(term13501, term13501.getClass(), "dbKey", "utCuuVCKqE");
        setField(term13501, term13501.getClass(), "passcode", "wCurppnDSA");
        setLongField(term13501, term13501.getClass(), "timestamp", 1786470043213L);
        setLongField(term13501, term13501.getClass(), "activationTimestamp", 7489064039921396098L);
        setLongField(term13501, term13501.getClass(), "approver", 6843866297465638866L);
        setField(term13501, term13501.getClass(), "licenceId", "QUymMnsCIj");
        setLongField(term13501, term13501.getClass(), "expiryTimestamp", -4023935540989049732L);
        setField(term13501, term13501.getClass(), "plan", "mxVLTgCwki");
        setBooleanField(term13501, term13501.getClass(), "isEvaluation", true);
        term13772 = new Long(855932984568615096L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term13772;
        callMethod(klass, "setExpiryTimestamp", argTypes, term13501, args);
    }

};



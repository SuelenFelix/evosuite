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

public class LicenceInfo_getEmail_479024299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3695;

    public LicenceInfo_getEmail_479024299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3695 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term3695, term3695.getClass(), "email", "hOncybyCAH");
        setField(term3695, term3695.getClass(), "name", "QduALnDSVo");
        setField(term3695, term3695.getClass(), "address", "izPpKDErnQ");
        setField(term3695, term3695.getClass(), "phone", "NnpwZBUTvx");
        setField(term3695, term3695.getClass(), "country", "tlQSNgTkQX");
        setField(term3695, term3695.getClass(), "zipPostalCode", "PCipZnmBOF");
        setField(term3695, term3695.getClass(), "deviceId", "zcorEihhLK");
        setField(term3695, term3695.getClass(), "activationKey", "BjugTaMcxJ");
        setField(term3695, term3695.getClass(), "activationHash", "vGiuZVPJNH");
        setField(term3695, term3695.getClass(), "dbKey", "tlzpzIjMib");
        setField(term3695, term3695.getClass(), "passcode", "CFyoseFGLF");
        setLongField(term3695, term3695.getClass(), "timestamp", 1786470041838L);
        setLongField(term3695, term3695.getClass(), "activationTimestamp", -6823727938421990489L);
        setLongField(term3695, term3695.getClass(), "approver", -484994522244390100L);
        setField(term3695, term3695.getClass(), "licenceId", "RMsXuyzKJV");
        setLongField(term3695, term3695.getClass(), "expiryTimestamp", 1233889271256172047L);
        setField(term3695, term3695.getClass(), "plan", "GrqozDKFOk");
        setBooleanField(term3695, term3695.getClass(), "isEvaluation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term3695, args);
    }

};



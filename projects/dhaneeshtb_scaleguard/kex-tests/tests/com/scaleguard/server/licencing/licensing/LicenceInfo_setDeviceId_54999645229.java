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

public class LicenceInfo_setDeviceId_54999645229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11849;

    public LicenceInfo_setDeviceId_54999645229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11849 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term11849, term11849.getClass(), "email", "IiNCZfdouL");
        setField(term11849, term11849.getClass(), "name", "AhOHzCsHKW");
        setField(term11849, term11849.getClass(), "address", "UqgLPaaAHi");
        setField(term11849, term11849.getClass(), "phone", "xypryEkUPF");
        setField(term11849, term11849.getClass(), "country", "zyZTzHNjQr");
        setField(term11849, term11849.getClass(), "zipPostalCode", "YSrFKQQwXE");
        setField(term11849, term11849.getClass(), "deviceId", "qxhOsmyyjm");
        setField(term11849, term11849.getClass(), "activationKey", "EBYHwsuWAU");
        setField(term11849, term11849.getClass(), "activationHash", "PtIjKpiSix");
        setField(term11849, term11849.getClass(), "dbKey", "NZdTuwSCIM");
        setField(term11849, term11849.getClass(), "passcode", "fRujHWvXjJ");
        setLongField(term11849, term11849.getClass(), "timestamp", 1786470042988L);
        setLongField(term11849, term11849.getClass(), "activationTimestamp", -6342139649364011743L);
        setLongField(term11849, term11849.getClass(), "approver", -4924950707540628022L);
        setField(term11849, term11849.getClass(), "licenceId", "HEaTkWYBgv");
        setLongField(term11849, term11849.getClass(), "expiryTimestamp", -4393710401270724527L);
        setField(term11849, term11849.getClass(), "plan", "DuKcNfVVYR");
        setBooleanField(term11849, term11849.getClass(), "isEvaluation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EAIAAStlTz";
        callMethod(klass, "setDeviceId", argTypes, term11849, args);
    }

};



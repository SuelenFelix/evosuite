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

public class LicenceInfo_setPlan_131158721234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13904;

    public LicenceInfo_setPlan_131158721234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13904 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term13904, term13904.getClass(), "email", "uOJFOUcNvv");
        setField(term13904, term13904.getClass(), "name", "tkmmGweDwJ");
        setField(term13904, term13904.getClass(), "address", "pMfTuAFXxg");
        setField(term13904, term13904.getClass(), "phone", "XCZmhkblRc");
        setField(term13904, term13904.getClass(), "country", "gFUWMydGCU");
        setField(term13904, term13904.getClass(), "zipPostalCode", "LLegSTfqJt");
        setField(term13904, term13904.getClass(), "deviceId", "XQfmqLbqHS");
        setField(term13904, term13904.getClass(), "activationKey", "qGkNzZAeDN");
        setField(term13904, term13904.getClass(), "activationHash", "wdtiuPgTVJ");
        setField(term13904, term13904.getClass(), "dbKey", "HUgzMgrpsK");
        setField(term13904, term13904.getClass(), "passcode", "JKGueoHesL");
        setLongField(term13904, term13904.getClass(), "timestamp", 1786470043274L);
        setLongField(term13904, term13904.getClass(), "activationTimestamp", 7495904023107549024L);
        setLongField(term13904, term13904.getClass(), "approver", 8802866251294305945L);
        setField(term13904, term13904.getClass(), "licenceId", "itAUCFhZhq");
        setLongField(term13904, term13904.getClass(), "expiryTimestamp", 4513004407927379358L);
        setField(term13904, term13904.getClass(), "plan", "jLVLqQSjqg");
        setBooleanField(term13904, term13904.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CRAUqtVBkU";
        callMethod(klass, "setPlan", argTypes, term13904, args);
    }

};



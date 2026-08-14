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

public class LicenceInfo_setDbKey_16944193202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term800;

    public LicenceInfo_setDbKey_16944193202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term800 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term800, term800.getClass(), "email", "UoYtihxVaS");
        setField(term800, term800.getClass(), "name", "JDswTTCZHV");
        setField(term800, term800.getClass(), "address", "onpbIeEKoi");
        setField(term800, term800.getClass(), "phone", "YRHGsAkhxb");
        setField(term800, term800.getClass(), "country", "ffYhPOzlUs");
        setField(term800, term800.getClass(), "zipPostalCode", "MLqYREekMl");
        setField(term800, term800.getClass(), "deviceId", "ytSBIKXogI");
        setField(term800, term800.getClass(), "activationKey", "tShwQLRGNe");
        setField(term800, term800.getClass(), "activationHash", "LvtrsXUliU");
        setField(term800, term800.getClass(), "dbKey", "xLbjWUgOIL");
        setField(term800, term800.getClass(), "passcode", "ieCtQFdkii");
        setLongField(term800, term800.getClass(), "timestamp", 1786470041483L);
        setLongField(term800, term800.getClass(), "activationTimestamp", 7411271909051562686L);
        setLongField(term800, term800.getClass(), "approver", 4872422362414183754L);
        setField(term800, term800.getClass(), "licenceId", "nGKItKLYNC");
        setLongField(term800, term800.getClass(), "expiryTimestamp", 6811161968424632369L);
        setField(term800, term800.getClass(), "plan", "nHXjMycHlU");
        setBooleanField(term800, term800.getClass(), "isEvaluation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dEnhdmILtU";
        callMethod(klass, "setDbKey", argTypes, term800, args);
    }

};



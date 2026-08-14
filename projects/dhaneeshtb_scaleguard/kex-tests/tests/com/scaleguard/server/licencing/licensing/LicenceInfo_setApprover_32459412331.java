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

public class LicenceInfo_setApprover_32459412331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12675;
     Object term12946;

    public LicenceInfo_setApprover_32459412331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12675 = newInstance(Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo"));
        setField(term12675, term12675.getClass(), "email", "VfmNFpEuax");
        setField(term12675, term12675.getClass(), "name", "ANHjlWPmZG");
        setField(term12675, term12675.getClass(), "address", "SibzENsyyy");
        setField(term12675, term12675.getClass(), "phone", "mrqGHotaef");
        setField(term12675, term12675.getClass(), "country", "UbZGBpQZQW");
        setField(term12675, term12675.getClass(), "zipPostalCode", "SvGTualQPa");
        setField(term12675, term12675.getClass(), "deviceId", "mdxcgZwsaP");
        setField(term12675, term12675.getClass(), "activationKey", "pxokrVaeMd");
        setField(term12675, term12675.getClass(), "activationHash", "ujxmmZZcbT");
        setField(term12675, term12675.getClass(), "dbKey", "BOvgwHfoHQ");
        setField(term12675, term12675.getClass(), "passcode", "lEcrFlxJXH");
        setLongField(term12675, term12675.getClass(), "timestamp", 1786470043099L);
        setLongField(term12675, term12675.getClass(), "activationTimestamp", 1084801489398441516L);
        setLongField(term12675, term12675.getClass(), "approver", 6273754186658578034L);
        setField(term12675, term12675.getClass(), "licenceId", "DNOtiLPAIY");
        setLongField(term12675, term12675.getClass(), "expiryTimestamp", 3620247240684476031L);
        setField(term12675, term12675.getClass(), "plan", "XildIRoZHG");
        setBooleanField(term12675, term12675.getClass(), "isEvaluation", true);
        term12946 = new Long(8313800941204938919L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.licencing.licensing.LicenceInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term12946;
        callMethod(klass, "setApprover", argTypes, term12675, args);
    }

};



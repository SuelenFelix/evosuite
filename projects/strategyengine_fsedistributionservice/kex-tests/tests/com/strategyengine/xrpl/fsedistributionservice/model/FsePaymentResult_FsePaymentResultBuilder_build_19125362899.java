package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class FsePaymentResult_FsePaymentResultBuilder_build_19125362899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16929;

    public FsePaymentResult_FsePaymentResultBuilder_build_19125362899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16930 = new Long(5262507301787091109L);
        Class<? extends Object> term17045 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term17044 = ((Class) term17045).getDeclaredField((String) "FAILED");
        ((Field) term17044).setAccessible(true);
        Object enum29 = ((Field) term17044).get((Object) null);
        term16929 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder"));
        setField(term16929, term16929.getClass(), "id", term16930);
        setField(term16929, term16929.getClass(), "responseCode", "PXdVZyoJyC");
        setField(term16929, term16929.getClass(), "reason", "vLerpqavFM");
        setField(term16929, term16929.getClass(), "classicAddress", "qnvxzwuGKX");
        setField(term16929, term16929.getClass(), "status", enum29);
        setField(term16929, term16929.getClass(), "paymentAmount", "EdPAvpluZg");
        setField(term16929, term16929.getClass(), "snapshotBalance", "DzHVBMqWtE");
        setField(term16929, term16929.getClass(), "nftOwned", "THZSpzBRYP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term16929, args);
    }

};



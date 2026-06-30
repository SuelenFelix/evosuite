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

public class FsePaymentResult_FsePaymentResultBuilder_status_11032109285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14161;
     Object enum25;

    public FsePaymentResult_FsePaymentResultBuilder_status_11032109285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14162 = new Long(1967728129628047933L);
        Class<? extends Object> term14289 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term14288 = ((Class) term14289).getDeclaredField((String) "FAILED");
        ((Field) term14288).setAccessible(true);
        Object enum24 = ((Field) term14288).get((Object) null);
        term14161 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder"));
        setField(term14161, term14161.getClass(), "id", term14162);
        setField(term14161, term14161.getClass(), "responseCode", "GBOEuByOfr");
        setField(term14161, term14161.getClass(), "reason", "NHbOFFjyVK");
        setField(term14161, term14161.getClass(), "classicAddress", "zaloBqlrSo");
        setField(term14161, term14161.getClass(), "status", enum24);
        setField(term14161, term14161.getClass(), "paymentAmount", "vvoLrMGCoN");
        setField(term14161, term14161.getClass(), "snapshotBalance", "pXdglvyrQe");
        setField(term14161, term14161.getClass(), "nftOwned", "OcfNzHYdki");
        Class<? extends Object> term14739 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term14738 = ((Class) term14739).getDeclaredField((String) "VERIFIED");
        ((Field) term14738).setAccessible(true);
        enum25 = ((Field) term14738).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Object[] args = new Object[1];
        args[0] = enum25;
        callMethod(klass, "status", argTypes, term14161, args);
    }

};



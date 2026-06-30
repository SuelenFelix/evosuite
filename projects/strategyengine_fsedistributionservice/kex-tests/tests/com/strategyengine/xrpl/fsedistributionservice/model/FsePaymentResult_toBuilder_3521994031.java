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

public class FsePaymentResult_toBuilder_3521994031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313557;

    public FsePaymentResult_toBuilder_3521994031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term313558 = new Long(6371581018571997173L);
        Class<? extends Object> term313675 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term313674 = ((Class) term313675).getDeclaredField((String) "VERIFIED");
        ((Field) term313674).setAccessible(true);
        Object enum635 = ((Field) term313674).get((Object) null);
        term313557 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term313557, term313557.getClass(), "id", term313558);
        setField(term313557, term313557.getClass(), "responseCode", "eADknKlQVd");
        setField(term313557, term313557.getClass(), "reason", "hfwLnDHizJ");
        setField(term313557, term313557.getClass(), "classicAddress", "eZGPUdohTF");
        setField(term313557, term313557.getClass(), "status", enum635);
        setField(term313557, term313557.getClass(), "paymentAmount", "NyINyLwoLC");
        setField(term313557, term313557.getClass(), "snapshotBalance", "VdHJiosxsv");
        setField(term313557, term313557.getClass(), "nftOwned", "wOuPdBQeOx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term313557, args);
    }

};



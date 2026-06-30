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

public class FsePaymentResult_setReason_144947584418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322646;

    public FsePaymentResult_setReason_144947584418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term322647 = new Long(-3988042285731673145L);
        Class<? extends Object> term322776 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term322775 = ((Class) term322776).getDeclaredField((String) "VERIFIED");
        ((Field) term322775).setAccessible(true);
        Object enum651 = ((Field) term322775).get((Object) null);
        term322646 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term322646, term322646.getClass(), "id", term322647);
        setField(term322646, term322646.getClass(), "responseCode", "xlERWkGbKr");
        setField(term322646, term322646.getClass(), "reason", "QvJNEroCUL");
        setField(term322646, term322646.getClass(), "classicAddress", "CpfLVqPiil");
        setField(term322646, term322646.getClass(), "status", enum651);
        setField(term322646, term322646.getClass(), "paymentAmount", "LmFOclAgbf");
        setField(term322646, term322646.getClass(), "snapshotBalance", "nYfzbXugsB");
        setField(term322646, term322646.getClass(), "nftOwned", "qRQNawdehr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SQzxKDMlfO";
        callMethod(klass, "setReason", argTypes, term322646, args);
    }

};



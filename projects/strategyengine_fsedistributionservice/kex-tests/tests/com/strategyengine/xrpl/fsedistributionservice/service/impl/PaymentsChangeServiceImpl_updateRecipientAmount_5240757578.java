package com.strategyengine.xrpl.fsedistributionservice.service.impl;

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
import static com.strategyengine.xrpl.fsedistributionservice.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.util.ArrayList;

public class PaymentsChangeServiceImpl_updateRecipientAmount_5240757578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6272;
     Object term6365;

    public PaymentsChangeServiceImpl_updateRecipientAmount_5240757578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6273 = new Long(-6823727938421990489L);
        Class<? extends Object> term6413 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term6412 = ((Class) term6413).getDeclaredField((String) "FAILED");
        ((Field) term6412).setAccessible(true);
        Object enum10 = ((Field) term6412).get((Object) null);
        Integer term6325 = new Integer(-1955890973);
        Long term6327 = new Long(-484994522244390100L);
        term6272 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term6287 = newInstance(Class.forName("java.util.Date"));
        Object term6289 = newInstance(Class.forName("java.util.Date"));
        setField(term6272, term6272.getClass(), "id", term6273);
        setField(term6272, term6272.getClass(), "address", "SJiQaLvSKv");
        setLongField(term6287, term6287.getClass(), "fastTime", 1882638884364L);
        setField(term6287, term6287.getClass(), "cdate", null);
        setField(term6272, term6272.getClass(), "createDate", term6287);
        setLongField(term6289, term6289.getClass(), "fastTime", 1437757323580L);
        setField(term6289, term6289.getClass(), "cdate", null);
        setField(term6272, term6272.getClass(), "updateDate", term6289);
        setField(term6272, term6272.getClass(), "status", enum10);
        setField(term6272, term6272.getClass(), "failReason", "OEXDRUKcFl");
        setField(term6272, term6272.getClass(), "code", "RYdKCNNMBR");
        setField(term6272, term6272.getClass(), "retryAttempt", term6325);
        setField(term6272, term6272.getClass(), "dropRequestId", term6327);
        setField(term6272, term6272.getClass(), "snapshotBalance", "yGtHPyvYiQ");
        setField(term6272, term6272.getClass(), "payAmount", "MvRIxilFMJ");
        setField(term6272, term6272.getClass(), "ownedNftId", "iNwOJRBEjp");
        Long term6366 = new Long(1233889271256172047L);
        Object term6382 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term6382, term6382.getClass(), "toClassicAddress", "");
        setField(term6382, term6382.getClass(), "amount", "");
        Object term6385 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term6385, term6385.getClass(), "toClassicAddress", "");
        setField(term6385, term6385.getClass(), "amount", "");
        Object term6388 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term6388, term6388.getClass(), "toClassicAddress", "");
        setField(term6388, term6388.getClass(), "amount", "");
        Object term6391 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term6391, term6391.getClass(), "toClassicAddress", "");
        setField(term6391, term6391.getClass(), "amount", "");
        Object term6394 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term6394, term6394.getClass(), "toClassicAddress", "");
        setField(term6394, term6394.getClass(), "amount", "");
        Object term6397 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term6397, term6397.getClass(), "toClassicAddress", "");
        setField(term6397, term6397.getClass(), "amount", "");
        ArrayList term6380 = new ArrayList();
        ((ArrayList) term6380).add(term6382);
        ((ArrayList) term6380).add(term6385);
        ((ArrayList) term6380).add(term6388);
        ((ArrayList) term6380).add(term6391);
        ((ArrayList) term6380).add(term6394);
        ((ArrayList) term6380).add(term6397);
        term6365 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange"));
        setField(term6365, term6365.getClass(), "dropRequestId", term6366);
        setField(term6365, term6365.getClass(), "privateKey", "XylxrMBraH");
        setField(term6365, term6365.getClass(), "paymentAmountChanges", term6380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.PaymentsChangeServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        argTypes[1] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange");
        Object[] args = new Object[2];
        args[0] = term6272;
        args[1] = term6365;
        callMethod(klass, "updateRecipientAmount", argTypes, null, args);
    }

};



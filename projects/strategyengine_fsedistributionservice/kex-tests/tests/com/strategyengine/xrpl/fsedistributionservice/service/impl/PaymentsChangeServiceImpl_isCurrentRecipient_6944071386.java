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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import java.lang.Integer;

public class PaymentsChangeServiceImpl_isCurrentRecipient_6944071386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5124;
     Object term5149;

    public PaymentsChangeServiceImpl_isCurrentRecipient_6944071386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5124 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term5124, term5124.getClass(), "toClassicAddress", "idgaQsnJpQ");
        setField(term5124, term5124.getClass(), "amount", "VgZnGoIFwQ");
        Long term5153 = new Long(2486810210675247493L);
        Class<? extends Object> term5342 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term5341 = ((Class) term5342).getDeclaredField((String) "FAILED");
        ((Field) term5341).setAccessible(true);
        Object enum8 = ((Field) term5341).get((Object) null);
        Integer term5198 = new Integer(1484323161);
        Long term5200 = new Long(7009926388951271268L);
        Object term5152 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term5167 = newInstance(Class.forName("java.util.Date"));
        Object term5169 = newInstance(Class.forName("java.util.Date"));
        setField(term5152, term5152.getClass(), "id", term5153);
        setField(term5152, term5152.getClass(), "address", "jUbSRrkrYZ");
        setLongField(term5167, term5167.getClass(), "fastTime", 1645834034896L);
        setField(term5167, term5167.getClass(), "cdate", null);
        setField(term5152, term5152.getClass(), "createDate", term5167);
        setLongField(term5169, term5169.getClass(), "fastTime", 1500721068023L);
        setField(term5169, term5169.getClass(), "cdate", null);
        setField(term5152, term5152.getClass(), "updateDate", term5169);
        setField(term5152, term5152.getClass(), "status", enum8);
        setField(term5152, term5152.getClass(), "failReason", "bWWfajKbEX");
        setField(term5152, term5152.getClass(), "code", "cAPeiZHKGJ");
        setField(term5152, term5152.getClass(), "retryAttempt", term5198);
        setField(term5152, term5152.getClass(), "dropRequestId", term5200);
        setField(term5152, term5152.getClass(), "snapshotBalance", "LvJFtLBaxj");
        setField(term5152, term5152.getClass(), "payAmount", "PHvxnGHptP");
        setField(term5152, term5152.getClass(), "ownedNftId", "TimdotUuNC");
        Long term5240 = new Long(-7672528020740371001L);
        Class<? extends Object> term5812 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term5811 = ((Class) term5812).getDeclaredField((String) "SENDING");
        ((Field) term5811).setAccessible(true);
        Object enum9 = ((Field) term5811).get((Object) null);
        Integer term5251 = new Integer(391863371);
        Long term5253 = new Long(-4502405999831680926L);
        Object term5239 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term5243 = newInstance(Class.forName("java.util.Date"));
        Object term5245 = newInstance(Class.forName("java.util.Date"));
        setField(term5239, term5239.getClass(), "id", term5240);
        setField(term5239, term5239.getClass(), "address", "");
        setLongField(term5243, term5243.getClass(), "fastTime", 1797203628025L);
        setField(term5243, term5243.getClass(), "cdate", null);
        setField(term5239, term5239.getClass(), "createDate", term5243);
        setLongField(term5245, term5245.getClass(), "fastTime", 1589457921030L);
        setField(term5245, term5245.getClass(), "cdate", null);
        setField(term5239, term5239.getClass(), "updateDate", term5245);
        setField(term5239, term5239.getClass(), "status", enum9);
        setField(term5239, term5239.getClass(), "failReason", "");
        setField(term5239, term5239.getClass(), "code", "");
        setField(term5239, term5239.getClass(), "retryAttempt", term5251);
        setField(term5239, term5239.getClass(), "dropRequestId", term5253);
        setField(term5239, term5239.getClass(), "snapshotBalance", "");
        setField(term5239, term5239.getClass(), "payAmount", "");
        setField(term5239, term5239.getClass(), "ownedNftId", "");
        Long term5260 = new Long(1967728129628047933L);
        Integer term5262 = new Integer(-1922583790);
        Long term5264 = new Long(2120084523938730454L);
        Object term5259 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        setField(term5259, term5259.getClass(), "id", term5260);
        setField(term5259, term5259.getClass(), "address", null);
        setField(term5259, term5259.getClass(), "createDate", null);
        setField(term5259, term5259.getClass(), "updateDate", null);
        setField(term5259, term5259.getClass(), "status", enum9);
        setField(term5259, term5259.getClass(), "failReason", null);
        setField(term5259, term5259.getClass(), "code", null);
        setField(term5259, term5259.getClass(), "retryAttempt", term5262);
        setField(term5259, term5259.getClass(), "dropRequestId", term5264);
        setField(term5259, term5259.getClass(), "snapshotBalance", null);
        setField(term5259, term5259.getClass(), "payAmount", null);
        setField(term5259, term5259.getClass(), "ownedNftId", null);
        term5149 = new LinkedList();
        ((LinkedList) term5149).add(term5152);
        ((LinkedList) term5149).add(term5239);
        ((LinkedList) term5149).add(term5259);
        ((LinkedList) term5149).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.PaymentsChangeServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term5124;
        args[1] = term5149;
        callMethod(klass, "isCurrentRecipient", argTypes, null, args);
    }

};



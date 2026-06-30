package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class DropRecipientEnt_DropRecipientEntBuilder_status_12736624165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42673;
     Object enum81;

    public DropRecipientEnt_DropRecipientEntBuilder_status_12736624165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term42674 = new Long(-6602460430714339690L);
        Class<? extends Object> term42777 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term42776 = ((Class) term42777).getDeclaredField((String) "FAILED");
        ((Field) term42776).setAccessible(true);
        enum81 = ((Field) term42776).get((Object) null);
        Integer term42726 = new Integer(-1087774327);
        Long term42728 = new Long(21047099434645581L);
        term42673 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder"));
        Object term42688 = newInstance(Class.forName("java.util.Date"));
        Object term42690 = newInstance(Class.forName("java.util.Date"));
        setField(term42673, term42673.getClass(), "id", term42674);
        setField(term42673, term42673.getClass(), "address", "IBpaxltauX");
        setLongField(term42688, term42688.getClass(), "fastTime", 1840780783490L);
        setField(term42688, term42688.getClass(), "cdate", null);
        setField(term42673, term42673.getClass(), "createDate", term42688);
        setLongField(term42690, term42690.getClass(), "fastTime", 1402603630583L);
        setField(term42690, term42690.getClass(), "cdate", null);
        setField(term42673, term42673.getClass(), "updateDate", term42690);
        setField(term42673, term42673.getClass(), "status", enum81);
        setField(term42673, term42673.getClass(), "failReason", "hePqROaplw");
        setField(term42673, term42673.getClass(), "code", "PJcSNDruWd");
        setField(term42673, term42673.getClass(), "retryAttempt", term42726);
        setField(term42673, term42673.getClass(), "dropRequestId", term42728);
        setField(term42673, term42673.getClass(), "snapshotBalance", "VVNNlAePXF");
        setField(term42673, term42673.getClass(), "payAmount", "jnwVnmKAFv");
        setField(term42673, term42673.getClass(), "ownedNftId", "TXyHhqeCjR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Object[] args = new Object[1];
        args[0] = enum81;
        callMethod(klass, "status", argTypes, term42673, args);
    }

};



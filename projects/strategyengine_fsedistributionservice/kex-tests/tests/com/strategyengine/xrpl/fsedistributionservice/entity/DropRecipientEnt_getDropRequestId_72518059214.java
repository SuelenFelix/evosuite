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

public class DropRecipientEnt_getDropRequestId_72518059214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29923;

    public DropRecipientEnt_getDropRequestId_72518059214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29924 = new Long(6698455537431331246L);
        Class<? extends Object> term30029 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term30028 = ((Class) term30029).getDeclaredField((String) "VERIFIED");
        ((Field) term30028).setAccessible(true);
        Object enum59 = ((Field) term30028).get((Object) null);
        Integer term29978 = new Integer(-883034806);
        Long term29980 = new Long(-8327432141027603933L);
        term29923 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term29938 = newInstance(Class.forName("java.util.Date"));
        Object term29940 = newInstance(Class.forName("java.util.Date"));
        setField(term29923, term29923.getClass(), "id", term29924);
        setField(term29923, term29923.getClass(), "address", "DhjNLmRMCu");
        setLongField(term29938, term29938.getClass(), "fastTime", 1655668811013L);
        setField(term29938, term29938.getClass(), "cdate", null);
        setField(term29923, term29923.getClass(), "createDate", term29938);
        setLongField(term29940, term29940.getClass(), "fastTime", 1319355084958L);
        setField(term29940, term29940.getClass(), "cdate", null);
        setField(term29923, term29923.getClass(), "updateDate", term29940);
        setField(term29923, term29923.getClass(), "status", enum59);
        setField(term29923, term29923.getClass(), "failReason", "PgPzMSEjjX");
        setField(term29923, term29923.getClass(), "code", "wzsPSPcRdj");
        setField(term29923, term29923.getClass(), "retryAttempt", term29978);
        setField(term29923, term29923.getClass(), "dropRequestId", term29980);
        setField(term29923, term29923.getClass(), "snapshotBalance", "kGMQdqJYyB");
        setField(term29923, term29923.getClass(), "payAmount", "XJJNClzHRf");
        setField(term29923, term29923.getClass(), "ownedNftId", "HDaezxQfQR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDropRequestId", argTypes, term29923, args);
    }

};



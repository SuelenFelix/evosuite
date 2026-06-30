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

public class DropRecipientEnt_getAddress_7520899547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25892;

    public DropRecipientEnt_getAddress_7520899547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25893 = new Long(-8614778293741404325L);
        Class<? extends Object> term25996 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term25995 = ((Class) term25996).getDeclaredField((String) "FAILED");
        ((Field) term25995).setAccessible(true);
        Object enum52 = ((Field) term25995).get((Object) null);
        Integer term25945 = new Integer(-1955890973);
        Long term25947 = new Long(-5447369594017685765L);
        term25892 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term25907 = newInstance(Class.forName("java.util.Date"));
        Object term25909 = newInstance(Class.forName("java.util.Date"));
        setField(term25892, term25892.getClass(), "id", term25893);
        setField(term25892, term25892.getClass(), "address", "MwwjNtdOFT");
        setLongField(term25907, term25907.getClass(), "fastTime", 1319541754821L);
        setField(term25907, term25907.getClass(), "cdate", null);
        setField(term25892, term25892.getClass(), "createDate", term25907);
        setLongField(term25909, term25909.getClass(), "fastTime", 1431655415283L);
        setField(term25909, term25909.getClass(), "cdate", null);
        setField(term25892, term25892.getClass(), "updateDate", term25909);
        setField(term25892, term25892.getClass(), "status", enum52);
        setField(term25892, term25892.getClass(), "failReason", "VYkqXKVlAJ");
        setField(term25892, term25892.getClass(), "code", "XkIoWJRNwN");
        setField(term25892, term25892.getClass(), "retryAttempt", term25945);
        setField(term25892, term25892.getClass(), "dropRequestId", term25947);
        setField(term25892, term25892.getClass(), "snapshotBalance", "aNWLJdrZMq");
        setField(term25892, term25892.getClass(), "payAmount", "HHmNoYxIGj");
        setField(term25892, term25892.getClass(), "ownedNftId", "PtirvZmsGt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddress", argTypes, term25892, args);
    }

};



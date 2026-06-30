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

public class DropRecipientEnt_setPayAmount_17377343030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39097;

    public DropRecipientEnt_setPayAmount_17377343030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term39098 = new Long(-4043093655001688454L);
        Class<? extends Object> term39215 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term39214 = ((Class) term39215).getDeclaredField((String) "VERIFIED");
        ((Field) term39214).setAccessible(true);
        Object enum75 = ((Field) term39214).get((Object) null);
        Integer term39152 = new Integer(-244121226);
        Long term39154 = new Long(-419800263764810394L);
        term39097 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term39112 = newInstance(Class.forName("java.util.Date"));
        Object term39114 = newInstance(Class.forName("java.util.Date"));
        setField(term39097, term39097.getClass(), "id", term39098);
        setField(term39097, term39097.getClass(), "address", "zNdorvdUgu");
        setLongField(term39112, term39112.getClass(), "fastTime", 1668066172011L);
        setField(term39112, term39112.getClass(), "cdate", null);
        setField(term39097, term39097.getClass(), "createDate", term39112);
        setLongField(term39114, term39114.getClass(), "fastTime", 1677875735410L);
        setField(term39114, term39114.getClass(), "cdate", null);
        setField(term39097, term39097.getClass(), "updateDate", term39114);
        setField(term39097, term39097.getClass(), "status", enum75);
        setField(term39097, term39097.getClass(), "failReason", "oPxuZbkYio");
        setField(term39097, term39097.getClass(), "code", "vKitydDVnM");
        setField(term39097, term39097.getClass(), "retryAttempt", term39152);
        setField(term39097, term39097.getClass(), "dropRequestId", term39154);
        setField(term39097, term39097.getClass(), "snapshotBalance", "urCiQnUFBM");
        setField(term39097, term39097.getClass(), "payAmount", "EKjQdtKxAM");
        setField(term39097, term39097.getClass(), "ownedNftId", "TXZAIPQJHt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DIbeDHICho";
        callMethod(klass, "setPayAmount", argTypes, term39097, args);
    }

};



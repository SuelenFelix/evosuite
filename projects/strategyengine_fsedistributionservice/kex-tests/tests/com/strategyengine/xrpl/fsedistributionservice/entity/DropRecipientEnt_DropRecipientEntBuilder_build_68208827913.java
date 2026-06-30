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

public class DropRecipientEnt_DropRecipientEntBuilder_build_68208827913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47399;

    public DropRecipientEnt_DropRecipientEntBuilder_build_68208827913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term47400 = new Long(4576699120365923235L);
        Class<? extends Object> term47504 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term47503 = ((Class) term47504).getDeclaredField((String) "SENDING");
        ((Field) term47503).setAccessible(true);
        Object enum89 = ((Field) term47503).get((Object) null);
        Integer term47453 = new Integer(1876565163);
        Long term47455 = new Long(-1635471392209071620L);
        term47399 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder"));
        Object term47414 = newInstance(Class.forName("java.util.Date"));
        Object term47416 = newInstance(Class.forName("java.util.Date"));
        setField(term47399, term47399.getClass(), "id", term47400);
        setField(term47399, term47399.getClass(), "address", "qUtkFGMNUV");
        setLongField(term47414, term47414.getClass(), "fastTime", 1707086031965L);
        setField(term47414, term47414.getClass(), "cdate", null);
        setField(term47399, term47399.getClass(), "createDate", term47414);
        setLongField(term47416, term47416.getClass(), "fastTime", 1697617324008L);
        setField(term47416, term47416.getClass(), "cdate", null);
        setField(term47399, term47399.getClass(), "updateDate", term47416);
        setField(term47399, term47399.getClass(), "status", enum89);
        setField(term47399, term47399.getClass(), "failReason", "mGRiYhnMcR");
        setField(term47399, term47399.getClass(), "code", "NFlvfJCVPO");
        setField(term47399, term47399.getClass(), "retryAttempt", term47453);
        setField(term47399, term47399.getClass(), "dropRequestId", term47455);
        setField(term47399, term47399.getClass(), "snapshotBalance", "KarbTXFmUU");
        setField(term47399, term47399.getClass(), "payAmount", "jiUSjqwSIQ");
        setField(term47399, term47399.getClass(), "ownedNftId", "MgLCedQfoj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term47399, args);
    }

};



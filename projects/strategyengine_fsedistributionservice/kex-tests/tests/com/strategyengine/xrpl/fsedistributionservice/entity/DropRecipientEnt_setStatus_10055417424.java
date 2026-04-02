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

public class DropRecipientEnt_setStatus_10055417424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35139;
     Object enum69;

    public DropRecipientEnt_setStatus_10055417424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term35140 = new Long(-3954795081650780841L);
        Class<? extends Object> term35255 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term35254 = ((Class) term35255).getDeclaredField((String) "FAILED");
        ((Field) term35254).setAccessible(true);
        Object enum68 = ((Field) term35254).get((Object) null);
        Integer term35192 = new Integer(-2068769794);
        Long term35194 = new Long(3288791194263207397L);
        term35139 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term35154 = newInstance(Class.forName("java.util.Date"));
        Object term35156 = newInstance(Class.forName("java.util.Date"));
        setField(term35139, term35139.getClass(), "id", term35140);
        setField(term35139, term35139.getClass(), "address", "SIODFGaQhr");
        setLongField(term35154, term35154.getClass(), "fastTime", 1518551771568L);
        setField(term35154, term35154.getClass(), "cdate", null);
        setField(term35139, term35139.getClass(), "createDate", term35154);
        setLongField(term35156, term35156.getClass(), "fastTime", 1496476439025L);
        setField(term35156, term35156.getClass(), "cdate", null);
        setField(term35139, term35139.getClass(), "updateDate", term35156);
        setField(term35139, term35139.getClass(), "status", enum68);
        setField(term35139, term35139.getClass(), "failReason", "qYzsiuXOgS");
        setField(term35139, term35139.getClass(), "code", "bxrCBbrrct");
        setField(term35139, term35139.getClass(), "retryAttempt", term35192);
        setField(term35139, term35139.getClass(), "dropRequestId", term35194);
        setField(term35139, term35139.getClass(), "snapshotBalance", "CKWpJaaaxX");
        setField(term35139, term35139.getClass(), "payAmount", "UBRmXJmfrt");
        setField(term35139, term35139.getClass(), "ownedNftId", "WZzvmIHhzZ");
        Class<? extends Object> term35725 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term35724 = ((Class) term35725).getDeclaredField((String) "VERIFIED");
        ((Field) term35724).setAccessible(true);
        enum69 = ((Field) term35724).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Object[] args = new Object[1];
        args[0] = enum69;
        callMethod(klass, "setStatus", argTypes, term35139, args);
    }

};



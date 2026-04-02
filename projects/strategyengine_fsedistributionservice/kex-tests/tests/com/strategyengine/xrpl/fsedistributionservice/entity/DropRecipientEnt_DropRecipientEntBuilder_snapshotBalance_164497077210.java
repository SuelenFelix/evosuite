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

public class DropRecipientEnt_DropRecipientEntBuilder_snapshotBalance_164497077210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45598;

    public DropRecipientEnt_DropRecipientEntBuilder_snapshotBalance_164497077210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term45599 = new Long(3108750145697087661L);
        Class<? extends Object> term45714 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term45713 = ((Class) term45714).getDeclaredField((String) "QUEUED");
        ((Field) term45713).setAccessible(true);
        Object enum86 = ((Field) term45713).get((Object) null);
        Integer term45651 = new Integer(767834723);
        Long term45653 = new Long(3752337209837437327L);
        term45598 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder"));
        Object term45613 = newInstance(Class.forName("java.util.Date"));
        Object term45615 = newInstance(Class.forName("java.util.Date"));
        setField(term45598, term45598.getClass(), "id", term45599);
        setField(term45598, term45598.getClass(), "address", "IoSfuKDFRe");
        setLongField(term45613, term45613.getClass(), "fastTime", 1589208576171L);
        setField(term45613, term45613.getClass(), "cdate", null);
        setField(term45598, term45598.getClass(), "createDate", term45613);
        setLongField(term45615, term45615.getClass(), "fastTime", 1420265476195L);
        setField(term45615, term45615.getClass(), "cdate", null);
        setField(term45598, term45598.getClass(), "updateDate", term45615);
        setField(term45598, term45598.getClass(), "status", enum86);
        setField(term45598, term45598.getClass(), "failReason", "AWYyZiNfsm");
        setField(term45598, term45598.getClass(), "code", "ITRRYiuDwH");
        setField(term45598, term45598.getClass(), "retryAttempt", term45651);
        setField(term45598, term45598.getClass(), "dropRequestId", term45653);
        setField(term45598, term45598.getClass(), "snapshotBalance", "llRfwANcVF");
        setField(term45598, term45598.getClass(), "payAmount", "sUEeHQTWkA");
        setField(term45598, term45598.getClass(), "ownedNftId", "BDIRCxAWLA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eOJfbiZLnb";
        callMethod(klass, "snapshotBalance", argTypes, term45598, args);
    }

};



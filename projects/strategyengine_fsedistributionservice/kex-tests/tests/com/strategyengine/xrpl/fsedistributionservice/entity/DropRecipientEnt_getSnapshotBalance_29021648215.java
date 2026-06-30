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

public class DropRecipientEnt_getSnapshotBalance_29021648215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30504;

    public DropRecipientEnt_getSnapshotBalance_29021648215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30505 = new Long(-433040798405298080L);
        Class<? extends Object> term30609 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term30608 = ((Class) term30609).getDeclaredField((String) "SENDING");
        ((Field) term30608).setAccessible(true);
        Object enum60 = ((Field) term30608).get((Object) null);
        Integer term30558 = new Integer(1585847225);
        Long term30560 = new Long(-1505191021111100819L);
        term30504 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term30519 = newInstance(Class.forName("java.util.Date"));
        Object term30521 = newInstance(Class.forName("java.util.Date"));
        setField(term30504, term30504.getClass(), "id", term30505);
        setField(term30504, term30504.getClass(), "address", "iikZEapDlu");
        setLongField(term30519, term30519.getClass(), "fastTime", 1676471642491L);
        setField(term30519, term30519.getClass(), "cdate", null);
        setField(term30504, term30504.getClass(), "createDate", term30519);
        setLongField(term30521, term30521.getClass(), "fastTime", 1724960506464L);
        setField(term30521, term30521.getClass(), "cdate", null);
        setField(term30504, term30504.getClass(), "updateDate", term30521);
        setField(term30504, term30504.getClass(), "status", enum60);
        setField(term30504, term30504.getClass(), "failReason", "nhoHrZfnIN");
        setField(term30504, term30504.getClass(), "code", "ZkMALXpEAZ");
        setField(term30504, term30504.getClass(), "retryAttempt", term30558);
        setField(term30504, term30504.getClass(), "dropRequestId", term30560);
        setField(term30504, term30504.getClass(), "snapshotBalance", "tXfQjSqDzN");
        setField(term30504, term30504.getClass(), "payAmount", "BjugTaMcxJ");
        setField(term30504, term30504.getClass(), "ownedNftId", "vGiuZVPJNH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSnapshotBalance", argTypes, term30504, args);
    }

};



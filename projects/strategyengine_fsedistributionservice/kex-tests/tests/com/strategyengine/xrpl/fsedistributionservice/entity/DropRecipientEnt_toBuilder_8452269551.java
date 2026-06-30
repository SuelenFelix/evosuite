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

public class DropRecipientEnt_toBuilder_8452269551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22436;

    public DropRecipientEnt_toBuilder_8452269551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22437 = new Long(-2783999800714825789L);
        Class<? extends Object> term22540 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term22539 = ((Class) term22540).getDeclaredField((String) "QUEUED");
        ((Field) term22539).setAccessible(true);
        Object enum46 = ((Field) term22539).get((Object) null);
        Integer term22489 = new Integer(568599855);
        Long term22491 = new Long(4266570509071948633L);
        term22436 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term22451 = newInstance(Class.forName("java.util.Date"));
        Object term22453 = newInstance(Class.forName("java.util.Date"));
        setField(term22436, term22436.getClass(), "id", term22437);
        setField(term22436, term22436.getClass(), "address", "iNwOJRBEjp");
        setLongField(term22451, term22451.getClass(), "fastTime", 1415426053422L);
        setField(term22451, term22451.getClass(), "cdate", null);
        setField(term22436, term22436.getClass(), "createDate", term22451);
        setLongField(term22453, term22453.getClass(), "fastTime", 1359786657069L);
        setField(term22453, term22453.getClass(), "cdate", null);
        setField(term22436, term22436.getClass(), "updateDate", term22453);
        setField(term22436, term22436.getClass(), "status", enum46);
        setField(term22436, term22436.getClass(), "failReason", "XylxrMBraH");
        setField(term22436, term22436.getClass(), "code", "pORebkoRdD");
        setField(term22436, term22436.getClass(), "retryAttempt", term22489);
        setField(term22436, term22436.getClass(), "dropRequestId", term22491);
        setField(term22436, term22436.getClass(), "snapshotBalance", "mXGCWJDOqA");
        setField(term22436, term22436.getClass(), "payAmount", "dpNsDgfPso");
        setField(term22436, term22436.getClass(), "ownedNftId", "hCWPJQKpdc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term22436, args);
    }

};



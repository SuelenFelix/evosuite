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

public class DropRecipientEnt_setRetryAttempt_104000158627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37352;
     Object term37445;

    public DropRecipientEnt_setRetryAttempt_104000158627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term37353 = new Long(-7698746988132548371L);
        Class<? extends Object> term37458 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term37457 = ((Class) term37458).getDeclaredField((String) "QUEUED");
        ((Field) term37457).setAccessible(true);
        Object enum72 = ((Field) term37457).get((Object) null);
        Integer term37405 = new Integer(1135664017);
        Long term37407 = new Long(2145420811068634601L);
        term37352 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term37367 = newInstance(Class.forName("java.util.Date"));
        Object term37369 = newInstance(Class.forName("java.util.Date"));
        setField(term37352, term37352.getClass(), "id", term37353);
        setField(term37352, term37352.getClass(), "address", "jDmhBrIoDa");
        setLongField(term37367, term37367.getClass(), "fastTime", 1563503265459L);
        setField(term37367, term37367.getClass(), "cdate", null);
        setField(term37352, term37352.getClass(), "createDate", term37367);
        setLongField(term37369, term37369.getClass(), "fastTime", 1416726423958L);
        setField(term37369, term37369.getClass(), "cdate", null);
        setField(term37352, term37352.getClass(), "updateDate", term37369);
        setField(term37352, term37352.getClass(), "status", enum72);
        setField(term37352, term37352.getClass(), "failReason", "SPtPatHeOm");
        setField(term37352, term37352.getClass(), "code", "ywmcuThdfL");
        setField(term37352, term37352.getClass(), "retryAttempt", term37405);
        setField(term37352, term37352.getClass(), "dropRequestId", term37407);
        setField(term37352, term37352.getClass(), "snapshotBalance", "GBOEuByOfr");
        setField(term37352, term37352.getClass(), "payAmount", "NHbOFFjyVK");
        setField(term37352, term37352.getClass(), "ownedNftId", "zaloBqlrSo");
        term37445 = new Integer(590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term37445;
        callMethod(klass, "setRetryAttempt", argTypes, term37352, args);
    }

};



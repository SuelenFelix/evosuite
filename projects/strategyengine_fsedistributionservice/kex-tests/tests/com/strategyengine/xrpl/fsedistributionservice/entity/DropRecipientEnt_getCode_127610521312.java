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

public class DropRecipientEnt_getCode_127610521312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28765;

    public DropRecipientEnt_getCode_127610521312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28766 = new Long(-4030863184426321096L);
        Class<? extends Object> term28871 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term28870 = ((Class) term28871).getDeclaredField((String) "VERIFIED");
        ((Field) term28870).setAccessible(true);
        Object enum57 = ((Field) term28870).get((Object) null);
        Integer term28820 = new Integer(-522618178);
        Long term28822 = new Long(-8010214112439224349L);
        term28765 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term28780 = newInstance(Class.forName("java.util.Date"));
        Object term28782 = newInstance(Class.forName("java.util.Date"));
        setField(term28765, term28765.getClass(), "id", term28766);
        setField(term28765, term28765.getClass(), "address", "kVEZMHmRtR");
        setLongField(term28780, term28780.getClass(), "fastTime", 1758773264597L);
        setField(term28780, term28780.getClass(), "cdate", null);
        setField(term28765, term28765.getClass(), "createDate", term28780);
        setLongField(term28782, term28782.getClass(), "fastTime", 1303889782295L);
        setField(term28782, term28782.getClass(), "cdate", null);
        setField(term28765, term28765.getClass(), "updateDate", term28782);
        setField(term28765, term28765.getClass(), "status", enum57);
        setField(term28765, term28765.getClass(), "failReason", "ekxGuOYIwi");
        setField(term28765, term28765.getClass(), "code", "RbVQXSpxXy");
        setField(term28765, term28765.getClass(), "retryAttempt", term28820);
        setField(term28765, term28765.getClass(), "dropRequestId", term28822);
        setField(term28765, term28765.getClass(), "snapshotBalance", "YpJbIgJWWv");
        setField(term28765, term28765.getClass(), "payAmount", "JppkknKVOw");
        setField(term28765, term28765.getClass(), "ownedNftId", "iljANwuEjk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCode", argTypes, term28765, args);
    }

};



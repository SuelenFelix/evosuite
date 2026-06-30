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

public class DropRecipientEnt_getPayAmount_33653087016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31081;

    public DropRecipientEnt_getPayAmount_33653087016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31082 = new Long(-1000830646340880796L);
        Class<? extends Object> term31185 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term31184 = ((Class) term31185).getDeclaredField((String) "QUEUED");
        ((Field) term31184).setAccessible(true);
        Object enum61 = ((Field) term31184).get((Object) null);
        Integer term31134 = new Integer(597278769);
        Long term31136 = new Long(5973526439563541711L);
        term31081 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term31096 = newInstance(Class.forName("java.util.Date"));
        Object term31098 = newInstance(Class.forName("java.util.Date"));
        setField(term31081, term31081.getClass(), "id", term31082);
        setField(term31081, term31081.getClass(), "address", "tlzpzIjMib");
        setLongField(term31096, term31096.getClass(), "fastTime", 1743136792108L);
        setField(term31096, term31096.getClass(), "cdate", null);
        setField(term31081, term31081.getClass(), "createDate", term31096);
        setLongField(term31098, term31098.getClass(), "fastTime", 1728457746580L);
        setField(term31098, term31098.getClass(), "cdate", null);
        setField(term31081, term31081.getClass(), "updateDate", term31098);
        setField(term31081, term31081.getClass(), "status", enum61);
        setField(term31081, term31081.getClass(), "failReason", "AZdLeSugwv");
        setField(term31081, term31081.getClass(), "code", "RMsXuyzKJV");
        setField(term31081, term31081.getClass(), "retryAttempt", term31134);
        setField(term31081, term31081.getClass(), "dropRequestId", term31136);
        setField(term31081, term31081.getClass(), "snapshotBalance", "FwPbDZcHmB");
        setField(term31081, term31081.getClass(), "payAmount", "hOncybyCAH");
        setField(term31081, term31081.getClass(), "ownedNftId", "QduALnDSVo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPayAmount", argTypes, term31081, args);
    }

};



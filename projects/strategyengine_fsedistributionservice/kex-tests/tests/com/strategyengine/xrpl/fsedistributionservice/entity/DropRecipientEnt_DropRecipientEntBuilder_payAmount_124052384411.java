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

public class DropRecipientEnt_DropRecipientEntBuilder_payAmount_124052384411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46193;

    public DropRecipientEnt_DropRecipientEntBuilder_payAmount_124052384411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term46194 = new Long(1860789353508856614L);
        Class<? extends Object> term46311 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term46310 = ((Class) term46311).getDeclaredField((String) "VERIFIED");
        ((Field) term46310).setAccessible(true);
        Object enum87 = ((Field) term46310).get((Object) null);
        Integer term46248 = new Integer(-602026508);
        Long term46250 = new Long(-7456852906235966771L);
        term46193 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder"));
        Object term46208 = newInstance(Class.forName("java.util.Date"));
        Object term46210 = newInstance(Class.forName("java.util.Date"));
        setField(term46193, term46193.getClass(), "id", term46194);
        setField(term46193, term46193.getClass(), "address", "nKZKnxWYCK");
        setLongField(term46208, term46208.getClass(), "fastTime", 1379588514567L);
        setField(term46208, term46208.getClass(), "cdate", null);
        setField(term46193, term46193.getClass(), "createDate", term46208);
        setLongField(term46210, term46210.getClass(), "fastTime", 1416359920111L);
        setField(term46210, term46210.getClass(), "cdate", null);
        setField(term46193, term46193.getClass(), "updateDate", term46210);
        setField(term46193, term46193.getClass(), "status", enum87);
        setField(term46193, term46193.getClass(), "failReason", "JOqQxuzRuZ");
        setField(term46193, term46193.getClass(), "code", "RSaoipUlsg");
        setField(term46193, term46193.getClass(), "retryAttempt", term46248);
        setField(term46193, term46193.getClass(), "dropRequestId", term46250);
        setField(term46193, term46193.getClass(), "snapshotBalance", "cSHGbqKqlN");
        setField(term46193, term46193.getClass(), "payAmount", "pFAfANnxup");
        setField(term46193, term46193.getClass(), "ownedNftId", "FbSIUZyBXZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mhQDwIyrRi";
        callMethod(klass, "payAmount", argTypes, term46193, args);
    }

};



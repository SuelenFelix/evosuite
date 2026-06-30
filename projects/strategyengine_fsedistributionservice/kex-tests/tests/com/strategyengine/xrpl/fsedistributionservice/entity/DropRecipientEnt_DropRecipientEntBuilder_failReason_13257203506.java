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

public class DropRecipientEnt_DropRecipientEntBuilder_failReason_13257203506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43246;

    public DropRecipientEnt_DropRecipientEntBuilder_failReason_13257203506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term43247 = new Long(-8862087040734407227L);
        Class<? extends Object> term43364 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term43363 = ((Class) term43364).getDeclaredField((String) "VERIFIED");
        ((Field) term43363).setAccessible(true);
        Object enum82 = ((Field) term43363).get((Object) null);
        Integer term43301 = new Integer(-1530420153);
        Long term43303 = new Long(-6394943900800506753L);
        term43246 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder"));
        Object term43261 = newInstance(Class.forName("java.util.Date"));
        Object term43263 = newInstance(Class.forName("java.util.Date"));
        setField(term43246, term43246.getClass(), "id", term43247);
        setField(term43246, term43246.getClass(), "address", "lZIgPZPgTu");
        setLongField(term43261, term43261.getClass(), "fastTime", 1303219614891L);
        setField(term43261, term43261.getClass(), "cdate", null);
        setField(term43246, term43246.getClass(), "createDate", term43261);
        setLongField(term43263, term43263.getClass(), "fastTime", 1798212749741L);
        setField(term43263, term43263.getClass(), "cdate", null);
        setField(term43246, term43246.getClass(), "updateDate", term43263);
        setField(term43246, term43246.getClass(), "status", enum82);
        setField(term43246, term43246.getClass(), "failReason", "iuCxnHGMoW");
        setField(term43246, term43246.getClass(), "code", "GPSEWEDSTo");
        setField(term43246, term43246.getClass(), "retryAttempt", term43301);
        setField(term43246, term43246.getClass(), "dropRequestId", term43303);
        setField(term43246, term43246.getClass(), "snapshotBalance", "RCOqfVsRHt");
        setField(term43246, term43246.getClass(), "payAmount", "TSyCeEZPaT");
        setField(term43246, term43246.getClass(), "ownedNftId", "JeZFtaqkzW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vOVuNSCCLe";
        callMethod(klass, "failReason", argTypes, term43246, args);
    }

};



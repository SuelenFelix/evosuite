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

public class DropRecipientEnt_DropRecipientEntBuilder_toString_26647541414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47976;

    public DropRecipientEnt_DropRecipientEntBuilder_toString_26647541414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term47977 = new Long(-4714000263923324167L);
        Class<? extends Object> term48082 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term48081 = ((Class) term48082).getDeclaredField((String) "VERIFIED");
        ((Field) term48081).setAccessible(true);
        Object enum90 = ((Field) term48081).get((Object) null);
        Integer term48031 = new Integer(-817164822);
        Long term48033 = new Long(6906379511067694917L);
        term47976 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder"));
        Object term47991 = newInstance(Class.forName("java.util.Date"));
        Object term47993 = newInstance(Class.forName("java.util.Date"));
        setField(term47976, term47976.getClass(), "id", term47977);
        setField(term47976, term47976.getClass(), "address", "zgKiINdgNu");
        setLongField(term47991, term47991.getClass(), "fastTime", 1684755976817L);
        setField(term47991, term47991.getClass(), "cdate", null);
        setField(term47976, term47976.getClass(), "createDate", term47991);
        setLongField(term47993, term47993.getClass(), "fastTime", 1449316822527L);
        setField(term47993, term47993.getClass(), "cdate", null);
        setField(term47976, term47976.getClass(), "updateDate", term47993);
        setField(term47976, term47976.getClass(), "status", enum90);
        setField(term47976, term47976.getClass(), "failReason", "zLMTXDQHYH");
        setField(term47976, term47976.getClass(), "code", "PqywFWJlpE");
        setField(term47976, term47976.getClass(), "retryAttempt", term48031);
        setField(term47976, term47976.getClass(), "dropRequestId", term48033);
        setField(term47976, term47976.getClass(), "snapshotBalance", "OzXRsFGTIp");
        setField(term47976, term47976.getClass(), "payAmount", "TjWpyghUWN");
        setField(term47976, term47976.getClass(), "ownedNftId", "dkZFDZxcde");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term47976, args);
    }

};



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

public class DropRecipientEnt_setCreateDate_6538343922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33973;
     Object term34068;

    public DropRecipientEnt_setCreateDate_6538343922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term33974 = new Long(5731563613239387113L);
        Class<? extends Object> term34081 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term34080 = ((Class) term34081).getDeclaredField((String) "VERIFIED");
        ((Field) term34080).setAccessible(true);
        Object enum66 = ((Field) term34080).get((Object) null);
        Integer term34028 = new Integer(-655067527);
        Long term34030 = new Long(3381333711768010594L);
        term33973 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term33988 = newInstance(Class.forName("java.util.Date"));
        Object term33990 = newInstance(Class.forName("java.util.Date"));
        setField(term33973, term33973.getClass(), "id", term33974);
        setField(term33973, term33973.getClass(), "address", "ShIELyuULw");
        setLongField(term33988, term33988.getClass(), "fastTime", 1546769987439L);
        setField(term33988, term33988.getClass(), "cdate", null);
        setField(term33973, term33973.getClass(), "createDate", term33988);
        setLongField(term33990, term33990.getClass(), "fastTime", 1851896886282L);
        setField(term33990, term33990.getClass(), "cdate", null);
        setField(term33973, term33973.getClass(), "updateDate", term33990);
        setField(term33973, term33973.getClass(), "status", enum66);
        setField(term33973, term33973.getClass(), "failReason", "IpQuOGMgmj");
        setField(term33973, term33973.getClass(), "code", "pJbnHTYrxn");
        setField(term33973, term33973.getClass(), "retryAttempt", term34028);
        setField(term33973, term33973.getClass(), "dropRequestId", term34030);
        setField(term33973, term33973.getClass(), "snapshotBalance", "iIRsCSYqXH");
        setField(term33973, term33973.getClass(), "payAmount", "nghfqDXyCG");
        setField(term33973, term33973.getClass(), "ownedNftId", "WBAOTqErtm");
        term34068 = newInstance(Class.forName("java.util.Date"));
        setLongField(term34068, term34068.getClass(), "fastTime", 1831742729790L);
        setField(term34068, term34068.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term34068;
        callMethod(klass, "setCreateDate", argTypes, term33973, args);
    }

};



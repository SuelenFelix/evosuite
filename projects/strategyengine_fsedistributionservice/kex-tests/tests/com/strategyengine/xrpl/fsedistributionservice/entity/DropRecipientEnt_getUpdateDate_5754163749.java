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

public class DropRecipientEnt_getUpdateDate_5754163749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27038;

    public DropRecipientEnt_getUpdateDate_5754163749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27039 = new Long(5465527210299101732L);
        Class<? extends Object> term27143 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term27142 = ((Class) term27143).getDeclaredField((String) "SENDING");
        ((Field) term27142).setAccessible(true);
        Object enum54 = ((Field) term27142).get((Object) null);
        Integer term27092 = new Integer(1227103734);
        Long term27094 = new Long(4699157009689333952L);
        term27038 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term27053 = newInstance(Class.forName("java.util.Date"));
        Object term27055 = newInstance(Class.forName("java.util.Date"));
        setField(term27038, term27038.getClass(), "id", term27039);
        setField(term27038, term27038.getClass(), "address", "WzFopsaDuG");
        setLongField(term27053, term27053.getClass(), "fastTime", 1618594705278L);
        setField(term27053, term27053.getClass(), "cdate", null);
        setField(term27038, term27038.getClass(), "createDate", term27053);
        setLongField(term27055, term27055.getClass(), "fastTime", 1584136591305L);
        setField(term27055, term27055.getClass(), "cdate", null);
        setField(term27038, term27038.getClass(), "updateDate", term27055);
        setField(term27038, term27038.getClass(), "status", enum54);
        setField(term27038, term27038.getClass(), "failReason", "PapWxkhEWe");
        setField(term27038, term27038.getClass(), "code", "smnHEqRFRx");
        setField(term27038, term27038.getClass(), "retryAttempt", term27092);
        setField(term27038, term27038.getClass(), "dropRequestId", term27094);
        setField(term27038, term27038.getClass(), "snapshotBalance", "XYtryyobou");
        setField(term27038, term27038.getClass(), "payAmount", "OYbzXylRWW");
        setField(term27038, term27038.getClass(), "ownedNftId", "DSNsTGYXDF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdateDate", argTypes, term27038, args);
    }

};



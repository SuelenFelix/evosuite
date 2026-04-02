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

public class DropRecipientEnt_DropRecipientEntBuilder_createDate_16556669473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41511;
     Object term41606;

    public DropRecipientEnt_DropRecipientEntBuilder_createDate_16556669473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term41512 = new Long(-2955854401507097864L);
        Class<? extends Object> term41619 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term41618 = ((Class) term41619).getDeclaredField((String) "VERIFIED");
        ((Field) term41618).setAccessible(true);
        Object enum79 = ((Field) term41618).get((Object) null);
        Integer term41566 = new Integer(-226514366);
        Long term41568 = new Long(329213208496958131L);
        term41511 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder"));
        Object term41526 = newInstance(Class.forName("java.util.Date"));
        Object term41528 = newInstance(Class.forName("java.util.Date"));
        setField(term41511, term41511.getClass(), "id", term41512);
        setField(term41511, term41511.getClass(), "address", "zNFLXMifnS");
        setLongField(term41526, term41526.getClass(), "fastTime", 1312186139711L);
        setField(term41526, term41526.getClass(), "cdate", null);
        setField(term41511, term41511.getClass(), "createDate", term41526);
        setLongField(term41528, term41528.getClass(), "fastTime", 1380452861286L);
        setField(term41528, term41528.getClass(), "cdate", null);
        setField(term41511, term41511.getClass(), "updateDate", term41528);
        setField(term41511, term41511.getClass(), "status", enum79);
        setField(term41511, term41511.getClass(), "failReason", "HHQcYMSBVc");
        setField(term41511, term41511.getClass(), "code", "wdoqITnaAP");
        setField(term41511, term41511.getClass(), "retryAttempt", term41566);
        setField(term41511, term41511.getClass(), "dropRequestId", term41568);
        setField(term41511, term41511.getClass(), "snapshotBalance", "rIPMBcrNqB");
        setField(term41511, term41511.getClass(), "payAmount", "UDaboHZHhz");
        setField(term41511, term41511.getClass(), "ownedNftId", "nRvKihUSPj");
        term41606 = newInstance(Class.forName("java.util.Date"));
        setLongField(term41606, term41606.getClass(), "fastTime", 1599094543267L);
        setField(term41606, term41606.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term41606;
        callMethod(klass, "createDate", argTypes, term41511, args);
    }

};



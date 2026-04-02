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

public class DropRecipientEnt_setDropRequestId_84493709428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37927;
     Object term38020;

    public DropRecipientEnt_setDropRequestId_84493709428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term37928 = new Long(2191130532479601175L);
        Class<? extends Object> term38033 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term38032 = ((Class) term38033).getDeclaredField((String) "QUEUED");
        ((Field) term38032).setAccessible(true);
        Object enum73 = ((Field) term38032).get((Object) null);
        Integer term37980 = new Integer(865208305);
        Long term37982 = new Long(860079646007397083L);
        term37927 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term37942 = newInstance(Class.forName("java.util.Date"));
        Object term37944 = newInstance(Class.forName("java.util.Date"));
        setField(term37927, term37927.getClass(), "id", term37928);
        setField(term37927, term37927.getClass(), "address", "vvoLrMGCoN");
        setLongField(term37942, term37942.getClass(), "fastTime", 1650014053723L);
        setField(term37942, term37942.getClass(), "cdate", null);
        setField(term37927, term37927.getClass(), "createDate", term37942);
        setLongField(term37944, term37944.getClass(), "fastTime", 1537221086922L);
        setField(term37944, term37944.getClass(), "cdate", null);
        setField(term37927, term37927.getClass(), "updateDate", term37944);
        setField(term37927, term37927.getClass(), "status", enum73);
        setField(term37927, term37927.getClass(), "failReason", "pXdglvyrQe");
        setField(term37927, term37927.getClass(), "code", "OcfNzHYdki");
        setField(term37927, term37927.getClass(), "retryAttempt", term37980);
        setField(term37927, term37927.getClass(), "dropRequestId", term37982);
        setField(term37927, term37927.getClass(), "snapshotBalance", "uPuCVuZYOI");
        setField(term37927, term37927.getClass(), "payAmount", "TweMFhxNdj");
        setField(term37927, term37927.getClass(), "ownedNftId", "NBrvVzvQHe");
        term38020 = new Long(3230472384687362867L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term38020;
        callMethod(klass, "setDropRequestId", argTypes, term37927, args);
    }

};



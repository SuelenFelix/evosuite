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

public class DropRecipientEnt_DropRecipientEntBuilder_address_20082205602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40908;

    public DropRecipientEnt_DropRecipientEntBuilder_address_20082205602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term40909 = new Long(-8019730974733786399L);
        Class<? extends Object> term41026 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term41025 = ((Class) term41026).getDeclaredField((String) "VERIFIED");
        ((Field) term41025).setAccessible(true);
        Object enum78 = ((Field) term41025).get((Object) null);
        Integer term40963 = new Integer(-73683645);
        Long term40965 = new Long(394960377236392159L);
        term40908 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder"));
        Object term40923 = newInstance(Class.forName("java.util.Date"));
        Object term40925 = newInstance(Class.forName("java.util.Date"));
        setField(term40908, term40908.getClass(), "id", term40909);
        setField(term40908, term40908.getClass(), "address", "NTWMiBEaDF");
        setLongField(term40923, term40923.getClass(), "fastTime", 1847834235018L);
        setField(term40923, term40923.getClass(), "cdate", null);
        setField(term40908, term40908.getClass(), "createDate", term40923);
        setLongField(term40925, term40925.getClass(), "fastTime", 1744270719416L);
        setField(term40925, term40925.getClass(), "cdate", null);
        setField(term40908, term40908.getClass(), "updateDate", term40925);
        setField(term40908, term40908.getClass(), "status", enum78);
        setField(term40908, term40908.getClass(), "failReason", "SPBstwKFVr");
        setField(term40908, term40908.getClass(), "code", "WxYUTuqmIq");
        setField(term40908, term40908.getClass(), "retryAttempt", term40963);
        setField(term40908, term40908.getClass(), "dropRequestId", term40965);
        setField(term40908, term40908.getClass(), "snapshotBalance", "OeQLvhVERT");
        setField(term40908, term40908.getClass(), "payAmount", "IlvgFINwIa");
        setField(term40908, term40908.getClass(), "ownedNftId", "GEJABPlHSI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aQFUvuaYxd";
        callMethod(klass, "address", argTypes, term40908, args);
    }

};



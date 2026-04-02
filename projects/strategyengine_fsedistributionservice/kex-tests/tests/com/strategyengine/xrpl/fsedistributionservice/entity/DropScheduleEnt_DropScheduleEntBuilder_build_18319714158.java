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
import java.lang.String;
import java.lang.Object;

public class DropScheduleEnt_DropScheduleEntBuilder_build_18319714158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249126;

    public DropScheduleEnt_DropScheduleEntBuilder_build_18319714158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term249127 = new Long(4832511106024339541L);
        Class<? extends Object> term249172 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term249171 = ((Class) term249172).getDeclaredField((String) "ANNUALLY");
        ((Field) term249171).setAccessible(true);
        Object enum437 = ((Field) term249171).get((Object) null);
        Class<? extends Object> term249578 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term249577 = ((Class) term249578).getDeclaredField((String) "REJECTED");
        ((Field) term249577).setAccessible(true);
        Object enum438 = ((Field) term249577).get((Object) null);
        Long term249169 = new Long(7840243516767232066L);
        term249126 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder"));
        Object term249141 = newInstance(Class.forName("java.util.Date"));
        Object term249143 = newInstance(Class.forName("java.util.Date"));
        setField(term249126, term249126.getClass(), "id", term249127);
        setField(term249126, term249126.getClass(), "frequency", enum437);
        setLongField(term249141, term249141.getClass(), "fastTime", 1551557662579L);
        setField(term249141, term249141.getClass(), "cdate", null);
        setField(term249126, term249126.getClass(), "repeatUntilDate", term249141);
        setLongField(term249143, term249143.getClass(), "fastTime", 1553318149160L);
        setField(term249143, term249143.getClass(), "cdate", null);
        setField(term249126, term249126.getClass(), "createDate", term249143);
        setField(term249126, term249126.getClass(), "lockUuid", "UDKBkeWilS");
        setField(term249126, term249126.getClass(), "dropScheduleStatus", enum438);
        setField(term249126, term249126.getClass(), "dropRequestId", term249169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term249126, args);
    }

};



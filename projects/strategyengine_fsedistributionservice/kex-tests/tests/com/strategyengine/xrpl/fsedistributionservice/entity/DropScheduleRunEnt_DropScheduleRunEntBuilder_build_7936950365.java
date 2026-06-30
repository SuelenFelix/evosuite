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

public class DropScheduleRunEnt_DropScheduleRunEntBuilder_build_7936950365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239818;

    public DropScheduleRunEnt_DropScheduleRunEntBuilder_build_7936950365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239819 = new Long(-2196447813514870436L);
        Long term239821 = new Long(2984955721798941743L);
        Long term239823 = new Long(7495572757420909707L);
        term239818 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt$DropScheduleRunEntBuilder"));
        Object term239825 = newInstance(Class.forName("java.util.Date"));
        setField(term239818, term239818.getClass(), "id", term239819);
        setField(term239818, term239818.getClass(), "dropScheduleId", term239821);
        setField(term239818, term239818.getClass(), "dropRequestId", term239823);
        setLongField(term239825, term239825.getClass(), "fastTime", 1399392665119L);
        setField(term239825, term239825.getClass(), "cdate", null);
        setField(term239818, term239818.getClass(), "createDate", term239825);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt$DropScheduleRunEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term239818, args);
    }

};



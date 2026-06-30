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

public class DropScheduleRunEnt_getDropRequestId_15391902618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238807;

    public DropScheduleRunEnt_getDropRequestId_15391902618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238808 = new Long(8495724482241106293L);
        Long term238810 = new Long(-4318584834500248968L);
        Long term238812 = new Long(-7839957570751440706L);
        term238807 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt"));
        Object term238814 = newInstance(Class.forName("java.util.Date"));
        setField(term238807, term238807.getClass(), "id", term238808);
        setField(term238807, term238807.getClass(), "dropScheduleId", term238810);
        setField(term238807, term238807.getClass(), "dropRequestId", term238812);
        setLongField(term238814, term238814.getClass(), "fastTime", 1599033558510L);
        setField(term238814, term238814.getClass(), "cdate", null);
        setField(term238807, term238807.getClass(), "createDate", term238814);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDropRequestId", argTypes, term238807, args);
    }

};



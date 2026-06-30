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

public class DropScheduleRunEnt_hashCode_15956991514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238771;

    public DropScheduleRunEnt_hashCode_15956991514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238772 = new Long(3778691000276335279L);
        Long term238774 = new Long(8453730687540121475L);
        Long term238776 = new Long(8505184530074334434L);
        term238771 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt"));
        Object term238778 = newInstance(Class.forName("java.util.Date"));
        setField(term238771, term238771.getClass(), "id", term238772);
        setField(term238771, term238771.getClass(), "dropScheduleId", term238774);
        setField(term238771, term238771.getClass(), "dropRequestId", term238776);
        setLongField(term238778, term238778.getClass(), "fastTime", 1800369489746L);
        setField(term238778, term238778.getClass(), "cdate", null);
        setField(term238771, term238771.getClass(), "createDate", term238778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term238771, args);
    }

};



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

public class DropScheduleRunEnt_DropScheduleRunEntBuilder_createDate_19271155174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239807;
     Object term239816;

    public DropScheduleRunEnt_DropScheduleRunEntBuilder_createDate_19271155174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239808 = new Long(7594342965038171122L);
        Long term239810 = new Long(-4475453924678388077L);
        Long term239812 = new Long(3831842879355381917L);
        term239807 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt$DropScheduleRunEntBuilder"));
        Object term239814 = newInstance(Class.forName("java.util.Date"));
        setField(term239807, term239807.getClass(), "id", term239808);
        setField(term239807, term239807.getClass(), "dropScheduleId", term239810);
        setField(term239807, term239807.getClass(), "dropRequestId", term239812);
        setLongField(term239814, term239814.getClass(), "fastTime", 1383282251920L);
        setField(term239814, term239814.getClass(), "cdate", null);
        setField(term239807, term239807.getClass(), "createDate", term239814);
        term239816 = newInstance(Class.forName("java.util.Date"));
        setLongField(term239816, term239816.getClass(), "fastTime", 1400433000881L);
        setField(term239816, term239816.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt$DropScheduleRunEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term239816;
        callMethod(klass, "createDate", argTypes, term239807, args);
    }

};



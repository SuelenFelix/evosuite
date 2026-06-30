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

public class DropScheduleRunEnt_DropScheduleRunEntBuilder_dropScheduleId_13738979062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239785;
     Object term239794;

    public DropScheduleRunEnt_DropScheduleRunEntBuilder_dropScheduleId_13738979062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239786 = new Long(-192072503176550129L);
        Long term239788 = new Long(-4726601557653351735L);
        Long term239790 = new Long(-3502423991725415780L);
        term239785 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt$DropScheduleRunEntBuilder"));
        Object term239792 = newInstance(Class.forName("java.util.Date"));
        setField(term239785, term239785.getClass(), "id", term239786);
        setField(term239785, term239785.getClass(), "dropScheduleId", term239788);
        setField(term239785, term239785.getClass(), "dropRequestId", term239790);
        setLongField(term239792, term239792.getClass(), "fastTime", 1387558856564L);
        setField(term239792, term239792.getClass(), "cdate", null);
        setField(term239785, term239785.getClass(), "createDate", term239792);
        term239794 = new Long(7717843551775677202L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt$DropScheduleRunEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term239794;
        callMethod(klass, "dropScheduleId", argTypes, term239785, args);
    }

};



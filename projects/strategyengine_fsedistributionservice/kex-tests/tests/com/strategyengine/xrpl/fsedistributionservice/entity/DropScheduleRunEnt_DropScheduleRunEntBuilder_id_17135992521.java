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

public class DropScheduleRunEnt_DropScheduleRunEntBuilder_id_17135992521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239774;
     Object term239783;

    public DropScheduleRunEnt_DropScheduleRunEntBuilder_id_17135992521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239775 = new Long(-8148408579143384073L);
        Long term239777 = new Long(-888581501148999479L);
        Long term239779 = new Long(1835131711657183788L);
        term239774 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt$DropScheduleRunEntBuilder"));
        Object term239781 = newInstance(Class.forName("java.util.Date"));
        setField(term239774, term239774.getClass(), "id", term239775);
        setField(term239774, term239774.getClass(), "dropScheduleId", term239777);
        setField(term239774, term239774.getClass(), "dropRequestId", term239779);
        setLongField(term239781, term239781.getClass(), "fastTime", 1462740219622L);
        setField(term239781, term239781.getClass(), "cdate", null);
        setField(term239774, term239774.getClass(), "createDate", term239781);
        term239783 = new Long(-4507768716367203234L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt$DropScheduleRunEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term239783;
        callMethod(klass, "id", argTypes, term239774, args);
    }

};



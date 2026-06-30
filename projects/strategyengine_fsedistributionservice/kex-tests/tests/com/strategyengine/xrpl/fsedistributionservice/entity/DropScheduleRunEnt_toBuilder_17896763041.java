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

public class DropScheduleRunEnt_toBuilder_17896763041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238742;

    public DropScheduleRunEnt_toBuilder_17896763041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238743 = new Long(-7787918913179897745L);
        Long term238745 = new Long(9173715346996433126L);
        Long term238747 = new Long(-3243599172737171562L);
        term238742 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt"));
        Object term238749 = newInstance(Class.forName("java.util.Date"));
        setField(term238742, term238742.getClass(), "id", term238743);
        setField(term238742, term238742.getClass(), "dropScheduleId", term238745);
        setField(term238742, term238742.getClass(), "dropRequestId", term238747);
        setLongField(term238749, term238749.getClass(), "fastTime", 1865584367410L);
        setField(term238749, term238749.getClass(), "cdate", null);
        setField(term238742, term238742.getClass(), "createDate", term238749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term238742, args);
    }

};



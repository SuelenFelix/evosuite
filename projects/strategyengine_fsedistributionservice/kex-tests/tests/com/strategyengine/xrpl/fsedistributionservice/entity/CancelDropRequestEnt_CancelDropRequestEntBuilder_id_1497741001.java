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

public class CancelDropRequestEnt_CancelDropRequestEntBuilder_id_1497741001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241796;
     Object term241803;

    public CancelDropRequestEnt_CancelDropRequestEntBuilder_id_1497741001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term241797 = new Long(2599553846982918627L);
        Long term241801 = new Long(-4821516944173509228L);
        term241796 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt$CancelDropRequestEntBuilder"));
        Object term241799 = newInstance(Class.forName("java.util.Date"));
        setField(term241796, term241796.getClass(), "id", term241797);
        setLongField(term241799, term241799.getClass(), "fastTime", 1287722515006L);
        setField(term241799, term241799.getClass(), "cdate", null);
        setField(term241796, term241796.getClass(), "createDate", term241799);
        setField(term241796, term241796.getClass(), "dropRequestId", term241801);
        term241803 = new Long(2315395988604904502L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt$CancelDropRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term241803;
        callMethod(klass, "id", argTypes, term241796, args);
    }

};



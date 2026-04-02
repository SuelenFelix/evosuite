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

public class ScammerAddressEnt_setCreateDate_106086131115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239579;
     Object term239610;

    public ScammerAddressEnt_setCreateDate_106086131115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239580 = new Long(-7488291606536854368L);
        term239579 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt"));
        Object term239594 = newInstance(Class.forName("java.util.Date"));
        Object term239596 = newInstance(Class.forName("java.util.Date"));
        setField(term239579, term239579.getClass(), "id", term239580);
        setField(term239579, term239579.getClass(), "address", "QZCuYHcIBC");
        setLongField(term239594, term239594.getClass(), "fastTime", 1532394992436L);
        setField(term239594, term239594.getClass(), "cdate", null);
        setField(term239579, term239579.getClass(), "createDate", term239594);
        setLongField(term239596, term239596.getClass(), "fastTime", 1572172579362L);
        setField(term239596, term239596.getClass(), "cdate", null);
        setField(term239579, term239579.getClass(), "updateDate", term239596);
        setField(term239579, term239579.getClass(), "type", "hpvoFaAyIu");
        term239610 = newInstance(Class.forName("java.util.Date"));
        setLongField(term239610, term239610.getClass(), "fastTime", 1530832843986L);
        setField(term239610, term239610.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term239610;
        callMethod(klass, "setCreateDate", argTypes, term239579, args);
    }

};



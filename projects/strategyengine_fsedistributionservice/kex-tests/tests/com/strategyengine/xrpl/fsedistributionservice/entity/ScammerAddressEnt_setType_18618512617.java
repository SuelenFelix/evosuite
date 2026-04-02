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

public class ScammerAddressEnt_setType_18618512617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239685;

    public ScammerAddressEnt_setType_18618512617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239686 = new Long(5307445998877056304L);
        term239685 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt"));
        Object term239700 = newInstance(Class.forName("java.util.Date"));
        Object term239702 = newInstance(Class.forName("java.util.Date"));
        setField(term239685, term239685.getClass(), "id", term239686);
        setField(term239685, term239685.getClass(), "address", "cQnJIENJHe");
        setLongField(term239700, term239700.getClass(), "fastTime", 1647766351255L);
        setField(term239700, term239700.getClass(), "cdate", null);
        setField(term239685, term239685.getClass(), "createDate", term239700);
        setLongField(term239702, term239702.getClass(), "fastTime", 1693299280437L);
        setField(term239702, term239702.getClass(), "cdate", null);
        setField(term239685, term239685.getClass(), "updateDate", term239702);
        setField(term239685, term239685.getClass(), "type", "ExjdCvAxlG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "moMySSiBuB";
        callMethod(klass, "setType", argTypes, term239685, args);
    }

};



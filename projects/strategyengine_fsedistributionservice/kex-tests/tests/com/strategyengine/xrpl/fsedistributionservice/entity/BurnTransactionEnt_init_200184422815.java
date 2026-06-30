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

public class BurnTransactionEnt_init_200184422815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234999;
     Object term235013;
     Object term235015;
     Object term235017;

    public BurnTransactionEnt_init_200184422815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234999 = new Long(-6759247883224780481L);
        term235013 = new Long(-3724162247917461536L);
        term235015 = newInstance(Class.forName("java.util.Date"));
        setLongField(term235015, term235015.getClass(), "fastTime", 1629836163258L);
        setField(term235015, term235015.getClass(), "cdate", null);
        term235017 = newInstance(Class.forName("java.util.Date"));
        setLongField(term235017, term235017.getClass(), "fastTime", 1285528374666L);
        setField(term235017, term235017.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Long");
        argTypes[3] = Class.forName("java.util.Date");
        argTypes[4] = Class.forName("java.util.Date");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        Object[] args = new Object[8];
        args[0] = term234999;
        args[1] = "AibUFEALwF";
        args[2] = term235013;
        args[3] = term235015;
        args[4] = term235017;
        args[5] = "eXOUrXTrdW";
        args[6] = "aomDEETHep";
        args[7] = "GTMrlIYfIM";
        Object instance = callConstructor(klass, argTypes, args);
    }

};



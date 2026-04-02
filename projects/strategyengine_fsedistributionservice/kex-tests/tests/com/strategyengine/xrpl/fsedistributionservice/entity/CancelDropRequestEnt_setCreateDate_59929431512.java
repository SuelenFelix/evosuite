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

public class CancelDropRequestEnt_setCreateDate_59929431512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74;
     Object term81;

    public CancelDropRequestEnt_setCreateDate_59929431512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term75 = new Long(-2585684163342970173L);
        Long term79 = new Long(8059786003080744426L);
        term74 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt"));
        Object term77 = newInstance(Class.forName("java.util.Date"));
        setField(term74, term74.getClass(), "id", term75);
        setLongField(term77, term77.getClass(), "fastTime", 1797203628025L);
        setField(term77, term77.getClass(), "cdate", null);
        setField(term74, term74.getClass(), "createDate", term77);
        setField(term74, term74.getClass(), "dropRequestId", term79);
        term81 = newInstance(Class.forName("java.util.Date"));
        setLongField(term81, term81.getClass(), "fastTime", 1589457921030L);
        setField(term81, term81.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term81;
        callMethod(klass, "setCreateDate", argTypes, term74, args);
    }

};



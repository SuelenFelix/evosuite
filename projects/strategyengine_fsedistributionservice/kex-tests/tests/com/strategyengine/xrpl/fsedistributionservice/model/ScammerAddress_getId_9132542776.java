package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class ScammerAddress_getId_9132542776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567074;

    public ScammerAddress_getId_9132542776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term567075 = new Long(-3380318205328241107L);
        term567074 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress"));
        Object term567089 = newInstance(Class.forName("java.util.Date"));
        Object term567091 = newInstance(Class.forName("java.util.Date"));
        setField(term567074, term567074.getClass(), "id", term567075);
        setField(term567074, term567074.getClass(), "account", "upOvrKREfg");
        setLongField(term567089, term567089.getClass(), "fastTime", 1483357401283L);
        setField(term567089, term567089.getClass(), "cdate", null);
        setField(term567074, term567074.getClass(), "createDate", term567089);
        setLongField(term567091, term567091.getClass(), "fastTime", 1696891168552L);
        setField(term567091, term567091.getClass(), "cdate", null);
        setField(term567074, term567074.getClass(), "updateDate", term567091);
        setField(term567074, term567074.getClass(), "type", "vMForGnHtH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term567074, args);
    }

};



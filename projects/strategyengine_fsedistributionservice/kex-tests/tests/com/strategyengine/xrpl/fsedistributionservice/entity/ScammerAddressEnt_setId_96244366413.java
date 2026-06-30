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

public class ScammerAddressEnt_setId_96244366413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239453;
     Object term239484;

    public ScammerAddressEnt_setId_96244366413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239454 = new Long(-575923088526116016L);
        term239453 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt"));
        Object term239468 = newInstance(Class.forName("java.util.Date"));
        Object term239470 = newInstance(Class.forName("java.util.Date"));
        setField(term239453, term239453.getClass(), "id", term239454);
        setField(term239453, term239453.getClass(), "address", "RMTgBohsAX");
        setLongField(term239468, term239468.getClass(), "fastTime", 1483432592773L);
        setField(term239468, term239468.getClass(), "cdate", null);
        setField(term239453, term239453.getClass(), "createDate", term239468);
        setLongField(term239470, term239470.getClass(), "fastTime", 1784358717925L);
        setField(term239470, term239470.getClass(), "cdate", null);
        setField(term239453, term239453.getClass(), "updateDate", term239470);
        setField(term239453, term239453.getClass(), "type", "kdYeXJnJGG");
        term239484 = new Long(8912657350087595530L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term239484;
        callMethod(klass, "setId", argTypes, term239453, args);
    }

};



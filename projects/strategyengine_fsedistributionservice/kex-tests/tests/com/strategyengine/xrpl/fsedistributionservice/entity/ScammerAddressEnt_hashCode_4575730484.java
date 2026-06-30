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

public class ScammerAddressEnt_hashCode_4575730484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239046;

    public ScammerAddressEnt_hashCode_4575730484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239047 = new Long(-5414076154478910734L);
        term239046 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt"));
        Object term239061 = newInstance(Class.forName("java.util.Date"));
        Object term239063 = newInstance(Class.forName("java.util.Date"));
        setField(term239046, term239046.getClass(), "id", term239047);
        setField(term239046, term239046.getClass(), "address", "DLfgyAqDDu");
        setLongField(term239061, term239061.getClass(), "fastTime", 1653727759166L);
        setField(term239061, term239061.getClass(), "cdate", null);
        setField(term239046, term239046.getClass(), "createDate", term239061);
        setLongField(term239063, term239063.getClass(), "fastTime", 1595808360505L);
        setField(term239063, term239063.getClass(), "cdate", null);
        setField(term239046, term239046.getClass(), "updateDate", term239063);
        setField(term239046, term239046.getClass(), "type", "ryuQaXtwNj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term239046, args);
    }

};



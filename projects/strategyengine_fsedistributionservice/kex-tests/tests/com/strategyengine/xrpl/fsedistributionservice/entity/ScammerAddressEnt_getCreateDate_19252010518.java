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

public class ScammerAddressEnt_getCreateDate_19252010518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239250;

    public ScammerAddressEnt_getCreateDate_19252010518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239251 = new Long(-6903160242975707710L);
        term239250 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt"));
        Object term239265 = newInstance(Class.forName("java.util.Date"));
        Object term239267 = newInstance(Class.forName("java.util.Date"));
        setField(term239250, term239250.getClass(), "id", term239251);
        setField(term239250, term239250.getClass(), "address", "BmnUezUoWz");
        setLongField(term239265, term239265.getClass(), "fastTime", 1544984618651L);
        setField(term239265, term239265.getClass(), "cdate", null);
        setField(term239250, term239250.getClass(), "createDate", term239265);
        setLongField(term239267, term239267.getClass(), "fastTime", 1767113649745L);
        setField(term239267, term239267.getClass(), "cdate", null);
        setField(term239250, term239250.getClass(), "updateDate", term239267);
        setField(term239250, term239250.getClass(), "type", "QqeCgeRpIS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateDate", argTypes, term239250, args);
    }

};



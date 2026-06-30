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

public class CancelDropRequestEnt_getCreateDate_7096106197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;

    public CancelDropRequestEnt_getCreateDate_7096106197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term46 = new Long(-4325723315152823407L);
        Long term50 = new Long(2535595959091595249L);
        term45 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt"));
        Object term48 = newInstance(Class.forName("java.util.Date"));
        setField(term45, term45.getClass(), "id", term46);
        setLongField(term48, term48.getClass(), "fastTime", 1429023851389L);
        setField(term48, term48.getClass(), "cdate", null);
        setField(term45, term45.getClass(), "createDate", term48);
        setField(term45, term45.getClass(), "dropRequestId", term50);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateDate", argTypes, term45, args);
    }

};



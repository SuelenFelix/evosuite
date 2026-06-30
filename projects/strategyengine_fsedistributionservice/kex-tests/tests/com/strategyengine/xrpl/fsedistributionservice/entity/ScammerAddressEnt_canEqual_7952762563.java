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

public class ScammerAddressEnt_canEqual_7952762563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238994;
     Object term239025;

    public ScammerAddressEnt_canEqual_7952762563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238995 = new Long(6762397834421232825L);
        term238994 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt"));
        Object term239009 = newInstance(Class.forName("java.util.Date"));
        Object term239011 = newInstance(Class.forName("java.util.Date"));
        setField(term238994, term238994.getClass(), "id", term238995);
        setField(term238994, term238994.getClass(), "address", "zIAIXHeKXt");
        setLongField(term239009, term239009.getClass(), "fastTime", 1438864413263L);
        setField(term239009, term239009.getClass(), "cdate", null);
        setField(term238994, term238994.getClass(), "createDate", term239009);
        setLongField(term239011, term239011.getClass(), "fastTime", 1435818676311L);
        setField(term239011, term239011.getClass(), "cdate", null);
        setField(term238994, term238994.getClass(), "updateDate", term239011);
        setField(term238994, term238994.getClass(), "type", "fVkSkOqFEO");
        term239025 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term239025;
        callMethod(klass, "canEqual", argTypes, term238994, args);
    }

};



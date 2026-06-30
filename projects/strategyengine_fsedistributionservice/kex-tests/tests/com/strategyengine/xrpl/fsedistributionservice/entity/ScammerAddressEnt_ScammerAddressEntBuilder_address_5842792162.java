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

public class ScammerAddressEnt_ScammerAddressEntBuilder_address_5842792162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236042;

    public ScammerAddressEnt_ScammerAddressEntBuilder_address_5842792162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term236043 = new Long(6252795312796363233L);
        term236042 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt$ScammerAddressEntBuilder"));
        Object term236057 = newInstance(Class.forName("java.util.Date"));
        Object term236059 = newInstance(Class.forName("java.util.Date"));
        setField(term236042, term236042.getClass(), "id", term236043);
        setField(term236042, term236042.getClass(), "address", "KEoUMzNdMA");
        setLongField(term236057, term236057.getClass(), "fastTime", 1397509386466L);
        setField(term236057, term236057.getClass(), "cdate", null);
        setField(term236042, term236042.getClass(), "createDate", term236057);
        setLongField(term236059, term236059.getClass(), "fastTime", 1750200267099L);
        setField(term236059, term236059.getClass(), "cdate", null);
        setField(term236042, term236042.getClass(), "updateDate", term236059);
        setField(term236042, term236042.getClass(), "type", "SOsGYAgpgW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt$ScammerAddressEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZBafuLDRDM";
        callMethod(klass, "address", argTypes, term236042, args);
    }

};



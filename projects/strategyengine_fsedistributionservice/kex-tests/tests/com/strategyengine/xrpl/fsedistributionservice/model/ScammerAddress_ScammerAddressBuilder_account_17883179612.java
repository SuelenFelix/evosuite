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

public class ScammerAddress_ScammerAddressBuilder_account_17883179612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606055;

    public ScammerAddress_ScammerAddressBuilder_account_17883179612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term606056 = new Long(219518058983770018L);
        term606055 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress$ScammerAddressBuilder"));
        Object term606070 = newInstance(Class.forName("java.util.Date"));
        Object term606072 = newInstance(Class.forName("java.util.Date"));
        setField(term606055, term606055.getClass(), "id", term606056);
        setField(term606055, term606055.getClass(), "account", "BtZDkCvyCl");
        setLongField(term606070, term606070.getClass(), "fastTime", 1868719161148L);
        setField(term606070, term606070.getClass(), "cdate", null);
        setField(term606055, term606055.getClass(), "createDate", term606070);
        setLongField(term606072, term606072.getClass(), "fastTime", 1509286323486L);
        setField(term606072, term606072.getClass(), "cdate", null);
        setField(term606055, term606055.getClass(), "updateDate", term606072);
        setField(term606055, term606055.getClass(), "type", "EMcBwIYzOV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress$ScammerAddressBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IuZuqYNKVu";
        callMethod(klass, "account", argTypes, term606055, args);
    }

};



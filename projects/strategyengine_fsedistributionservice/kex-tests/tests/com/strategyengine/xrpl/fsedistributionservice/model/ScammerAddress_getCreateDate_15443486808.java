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

public class ScammerAddress_getCreateDate_15443486808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567176;

    public ScammerAddress_getCreateDate_15443486808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term567177 = new Long(-8031780876521881873L);
        term567176 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress"));
        Object term567191 = newInstance(Class.forName("java.util.Date"));
        Object term567193 = newInstance(Class.forName("java.util.Date"));
        setField(term567176, term567176.getClass(), "id", term567177);
        setField(term567176, term567176.getClass(), "account", "CVpwUkVCbY");
        setLongField(term567191, term567191.getClass(), "fastTime", 1377617539837L);
        setField(term567191, term567191.getClass(), "cdate", null);
        setField(term567176, term567176.getClass(), "createDate", term567191);
        setLongField(term567193, term567193.getClass(), "fastTime", 1880334807937L);
        setField(term567193, term567193.getClass(), "cdate", null);
        setField(term567176, term567176.getClass(), "updateDate", term567193);
        setField(term567176, term567176.getClass(), "type", "HELbjUlajR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateDate", argTypes, term567176, args);
    }

};



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

public class ScammerAddress_setId_134329603513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567379;
     Object term567410;

    public ScammerAddress_setId_134329603513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term567380 = new Long(8485617704048210611L);
        term567379 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress"));
        Object term567394 = newInstance(Class.forName("java.util.Date"));
        Object term567396 = newInstance(Class.forName("java.util.Date"));
        setField(term567379, term567379.getClass(), "id", term567380);
        setField(term567379, term567379.getClass(), "account", "iHpqtMMAFo");
        setLongField(term567394, term567394.getClass(), "fastTime", 1289986425973L);
        setField(term567394, term567394.getClass(), "cdate", null);
        setField(term567379, term567379.getClass(), "createDate", term567394);
        setLongField(term567396, term567396.getClass(), "fastTime", 1462164944182L);
        setField(term567396, term567396.getClass(), "cdate", null);
        setField(term567379, term567379.getClass(), "updateDate", term567396);
        setField(term567379, term567379.getClass(), "type", "AzJPrFTejS");
        term567410 = new Long(-2343035648899467663L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term567410;
        callMethod(klass, "setId", argTypes, term567379, args);
    }

};



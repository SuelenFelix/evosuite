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

public class ScammerAddress_setCreateDate_144171368215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567505;
     Object term567536;

    public ScammerAddress_setCreateDate_144171368215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term567506 = new Long(3144720397872891648L);
        term567505 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress"));
        Object term567520 = newInstance(Class.forName("java.util.Date"));
        Object term567522 = newInstance(Class.forName("java.util.Date"));
        setField(term567505, term567505.getClass(), "id", term567506);
        setField(term567505, term567505.getClass(), "account", "WLooWdtMun");
        setLongField(term567520, term567520.getClass(), "fastTime", 1361417520705L);
        setField(term567520, term567520.getClass(), "cdate", null);
        setField(term567505, term567505.getClass(), "createDate", term567520);
        setLongField(term567522, term567522.getClass(), "fastTime", 1264178441959L);
        setField(term567522, term567522.getClass(), "cdate", null);
        setField(term567505, term567505.getClass(), "updateDate", term567522);
        setField(term567505, term567505.getClass(), "type", "nMoLefpNTs");
        term567536 = newInstance(Class.forName("java.util.Date"));
        setLongField(term567536, term567536.getClass(), "fastTime", 1462817567217L);
        setField(term567536, term567536.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term567536;
        callMethod(klass, "setCreateDate", argTypes, term567505, args);
    }

};



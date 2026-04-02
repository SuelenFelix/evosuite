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

public class ScammerAddress_setType_56703749717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567611;

    public ScammerAddress_setType_56703749717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term567612 = new Long(9130132268364804177L);
        term567611 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress"));
        Object term567626 = newInstance(Class.forName("java.util.Date"));
        Object term567628 = newInstance(Class.forName("java.util.Date"));
        setField(term567611, term567611.getClass(), "id", term567612);
        setField(term567611, term567611.getClass(), "account", "WNiXGNcYjm");
        setLongField(term567626, term567626.getClass(), "fastTime", 1565126647490L);
        setField(term567626, term567626.getClass(), "cdate", null);
        setField(term567611, term567611.getClass(), "createDate", term567626);
        setLongField(term567628, term567628.getClass(), "fastTime", 1297839108896L);
        setField(term567628, term567628.getClass(), "cdate", null);
        setField(term567611, term567611.getClass(), "updateDate", term567628);
        setField(term567611, term567611.getClass(), "type", "nmtwfmagfX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kiIMTOKJXF";
        callMethod(klass, "setType", argTypes, term567611, args);
    }

};



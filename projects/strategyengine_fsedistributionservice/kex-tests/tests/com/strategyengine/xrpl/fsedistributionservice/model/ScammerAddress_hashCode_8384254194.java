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

public class ScammerAddress_hashCode_8384254194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566972;

    public ScammerAddress_hashCode_8384254194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term566973 = new Long(2008211696778135261L);
        term566972 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress"));
        Object term566987 = newInstance(Class.forName("java.util.Date"));
        Object term566989 = newInstance(Class.forName("java.util.Date"));
        setField(term566972, term566972.getClass(), "id", term566973);
        setField(term566972, term566972.getClass(), "account", "QLWISNFJbc");
        setLongField(term566987, term566987.getClass(), "fastTime", 1686468584013L);
        setField(term566987, term566987.getClass(), "cdate", null);
        setField(term566972, term566972.getClass(), "createDate", term566987);
        setLongField(term566989, term566989.getClass(), "fastTime", 1817597555760L);
        setField(term566989, term566989.getClass(), "cdate", null);
        setField(term566972, term566972.getClass(), "updateDate", term566989);
        setField(term566972, term566972.getClass(), "type", "xbmjEKbGpU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term566972, args);
    }

};



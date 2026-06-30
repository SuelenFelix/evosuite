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

public class SummaryResult_SummaryResultBuilder_id_12904051641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236403;
     Object term236408;

    public SummaryResult_SummaryResultBuilder_id_12904051641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term236404 = new Long(7065003857377879971L);
        Long term236406 = new Long(2243864141567980599L);
        term236403 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.SummaryResult$SummaryResultBuilder"));
        setField(term236403, term236403.getClass(), "id", term236404);
        setField(term236403, term236403.getClass(), "count", term236406);
        term236408 = new Long(353705949229610067L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.SummaryResult$SummaryResultBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term236408;
        callMethod(klass, "id", argTypes, term236403, args);
    }

};



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
import java.lang.Boolean;

public class AirdropStatus_init_1980144063103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313459;
     Object term313461;

    public AirdropStatus_init_1980144063103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313459 = new Boolean(false);
        term313461 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[30];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.util.Date");
        argTypes[3] = Class.forName("java.util.Date");
        argTypes[4] = Class.forName("java.util.Date");
        argTypes[5] = Class.forName("java.util.Date");
        argTypes[6] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        argTypes[7] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = Class.forName("java.lang.String");
        argTypes[13] = boolean.class;
        argTypes[14] = boolean.class;
        argTypes[15] = Class.forName("java.lang.Integer");
        argTypes[16] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        argTypes[17] = Class.forName("java.lang.String");
        argTypes[18] = Class.forName("java.lang.String");
        argTypes[19] = Class.forName("java.lang.String");
        argTypes[20] = Class.forName("java.lang.Long");
        argTypes[21] = Class.forName("java.lang.String");
        argTypes[22] = Class.forName("java.lang.Long");
        argTypes[23] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        argTypes[24] = Class.forName("java.lang.String");
        argTypes[25] = Class.forName("java.lang.String");
        argTypes[26] = Class.forName("java.lang.String");
        argTypes[27] = Class.forName("java.lang.String");
        argTypes[28] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        argTypes[29] = Class.forName("java.lang.Long");
        Object[] args = new Object[30];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        args[8] = null;
        args[9] = null;
        args[10] = null;
        args[11] = null;
        args[12] = null;
        args[13] = term313459;
        args[14] = term313461;
        args[15] = null;
        args[16] = null;
        args[17] = null;
        args[18] = null;
        args[19] = null;
        args[20] = null;
        args[21] = null;
        args[22] = null;
        args[23] = null;
        args[24] = null;
        args[25] = null;
        args[26] = null;
        args[27] = null;
        args[28] = null;
        args[29] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



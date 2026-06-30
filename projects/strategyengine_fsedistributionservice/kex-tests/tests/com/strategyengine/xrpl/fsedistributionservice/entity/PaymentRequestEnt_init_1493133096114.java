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

public class PaymentRequestEnt_init_1493133096114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public PaymentRequestEnt_init_1493133096114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[33];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.Date");
        argTypes[4] = Class.forName("java.util.Date");
        argTypes[5] = Class.forName("java.util.Date");
        argTypes[6] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = Class.forName("java.lang.String");
        argTypes[13] = Class.forName("java.lang.String");
        argTypes[14] = Class.forName("java.lang.String");
        argTypes[15] = Class.forName("java.lang.String");
        argTypes[16] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        argTypes[17] = Class.forName("java.lang.Boolean");
        argTypes[18] = Class.forName("java.lang.Boolean");
        argTypes[19] = Class.forName("java.lang.Integer");
        argTypes[20] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        argTypes[21] = Class.forName("java.lang.String");
        argTypes[22] = Class.forName("java.lang.String");
        argTypes[23] = Class.forName("java.lang.String");
        argTypes[24] = Class.forName("java.lang.String");
        argTypes[25] = Class.forName("java.lang.String");
        argTypes[26] = Class.forName("java.lang.String");
        argTypes[27] = Class.forName("java.lang.Long");
        argTypes[28] = Class.forName("java.lang.String");
        argTypes[29] = Class.forName("java.lang.Long");
        argTypes[30] = Class.forName("java.lang.String");
        argTypes[31] = Class.forName("java.lang.Boolean");
        argTypes[32] = Class.forName("java.lang.String");
        Object[] args = new Object[33];
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
        args[13] = null;
        args[14] = null;
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
        args[30] = null;
        args[31] = null;
        args[32] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



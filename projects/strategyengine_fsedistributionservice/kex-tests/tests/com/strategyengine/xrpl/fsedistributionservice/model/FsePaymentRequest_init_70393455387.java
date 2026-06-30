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

public class FsePaymentRequest_init_70393455387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406166;
     Object term406168;
     Object term406170;
     Object term406172;

    public FsePaymentRequest_init_70393455387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406166 = new Boolean(false);
        term406168 = new Boolean(false);
        term406170 = new Boolean(false);
        term406172 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[24];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.util.List");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.util.Date");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = boolean.class;
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = boolean.class;
        argTypes[13] = boolean.class;
        argTypes[14] = Class.forName("java.lang.Long");
        argTypes[15] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        argTypes[16] = Class.forName("java.lang.String");
        argTypes[17] = Class.forName("java.lang.String");
        argTypes[18] = Class.forName("java.lang.String");
        argTypes[19] = Class.forName("java.lang.Long");
        argTypes[20] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        argTypes[21] = Class.forName("java.util.Date");
        argTypes[22] = Class.forName("java.lang.String");
        argTypes[23] = boolean.class;
        Object[] args = new Object[24];
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
        args[10] = term406166;
        args[11] = null;
        args[12] = term406168;
        args[13] = term406170;
        args[14] = null;
        args[15] = null;
        args[16] = null;
        args[17] = null;
        args[18] = null;
        args[19] = null;
        args[20] = null;
        args[21] = null;
        args[22] = null;
        args[23] = term406172;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



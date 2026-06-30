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
import java.util.LinkedList;

public class PaymentsChange_init_58792142610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11034;
     Object term11048;

    public PaymentsChange_init_58792142610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11034 = new Long(-6573104506744284592L);
        term11048 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = term11034;
        args[1] = "DyiXbeYIaN";
        args[2] = term11048;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



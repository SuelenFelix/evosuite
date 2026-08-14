package com.praveen.drools.example.service;

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
import static com.praveen.drools.example.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class CustomerCategorizeService_getCustomerType_9047729830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public CustomerCategorizeService_getCustomerType_9047729830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3 = new Integer(568599855);
        Integer term17 = new Integer(1162663216);
        term1 = newInstance(Class.forName("com.praveen.drools.example.model.CustomerRequest"));
        setLongField(term1, term1.getClass(), "id", 2442117782898005296L);
        setField(term1, term1.getClass(), "age", term3);
        setField(term1, term1.getClass(), "gender", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "numberOfOrders", term17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.praveen.drools.example.service.CustomerCategorizeService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.praveen.drools.example.model.CustomerRequest");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "getCustomerType", argTypes, null, args);
    }

};



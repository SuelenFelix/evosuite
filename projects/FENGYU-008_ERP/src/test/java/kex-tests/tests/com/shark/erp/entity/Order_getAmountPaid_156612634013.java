package com.shark.erp.entity;

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
import static com.shark.erp.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Order_getAmountPaid_156612634013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4467;

    public Order_getAmountPaid_156612634013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4467 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term4467, term4467.getClass(), "id", -209654048);
        setIntField(term4467, term4467.getClass(), "goodsId", 477625804);
        setField(term4467, term4467.getClass(), "goodsName", "xtftXXMbem");
        setIntField(term4467, term4467.getClass(), "customerId", 252575029);
        setIntField(term4467, term4467.getClass(), "quantity", 57189932);
        setDoubleField(term4467, term4467.getClass(), "amountPayable", 0.6862221294683138);
        setDoubleField(term4467, term4467.getClass(), "amountPaid", 0.15917839663695388);
        setDoubleField(term4467, term4467.getClass(), "change", 0.9374115574082594);
        setIntField(term4467, term4467.getClass(), "point", 1460722225);
        setField(term4467, term4467.getClass(), "salesTime", "cudZvLMQon");
        setField(term4467, term4467.getClass(), "state", "lihXWlGDxk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAmountPaid", argTypes, term4467, args);
    }

};



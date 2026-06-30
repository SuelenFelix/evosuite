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

public class Order_getQuantity_19354873989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4163;

    public Order_getQuantity_19354873989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4163 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term4163, term4163.getClass(), "id", -75206835);
        setIntField(term4163, term4163.getClass(), "goodsId", -1618206977);
        setField(term4163, term4163.getClass(), "goodsName", "BRIVNtfUWU");
        setIntField(term4163, term4163.getClass(), "customerId", -1747406163);
        setIntField(term4163, term4163.getClass(), "quantity", 388157121);
        setDoubleField(term4163, term4163.getClass(), "amountPayable", 0.07802449704920456);
        setDoubleField(term4163, term4163.getClass(), "amountPaid", 0.5279279537140873);
        setDoubleField(term4163, term4163.getClass(), "change", 0.3202192021706908);
        setIntField(term4163, term4163.getClass(), "point", 1684998508);
        setField(term4163, term4163.getClass(), "salesTime", "DbiCVtPPCT");
        setField(term4163, term4163.getClass(), "state", "WzFopsaDuG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuantity", argTypes, term4163, args);
    }

};



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

public class Order_setSalesTime_55544595120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4998;

    public Order_setSalesTime_55544595120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4998 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term4998, term4998.getClass(), "id", -1656687479);
        setIntField(term4998, term4998.getClass(), "goodsId", -249614216);
        setField(term4998, term4998.getClass(), "goodsName", "PgPzMSEjjX");
        setIntField(term4998, term4998.getClass(), "customerId", 1870727665);
        setIntField(term4998, term4998.getClass(), "quantity", -519881101);
        setDoubleField(term4998, term4998.getClass(), "amountPayable", 0.36226058076369927);
        setDoubleField(term4998, term4998.getClass(), "amountPaid", 0.03699061125289671);
        setDoubleField(term4998, term4998.getClass(), "change", 0.6047137830113202);
        setIntField(term4998, term4998.getClass(), "point", -680920524);
        setField(term4998, term4998.getClass(), "salesTime", "wzsPSPcRdj");
        setField(term4998, term4998.getClass(), "state", "kGMQdqJYyB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XJJNClzHRf";
        callMethod(klass, "setSalesTime", argTypes, term4998, args);
    }

};



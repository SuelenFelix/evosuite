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

public class Purchase_getPurchaseTime_15592236911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1667;

    public Purchase_getPurchaseTime_15592236911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1667 = newInstance(Class.forName("com.shark.erp.entity.Purchase"));
        setIntField(term1667, term1667.getClass(), "id", -344842608);
        setIntField(term1667, term1667.getClass(), "goodsId", 941650513);
        setField(term1667, term1667.getClass(), "supplier", "kBdSllIBVz");
        setIntField(term1667, term1667.getClass(), "quantity", 444029505);
        setDoubleField(term1667, term1667.getClass(), "purchasePrice", 0.5183269973490326);
        setField(term1667, term1667.getClass(), "purchaseTime", "TJmVBGfTML");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Purchase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPurchaseTime", argTypes, term1667, args);
    }

};



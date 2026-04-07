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

public class ReturnGoods_getReturnTime_179089738311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3129;

    public ReturnGoods_getReturnTime_179089738311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3129 = newInstance(Class.forName("com.shark.erp.entity.ReturnGoods"));
        setIntField(term3129, term3129.getClass(), "id", -461771056);
        setIntField(term3129, term3129.getClass(), "goodsId", -243422082);
        setField(term3129, term3129.getClass(), "goodsName", "XOiDvlDhdc");
        setIntField(term3129, term3129.getClass(), "customerId", 1384592638);
        setIntField(term3129, term3129.getClass(), "orderId", -1002370457);
        setField(term3129, term3129.getClass(), "returnTime", "AdxvLJhNLe");
        setField(term3129, term3129.getClass(), "state", "lHfTrWKMPk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ReturnGoods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReturnTime", argTypes, term3129, args);
    }

};



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

public class ReturnGoods_setReturnTime_105434878512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3200;

    public ReturnGoods_setReturnTime_105434878512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3200 = newInstance(Class.forName("com.shark.erp.entity.ReturnGoods"));
        setIntField(term3200, term3200.getClass(), "id", -2014576105);
        setIntField(term3200, term3200.getClass(), "goodsId", 1296895584);
        setField(term3200, term3200.getClass(), "goodsName", "JDaAnsVTGV");
        setIntField(term3200, term3200.getClass(), "customerId", 628918458);
        setIntField(term3200, term3200.getClass(), "orderId", -1274456137);
        setField(term3200, term3200.getClass(), "returnTime", "mLUZFTfjle");
        setField(term3200, term3200.getClass(), "state", "xIeFjkHkOe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ReturnGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SdCKLMIYnX";
        callMethod(klass, "setReturnTime", argTypes, term3200, args);
    }

};



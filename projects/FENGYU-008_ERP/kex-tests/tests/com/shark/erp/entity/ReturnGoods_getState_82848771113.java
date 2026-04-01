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

public class ReturnGoods_getState_82848771113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3293;

    public ReturnGoods_getState_82848771113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3293 = newInstance(Class.forName("com.shark.erp.entity.ReturnGoods"));
        setIntField(term3293, term3293.getClass(), "id", 1041916673);
        setIntField(term3293, term3293.getClass(), "goodsId", -601863069);
        setField(term3293, term3293.getClass(), "goodsName", "OJJtVNPyKZ");
        setIntField(term3293, term3293.getClass(), "customerId", 663292551);
        setIntField(term3293, term3293.getClass(), "orderId", -1885090354);
        setField(term3293, term3293.getClass(), "returnTime", "AKNapTAfmD");
        setField(term3293, term3293.getClass(), "state", "xJgPlLxpgC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ReturnGoods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term3293, args);
    }

};



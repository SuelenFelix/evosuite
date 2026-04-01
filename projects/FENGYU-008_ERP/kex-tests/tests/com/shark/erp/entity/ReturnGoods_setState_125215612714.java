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

public class ReturnGoods_setState_125215612714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3364;

    public ReturnGoods_setState_125215612714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3364 = newInstance(Class.forName("com.shark.erp.entity.ReturnGoods"));
        setIntField(term3364, term3364.getClass(), "id", -2066804303);
        setIntField(term3364, term3364.getClass(), "goodsId", -1731761810);
        setField(term3364, term3364.getClass(), "goodsName", "EYtfuJaxiM");
        setIntField(term3364, term3364.getClass(), "customerId", 197109649);
        setIntField(term3364, term3364.getClass(), "orderId", -1239406390);
        setField(term3364, term3364.getClass(), "returnTime", "gCWtLVKVVe");
        setField(term3364, term3364.getClass(), "state", "fWKJoSoCwE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ReturnGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wfaXBpWAUH";
        callMethod(klass, "setState", argTypes, term3364, args);
    }

};



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

public class ReturnGoods_setGoodsName_4531751516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2748;

    public ReturnGoods_setGoodsName_4531751516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2748 = newInstance(Class.forName("com.shark.erp.entity.ReturnGoods"));
        setIntField(term2748, term2748.getClass(), "id", -1565502840);
        setIntField(term2748, term2748.getClass(), "goodsId", 344323424);
        setField(term2748, term2748.getClass(), "goodsName", "sEnIVFtZuQ");
        setIntField(term2748, term2748.getClass(), "customerId", 9726679);
        setIntField(term2748, term2748.getClass(), "orderId", -25637976);
        setField(term2748, term2748.getClass(), "returnTime", "ZVecLZMLHF");
        setField(term2748, term2748.getClass(), "state", "fztQhjqwdP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ReturnGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eVpkWxjuki";
        callMethod(klass, "setGoodsName", argTypes, term2748, args);
    }

};



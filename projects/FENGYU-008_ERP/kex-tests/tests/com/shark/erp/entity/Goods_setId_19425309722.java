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
import java.lang.Integer;

public class Goods_setId_19425309722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5869;
     Object term5933;

    public Goods_setId_19425309722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5869 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term5869, term5869.getClass(), "id", 993388358);
        setField(term5869, term5869.getClass(), "category", "GZdcJyZntS");
        setField(term5869, term5869.getClass(), "goodsName", "OIHoJeysUi");
        setField(term5869, term5869.getClass(), "productionTime", "WXMWFDGcLB");
        setField(term5869, term5869.getClass(), "purchaseTime", "wKWbJssZuG");
        setField(term5869, term5869.getClass(), "expirationTime", "NzBMMhkhpT");
        setDoubleField(term5869, term5869.getClass(), "unitPrice", 0.32237559209193944);
        setIntField(term5869, term5869.getClass(), "inventory", -765191335);
        term5933 = new Integer(-1697741155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5933;
        callMethod(klass, "setId", argTypes, term5869, args);
    }

};



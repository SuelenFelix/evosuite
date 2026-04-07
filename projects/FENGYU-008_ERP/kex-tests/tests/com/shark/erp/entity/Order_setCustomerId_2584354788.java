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

public class Order_setCustomerId_2584354788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4086;
     Object term4131;

    public Order_setCustomerId_2584354788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4086 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term4086, term4086.getClass(), "id", -2131181468);
        setIntField(term4086, term4086.getClass(), "goodsId", 282916351);
        setField(term4086, term4086.getClass(), "goodsName", "hMmaoREuCK");
        setIntField(term4086, term4086.getClass(), "customerId", 880977281);
        setIntField(term4086, term4086.getClass(), "quantity", 371943306);
        setDoubleField(term4086, term4086.getClass(), "amountPayable", 0.9737083944266686);
        setDoubleField(term4086, term4086.getClass(), "amountPaid", 0.0668892744806211);
        setDoubleField(term4086, term4086.getClass(), "change", 0.3587267442738795);
        setIntField(term4086, term4086.getClass(), "point", 982388293);
        setField(term4086, term4086.getClass(), "salesTime", "VeDtgDzGAN");
        setField(term4086, term4086.getClass(), "state", "aWYOWZFyaX");
        term4131 = new Integer(-159494544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4131;
        callMethod(klass, "setCustomerId", argTypes, term4086, args);
    }

};



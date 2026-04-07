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

public class Purchase_getId_5577296071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1147;

    public Purchase_getId_5577296071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1147 = newInstance(Class.forName("com.shark.erp.entity.Purchase"));
        setIntField(term1147, term1147.getClass(), "id", 1596070772);
        setIntField(term1147, term1147.getClass(), "goodsId", 97029295);
        setField(term1147, term1147.getClass(), "supplier", "GzFkzHGYFt");
        setIntField(term1147, term1147.getClass(), "quantity", -1371869594);
        setDoubleField(term1147, term1147.getClass(), "purchasePrice", 0.13238746331190498);
        setField(term1147, term1147.getClass(), "purchaseTime", "tShwQLRGNe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Purchase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1147, args);
    }

};



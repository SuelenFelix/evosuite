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

public class Goods_getUnitPrice_68566196713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7235;

    public Goods_getUnitPrice_68566196713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7235 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term7235, term7235.getClass(), "id", -288604325);
        setField(term7235, term7235.getClass(), "category", "NBrvVzvQHe");
        setField(term7235, term7235.getClass(), "goodsName", "FjOiNAfBOc");
        setField(term7235, term7235.getClass(), "productionTime", "iCCsaLHohG");
        setField(term7235, term7235.getClass(), "purchaseTime", "NJhGgctbdj");
        setField(term7235, term7235.getClass(), "expirationTime", "MYWYUeLGOp");
        setDoubleField(term7235, term7235.getClass(), "unitPrice", 0.16988691727397487);
        setIntField(term7235, term7235.getClass(), "inventory", -1268314569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnitPrice", argTypes, term7235, args);
    }

};



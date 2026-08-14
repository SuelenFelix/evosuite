package com.example.web_shop.service.Impl;

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
import static com.example.web_shop.service.Impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ShoppingCartServiceImpl_removeProduct_3227187052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130;
     Object term137;

    public ShoppingCartServiceImpl_removeProduct_3227187052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term131 = new LinkedHashMap();
        term130 = newInstance(Class.forName("com.example.web_shop.service.Impl.ShoppingCartServiceImpl"));
        setField(term130, term130.getClass(), "cart", term131);
        HashMap term166 = new HashMap();
        Set<Object> term232 =  ((Map) term166).keySet();
        HashSet term165 = new HashSet((Collection<? extends Object>) term232);
        term137 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        Object term151 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        Object term195 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term196 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term198 = (int[]) newIntArray(6);
        setLongField(term137, term137.getClass(), "id", -8257434502486459194L);
        setField(term137, term137.getClass(), "name", "jJCZpVmanW");
        setLongField(term151, term151.getClass(), "id", -8400487765614892086L);
        setField(term151, term151.getClass(), "categoryName", "EGtDIRbSSb");
        setField(term151, term151.getClass(), "books", term165);
        setField(term137, term137.getClass(), "category", term151);
        setField(term137, term137.getClass(), "description", "SzjVpOQTyS");
        setField(term137, term137.getClass(), "image_url", "MjGYSRKTNF");
        setIntField(term196, term196.getClass(), "signum", 1);
        setIntElement(term198, 0, 2364);
        setIntElement(term198, 1, -1446584625);
        setIntElement(term198, 2, 1957600567);
        setIntElement(term198, 3, -336418707);
        setIntElement(term198, 4, -1905211145);
        setIntElement(term198, 5, 86968353);
        setField(term196, term196.getClass(), "mag", term198);
        setIntField(term196, term196.getClass(), "bitCountPlusOne", 0);
        setIntField(term196, term196.getClass(), "bitLengthPlusOne", 0);
        setIntField(term196, term196.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term196, term196.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term195, term195.getClass(), "intVal", term196);
        setIntField(term195, term195.getClass(), "scale", 52);
        setIntField(term195, term195.getClass(), "precision", 0);
        setField(term195, term195.getClass(), "stringCache", null);
        setLongField(term195, term195.getClass(), "intCompact", -9223372036854775808L);
        setField(term137, term137.getClass(), "price", term195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.service.Impl.ShoppingCartServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.web_shop.entity.Product");
        Object[] args = new Object[1];
        args[0] = term137;
        callMethod(klass, "removeProduct", argTypes, term130, args);
    }

};



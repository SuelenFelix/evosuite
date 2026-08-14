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

public class ShoppingCartServiceImpl_addProduct_17227460021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term8;

    public ShoppingCartServiceImpl_addProduct_17227460021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term2 = new LinkedHashMap();
        term1 = newInstance(Class.forName("com.example.web_shop.service.Impl.ShoppingCartServiceImpl"));
        setField(term1, term1.getClass(), "cart", term2);
        HashMap term37 = new HashMap();
        Set<Object> term103 =  ((Map) term37).keySet();
        HashSet term36 = new HashSet((Collection<? extends Object>) term103);
        term8 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        Object term22 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        Object term66 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term67 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term69 = (int[]) newIntArray(6);
        setLongField(term8, term8.getClass(), "id", 2442117782898005296L);
        setField(term8, term8.getClass(), "name", "PAEBtnZtTD");
        setLongField(term22, term22.getClass(), "id", 6375119433582206027L);
        setField(term22, term22.getClass(), "categoryName", "sjlJAEtRrb");
        setField(term22, term22.getClass(), "books", term36);
        setField(term8, term8.getClass(), "category", term22);
        setField(term8, term8.getClass(), "description", "MuLcgQHgqz");
        setField(term8, term8.getClass(), "image_url", "xxtlPwDYFs");
        setIntField(term67, term67.getClass(), "signum", 1);
        setIntElement(term69, 0, 9058);
        setIntElement(term69, 1, 1365043541);
        setIntElement(term69, 2, 1239861896);
        setIntElement(term69, 3, -1338148297);
        setIntElement(term69, 4, -418263970);
        setIntElement(term69, 5, -265097411);
        setField(term67, term67.getClass(), "mag", term69);
        setIntField(term67, term67.getClass(), "bitCountPlusOne", 0);
        setIntField(term67, term67.getClass(), "bitLengthPlusOne", 0);
        setIntField(term67, term67.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term67, term67.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term66, term66.getClass(), "intVal", term67);
        setIntField(term66, term66.getClass(), "scale", 53);
        setIntField(term66, term66.getClass(), "precision", 0);
        setField(term66, term66.getClass(), "stringCache", null);
        setLongField(term66, term66.getClass(), "intCompact", -9223372036854775808L);
        setField(term8, term8.getClass(), "price", term66);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.service.Impl.ShoppingCartServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.web_shop.entity.Product");
        Object[] args = new Object[1];
        args[0] = term8;
        callMethod(klass, "addProduct", argTypes, term1, args);
    }

};



package com.fatihhernn.ecommerce.entities;

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
import static com.fatihhernn.ecommerce.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Product_getImageUrl_4964484107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2132;

    public Product_getImageUrl_4964484107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2133 = new Long(3452833434644634217L);
        Long term2136 = new Long(-8603648071751666348L);
        HashMap term2151 = new HashMap();
        Set<Object> term2237 =  ((Map) term2151).keySet();
        HashSet term2150 = new HashSet((Collection<? extends Object>) term2237);
        term2132 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term2135 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term2192 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2193 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2195 = (int[]) newIntArray(6);
        Object term2223 = newInstance(Class.forName("java.util.Date"));
        Object term2225 = newInstance(Class.forName("java.util.Date"));
        setField(term2132, term2132.getClass(), "id", term2133);
        setField(term2135, term2135.getClass(), "id", term2136);
        setField(term2135, term2135.getClass(), "categoryName", "JdOMfNWgLP");
        setField(term2135, term2135.getClass(), "products", term2150);
        setField(term2132, term2132.getClass(), "category", term2135);
        setField(term2132, term2132.getClass(), "sku", "uWqXrwAsDU");
        setField(term2132, term2132.getClass(), "name", "hgFbWAUtsu");
        setField(term2132, term2132.getClass(), "description", "HqoTWlkbwF");
        setIntField(term2193, term2193.getClass(), "signum", 1);
        setIntElement(term2195, 0, 10019);
        setIntElement(term2195, 1, 1068910244);
        setIntElement(term2195, 2, -144922776);
        setIntElement(term2195, 3, 1698242623);
        setIntElement(term2195, 4, -217106671);
        setIntElement(term2195, 5, 25951329);
        setField(term2193, term2193.getClass(), "mag", term2195);
        setIntField(term2193, term2193.getClass(), "bitCountPlusOne", 0);
        setIntField(term2193, term2193.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2193, term2193.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2193, term2193.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2192, term2192.getClass(), "intVal", term2193);
        setIntField(term2192, term2192.getClass(), "scale", 53);
        setIntField(term2192, term2192.getClass(), "precision", 0);
        setField(term2192, term2192.getClass(), "stringCache", null);
        setLongField(term2192, term2192.getClass(), "intCompact", -9223372036854775808L);
        setField(term2132, term2132.getClass(), "unitPrice", term2192);
        setField(term2132, term2132.getClass(), "imageUrl", "CwNELDTAPP");
        setBooleanField(term2132, term2132.getClass(), "active", false);
        setIntField(term2132, term2132.getClass(), "unitsInStock", -2131181468);
        setLongField(term2223, term2223.getClass(), "fastTime", 1379588514567L);
        setField(term2223, term2223.getClass(), "cdate", null);
        setField(term2132, term2132.getClass(), "dateCreated", term2223);
        setLongField(term2225, term2225.getClass(), "fastTime", 1416359920111L);
        setField(term2225, term2225.getClass(), "cdate", null);
        setField(term2132, term2132.getClass(), "lastUpdated", term2225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term2132, args);
    }

};



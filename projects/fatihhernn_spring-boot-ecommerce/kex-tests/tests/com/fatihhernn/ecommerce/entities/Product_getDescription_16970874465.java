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

public class Product_getDescription_16970874465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1826;

    public Product_getDescription_16970874465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1827 = new Long(-6432617521836576658L);
        Long term1830 = new Long(-2255965562447970862L);
        HashMap term1845 = new HashMap();
        Set<Object> term1932 =  ((Map) term1845).keySet();
        HashSet term1844 = new HashSet((Collection<? extends Object>) term1932);
        term1826 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term1829 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term1887 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1888 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1890 = (int[]) newIntArray(6);
        Object term1918 = newInstance(Class.forName("java.util.Date"));
        Object term1920 = newInstance(Class.forName("java.util.Date"));
        setField(term1826, term1826.getClass(), "id", term1827);
        setField(term1829, term1829.getClass(), "id", term1830);
        setField(term1829, term1829.getClass(), "categoryName", "vMsWjuPTnO");
        setField(term1829, term1829.getClass(), "products", term1844);
        setField(term1826, term1826.getClass(), "category", term1829);
        setField(term1826, term1826.getClass(), "sku", "fbnKvthhOz");
        setField(term1826, term1826.getClass(), "name", "PGfCDJTBek");
        setField(term1826, term1826.getClass(), "description", "ZwjARhAtHC");
        setIntField(term1888, term1888.getClass(), "signum", 1);
        setIntElement(term1890, 0, 186);
        setIntElement(term1890, 1, -904763891);
        setIntElement(term1890, 2, 1070176067);
        setIntElement(term1890, 3, 1699334566);
        setIntElement(term1890, 4, 706694897);
        setIntElement(term1890, 5, -870914817);
        setField(term1888, term1888.getClass(), "mag", term1890);
        setIntField(term1888, term1888.getClass(), "bitCountPlusOne", 0);
        setIntField(term1888, term1888.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1888, term1888.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1888, term1888.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1887, term1887.getClass(), "intVal", term1888);
        setIntField(term1887, term1887.getClass(), "scale", 53);
        setIntField(term1887, term1887.getClass(), "precision", 0);
        setField(term1887, term1887.getClass(), "stringCache", null);
        setLongField(term1887, term1887.getClass(), "intCompact", -9223372036854775808L);
        setField(term1826, term1826.getClass(), "unitPrice", term1887);
        setField(term1826, term1826.getClass(), "imageUrl", "XXvscsYBWv");
        setBooleanField(term1826, term1826.getClass(), "active", true);
        setIntField(term1826, term1826.getClass(), "unitsInStock", 806595993);
        setLongField(term1918, term1918.getClass(), "fastTime", 1840780783490L);
        setField(term1918, term1918.getClass(), "cdate", null);
        setField(term1826, term1826.getClass(), "dateCreated", term1918);
        setLongField(term1920, term1920.getClass(), "fastTime", 1402603630583L);
        setField(term1920, term1920.getClass(), "cdate", null);
        setField(term1826, term1826.getClass(), "lastUpdated", term1920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term1826, args);
    }

};



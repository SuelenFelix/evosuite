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

public class Product_getCategory_21039916012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1367;

    public Product_getCategory_21039916012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1368 = new Long(-8085190702504231560L);
        Long term1371 = new Long(1672578078364590450L);
        HashMap term1386 = new HashMap();
        Set<Object> term1473 =  ((Map) term1386).keySet();
        HashSet term1385 = new HashSet((Collection<? extends Object>) term1473);
        term1367 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term1370 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term1428 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1429 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1431 = (int[]) newIntArray(6);
        Object term1459 = newInstance(Class.forName("java.util.Date"));
        Object term1461 = newInstance(Class.forName("java.util.Date"));
        setField(term1367, term1367.getClass(), "id", term1368);
        setField(term1370, term1370.getClass(), "id", term1371);
        setField(term1370, term1370.getClass(), "categoryName", "bxyfeicqrK");
        setField(term1370, term1370.getClass(), "products", term1385);
        setField(term1367, term1367.getClass(), "category", term1370);
        setField(term1367, term1367.getClass(), "sku", "BWxJSgKHRT");
        setField(term1367, term1367.getClass(), "name", "AGXoIndFnm");
        setField(term1367, term1367.getClass(), "description", "mwmFMNEzkK");
        setIntField(term1429, term1429.getClass(), "signum", 1);
        setIntElement(term1431, 0, 29652);
        setIntElement(term1431, 1, -2060047100);
        setIntElement(term1431, 2, 1632887548);
        setIntElement(term1431, 3, 552729650);
        setIntElement(term1431, 4, 1012508025);
        setIntElement(term1431, 5, 1261026219);
        setField(term1429, term1429.getClass(), "mag", term1431);
        setIntField(term1429, term1429.getClass(), "bitCountPlusOne", 0);
        setIntField(term1429, term1429.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1429, term1429.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1429, term1429.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1428, term1428.getClass(), "intVal", term1429);
        setIntField(term1428, term1428.getClass(), "scale", 53);
        setIntField(term1428, term1428.getClass(), "precision", 0);
        setField(term1428, term1428.getClass(), "stringCache", null);
        setLongField(term1428, term1428.getClass(), "intCompact", -9223372036854775808L);
        setField(term1367, term1367.getClass(), "unitPrice", term1428);
        setField(term1367, term1367.getClass(), "imageUrl", "kVAmKknVln");
        setBooleanField(term1367, term1367.getClass(), "active", false);
        setIntField(term1367, term1367.getClass(), "unitsInStock", -1899301124);
        setLongField(term1459, term1459.getClass(), "fastTime", 1862657813973L);
        setField(term1459, term1459.getClass(), "cdate", null);
        setField(term1367, term1367.getClass(), "dateCreated", term1459);
        setLongField(term1461, term1461.getClass(), "fastTime", 1299431078379L);
        setField(term1461, term1461.getClass(), "cdate", null);
        setField(term1367, term1367.getClass(), "lastUpdated", term1461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term1367, args);
    }

};



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

public class Product_setName_31435600915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3416;

    public Product_setName_31435600915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3417 = new Long(-2986201902216133814L);
        Long term3420 = new Long(4255811647459029682L);
        HashMap term3435 = new HashMap();
        Set<Object> term3534 =  ((Map) term3435).keySet();
        HashSet term3434 = new HashSet((Collection<? extends Object>) term3534);
        term3416 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term3419 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term3477 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3478 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3480 = (int[]) newIntArray(6);
        Object term3508 = newInstance(Class.forName("java.util.Date"));
        Object term3510 = newInstance(Class.forName("java.util.Date"));
        setField(term3416, term3416.getClass(), "id", term3417);
        setField(term3419, term3419.getClass(), "id", term3420);
        setField(term3419, term3419.getClass(), "categoryName", "NNMBrIWEBw");
        setField(term3419, term3419.getClass(), "products", term3434);
        setField(term3416, term3416.getClass(), "category", term3419);
        setField(term3416, term3416.getClass(), "sku", "PVykkUSgBq");
        setField(term3416, term3416.getClass(), "name", "tnKbZaCsuj");
        setField(term3416, term3416.getClass(), "description", "ZFpcYBgLNC");
        setIntField(term3478, term3478.getClass(), "signum", 1);
        setIntElement(term3480, 0, 450);
        setIntElement(term3480, 1, -2117852227);
        setIntElement(term3480, 2, 1033295569);
        setIntElement(term3480, 3, -1169279404);
        setIntElement(term3480, 4, 1199729184);
        setIntElement(term3480, 5, -1178213705);
        setField(term3478, term3478.getClass(), "mag", term3480);
        setIntField(term3478, term3478.getClass(), "bitCountPlusOne", 0);
        setIntField(term3478, term3478.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3478, term3478.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3478, term3478.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3477, term3477.getClass(), "intVal", term3478);
        setIntField(term3477, term3477.getClass(), "scale", 51);
        setIntField(term3477, term3477.getClass(), "precision", 0);
        setField(term3477, term3477.getClass(), "stringCache", null);
        setLongField(term3477, term3477.getClass(), "intCompact", -9223372036854775808L);
        setField(term3416, term3416.getClass(), "unitPrice", term3477);
        setField(term3416, term3416.getClass(), "imageUrl", "VAGkRppBem");
        setBooleanField(term3416, term3416.getClass(), "active", true);
        setIntField(term3416, term3416.getClass(), "unitsInStock", 1236004505);
        setLongField(term3508, term3508.getClass(), "fastTime", 1603673487779L);
        setField(term3508, term3508.getClass(), "cdate", null);
        setField(term3416, term3416.getClass(), "dateCreated", term3508);
        setLongField(term3510, term3510.getClass(), "fastTime", 1262701967235L);
        setField(term3510, term3510.getClass(), "cdate", null);
        setField(term3416, term3416.getClass(), "lastUpdated", term3510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eKcEJRxNSu";
        callMethod(klass, "setName", argTypes, term3416, args);
    }

};



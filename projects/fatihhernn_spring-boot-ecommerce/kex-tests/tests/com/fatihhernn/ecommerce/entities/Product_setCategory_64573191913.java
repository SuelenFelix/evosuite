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

public class Product_setCategory_64573191913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3049;
     Object term3145;

    public Product_setCategory_64573191913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3050 = new Long(-1820639665251914495L);
        Long term3053 = new Long(3238645206498300107L);
        HashMap term3068 = new HashMap();
        Set<Object> term3183 =  ((Map) term3068).keySet();
        HashSet term3067 = new HashSet((Collection<? extends Object>) term3183);
        term3049 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term3052 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term3110 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3111 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3113 = (int[]) newIntArray(6);
        Object term3141 = newInstance(Class.forName("java.util.Date"));
        Object term3143 = newInstance(Class.forName("java.util.Date"));
        setField(term3049, term3049.getClass(), "id", term3050);
        setField(term3052, term3052.getClass(), "id", term3053);
        setField(term3052, term3052.getClass(), "categoryName", "XQfmqLbqHS");
        setField(term3052, term3052.getClass(), "products", term3067);
        setField(term3049, term3049.getClass(), "category", term3052);
        setField(term3049, term3049.getClass(), "sku", "mrSAYJlddZ");
        setField(term3049, term3049.getClass(), "name", "KbwxawvYsw");
        setField(term3049, term3049.getClass(), "description", "gvjdfHNzOa");
        setIntField(term3111, term3111.getClass(), "signum", 1);
        setIntElement(term3113, 0, 23270);
        setIntElement(term3113, 1, -1515076358);
        setIntElement(term3113, 2, -614868568);
        setIntElement(term3113, 3, -2057053008);
        setIntElement(term3113, 4, -719340387);
        setIntElement(term3113, 5, 934892047);
        setField(term3111, term3111.getClass(), "mag", term3113);
        setIntField(term3111, term3111.getClass(), "bitCountPlusOne", 0);
        setIntField(term3111, term3111.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3111, term3111.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3111, term3111.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3110, term3110.getClass(), "intVal", term3111);
        setIntField(term3110, term3110.getClass(), "scale", 53);
        setIntField(term3110, term3110.getClass(), "precision", 0);
        setField(term3110, term3110.getClass(), "stringCache", null);
        setLongField(term3110, term3110.getClass(), "intCompact", -9223372036854775808L);
        setField(term3049, term3049.getClass(), "unitPrice", term3110);
        setField(term3049, term3049.getClass(), "imageUrl", "HqitWglYWX");
        setBooleanField(term3049, term3049.getClass(), "active", false);
        setIntField(term3049, term3049.getClass(), "unitsInStock", -420030135);
        setLongField(term3141, term3141.getClass(), "fastTime", 1460978610142L);
        setField(term3141, term3141.getClass(), "cdate", null);
        setField(term3049, term3049.getClass(), "dateCreated", term3141);
        setLongField(term3143, term3143.getClass(), "fastTime", 1418905725858L);
        setField(term3143, term3143.getClass(), "cdate", null);
        setField(term3049, term3049.getClass(), "lastUpdated", term3143);
        Long term3146 = new Long(-8862087040734407227L);
        HashMap term3161 = new HashMap();
        Set<Object> term3240 =  ((Map) term3161).keySet();
        HashSet term3160 = new HashSet((Collection<? extends Object>) term3240);
        term3145 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        setField(term3145, term3145.getClass(), "id", term3146);
        setField(term3145, term3145.getClass(), "categoryName", "pOuFRlHmbK");
        setField(term3145, term3145.getClass(), "products", term3160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory");
        Object[] args = new Object[1];
        args[0] = term3145;
        callMethod(klass, "setCategory", argTypes, term3049, args);
    }

};



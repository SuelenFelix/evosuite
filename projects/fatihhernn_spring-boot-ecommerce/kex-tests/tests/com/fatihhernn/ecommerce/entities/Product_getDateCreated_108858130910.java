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

public class Product_getDateCreated_108858130910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2590;

    public Product_getDateCreated_108858130910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2591 = new Long(-78240609295693193L);
        Long term2594 = new Long(3090901538358721367L);
        HashMap term2609 = new HashMap();
        Set<Object> term2695 =  ((Map) term2609).keySet();
        HashSet term2608 = new HashSet((Collection<? extends Object>) term2695);
        term2590 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term2593 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term2651 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2652 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2654 = (int[]) newIntArray(5);
        Object term2681 = newInstance(Class.forName("java.util.Date"));
        Object term2683 = newInstance(Class.forName("java.util.Date"));
        setField(term2590, term2590.getClass(), "id", term2591);
        setField(term2593, term2593.getClass(), "id", term2594);
        setField(term2593, term2593.getClass(), "categoryName", "vpZIqpFbKM");
        setField(term2593, term2593.getClass(), "products", term2608);
        setField(term2590, term2590.getClass(), "category", term2593);
        setField(term2590, term2590.getClass(), "sku", "FnEkAHBfyV");
        setField(term2590, term2590.getClass(), "name", "VfmNFpEuax");
        setField(term2590, term2590.getClass(), "description", "ANHjlWPmZG");
        setIntField(term2652, term2652.getClass(), "signum", 1);
        setIntElement(term2654, 0, -2115074141);
        setIntElement(term2654, 1, 254548962);
        setIntElement(term2654, 2, 908962);
        setIntElement(term2654, 3, -1317619852);
        setIntElement(term2654, 4, -1598991849);
        setField(term2652, term2652.getClass(), "mag", term2654);
        setIntField(term2652, term2652.getClass(), "bitCountPlusOne", 0);
        setIntField(term2652, term2652.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2652, term2652.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2652, term2652.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2651, term2651.getClass(), "intVal", term2652);
        setIntField(term2651, term2651.getClass(), "scale", 49);
        setIntField(term2651, term2651.getClass(), "precision", 0);
        setField(term2651, term2651.getClass(), "stringCache", null);
        setLongField(term2651, term2651.getClass(), "intCompact", -9223372036854775808L);
        setField(term2590, term2590.getClass(), "unitPrice", term2651);
        setField(term2590, term2590.getClass(), "imageUrl", "SibzENsyyy");
        setBooleanField(term2590, term2590.getClass(), "active", true);
        setIntField(term2590, term2590.getClass(), "unitsInStock", -1254072822);
        setLongField(term2681, term2681.getClass(), "fastTime", 1374845329130L);
        setField(term2681, term2681.getClass(), "cdate", null);
        setField(term2590, term2590.getClass(), "dateCreated", term2681);
        setLongField(term2683, term2683.getClass(), "fastTime", 1608183479074L);
        setField(term2683, term2683.getClass(), "cdate", null);
        setField(term2590, term2590.getClass(), "lastUpdated", term2683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDateCreated", argTypes, term2590, args);
    }

};



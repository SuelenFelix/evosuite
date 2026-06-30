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

public class Product_getUnitsInStock_5210330539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2437;

    public Product_getUnitsInStock_5210330539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2438 = new Long(4616440478358528406L);
        Long term2441 = new Long(3427570961451840069L);
        HashMap term2456 = new HashMap();
        Set<Object> term2543 =  ((Map) term2456).keySet();
        HashSet term2455 = new HashSet((Collection<? extends Object>) term2543);
        term2437 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term2440 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term2498 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2499 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2501 = (int[]) newIntArray(6);
        Object term2529 = newInstance(Class.forName("java.util.Date"));
        Object term2531 = newInstance(Class.forName("java.util.Date"));
        setField(term2437, term2437.getClass(), "id", term2438);
        setField(term2440, term2440.getClass(), "id", term2441);
        setField(term2440, term2440.getClass(), "categoryName", "ZLQamJFBmu");
        setField(term2440, term2440.getClass(), "products", term2455);
        setField(term2437, term2437.getClass(), "category", term2440);
        setField(term2437, term2437.getClass(), "sku", "EAIAAStlTz");
        setField(term2437, term2437.getClass(), "name", "yIWXcOQTgy");
        setField(term2437, term2437.getClass(), "description", "xAWekqanqc");
        setIntField(term2499, term2499.getClass(), "signum", 1);
        setIntElement(term2501, 0, 38433);
        setIntElement(term2501, 1, 590969225);
        setIntElement(term2501, 2, -928327376);
        setIntElement(term2501, 3, -1652643905);
        setIntElement(term2501, 4, 1376127699);
        setIntElement(term2501, 5, -658266009);
        setField(term2499, term2499.getClass(), "mag", term2501);
        setIntField(term2499, term2499.getClass(), "bitCountPlusOne", 0);
        setIntField(term2499, term2499.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2499, term2499.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2499, term2499.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2498, term2498.getClass(), "intVal", term2499);
        setIntField(term2498, term2498.getClass(), "scale", 53);
        setIntField(term2498, term2498.getClass(), "precision", 0);
        setField(term2498, term2498.getClass(), "stringCache", null);
        setLongField(term2498, term2498.getClass(), "intCompact", -9223372036854775808L);
        setField(term2437, term2437.getClass(), "unitPrice", term2498);
        setField(term2437, term2437.getClass(), "imageUrl", "GSOWFHMlbF");
        setBooleanField(term2437, term2437.getClass(), "active", true);
        setIntField(term2437, term2437.getClass(), "unitsInStock", 1270666529);
        setLongField(term2529, term2529.getClass(), "fastTime", 1412676996116L);
        setField(term2529, term2529.getClass(), "cdate", null);
        setField(term2437, term2437.getClass(), "dateCreated", term2529);
        setLongField(term2531, term2531.getClass(), "fastTime", 1643347136541L);
        setField(term2531, term2531.getClass(), "cdate", null);
        setField(term2437, term2437.getClass(), "lastUpdated", term2531);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnitsInStock", argTypes, term2437, args);
    }

};



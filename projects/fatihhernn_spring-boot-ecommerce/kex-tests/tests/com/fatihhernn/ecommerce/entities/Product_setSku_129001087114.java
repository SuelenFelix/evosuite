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

public class Product_setSku_129001087114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3241;

    public Product_setSku_129001087114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3242 = new Long(4576699120365923235L);
        Long term3245 = new Long(-1635471392209071620L);
        HashMap term3260 = new HashMap();
        Set<Object> term3359 =  ((Map) term3260).keySet();
        HashSet term3259 = new HashSet((Collection<? extends Object>) term3359);
        term3241 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term3244 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term3302 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3303 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3305 = (int[]) newIntArray(6);
        Object term3333 = newInstance(Class.forName("java.util.Date"));
        Object term3335 = newInstance(Class.forName("java.util.Date"));
        setField(term3241, term3241.getClass(), "id", term3242);
        setField(term3244, term3244.getClass(), "id", term3245);
        setField(term3244, term3244.getClass(), "categoryName", "jdQANIXSTq");
        setField(term3244, term3244.getClass(), "products", term3259);
        setField(term3241, term3241.getClass(), "category", term3244);
        setField(term3241, term3241.getClass(), "sku", "szGicGyWDL");
        setField(term3241, term3241.getClass(), "name", "lkdvUiYwRq");
        setField(term3241, term3241.getClass(), "description", "XuxkPrpfND");
        setIntField(term3303, term3303.getClass(), "signum", 1);
        setIntElement(term3305, 0, 42030);
        setIntElement(term3305, 1, 958527659);
        setIntElement(term3305, 2, 1614502175);
        setIntElement(term3305, 3, -2004994062);
        setIntElement(term3305, 4, -839504863);
        setIntElement(term3305, 5, 519648479);
        setField(term3303, term3303.getClass(), "mag", term3305);
        setIntField(term3303, term3303.getClass(), "bitCountPlusOne", 0);
        setIntField(term3303, term3303.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3303, term3303.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3303, term3303.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3302, term3302.getClass(), "intVal", term3303);
        setIntField(term3302, term3302.getClass(), "scale", 53);
        setIntField(term3302, term3302.getClass(), "precision", 0);
        setField(term3302, term3302.getClass(), "stringCache", null);
        setLongField(term3302, term3302.getClass(), "intCompact", -9223372036854775808L);
        setField(term3241, term3241.getClass(), "unitPrice", term3302);
        setField(term3241, term3241.getClass(), "imageUrl", "OxNXeKMDje");
        setBooleanField(term3241, term3241.getClass(), "active", true);
        setIntField(term3241, term3241.getClass(), "unitsInStock", -376422566);
        setLongField(term3333, term3333.getClass(), "fastTime", 1873152234138L);
        setField(term3333, term3333.getClass(), "cdate", null);
        setField(term3241, term3241.getClass(), "dateCreated", term3333);
        setLongField(term3335, term3335.getClass(), "fastTime", 1469019341287L);
        setField(term3335, term3335.getClass(), "cdate", null);
        setField(term3241, term3241.getClass(), "lastUpdated", term3335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hGTqHomrbc";
        callMethod(klass, "setSku", argTypes, term3241, args);
    }

};



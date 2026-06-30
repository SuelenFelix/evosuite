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

public class Product_setId_26787374612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2894;
     Object term2990;

    public Product_setId_26787374612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2895 = new Long(-8338004844694486146L);
        Long term2898 = new Long(6426732259596412988L);
        HashMap term2913 = new HashMap();
        Set<Object> term3002 =  ((Map) term2913).keySet();
        HashSet term2912 = new HashSet((Collection<? extends Object>) term3002);
        term2894 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term2897 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term2955 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2956 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2958 = (int[]) newIntArray(6);
        Object term2986 = newInstance(Class.forName("java.util.Date"));
        Object term2988 = newInstance(Class.forName("java.util.Date"));
        setField(term2894, term2894.getClass(), "id", term2895);
        setField(term2897, term2897.getClass(), "id", term2898);
        setField(term2897, term2897.getClass(), "categoryName", "QUymMnsCIj");
        setField(term2897, term2897.getClass(), "products", term2912);
        setField(term2894, term2894.getClass(), "category", term2897);
        setField(term2894, term2894.getClass(), "sku", "pMfTuAFXxg");
        setField(term2894, term2894.getClass(), "name", "XCZmhkblRc");
        setField(term2894, term2894.getClass(), "description", "gFUWMydGCU");
        setIntField(term2956, term2956.getClass(), "signum", 1);
        setIntElement(term2958, 0, 4844);
        setIntElement(term2958, 1, 1822993645);
        setIntElement(term2958, 2, -2018210365);
        setIntElement(term2958, 3, 1180040502);
        setIntElement(term2958, 4, -1117718570);
        setIntElement(term2958, 5, -861944479);
        setField(term2956, term2956.getClass(), "mag", term2958);
        setIntField(term2956, term2956.getClass(), "bitCountPlusOne", 0);
        setIntField(term2956, term2956.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2956, term2956.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2956, term2956.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2955, term2955.getClass(), "intVal", term2956);
        setIntField(term2955, term2955.getClass(), "scale", 52);
        setIntField(term2955, term2955.getClass(), "precision", 0);
        setField(term2955, term2955.getClass(), "stringCache", null);
        setLongField(term2955, term2955.getClass(), "intCompact", -9223372036854775808L);
        setField(term2894, term2894.getClass(), "unitPrice", term2955);
        setField(term2894, term2894.getClass(), "imageUrl", "LLegSTfqJt");
        setBooleanField(term2894, term2894.getClass(), "active", false);
        setIntField(term2894, term2894.getClass(), "unitsInStock", 842904495);
        setLongField(term2986, term2986.getClass(), "fastTime", 1726911068143L);
        setField(term2986, term2986.getClass(), "cdate", null);
        setField(term2894, term2894.getClass(), "dateCreated", term2986);
        setLongField(term2988, term2988.getClass(), "fastTime", 1298065306825L);
        setField(term2988, term2988.getClass(), "cdate", null);
        setField(term2894, term2894.getClass(), "lastUpdated", term2988);
        term2990 = new Long(5904678961906211249L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2990;
        callMethod(klass, "setId", argTypes, term2894, args);
    }

};



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

public class Product_setImageUrl_108989403018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3940;

    public Product_setImageUrl_108989403018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3941 = new Long(1346299551708610248L);
        Long term3944 = new Long(-7191625829563442696L);
        HashMap term3959 = new HashMap();
        Set<Object> term4058 =  ((Map) term3959).keySet();
        HashSet term3958 = new HashSet((Collection<? extends Object>) term4058);
        term3940 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term3943 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term4001 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4002 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4004 = (int[]) newIntArray(6);
        Object term4032 = newInstance(Class.forName("java.util.Date"));
        Object term4034 = newInstance(Class.forName("java.util.Date"));
        setField(term3940, term3940.getClass(), "id", term3941);
        setField(term3943, term3943.getClass(), "id", term3944);
        setField(term3943, term3943.getClass(), "categoryName", "RINhPkhhct");
        setField(term3943, term3943.getClass(), "products", term3958);
        setField(term3940, term3940.getClass(), "category", term3943);
        setField(term3940, term3940.getClass(), "sku", "rdiIyXfRtL");
        setField(term3940, term3940.getClass(), "name", "douzkltmiI");
        setField(term3940, term3940.getClass(), "description", "MFKjhvLtpe");
        setIntField(term4002, term4002.getClass(), "signum", 1);
        setIntElement(term4004, 0, 1582);
        setIntElement(term4004, 1, -1893943236);
        setIntElement(term4004, 2, -1614415445);
        setIntElement(term4004, 3, 253734933);
        setIntElement(term4004, 4, -947796979);
        setIntElement(term4004, 5, 72582237);
        setField(term4002, term4002.getClass(), "mag", term4004);
        setIntField(term4002, term4002.getClass(), "bitCountPlusOne", 0);
        setIntField(term4002, term4002.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4002, term4002.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4002, term4002.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4001, term4001.getClass(), "intVal", term4002);
        setIntField(term4001, term4001.getClass(), "scale", 52);
        setIntField(term4001, term4001.getClass(), "precision", 0);
        setField(term4001, term4001.getClass(), "stringCache", null);
        setLongField(term4001, term4001.getClass(), "intCompact", -9223372036854775808L);
        setField(term3940, term3940.getClass(), "unitPrice", term4001);
        setField(term3940, term3940.getClass(), "imageUrl", "xpbLKEsput");
        setBooleanField(term3940, term3940.getClass(), "active", true);
        setIntField(term3940, term3940.getClass(), "unitsInStock", 1166710220);
        setLongField(term4032, term4032.getClass(), "fastTime", 1887042175557L);
        setField(term4032, term4032.getClass(), "cdate", null);
        setField(term3940, term3940.getClass(), "dateCreated", term4032);
        setLongField(term4034, term4034.getClass(), "fastTime", 1278344008475L);
        setField(term4034, term4034.getClass(), "cdate", null);
        setField(term3940, term3940.getClass(), "lastUpdated", term4034);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "urlyLwPBVn";
        callMethod(klass, "setImageUrl", argTypes, term3940, args);
    }

};



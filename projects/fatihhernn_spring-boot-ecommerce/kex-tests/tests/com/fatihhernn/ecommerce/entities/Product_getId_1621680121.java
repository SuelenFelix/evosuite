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

public class Product_getId_1621680121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1215;

    public Product_getId_1621680121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1216 = new Long(7247160664318067468L);
        Long term1219 = new Long(2135754395358000892L);
        HashMap term1234 = new HashMap();
        Set<Object> term1320 =  ((Map) term1234).keySet();
        HashSet term1233 = new HashSet((Collection<? extends Object>) term1320);
        term1215 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term1218 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term1275 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1276 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1278 = (int[]) newIntArray(6);
        Object term1306 = newInstance(Class.forName("java.util.Date"));
        Object term1308 = newInstance(Class.forName("java.util.Date"));
        setField(term1215, term1215.getClass(), "id", term1216);
        setField(term1218, term1218.getClass(), "id", term1219);
        setField(term1218, term1218.getClass(), "categoryName", "jqrVEUvYEz");
        setField(term1218, term1218.getClass(), "products", term1233);
        setField(term1215, term1215.getClass(), "category", term1218);
        setField(term1215, term1215.getClass(), "sku", "QITgiBrmfj");
        setField(term1215, term1215.getClass(), "name", "pXxkiXgQnq");
        setField(term1215, term1215.getClass(), "description", "tKmrUDURku");
        setIntField(term1276, term1276.getClass(), "signum", 1);
        setIntElement(term1278, 0, 39719);
        setIntElement(term1278, 1, 312741950);
        setIntElement(term1278, 2, 1687566412);
        setIntElement(term1278, 3, 1397743036);
        setIntElement(term1278, 4, -1072974636);
        setIntElement(term1278, 5, 1992870963);
        setField(term1276, term1276.getClass(), "mag", term1278);
        setIntField(term1276, term1276.getClass(), "bitCountPlusOne", 0);
        setIntField(term1276, term1276.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1276, term1276.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1276, term1276.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1275, term1275.getClass(), "intVal", term1276);
        setIntField(term1275, term1275.getClass(), "scale", 53);
        setIntField(term1275, term1275.getClass(), "precision", 0);
        setField(term1275, term1275.getClass(), "stringCache", null);
        setLongField(term1275, term1275.getClass(), "intCompact", -9223372036854775808L);
        setField(term1215, term1215.getClass(), "unitPrice", term1275);
        setField(term1215, term1215.getClass(), "imageUrl", "JeZbrwZmsP");
        setBooleanField(term1215, term1215.getClass(), "active", false);
        setIntField(term1215, term1215.getClass(), "unitsInStock", 729658803);
        setLongField(term1306, term1306.getClass(), "fastTime", 1655668811013L);
        setField(term1306, term1306.getClass(), "cdate", null);
        setField(term1215, term1215.getClass(), "dateCreated", term1306);
        setLongField(term1308, term1308.getClass(), "fastTime", 1319355084958L);
        setField(term1308, term1308.getClass(), "cdate", null);
        setField(term1215, term1215.getClass(), "lastUpdated", term1308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1215, args);
    }

};



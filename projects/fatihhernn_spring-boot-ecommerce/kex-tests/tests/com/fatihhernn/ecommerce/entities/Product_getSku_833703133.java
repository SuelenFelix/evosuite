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

public class Product_getSku_833703133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1520;

    public Product_getSku_833703133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1521 = new Long(7276637106827860087L);
        Long term1524 = new Long(-3936701866695933852L);
        HashMap term1539 = new HashMap();
        Set<Object> term1626 =  ((Map) term1539).keySet();
        HashSet term1538 = new HashSet((Collection<? extends Object>) term1626);
        term1520 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term1523 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term1581 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1582 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1584 = (int[]) newIntArray(6);
        Object term1612 = newInstance(Class.forName("java.util.Date"));
        Object term1614 = newInstance(Class.forName("java.util.Date"));
        setField(term1520, term1520.getClass(), "id", term1521);
        setField(term1523, term1523.getClass(), "id", term1524);
        setField(term1523, term1523.getClass(), "categoryName", "MRFLbEGYKG");
        setField(term1523, term1523.getClass(), "products", term1538);
        setField(term1520, term1520.getClass(), "category", term1523);
        setField(term1520, term1520.getClass(), "sku", "ceCWHUTQUM");
        setField(term1520, term1520.getClass(), "name", "LrqwfrKKtS");
        setField(term1520, term1520.getClass(), "description", "ZUdnQXfzCI");
        setIntField(term1582, term1582.getClass(), "signum", 1);
        setIntElement(term1584, 0, 17);
        setIntElement(term1584, 1, 844956453);
        setIntElement(term1584, 2, -1392510658);
        setIntElement(term1584, 3, 845698942);
        setIntElement(term1584, 4, 222942389);
        setIntElement(term1584, 5, 492734931);
        setField(term1582, term1582.getClass(), "mag", term1584);
        setIntField(term1582, term1582.getClass(), "bitCountPlusOne", 0);
        setIntField(term1582, term1582.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1582, term1582.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1582, term1582.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1581, term1581.getClass(), "intVal", term1582);
        setIntField(term1581, term1581.getClass(), "scale", 51);
        setIntField(term1581, term1581.getClass(), "precision", 0);
        setField(term1581, term1581.getClass(), "stringCache", null);
        setLongField(term1581, term1581.getClass(), "intCompact", -9223372036854775808L);
        setField(term1520, term1520.getClass(), "unitPrice", term1581);
        setField(term1520, term1520.getClass(), "imageUrl", "EULDrUNQvw");
        setBooleanField(term1520, term1520.getClass(), "active", true);
        setIntField(term1520, term1520.getClass(), "unitsInStock", -1667990367);
        setLongField(term1612, term1612.getClass(), "fastTime", 1755788577674L);
        setField(term1612, term1612.getClass(), "cdate", null);
        setField(term1520, term1520.getClass(), "dateCreated", term1612);
        setLongField(term1614, term1614.getClass(), "fastTime", 1291600397937L);
        setField(term1614, term1614.getClass(), "cdate", null);
        setField(term1520, term1520.getClass(), "lastUpdated", term1614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSku", argTypes, term1520, args);
    }

};



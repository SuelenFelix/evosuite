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

public class Product_getName_14055205594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1673;

    public Product_getName_14055205594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1674 = new Long(-7268507582722666254L);
        Long term1677 = new Long(5671808784468963649L);
        HashMap term1692 = new HashMap();
        Set<Object> term1779 =  ((Map) term1692).keySet();
        HashSet term1691 = new HashSet((Collection<? extends Object>) term1779);
        term1673 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term1676 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term1734 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1735 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1737 = (int[]) newIntArray(6);
        Object term1765 = newInstance(Class.forName("java.util.Date"));
        Object term1767 = newInstance(Class.forName("java.util.Date"));
        setField(term1673, term1673.getClass(), "id", term1674);
        setField(term1676, term1676.getClass(), "id", term1677);
        setField(term1676, term1676.getClass(), "categoryName", "BtvAvsJSei");
        setField(term1676, term1676.getClass(), "products", term1691);
        setField(term1673, term1673.getClass(), "category", term1676);
        setField(term1673, term1673.getClass(), "sku", "zMsSLTfGhl");
        setField(term1673, term1673.getClass(), "name", "bEmHScVZaQ");
        setField(term1673, term1673.getClass(), "description", "TcuXODkzBV");
        setIntField(term1735, term1735.getClass(), "signum", 1);
        setIntElement(term1737, 0, 154);
        setIntElement(term1737, 1, -190767620);
        setIntElement(term1737, 2, 1384068716);
        setIntElement(term1737, 3, -1306517818);
        setIntElement(term1737, 4, 1608452838);
        setIntElement(term1737, 5, -1191314303);
        setField(term1735, term1735.getClass(), "mag", term1737);
        setIntField(term1735, term1735.getClass(), "bitCountPlusOne", 0);
        setIntField(term1735, term1735.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1735, term1735.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1735, term1735.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1734, term1734.getClass(), "intVal", term1735);
        setIntField(term1734, term1734.getClass(), "scale", 53);
        setIntField(term1734, term1734.getClass(), "precision", 0);
        setField(term1734, term1734.getClass(), "stringCache", null);
        setLongField(term1734, term1734.getClass(), "intCompact", -9223372036854775808L);
        setField(term1673, term1673.getClass(), "unitPrice", term1734);
        setField(term1673, term1673.getClass(), "imageUrl", "coJPjrBZNe");
        setBooleanField(term1673, term1673.getClass(), "active", false);
        setIntField(term1673, term1673.getClass(), "unitsInStock", -1870495012);
        setLongField(term1765, term1765.getClass(), "fastTime", 1668066172011L);
        setField(term1765, term1765.getClass(), "cdate", null);
        setField(term1673, term1673.getClass(), "dateCreated", term1765);
        setLongField(term1767, term1767.getClass(), "fastTime", 1677875735410L);
        setField(term1767, term1767.getClass(), "cdate", null);
        setField(term1673, term1673.getClass(), "lastUpdated", term1767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1673, args);
    }

};



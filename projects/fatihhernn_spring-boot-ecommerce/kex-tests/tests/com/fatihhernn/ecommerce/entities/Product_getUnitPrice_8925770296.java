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

public class Product_getUnitPrice_8925770296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1979;

    public Product_getUnitPrice_8925770296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1980 = new Long(-3948863953565024517L);
        Long term1983 = new Long(-6587807377747738663L);
        HashMap term1998 = new HashMap();
        Set<Object> term2085 =  ((Map) term1998).keySet();
        HashSet term1997 = new HashSet((Collection<? extends Object>) term2085);
        term1979 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term1982 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term2040 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2041 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2043 = (int[]) newIntArray(6);
        Object term2071 = newInstance(Class.forName("java.util.Date"));
        Object term2073 = newInstance(Class.forName("java.util.Date"));
        setField(term1979, term1979.getClass(), "id", term1980);
        setField(term1982, term1982.getClass(), "id", term1983);
        setField(term1982, term1982.getClass(), "categoryName", "uePedtiAfL");
        setField(term1982, term1982.getClass(), "products", term1997);
        setField(term1979, term1979.getClass(), "category", term1982);
        setField(term1979, term1979.getClass(), "sku", "ndAITnOsny");
        setField(term1979, term1979.getClass(), "name", "CVZnTiJucs");
        setField(term1979, term1979.getClass(), "description", "ecHEQufXoq");
        setIntField(term2041, term2041.getClass(), "signum", 1);
        setIntElement(term2043, 0, 36328);
        setIntElement(term2043, 1, -1170174767);
        setIntElement(term2043, 2, 655972142);
        setIntElement(term2043, 3, 462471887);
        setIntElement(term2043, 4, 119631125);
        setIntElement(term2043, 5, 1339467919);
        setField(term2041, term2041.getClass(), "mag", term2043);
        setIntField(term2041, term2041.getClass(), "bitCountPlusOne", 0);
        setIntField(term2041, term2041.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2041, term2041.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2041, term2041.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2040, term2040.getClass(), "intVal", term2041);
        setIntField(term2040, term2040.getClass(), "scale", 53);
        setIntField(term2040, term2040.getClass(), "precision", 0);
        setField(term2040, term2040.getClass(), "stringCache", null);
        setLongField(term2040, term2040.getClass(), "intCompact", -9223372036854775808L);
        setField(term1979, term1979.getClass(), "unitPrice", term2040);
        setField(term1979, term1979.getClass(), "imageUrl", "btBLMvHzJg");
        setBooleanField(term1979, term1979.getClass(), "active", true);
        setIntField(term1979, term1979.getClass(), "unitsInStock", -916584829);
        setLongField(term2071, term2071.getClass(), "fastTime", 1589208576171L);
        setField(term2071, term2071.getClass(), "cdate", null);
        setField(term1979, term1979.getClass(), "dateCreated", term2071);
        setLongField(term2073, term2073.getClass(), "fastTime", 1420265476195L);
        setField(term2073, term2073.getClass(), "cdate", null);
        setField(term1979, term1979.getClass(), "lastUpdated", term2073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnitPrice", argTypes, term1979, args);
    }

};



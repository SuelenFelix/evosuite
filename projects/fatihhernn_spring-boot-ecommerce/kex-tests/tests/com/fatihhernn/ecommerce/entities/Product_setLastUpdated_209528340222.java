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

public class Product_setLastUpdated_209528340222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4580;
     Object term4676;

    public Product_setLastUpdated_209528340222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4581 = new Long(-1279670138064751276L);
        Long term4584 = new Long(-7205236974351118210L);
        HashMap term4599 = new HashMap();
        Set<Object> term4688 =  ((Map) term4599).keySet();
        HashSet term4598 = new HashSet((Collection<? extends Object>) term4688);
        term4580 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term4583 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term4641 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4642 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4644 = (int[]) newIntArray(6);
        Object term4672 = newInstance(Class.forName("java.util.Date"));
        Object term4674 = newInstance(Class.forName("java.util.Date"));
        setField(term4580, term4580.getClass(), "id", term4581);
        setField(term4583, term4583.getClass(), "id", term4584);
        setField(term4583, term4583.getClass(), "categoryName", "EAMaFLdmaG");
        setField(term4583, term4583.getClass(), "products", term4598);
        setField(term4580, term4580.getClass(), "category", term4583);
        setField(term4580, term4580.getClass(), "sku", "JPUZuGxKlI");
        setField(term4580, term4580.getClass(), "name", "xqIbVsUspl");
        setField(term4580, term4580.getClass(), "description", "GnjLRtJywq");
        setIntField(term4642, term4642.getClass(), "signum", 1);
        setIntElement(term4644, 0, 12658);
        setIntElement(term4644, 1, 878538917);
        setIntElement(term4644, 2, -466545988);
        setIntElement(term4644, 3, 1185733849);
        setIntElement(term4644, 4, -1724512112);
        setIntElement(term4644, 5, 567745329);
        setField(term4642, term4642.getClass(), "mag", term4644);
        setIntField(term4642, term4642.getClass(), "bitCountPlusOne", 0);
        setIntField(term4642, term4642.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4642, term4642.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4642, term4642.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4641, term4641.getClass(), "intVal", term4642);
        setIntField(term4641, term4641.getClass(), "scale", 53);
        setIntField(term4641, term4641.getClass(), "precision", 0);
        setField(term4641, term4641.getClass(), "stringCache", null);
        setLongField(term4641, term4641.getClass(), "intCompact", -9223372036854775808L);
        setField(term4580, term4580.getClass(), "unitPrice", term4641);
        setField(term4580, term4580.getClass(), "imageUrl", "TDaodpHTRK");
        setBooleanField(term4580, term4580.getClass(), "active", true);
        setIntField(term4580, term4580.getClass(), "unitsInStock", 954660603);
        setLongField(term4672, term4672.getClass(), "fastTime", 1839714137646L);
        setField(term4672, term4672.getClass(), "cdate", null);
        setField(term4580, term4580.getClass(), "dateCreated", term4672);
        setLongField(term4674, term4674.getClass(), "fastTime", 1620297238542L);
        setField(term4674, term4674.getClass(), "cdate", null);
        setField(term4580, term4580.getClass(), "lastUpdated", term4674);
        term4676 = newInstance(Class.forName("java.util.Date"));
        setLongField(term4676, term4676.getClass(), "fastTime", 1340144055808L);
        setField(term4676, term4676.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term4676;
        callMethod(klass, "setLastUpdated", argTypes, term4580, args);
    }

};



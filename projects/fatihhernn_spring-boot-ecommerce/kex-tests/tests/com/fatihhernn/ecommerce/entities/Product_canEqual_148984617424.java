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

public class Product_canEqual_148984617424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4889;
     Object term4984;

    public Product_canEqual_148984617424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4890 = new Long(-278716491237139968L);
        Long term4893 = new Long(-629491722907628764L);
        HashMap term4908 = new HashMap();
        Set<Object> term4995 =  ((Map) term4908).keySet();
        HashSet term4907 = new HashSet((Collection<? extends Object>) term4995);
        term4889 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term4892 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term4949 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4950 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4952 = (int[]) newIntArray(6);
        Object term4980 = newInstance(Class.forName("java.util.Date"));
        Object term4982 = newInstance(Class.forName("java.util.Date"));
        setField(term4889, term4889.getClass(), "id", term4890);
        setField(term4892, term4892.getClass(), "id", term4893);
        setField(term4892, term4892.getClass(), "categoryName", "kHxujKiCsr");
        setField(term4892, term4892.getClass(), "products", term4907);
        setField(term4889, term4889.getClass(), "category", term4892);
        setField(term4889, term4889.getClass(), "sku", "cseZveWowm");
        setField(term4889, term4889.getClass(), "name", "idfslIPhgx");
        setField(term4889, term4889.getClass(), "description", "HyFLOXeoDX");
        setIntField(term4950, term4950.getClass(), "signum", 1);
        setIntElement(term4952, 0, 1630);
        setIntElement(term4952, 1, 286727680);
        setIntElement(term4952, 2, -1201506640);
        setIntElement(term4952, 3, 2020132078);
        setIntElement(term4952, 4, -461854070);
        setIntElement(term4952, 5, 454662305);
        setField(term4950, term4950.getClass(), "mag", term4952);
        setIntField(term4950, term4950.getClass(), "bitCountPlusOne", 0);
        setIntField(term4950, term4950.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4950, term4950.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4950, term4950.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4949, term4949.getClass(), "intVal", term4950);
        setIntField(term4949, term4949.getClass(), "scale", 52);
        setIntField(term4949, term4949.getClass(), "precision", 0);
        setField(term4949, term4949.getClass(), "stringCache", null);
        setLongField(term4949, term4949.getClass(), "intCompact", -9223372036854775808L);
        setField(term4889, term4889.getClass(), "unitPrice", term4949);
        setField(term4889, term4889.getClass(), "imageUrl", "crkNabVaWs");
        setBooleanField(term4889, term4889.getClass(), "active", true);
        setIntField(term4889, term4889.getClass(), "unitsInStock", -1697741155);
        setLongField(term4980, term4980.getClass(), "fastTime", 1640244611861L);
        setField(term4980, term4980.getClass(), "cdate", null);
        setField(term4889, term4889.getClass(), "dateCreated", term4980);
        setLongField(term4982, term4982.getClass(), "fastTime", 1585770433121L);
        setField(term4982, term4982.getClass(), "cdate", null);
        setField(term4889, term4889.getClass(), "lastUpdated", term4982);
        term4984 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4984;
        callMethod(klass, "canEqual", argTypes, term4889, args);
    }

};



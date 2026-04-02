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

public class Product_equals_68568354523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4735;
     Object term4831;

    public Product_equals_68568354523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4736 = new Long(4458302820344896046L);
        Long term4739 = new Long(-432424084523104253L);
        HashMap term4754 = new HashMap();
        Set<Object> term4842 =  ((Map) term4754).keySet();
        HashSet term4753 = new HashSet((Collection<? extends Object>) term4842);
        term4735 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term4738 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term4796 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4797 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4799 = (int[]) newIntArray(6);
        Object term4827 = newInstance(Class.forName("java.util.Date"));
        Object term4829 = newInstance(Class.forName("java.util.Date"));
        setField(term4735, term4735.getClass(), "id", term4736);
        setField(term4738, term4738.getClass(), "id", term4739);
        setField(term4738, term4738.getClass(), "categoryName", "JayazbYDLK");
        setField(term4738, term4738.getClass(), "products", term4753);
        setField(term4735, term4735.getClass(), "category", term4738);
        setField(term4735, term4735.getClass(), "sku", "EfSUvjuZAA");
        setField(term4735, term4735.getClass(), "name", "PrHWfHydsG");
        setField(term4735, term4735.getClass(), "description", "igruEzTbBE");
        setIntField(term4797, term4797.getClass(), "signum", 1);
        setIntElement(term4799, 0, 19458);
        setIntElement(term4799, 1, -1232510219);
        setIntElement(term4799, 2, -1084191877);
        setIntElement(term4799, 3, 1473605384);
        setIntElement(term4799, 4, -1473129878);
        setIntElement(term4799, 5, -1426150847);
        setField(term4797, term4797.getClass(), "mag", term4799);
        setIntField(term4797, term4797.getClass(), "bitCountPlusOne", 0);
        setIntField(term4797, term4797.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4797, term4797.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4797, term4797.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4796, term4796.getClass(), "intVal", term4797);
        setIntField(term4796, term4796.getClass(), "scale", 53);
        setIntField(term4796, term4796.getClass(), "precision", 0);
        setField(term4796, term4796.getClass(), "stringCache", null);
        setLongField(term4796, term4796.getClass(), "intCompact", -9223372036854775808L);
        setField(term4735, term4735.getClass(), "unitPrice", term4796);
        setField(term4735, term4735.getClass(), "imageUrl", "LFjgROsRUV");
        setBooleanField(term4735, term4735.getClass(), "active", true);
        setIntField(term4735, term4735.getClass(), "unitsInStock", -765191335);
        setLongField(term4827, term4827.getClass(), "fastTime", 1498239061308L);
        setField(term4827, term4827.getClass(), "cdate", null);
        setField(term4735, term4735.getClass(), "dateCreated", term4827);
        setLongField(term4829, term4829.getClass(), "fastTime", 1572369705867L);
        setField(term4829, term4829.getClass(), "cdate", null);
        setField(term4735, term4735.getClass(), "lastUpdated", term4829);
        term4831 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4831;
        callMethod(klass, "equals", argTypes, term4735, args);
    }

};



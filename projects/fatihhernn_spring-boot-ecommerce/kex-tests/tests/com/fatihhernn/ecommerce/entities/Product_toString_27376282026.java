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

public class Product_toString_27376282026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5195;

    public Product_toString_27376282026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5196 = new Long(-8692119547314358088L);
        Long term5199 = new Long(-2083524977884307536L);
        HashMap term5214 = new HashMap();
        Set<Object> term5301 =  ((Map) term5214).keySet();
        HashSet term5213 = new HashSet((Collection<? extends Object>) term5301);
        term5195 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term5198 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term5256 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5257 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5259 = (int[]) newIntArray(6);
        Object term5287 = newInstance(Class.forName("java.util.Date"));
        Object term5289 = newInstance(Class.forName("java.util.Date"));
        setField(term5195, term5195.getClass(), "id", term5196);
        setField(term5198, term5198.getClass(), "id", term5199);
        setField(term5198, term5198.getClass(), "categoryName", "WBrpvMhmsz");
        setField(term5198, term5198.getClass(), "products", term5213);
        setField(term5195, term5195.getClass(), "category", term5198);
        setField(term5195, term5195.getClass(), "sku", "iGTpXnnTqB");
        setField(term5195, term5195.getClass(), "name", "XgJzBOYfQB");
        setField(term5195, term5195.getClass(), "description", "GAPGgDekVG");
        setIntField(term5257, term5257.getClass(), "signum", 1);
        setIntElement(term5259, 0, 19772);
        setIntElement(term5259, 1, -449158655);
        setIntElement(term5259, 2, 141626585);
        setIntElement(term5259, 3, 124766628);
        setIntElement(term5259, 4, -842092141);
        setIntElement(term5259, 5, 596412319);
        setField(term5257, term5257.getClass(), "mag", term5259);
        setIntField(term5257, term5257.getClass(), "bitCountPlusOne", 0);
        setIntField(term5257, term5257.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5257, term5257.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5257, term5257.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5256, term5256.getClass(), "intVal", term5257);
        setIntField(term5256, term5256.getClass(), "scale", 53);
        setIntField(term5256, term5256.getClass(), "precision", 0);
        setField(term5256, term5256.getClass(), "stringCache", null);
        setLongField(term5256, term5256.getClass(), "intCompact", -9223372036854775808L);
        setField(term5195, term5195.getClass(), "unitPrice", term5256);
        setField(term5195, term5195.getClass(), "imageUrl", "WmTogHwGLE");
        setBooleanField(term5195, term5195.getClass(), "active", true);
        setIntField(term5195, term5195.getClass(), "unitsInStock", -1127721881);
        setLongField(term5287, term5287.getClass(), "fastTime", 1518509835152L);
        setField(term5287, term5287.getClass(), "cdate", null);
        setField(term5195, term5195.getClass(), "dateCreated", term5287);
        setLongField(term5289, term5289.getClass(), "fastTime", 1502165750304L);
        setField(term5289, term5289.getClass(), "cdate", null);
        setField(term5195, term5195.getClass(), "lastUpdated", term5289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5195, args);
    }

};



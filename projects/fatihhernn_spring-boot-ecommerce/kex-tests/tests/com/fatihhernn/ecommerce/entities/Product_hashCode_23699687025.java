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

public class Product_hashCode_23699687025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5042;

    public Product_hashCode_23699687025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5043 = new Long(-5552123402871285352L);
        Long term5046 = new Long(-5587528177305224828L);
        HashMap term5061 = new HashMap();
        Set<Object> term5148 =  ((Map) term5061).keySet();
        HashSet term5060 = new HashSet((Collection<? extends Object>) term5148);
        term5042 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term5045 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term5103 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5104 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5106 = (int[]) newIntArray(6);
        Object term5134 = newInstance(Class.forName("java.util.Date"));
        Object term5136 = newInstance(Class.forName("java.util.Date"));
        setField(term5042, term5042.getClass(), "id", term5043);
        setField(term5045, term5045.getClass(), "id", term5046);
        setField(term5045, term5045.getClass(), "categoryName", "qBcAJgrABE");
        setField(term5045, term5045.getClass(), "products", term5060);
        setField(term5042, term5042.getClass(), "category", term5045);
        setField(term5042, term5042.getClass(), "sku", "gUQhOyGfzF");
        setField(term5042, term5042.getClass(), "name", "IqDObvPBZX");
        setField(term5042, term5042.getClass(), "description", "NITCrIISoC");
        setIntField(term5104, term5104.getClass(), "signum", 1);
        setIntElement(term5106, 0, 31680);
        setIntElement(term5106, 1, 1333852263);
        setIntElement(term5106, 2, 1118133288);
        setIntElement(term5106, 3, -1665031106);
        setIntElement(term5106, 4, 493921560);
        setIntElement(term5106, 5, 1430028949);
        setField(term5104, term5104.getClass(), "mag", term5106);
        setIntField(term5104, term5104.getClass(), "bitCountPlusOne", 0);
        setIntField(term5104, term5104.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5104, term5104.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5104, term5104.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5103, term5103.getClass(), "intVal", term5104);
        setIntField(term5103, term5103.getClass(), "scale", 53);
        setIntField(term5103, term5103.getClass(), "precision", 0);
        setField(term5103, term5103.getClass(), "stringCache", null);
        setLongField(term5103, term5103.getClass(), "intCompact", -9223372036854775808L);
        setField(term5042, term5042.getClass(), "unitPrice", term5103);
        setField(term5042, term5042.getClass(), "imageUrl", "nSzzeexTDI");
        setBooleanField(term5042, term5042.getClass(), "active", true);
        setIntField(term5042, term5042.getClass(), "unitsInStock", -1422859977);
        setLongField(term5134, term5134.getClass(), "fastTime", 1576226551563L);
        setField(term5134, term5134.getClass(), "cdate", null);
        setField(term5042, term5042.getClass(), "dateCreated", term5134);
        setLongField(term5136, term5136.getClass(), "fastTime", 1536870844334L);
        setField(term5136, term5136.getClass(), "cdate", null);
        setField(term5042, term5042.getClass(), "lastUpdated", term5136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5042, args);
    }

};



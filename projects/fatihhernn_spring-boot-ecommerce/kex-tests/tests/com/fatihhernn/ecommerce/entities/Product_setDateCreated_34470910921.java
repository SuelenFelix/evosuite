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

public class Product_setDateCreated_34470910921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4425;
     Object term4521;

    public Product_setDateCreated_34470910921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4426 = new Long(5797412846146719084L);
        Long term4429 = new Long(5319740127125920367L);
        HashMap term4444 = new HashMap();
        Set<Object> term4533 =  ((Map) term4444).keySet();
        HashSet term4443 = new HashSet((Collection<? extends Object>) term4533);
        term4425 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term4428 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term4486 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4487 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4489 = (int[]) newIntArray(6);
        Object term4517 = newInstance(Class.forName("java.util.Date"));
        Object term4519 = newInstance(Class.forName("java.util.Date"));
        setField(term4425, term4425.getClass(), "id", term4426);
        setField(term4428, term4428.getClass(), "id", term4429);
        setField(term4428, term4428.getClass(), "categoryName", "RKcKwlEYZb");
        setField(term4428, term4428.getClass(), "products", term4443);
        setField(term4425, term4425.getClass(), "category", term4428);
        setField(term4425, term4425.getClass(), "sku", "YciMAObLwl");
        setField(term4425, term4425.getClass(), "name", "qAmVqwwdyf");
        setField(term4425, term4425.getClass(), "description", "IXPaHQnEUy");
        setIntField(term4487, term4487.getClass(), "signum", 1);
        setIntElement(term4489, 0, 68132);
        setIntElement(term4489, 1, -1862768422);
        setIntElement(term4489, 2, 15996450);
        setIntElement(term4489, 3, 1947624575);
        setIntElement(term4489, 4, -1065536589);
        setIntElement(term4489, 5, 1917689327);
        setField(term4487, term4487.getClass(), "mag", term4489);
        setIntField(term4487, term4487.getClass(), "bitCountPlusOne", 0);
        setIntField(term4487, term4487.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4487, term4487.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4487, term4487.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4486, term4486.getClass(), "intVal", term4487);
        setIntField(term4486, term4486.getClass(), "scale", 53);
        setIntField(term4486, term4486.getClass(), "precision", 0);
        setField(term4486, term4486.getClass(), "stringCache", null);
        setLongField(term4486, term4486.getClass(), "intCompact", -9223372036854775808L);
        setField(term4425, term4425.getClass(), "unitPrice", term4486);
        setField(term4425, term4425.getClass(), "imageUrl", "zhcWVVrrjs");
        setBooleanField(term4425, term4425.getClass(), "active", true);
        setIntField(term4425, term4425.getClass(), "unitsInStock", -1404350380);
        setLongField(term4517, term4517.getClass(), "fastTime", 1562237802749L);
        setField(term4517, term4517.getClass(), "cdate", null);
        setField(term4425, term4425.getClass(), "dateCreated", term4517);
        setLongField(term4519, term4519.getClass(), "fastTime", 1418073237580L);
        setField(term4519, term4519.getClass(), "cdate", null);
        setField(term4425, term4425.getClass(), "lastUpdated", term4519);
        term4521 = newInstance(Class.forName("java.util.Date"));
        setLongField(term4521, term4521.getClass(), "fastTime", 1688138498192L);
        setField(term4521, term4521.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term4521;
        callMethod(klass, "setDateCreated", argTypes, term4425, args);
    }

};



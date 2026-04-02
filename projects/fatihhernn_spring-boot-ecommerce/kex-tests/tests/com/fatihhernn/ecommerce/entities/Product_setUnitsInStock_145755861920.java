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
import java.lang.Integer;

public class Product_setUnitsInStock_145755861920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4270;
     Object term4366;

    public Product_setUnitsInStock_145755861920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4271 = new Long(-1497280900081695731L);
        Long term4274 = new Long(-3602825674339018793L);
        HashMap term4289 = new HashMap();
        Set<Object> term4378 =  ((Map) term4289).keySet();
        HashSet term4288 = new HashSet((Collection<? extends Object>) term4378);
        term4270 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term4273 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term4331 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4332 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4334 = (int[]) newIntArray(6);
        Object term4362 = newInstance(Class.forName("java.util.Date"));
        Object term4364 = newInstance(Class.forName("java.util.Date"));
        setField(term4270, term4270.getClass(), "id", term4271);
        setField(term4273, term4273.getClass(), "id", term4274);
        setField(term4273, term4273.getClass(), "categoryName", "NPUSTXlEKx");
        setField(term4273, term4273.getClass(), "products", term4288);
        setField(term4270, term4270.getClass(), "category", term4273);
        setField(term4270, term4270.getClass(), "sku", "MxrhCLTMTH");
        setField(term4270, term4270.getClass(), "name", "kEehLMZcOU");
        setField(term4270, term4270.getClass(), "description", "RhLliqMiOF");
        setIntField(term4332, term4332.getClass(), "signum", 1);
        setIntElement(term4334, 0, 3646);
        setIntElement(term4334, 1, -520226555);
        setIntElement(term4334, 2, -500867287);
        setIntElement(term4334, 3, 2058130326);
        setIntElement(term4334, 4, 630142228);
        setIntElement(term4334, 5, -1611343891);
        setField(term4332, term4332.getClass(), "mag", term4334);
        setIntField(term4332, term4332.getClass(), "bitCountPlusOne", 0);
        setIntField(term4332, term4332.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4332, term4332.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4332, term4332.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4331, term4331.getClass(), "intVal", term4332);
        setIntField(term4331, term4331.getClass(), "scale", 52);
        setIntField(term4331, term4331.getClass(), "precision", 0);
        setField(term4331, term4331.getClass(), "stringCache", null);
        setLongField(term4331, term4331.getClass(), "intCompact", -9223372036854775808L);
        setField(term4270, term4270.getClass(), "unitPrice", term4331);
        setField(term4270, term4270.getClass(), "imageUrl", "jlhonEGrJH");
        setBooleanField(term4270, term4270.getClass(), "active", true);
        setIntField(term4270, term4270.getClass(), "unitsInStock", 339372704);
        setLongField(term4362, term4362.getClass(), "fastTime", 1783094578974L);
        setField(term4362, term4362.getClass(), "cdate", null);
        setField(term4270, term4270.getClass(), "dateCreated", term4362);
        setLongField(term4364, term4364.getClass(), "fastTime", 1853629046308L);
        setField(term4364, term4364.getClass(), "cdate", null);
        setField(term4270, term4270.getClass(), "lastUpdated", term4364);
        term4366 = new Integer(-851097944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4366;
        callMethod(klass, "setUnitsInStock", argTypes, term4270, args);
    }

};



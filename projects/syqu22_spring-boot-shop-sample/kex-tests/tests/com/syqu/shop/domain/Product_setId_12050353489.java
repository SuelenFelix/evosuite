package com.syqu.shop.domain;

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
import static com.syqu.shop.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Long;

public class Product_setId_12050353489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978;
     Object term1053;

    public Product_setId_12050353489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1007 = new HashMap();
        Set<Object> term1075 =  ((Map) term1007).keySet();
        HashSet term1006 = new HashSet((Collection<? extends Object>) term1075);
        term978 = newInstance(Class.forName("com.syqu.shop.domain.Product"));
        Object term992 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        Object term1036 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1037 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1039 = (int[]) newIntArray(6);
        setLongField(term978, term978.getClass(), "id", -316468845751588286L);
        setField(term978, term978.getClass(), "name", "AijpHYOFuy");
        setLongField(term992, term992.getClass(), "id", 5127676408959197577L);
        setField(term992, term992.getClass(), "categoryName", "SbAoxhfrkn");
        setField(term992, term992.getClass(), "books", term1006);
        setField(term978, term978.getClass(), "category", term992);
        setField(term978, term978.getClass(), "description", "kuTXqwMtDB");
        setField(term978, term978.getClass(), "imageUrl", "Ghbwtircqb");
        setIntField(term1037, term1037.getClass(), "signum", 1);
        setIntElement(term1039, 0, 4157);
        setIntElement(term1039, 1, -1258399411);
        setIntElement(term1039, 2, -1445096589);
        setIntElement(term1039, 3, 1602721280);
        setIntElement(term1039, 4, 1738795194);
        setIntElement(term1039, 5, -481877419);
        setField(term1037, term1037.getClass(), "mag", term1039);
        setIntField(term1037, term1037.getClass(), "bitCountPlusOne", 0);
        setIntField(term1037, term1037.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1037, term1037.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1037, term1037.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1036, term1036.getClass(), "intVal", term1037);
        setIntField(term1036, term1036.getClass(), "scale", 52);
        setIntField(term1036, term1036.getClass(), "precision", 0);
        setField(term1036, term1036.getClass(), "stringCache", null);
        setLongField(term1036, term1036.getClass(), "intCompact", -9223372036854775808L);
        setField(term978, term978.getClass(), "price", term1036);
        term1053 = new Long(-6573104506744284592L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1053;
        callMethod(klass, "setId", argTypes, term978, args);
    }

};



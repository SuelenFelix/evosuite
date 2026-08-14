package com.example.web_shop.entity;

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
import static com.example.web_shop.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Product_setPrice_89024248313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1935;
     Object term2010;

    public Product_setPrice_89024248313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1964 = new HashMap();
        Set<Object> term2047 =  ((Map) term1964).keySet();
        HashSet term1963 = new HashSet((Collection<? extends Object>) term2047);
        term1935 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        Object term1949 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        Object term1993 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1994 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1996 = (int[]) newIntArray(6);
        setLongField(term1935, term1935.getClass(), "id", -7738503207562305297L);
        setField(term1935, term1935.getClass(), "name", "xBsXSDjXYK");
        setLongField(term1949, term1949.getClass(), "id", 3825396310311739952L);
        setField(term1949, term1949.getClass(), "categoryName", "sEnIVFtZuQ");
        setField(term1949, term1949.getClass(), "books", term1963);
        setField(term1935, term1935.getClass(), "category", term1949);
        setField(term1935, term1935.getClass(), "description", "ZVecLZMLHF");
        setField(term1935, term1935.getClass(), "image_url", "fztQhjqwdP");
        setIntField(term1994, term1994.getClass(), "signum", 1);
        setIntElement(term1996, 0, 5222);
        setIntElement(term1996, 1, -454284340);
        setIntElement(term1996, 2, -1412298361);
        setIntElement(term1996, 3, -225970664);
        setIntElement(term1996, 4, -1354448185);
        setIntElement(term1996, 5, -1168679607);
        setField(term1994, term1994.getClass(), "mag", term1996);
        setIntField(term1994, term1994.getClass(), "bitCountPlusOne", 0);
        setIntField(term1994, term1994.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1994, term1994.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1994, term1994.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1993, term1993.getClass(), "intVal", term1994);
        setIntField(term1993, term1993.getClass(), "scale", 52);
        setIntField(term1993, term1993.getClass(), "precision", 0);
        setField(term1993, term1993.getClass(), "stringCache", null);
        setLongField(term1993, term1993.getClass(), "intCompact", -9223372036854775808L);
        setField(term1935, term1935.getClass(), "price", term1993);
        term2010 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2011 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2013 = (int[]) newIntArray(6);
        setIntField(term2011, term2011.getClass(), "signum", 1);
        setIntElement(term2013, 0, 92);
        setIntElement(term2013, 1, 1034738575);
        setIntElement(term2013, 2, -1456630577);
        setIntElement(term2013, 3, -1449292938);
        setIntElement(term2013, 4, -1319116780);
        setIntElement(term2013, 5, 1851590535);
        setField(term2011, term2011.getClass(), "mag", term2013);
        setIntField(term2011, term2011.getClass(), "bitCountPlusOne", 0);
        setIntField(term2011, term2011.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2011, term2011.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2011, term2011.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2010, term2010.getClass(), "intVal", term2011);
        setIntField(term2010, term2010.getClass(), "scale", 51);
        setIntField(term2010, term2010.getClass(), "precision", 0);
        setField(term2010, term2010.getClass(), "stringCache", null);
        setLongField(term2010, term2010.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term2010;
        callMethod(klass, "setPrice", argTypes, term1935, args);
    }

};



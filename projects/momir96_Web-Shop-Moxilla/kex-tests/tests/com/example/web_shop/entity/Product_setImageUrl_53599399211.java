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

public class Product_setImageUrl_53599399211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1669;

    public Product_setImageUrl_53599399211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1698 = new HashMap();
        Set<Object> term1776 =  ((Map) term1698).keySet();
        HashSet term1697 = new HashSet((Collection<? extends Object>) term1776);
        term1669 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        Object term1683 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        Object term1727 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1728 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1730 = (int[]) newIntArray(6);
        setLongField(term1669, term1669.getClass(), "id", -1154553077993834885L);
        setField(term1669, term1669.getClass(), "name", "JiVRgTZvKc");
        setLongField(term1683, term1683.getClass(), "id", -2850532706972744550L);
        setField(term1683, term1683.getClass(), "categoryName", "XPKmummaqg");
        setField(term1683, term1683.getClass(), "books", term1697);
        setField(term1669, term1669.getClass(), "category", term1683);
        setField(term1669, term1669.getClass(), "description", "BKLfkLiZTH");
        setField(term1669, term1669.getClass(), "image_url", "SPpkrGcPRr");
        setIntField(term1728, term1728.getClass(), "signum", 1);
        setIntElement(term1730, 0, 5883);
        setIntElement(term1730, 1, 833709085);
        setIntElement(term1730, 2, 749794735);
        setIntElement(term1730, 3, 825830368);
        setIntElement(term1730, 4, 935494074);
        setIntElement(term1730, 5, -2012885541);
        setField(term1728, term1728.getClass(), "mag", term1730);
        setIntField(term1728, term1728.getClass(), "bitCountPlusOne", 0);
        setIntField(term1728, term1728.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1728, term1728.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1728, term1728.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1727, term1727.getClass(), "intVal", term1728);
        setIntField(term1727, term1727.getClass(), "scale", 52);
        setIntField(term1727, term1727.getClass(), "precision", 0);
        setField(term1727, term1727.getClass(), "stringCache", null);
        setLongField(term1727, term1727.getClass(), "intCompact", -9223372036854775808L);
        setField(term1669, term1669.getClass(), "price", term1727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sEccwbJKYE";
        callMethod(klass, "setImageUrl", argTypes, term1669, args);
    }

};



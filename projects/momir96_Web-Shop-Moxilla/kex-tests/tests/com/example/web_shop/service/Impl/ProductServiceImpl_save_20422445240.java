package com.example.web_shop.service.Impl;

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
import static com.example.web_shop.service.Impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ProductServiceImpl_save_20422445240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293;

    public ProductServiceImpl_save_20422445240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term322 = new HashMap();
        Set<Object> term388 =  ((Map) term322).keySet();
        HashSet term321 = new HashSet((Collection<? extends Object>) term388);
        term293 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        Object term307 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        Object term351 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term352 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term354 = (int[]) newIntArray(6);
        setLongField(term293, term293.getClass(), "id", 5270370404989704783L);
        setField(term293, term293.getClass(), "name", "hRNSzYYIrc");
        setLongField(term307, term307.getClass(), "id", 7411271909051562686L);
        setField(term307, term307.getClass(), "categoryName", "RMFIsYGgne");
        setField(term307, term307.getClass(), "books", term321);
        setField(term293, term293.getClass(), "category", term307);
        setField(term293, term293.getClass(), "description", "NRdvgJlhkX");
        setField(term293, term293.getClass(), "image_url", "uuaPigETmJ");
        setIntField(term352, term352.getClass(), "signum", 1);
        setIntElement(term354, 0, 3779);
        setIntElement(term354, 1, 1825499203);
        setIntElement(term354, 2, 189827582);
        setIntElement(term354, 3, 731025545);
        setIntElement(term354, 4, -475097163);
        setIntElement(term354, 5, 890127363);
        setField(term352, term352.getClass(), "mag", term354);
        setIntField(term352, term352.getClass(), "bitCountPlusOne", 0);
        setIntField(term352, term352.getClass(), "bitLengthPlusOne", 0);
        setIntField(term352, term352.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term352, term352.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term351, term351.getClass(), "intVal", term352);
        setIntField(term351, term351.getClass(), "scale", 52);
        setIntField(term351, term351.getClass(), "precision", 0);
        setField(term351, term351.getClass(), "stringCache", null);
        setLongField(term351, term351.getClass(), "intCompact", -9223372036854775808L);
        setField(term293, term293.getClass(), "price", term351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.service.Impl.ProductServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.web_shop.entity.Product");
        Object[] args = new Object[1];
        args[0] = term293;
        callMethod(klass, "save", argTypes, null, args);
    }

};



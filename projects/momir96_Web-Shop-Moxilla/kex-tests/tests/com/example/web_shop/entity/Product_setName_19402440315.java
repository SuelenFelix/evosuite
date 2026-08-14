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

public class Product_setName_19402440315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term862;

    public Product_setName_19402440315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term891 = new HashMap();
        Set<Object> term969 =  ((Map) term891).keySet();
        HashSet term890 = new HashSet((Collection<? extends Object>) term969);
        term862 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        Object term876 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        Object term920 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term921 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term923 = (int[]) newIntArray(6);
        setLongField(term862, term862.getClass(), "id", 5907001541142728739L);
        setField(term862, term862.getClass(), "name", "whBvTVIIlC");
        setLongField(term876, term876.getClass(), "id", 4178434741742309755L);
        setField(term876, term876.getClass(), "categoryName", "IgRJUzaCwW");
        setField(term876, term876.getClass(), "books", term890);
        setField(term862, term862.getClass(), "category", term876);
        setField(term862, term862.getClass(), "description", "JUmudUmaaV");
        setField(term862, term862.getClass(), "image_url", "KoyGrUJeJW");
        setIntField(term921, term921.getClass(), "signum", 1);
        setIntElement(term923, 0, 65188);
        setIntElement(term923, 1, 1319681440);
        setIntElement(term923, 2, -739534113);
        setIntElement(term923, 3, -1337808284);
        setIntElement(term923, 4, 786647436);
        setIntElement(term923, 5, -1827169985);
        setField(term921, term921.getClass(), "mag", term923);
        setIntField(term921, term921.getClass(), "bitCountPlusOne", 0);
        setIntField(term921, term921.getClass(), "bitLengthPlusOne", 0);
        setIntField(term921, term921.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term921, term921.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term920, term920.getClass(), "intVal", term921);
        setIntField(term920, term920.getClass(), "scale", 53);
        setIntField(term920, term920.getClass(), "precision", 0);
        setField(term920, term920.getClass(), "stringCache", null);
        setLongField(term920, term920.getClass(), "intCompact", -9223372036854775808L);
        setField(term862, term862.getClass(), "price", term920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HqBOwkVqjD";
        callMethod(klass, "setName", argTypes, term862, args);
    }

};



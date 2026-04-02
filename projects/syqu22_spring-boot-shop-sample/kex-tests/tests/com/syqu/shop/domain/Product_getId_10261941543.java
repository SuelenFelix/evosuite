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

public class Product_getId_10261941543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246;

    public Product_getId_10261941543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term275 = new HashMap();
        Set<Object> term341 =  ((Map) term275).keySet();
        HashSet term274 = new HashSet((Collection<? extends Object>) term341);
        term246 = newInstance(Class.forName("com.syqu.shop.domain.Product"));
        Object term260 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        Object term304 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term305 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term307 = (int[]) newIntArray(6);
        setLongField(term246, term246.getClass(), "id", 5270370404989704783L);
        setField(term246, term246.getClass(), "name", "hRNSzYYIrc");
        setLongField(term260, term260.getClass(), "id", 7411271909051562686L);
        setField(term260, term260.getClass(), "categoryName", "RMFIsYGgne");
        setField(term260, term260.getClass(), "books", term274);
        setField(term246, term246.getClass(), "category", term260);
        setField(term246, term246.getClass(), "description", "NRdvgJlhkX");
        setField(term246, term246.getClass(), "imageUrl", "uuaPigETmJ");
        setIntField(term305, term305.getClass(), "signum", 1);
        setIntElement(term307, 0, 3779);
        setIntElement(term307, 1, 1825499203);
        setIntElement(term307, 2, 189827582);
        setIntElement(term307, 3, 731025545);
        setIntElement(term307, 4, -475097163);
        setIntElement(term307, 5, 890127363);
        setField(term305, term305.getClass(), "mag", term307);
        setIntField(term305, term305.getClass(), "bitCountPlusOne", 0);
        setIntField(term305, term305.getClass(), "bitLengthPlusOne", 0);
        setIntField(term305, term305.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term305, term305.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term304, term304.getClass(), "intVal", term305);
        setIntField(term304, term304.getClass(), "scale", 52);
        setIntField(term304, term304.getClass(), "precision", 0);
        setField(term304, term304.getClass(), "stringCache", null);
        setLongField(term304, term304.getClass(), "intCompact", -9223372036854775808L);
        setField(term246, term246.getClass(), "price", term304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term246, args);
    }

};



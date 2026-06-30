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

public class Product_getDescription_15306485406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term612;

    public Product_getDescription_15306485406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term641 = new HashMap();
        Set<Object> term707 =  ((Map) term641).keySet();
        HashSet term640 = new HashSet((Collection<? extends Object>) term707);
        term612 = newInstance(Class.forName("com.syqu.shop.domain.Product"));
        Object term626 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        Object term670 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term671 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term673 = (int[]) newIntArray(6);
        setLongField(term612, term612.getClass(), "id", -2813493605142626659L);
        setField(term612, term612.getClass(), "name", "hNxWaHcfhY");
        setLongField(term626, term626.getClass(), "id", -8885298608300233488L);
        setField(term626, term626.getClass(), "categoryName", "RkybSrpybU");
        setField(term626, term626.getClass(), "books", term640);
        setField(term612, term612.getClass(), "category", term626);
        setField(term612, term612.getClass(), "description", "xOEqzGAmDU");
        setField(term612, term612.getClass(), "imageUrl", "eZFUvlxvGV");
        setIntField(term671, term671.getClass(), "signum", 1);
        setIntElement(term673, 0, 27489);
        setIntElement(term673, 1, -274433180);
        setIntElement(term673, 2, 698548608);
        setIntElement(term673, 3, -1143703655);
        setIntElement(term673, 4, 1619765041);
        setIntElement(term673, 5, -418227111);
        setField(term671, term671.getClass(), "mag", term673);
        setIntField(term671, term671.getClass(), "bitCountPlusOne", 0);
        setIntField(term671, term671.getClass(), "bitLengthPlusOne", 0);
        setIntField(term671, term671.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term671, term671.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term670, term670.getClass(), "intVal", term671);
        setIntField(term670, term670.getClass(), "scale", 53);
        setIntField(term670, term670.getClass(), "precision", 0);
        setField(term670, term670.getClass(), "stringCache", null);
        setLongField(term670, term670.getClass(), "intCompact", -9223372036854775808L);
        setField(term612, term612.getClass(), "price", term670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term612, args);
    }

};



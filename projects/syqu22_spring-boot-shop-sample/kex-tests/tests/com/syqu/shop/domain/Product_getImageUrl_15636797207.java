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

public class Product_getImageUrl_15636797207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term734;

    public Product_getImageUrl_15636797207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term763 = new HashMap();
        Set<Object> term829 =  ((Map) term763).keySet();
        HashSet term762 = new HashSet((Collection<? extends Object>) term829);
        term734 = newInstance(Class.forName("com.syqu.shop.domain.Product"));
        Object term748 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        Object term792 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term793 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term795 = (int[]) newIntArray(6);
        setLongField(term734, term734.getClass(), "id", -4325723315152823407L);
        setField(term734, term734.getClass(), "name", "BYqFIqCKAV");
        setLongField(term748, term748.getClass(), "id", 2535595959091595249L);
        setField(term748, term748.getClass(), "categoryName", "vrQLuWIDJX");
        setField(term748, term748.getClass(), "books", term762);
        setField(term734, term734.getClass(), "category", term748);
        setField(term734, term734.getClass(), "description", "flxyYxBRtu");
        setField(term734, term734.getClass(), "imageUrl", "OclPbYPkcH");
        setIntField(term793, term793.getClass(), "signum", 1);
        setIntElement(term795, 0, 1807);
        setIntElement(term795, 1, 1210968587);
        setIntElement(term795, 2, -857410878);
        setIntElement(term795, 3, 520383771);
        setIntElement(term795, 4, 2106706510);
        setIntElement(term795, 5, 1731185477);
        setField(term793, term793.getClass(), "mag", term795);
        setIntField(term793, term793.getClass(), "bitCountPlusOne", 0);
        setIntField(term793, term793.getClass(), "bitLengthPlusOne", 0);
        setIntField(term793, term793.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term793, term793.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term792, term792.getClass(), "intVal", term793);
        setIntField(term792, term792.getClass(), "scale", 52);
        setIntField(term792, term792.getClass(), "precision", 0);
        setField(term792, term792.getClass(), "stringCache", null);
        setLongField(term792, term792.getClass(), "intCompact", -9223372036854775808L);
        setField(term734, term734.getClass(), "price", term792);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term734, args);
    }

};



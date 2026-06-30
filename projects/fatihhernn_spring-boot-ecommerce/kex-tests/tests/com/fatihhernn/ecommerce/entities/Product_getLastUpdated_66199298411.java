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

public class Product_getLastUpdated_66199298411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2741;

    public Product_getLastUpdated_66199298411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2742 = new Long(5246058710498845622L);
        Long term2745 = new Long(4394651392080968777L);
        HashMap term2760 = new HashMap();
        Set<Object> term2847 =  ((Map) term2760).keySet();
        HashSet term2759 = new HashSet((Collection<? extends Object>) term2847);
        term2741 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term2744 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term2802 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2803 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2805 = (int[]) newIntArray(6);
        Object term2833 = newInstance(Class.forName("java.util.Date"));
        Object term2835 = newInstance(Class.forName("java.util.Date"));
        setField(term2741, term2741.getClass(), "id", term2742);
        setField(term2744, term2744.getClass(), "id", term2745);
        setField(term2744, term2744.getClass(), "categoryName", "mrqGHotaef");
        setField(term2744, term2744.getClass(), "products", term2759);
        setField(term2741, term2741.getClass(), "category", term2744);
        setField(term2741, term2741.getClass(), "sku", "xVFgeyYxZS");
        setField(term2741, term2741.getClass(), "name", "iQiGTulJiH");
        setField(term2741, term2741.getClass(), "description", "utCuuVCKqE");
        setIntField(term2803, term2803.getClass(), "signum", 1);
        setIntElement(term2805, 0, 42643);
        setIntElement(term2805, 1, 1081144233);
        setIntElement(term2805, 2, -1527105819);
        setIntElement(term2805, 3, -1056732389);
        setIntElement(term2805, 4, -975530795);
        setIntElement(term2805, 5, 1404469529);
        setField(term2803, term2803.getClass(), "mag", term2805);
        setIntField(term2803, term2803.getClass(), "bitCountPlusOne", 0);
        setIntField(term2803, term2803.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2803, term2803.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2803, term2803.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2802, term2802.getClass(), "intVal", term2803);
        setIntField(term2802, term2802.getClass(), "scale", 53);
        setIntField(term2802, term2802.getClass(), "precision", 0);
        setField(term2802, term2802.getClass(), "stringCache", null);
        setLongField(term2802, term2802.getClass(), "intCompact", -9223372036854775808L);
        setField(term2741, term2741.getClass(), "unitPrice", term2802);
        setField(term2741, term2741.getClass(), "imageUrl", "zSfoqzJbPT");
        setBooleanField(term2741, term2741.getClass(), "active", true);
        setIntField(term2741, term2741.getClass(), "unitsInStock", -209654048);
        setLongField(term2833, term2833.getClass(), "fastTime", 1838972963174L);
        setField(term2833, term2833.getClass(), "cdate", null);
        setField(term2741, term2741.getClass(), "dateCreated", term2833);
        setLongField(term2835, term2835.getClass(), "fastTime", 1498477973553L);
        setField(term2835, term2835.getClass(), "cdate", null);
        setField(term2741, term2741.getClass(), "lastUpdated", term2835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastUpdated", argTypes, term2741, args);
    }

};



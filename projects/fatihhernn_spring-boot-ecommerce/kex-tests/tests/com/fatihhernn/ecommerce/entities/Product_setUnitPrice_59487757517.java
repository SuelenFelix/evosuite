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

public class Product_setUnitPrice_59487757517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3764;
     Object term3860;

    public Product_setUnitPrice_59487757517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3765 = new Long(-5258945362776941718L);
        Long term3768 = new Long(24067105862153728L);
        HashMap term3783 = new HashMap();
        Set<Object> term3887 =  ((Map) term3783).keySet();
        HashSet term3782 = new HashSet((Collection<? extends Object>) term3887);
        term3764 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term3767 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term3825 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3826 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3828 = (int[]) newIntArray(6);
        Object term3856 = newInstance(Class.forName("java.util.Date"));
        Object term3858 = newInstance(Class.forName("java.util.Date"));
        setField(term3764, term3764.getClass(), "id", term3765);
        setField(term3767, term3767.getClass(), "id", term3768);
        setField(term3767, term3767.getClass(), "categoryName", "HejzvyejjG");
        setField(term3767, term3767.getClass(), "products", term3782);
        setField(term3764, term3764.getClass(), "category", term3767);
        setField(term3764, term3764.getClass(), "sku", "eBcTbweeYp");
        setField(term3764, term3764.getClass(), "name", "drcmjfQUDq");
        setField(term3764, term3764.getClass(), "description", "GjdWUoUSyA");
        setIntField(term3826, term3826.getClass(), "signum", 1);
        setIntElement(term3828, 0, 36339);
        setIntElement(term3828, 1, 480123013);
        setIntElement(term3828, 2, 938705555);
        setIntElement(term3828, 3, -378636844);
        setIntElement(term3828, 4, -1741135248);
        setIntElement(term3828, 5, -1148060083);
        setField(term3826, term3826.getClass(), "mag", term3828);
        setIntField(term3826, term3826.getClass(), "bitCountPlusOne", 0);
        setIntField(term3826, term3826.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3826, term3826.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3826, term3826.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3825, term3825.getClass(), "intVal", term3826);
        setIntField(term3825, term3825.getClass(), "scale", 53);
        setIntField(term3825, term3825.getClass(), "precision", 0);
        setField(term3825, term3825.getClass(), "stringCache", null);
        setLongField(term3825, term3825.getClass(), "intCompact", -9223372036854775808L);
        setField(term3764, term3764.getClass(), "unitPrice", term3825);
        setField(term3764, term3764.getClass(), "imageUrl", "YEkxWsWaUl");
        setBooleanField(term3764, term3764.getClass(), "active", false);
        setIntField(term3764, term3764.getClass(), "unitsInStock", -1533843432);
        setLongField(term3856, term3856.getClass(), "fastTime", 1589287310419L);
        setField(term3856, term3856.getClass(), "cdate", null);
        setField(term3764, term3764.getClass(), "dateCreated", term3856);
        setLongField(term3858, term3858.getClass(), "fastTime", 1689828992084L);
        setField(term3858, term3858.getClass(), "cdate", null);
        setField(term3764, term3764.getClass(), "lastUpdated", term3858);
        term3860 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3861 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3863 = (int[]) newIntArray(6);
        setIntField(term3861, term3861.getClass(), "signum", 1);
        setIntElement(term3863, 0, 41423);
        setIntElement(term3863, 1, -445091250);
        setIntElement(term3863, 2, 832549657);
        setIntElement(term3863, 3, -683613588);
        setIntElement(term3863, 4, -85227065);
        setIntElement(term3863, 5, 467794295);
        setField(term3861, term3861.getClass(), "mag", term3863);
        setIntField(term3861, term3861.getClass(), "bitCountPlusOne", 0);
        setIntField(term3861, term3861.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3861, term3861.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3861, term3861.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3860, term3860.getClass(), "intVal", term3861);
        setIntField(term3860, term3860.getClass(), "scale", 53);
        setIntField(term3860, term3860.getClass(), "precision", 0);
        setField(term3860, term3860.getClass(), "stringCache", null);
        setLongField(term3860, term3860.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term3860;
        callMethod(klass, "setUnitPrice", argTypes, term3764, args);
    }

};



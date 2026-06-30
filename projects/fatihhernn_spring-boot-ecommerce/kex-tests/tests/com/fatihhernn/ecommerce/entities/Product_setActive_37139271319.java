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
import java.lang.Boolean;

public class Product_setActive_37139271319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4115;
     Object term4211;

    public Product_setActive_37139271319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4116 = new Long(6315101499811179240L);
        Long term4119 = new Long(-3033337370154155851L);
        HashMap term4134 = new HashMap();
        Set<Object> term4223 =  ((Map) term4134).keySet();
        HashSet term4133 = new HashSet((Collection<? extends Object>) term4223);
        term4115 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term4118 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term4176 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4177 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4179 = (int[]) newIntArray(6);
        Object term4207 = newInstance(Class.forName("java.util.Date"));
        Object term4209 = newInstance(Class.forName("java.util.Date"));
        setField(term4115, term4115.getClass(), "id", term4116);
        setField(term4118, term4118.getClass(), "id", term4119);
        setField(term4118, term4118.getClass(), "categoryName", "SPQVzOlOzZ");
        setField(term4118, term4118.getClass(), "products", term4133);
        setField(term4115, term4115.getClass(), "category", term4118);
        setField(term4115, term4115.getClass(), "sku", "ocZcumnXEz");
        setField(term4115, term4115.getClass(), "name", "rNNwyactDR");
        setField(term4115, term4115.getClass(), "description", "QJrTMTdxyh");
        setIntField(term4177, term4177.getClass(), "signum", 1);
        setIntElement(term4179, 0, 35438);
        setIntElement(term4179, 1, 1464672276);
        setIntElement(term4179, 2, 2105366875);
        setIntElement(term4179, 3, -1732931527);
        setIntElement(term4179, 4, 1812340004);
        setIntElement(term4179, 5, 254550143);
        setField(term4177, term4177.getClass(), "mag", term4179);
        setIntField(term4177, term4177.getClass(), "bitCountPlusOne", 0);
        setIntField(term4177, term4177.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4177, term4177.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4177, term4177.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4176, term4176.getClass(), "intVal", term4177);
        setIntField(term4176, term4176.getClass(), "scale", 53);
        setIntField(term4176, term4176.getClass(), "precision", 0);
        setField(term4176, term4176.getClass(), "stringCache", null);
        setLongField(term4176, term4176.getClass(), "intCompact", -9223372036854775808L);
        setField(term4115, term4115.getClass(), "unitPrice", term4176);
        setField(term4115, term4115.getClass(), "imageUrl", "rgZSPplPSs");
        setBooleanField(term4115, term4115.getClass(), "active", true);
        setIntField(term4115, term4115.getClass(), "unitsInStock", 574481092);
        setLongField(term4207, term4207.getClass(), "fastTime", 1355447674618L);
        setField(term4207, term4207.getClass(), "cdate", null);
        setField(term4115, term4115.getClass(), "dateCreated", term4207);
        setLongField(term4209, term4209.getClass(), "fastTime", 1489372405062L);
        setField(term4209, term4209.getClass(), "cdate", null);
        setField(term4115, term4115.getClass(), "lastUpdated", term4209);
        term4211 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4211;
        callMethod(klass, "setActive", argTypes, term4115, args);
    }

};



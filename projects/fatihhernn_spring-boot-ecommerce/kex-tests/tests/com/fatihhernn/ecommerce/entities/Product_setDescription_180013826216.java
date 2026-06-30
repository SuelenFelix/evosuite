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

public class Product_setDescription_180013826216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3591;

    public Product_setDescription_180013826216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3592 = new Long(-6685235643232255177L);
        Long term3595 = new Long(-5656664340499957324L);
        HashMap term3610 = new HashMap();
        Set<Object> term3708 =  ((Map) term3610).keySet();
        HashSet term3609 = new HashSet((Collection<? extends Object>) term3708);
        term3591 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term3594 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term3652 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3653 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3655 = (int[]) newIntArray(5);
        Object term3682 = newInstance(Class.forName("java.util.Date"));
        Object term3684 = newInstance(Class.forName("java.util.Date"));
        setField(term3591, term3591.getClass(), "id", term3592);
        setField(term3594, term3594.getClass(), "id", term3595);
        setField(term3594, term3594.getClass(), "categoryName", "NTXQPWFYSA");
        setField(term3594, term3594.getClass(), "products", term3609);
        setField(term3591, term3591.getClass(), "category", term3594);
        setField(term3591, term3591.getClass(), "sku", "KyGbLglqbW");
        setField(term3591, term3591.getClass(), "name", "ZKVeStsSNT");
        setField(term3591, term3591.getClass(), "description", "cqCXYaAnFB");
        setIntField(term3653, term3653.getClass(), "signum", 1);
        setIntElement(term3655, 0, -2050910157);
        setIntElement(term3655, 1, 1047531883);
        setIntElement(term3655, 2, 703826928);
        setIntElement(term3655, 3, -1877771121);
        setIntElement(term3655, 4, -884532191);
        setField(term3653, term3653.getClass(), "mag", term3655);
        setIntField(term3653, term3653.getClass(), "bitCountPlusOne", 0);
        setIntField(term3653, term3653.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3653, term3653.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3653, term3653.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3652, term3652.getClass(), "intVal", term3653);
        setIntField(term3652, term3652.getClass(), "scale", 48);
        setIntField(term3652, term3652.getClass(), "precision", 0);
        setField(term3652, term3652.getClass(), "stringCache", null);
        setLongField(term3652, term3652.getClass(), "intCompact", -9223372036854775808L);
        setField(term3591, term3591.getClass(), "unitPrice", term3652);
        setField(term3591, term3591.getClass(), "imageUrl", "UPLNFZHXjw");
        setBooleanField(term3591, term3591.getClass(), "active", false);
        setIntField(term3591, term3591.getClass(), "unitsInStock", -519881101);
        setLongField(term3682, term3682.getClass(), "fastTime", 1331513661676L);
        setField(term3682, term3682.getClass(), "cdate", null);
        setField(term3591, term3591.getClass(), "dateCreated", term3682);
        setLongField(term3684, term3684.getClass(), "fastTime", 1478384856375L);
        setField(term3684, term3684.getClass(), "cdate", null);
        setField(term3591, term3591.getClass(), "lastUpdated", term3684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CwrrJlrGmg";
        callMethod(klass, "setDescription", argTypes, term3591, args);
    }

};



package legacyfighter.dietary;

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
import static legacyfighter.dietary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Product_incrementCounter_18807082632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45918;

    public Product_incrementCounter_18807082632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term45919 = new Long(-4468743939548166452L);
        term45918 = newInstance(Class.forName("legacyfighter.dietary.Product"));
        Object term45921 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term45922 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term45924 = (int[]) newIntArray(6);
        setField(term45918, term45918.getClass(), "id", term45919);
        setIntField(term45922, term45922.getClass(), "signum", 1);
        setIntElement(term45924, 0, 5101);
        setIntElement(term45924, 1, 915133706);
        setIntElement(term45924, 2, -368975873);
        setIntElement(term45924, 3, 724406895);
        setIntElement(term45924, 4, 132713401);
        setIntElement(term45924, 5, 90758719);
        setField(term45922, term45922.getClass(), "mag", term45924);
        setIntField(term45922, term45922.getClass(), "bitCountPlusOne", 0);
        setIntField(term45922, term45922.getClass(), "bitLengthPlusOne", 0);
        setIntField(term45922, term45922.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term45922, term45922.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term45921, term45921.getClass(), "intVal", term45922);
        setIntField(term45921, term45921.getClass(), "scale", 52);
        setIntField(term45921, term45921.getClass(), "precision", 0);
        setField(term45921, term45921.getClass(), "stringCache", null);
        setLongField(term45921, term45921.getClass(), "intCompact", -9223372036854775808L);
        setField(term45918, term45918.getClass(), "price", term45921);
        setField(term45918, term45918.getClass(), "product", "GnPrxkKUmR");
        setIntField(term45918, term45918.getClass(), "counter", 534508972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "incrementCounter", argTypes, term45918, args);
    }

};



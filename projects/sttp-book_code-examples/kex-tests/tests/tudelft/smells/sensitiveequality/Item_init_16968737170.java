package tudelft.smells.sensitiveequality;

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
import static tudelft.smells.sensitiveequality.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Item_init_16968737170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term15;

    public Item_init_16968737170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = new Integer(568599855);
        term15 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term16 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term18 = (int[]) newIntArray(6);
        setIntField(term16, term16.getClass(), "signum", 1);
        setIntElement(term18, 0, 9058);
        setIntElement(term18, 1, 1365043541);
        setIntElement(term18, 2, 1239861896);
        setIntElement(term18, 3, -1338148297);
        setIntElement(term18, 4, -418263970);
        setIntElement(term18, 5, -265097411);
        setField(term16, term16.getClass(), "mag", term18);
        setIntField(term16, term16.getClass(), "bitCountPlusOne", 0);
        setIntField(term16, term16.getClass(), "bitLengthPlusOne", 0);
        setIntField(term16, term16.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term16, term16.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term15, term15.getClass(), "intVal", term16);
        setIntField(term15, term15.getClass(), "scale", 53);
        setIntField(term15, term15.getClass(), "precision", 0);
        setField(term15, term15.getClass(), "stringCache", null);
        setLongField(term15, term15.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.smells.sensitiveequality.Item");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[3];
        args[0] = "PAEBtnZtTD";
        args[1] = term13;
        args[2] = term15;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



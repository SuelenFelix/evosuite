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
import java.lang.Object;

public class Item_getQty_3570690272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95;

    public Item_getQty_3570690272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95 = newInstance(Class.forName("tudelft.smells.sensitiveequality.Item"));
        Object term109 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term110 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term112 = (int[]) newIntArray(6);
        setField(term95, term95.getClass(), "name", "MuLcgQHgqz");
        setIntField(term95, term95.getClass(), "qty", 1484323161);
        setIntField(term110, term110.getClass(), "signum", 1);
        setIntElement(term112, 0, 3779);
        setIntElement(term112, 1, 1825499203);
        setIntElement(term112, 2, 189827582);
        setIntElement(term112, 3, 731025545);
        setIntElement(term112, 4, -475097163);
        setIntElement(term112, 5, 890127363);
        setField(term110, term110.getClass(), "mag", term112);
        setIntField(term110, term110.getClass(), "bitCountPlusOne", 0);
        setIntField(term110, term110.getClass(), "bitLengthPlusOne", 0);
        setIntField(term110, term110.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term110, term110.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term109, term109.getClass(), "intVal", term110);
        setIntField(term109, term109.getClass(), "scale", 52);
        setIntField(term109, term109.getClass(), "precision", 0);
        setField(term109, term109.getClass(), "stringCache", null);
        setLongField(term109, term109.getClass(), "intCompact", -9223372036854775808L);
        setField(term95, term95.getClass(), "individualPrice", term109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.smells.sensitiveequality.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQty", argTypes, term95, args);
    }

};



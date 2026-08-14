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

public class Item_getIndividualPrice_4678300783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142;

    public Item_getIndividualPrice_4678300783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142 = newInstance(Class.forName("tudelft.smells.sensitiveequality.Item"));
        Object term156 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term157 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term159 = (int[]) newIntArray(6);
        setField(term142, term142.getClass(), "name", "xxtlPwDYFs");
        setIntField(term142, term142.getClass(), "qty", 391863371);
        setIntField(term157, term157.getClass(), "signum", 1);
        setIntElement(term159, 0, 3726);
        setIntElement(term159, 1, 1561510548);
        setIntElement(term159, 2, 756973629);
        setIntElement(term159, 3, -1169068666);
        setIntElement(term159, 4, -1772498162);
        setIntElement(term159, 5, -1207241473);
        setField(term157, term157.getClass(), "mag", term159);
        setIntField(term157, term157.getClass(), "bitCountPlusOne", 0);
        setIntField(term157, term157.getClass(), "bitLengthPlusOne", 0);
        setIntField(term157, term157.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term157, term157.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term156, term156.getClass(), "intVal", term157);
        setIntField(term156, term156.getClass(), "scale", 52);
        setIntField(term156, term156.getClass(), "precision", 0);
        setField(term156, term156.getClass(), "stringCache", null);
        setLongField(term156, term156.getClass(), "intCompact", -9223372036854775808L);
        setField(term142, term142.getClass(), "individualPrice", term156);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.smells.sensitiveequality.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIndividualPrice", argTypes, term142, args);
    }

};



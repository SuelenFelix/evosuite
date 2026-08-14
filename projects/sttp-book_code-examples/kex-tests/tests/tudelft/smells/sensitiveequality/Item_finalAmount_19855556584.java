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

public class Item_finalAmount_19855556584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189;

    public Item_finalAmount_19855556584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189 = newInstance(Class.forName("tudelft.smells.sensitiveequality.Item"));
        Object term203 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term204 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term206 = (int[]) newIntArray(6);
        setField(term189, term189.getClass(), "name", "jJCZpVmanW");
        setIntField(term189, term189.getClass(), "qty", -1922583790);
        setIntField(term204, term204.getClass(), "signum", 1);
        setIntElement(term206, 0, 1954);
        setIntElement(term206, 1, -476668863);
        setIntElement(term206, 2, 661030673);
        setIntElement(term206, 3, 328061253);
        setIntElement(term206, 4, -431156338);
        setIntElement(term206, 5, 791621529);
        setField(term204, term204.getClass(), "mag", term206);
        setIntField(term204, term204.getClass(), "bitCountPlusOne", 0);
        setIntField(term204, term204.getClass(), "bitLengthPlusOne", 0);
        setIntField(term204, term204.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term204, term204.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term203, term203.getClass(), "intVal", term204);
        setIntField(term203, term203.getClass(), "scale", 52);
        setIntField(term203, term203.getClass(), "precision", 0);
        setField(term203, term203.getClass(), "stringCache", null);
        setLongField(term203, term203.getClass(), "intCompact", -9223372036854775808L);
        setField(term189, term189.getClass(), "individualPrice", term203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.smells.sensitiveequality.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "finalAmount", argTypes, term189, args);
    }

};



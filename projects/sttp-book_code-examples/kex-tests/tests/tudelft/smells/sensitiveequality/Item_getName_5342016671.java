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

public class Item_getName_5342016671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;

    public Item_getName_5342016671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("tudelft.smells.sensitiveequality.Item"));
        Object term62 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term63 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term65 = (int[]) newIntArray(6);
        setField(term48, term48.getClass(), "name", "sjlJAEtRrb");
        setIntField(term48, term48.getClass(), "qty", 1162663216);
        setIntField(term63, term63.getClass(), "signum", 1);
        setIntElement(term65, 0, 2364);
        setIntElement(term65, 1, -1446584625);
        setIntElement(term65, 2, 1957600567);
        setIntElement(term65, 3, -336418707);
        setIntElement(term65, 4, -1905211145);
        setIntElement(term65, 5, 86968353);
        setField(term63, term63.getClass(), "mag", term65);
        setIntField(term63, term63.getClass(), "bitCountPlusOne", 0);
        setIntField(term63, term63.getClass(), "bitLengthPlusOne", 0);
        setIntField(term63, term63.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term63, term63.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term62, term62.getClass(), "intVal", term63);
        setIntField(term62, term62.getClass(), "scale", 52);
        setIntField(term62, term62.getClass(), "precision", 0);
        setField(term62, term62.getClass(), "stringCache", null);
        setLongField(term62, term62.getClass(), "intCompact", -9223372036854775808L);
        setField(term48, term48.getClass(), "individualPrice", term62);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.smells.sensitiveequality.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term48, args);
    }

};



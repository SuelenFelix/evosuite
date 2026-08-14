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

public class Item_toString_16659594065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236;

    public Item_toString_16659594065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236 = newInstance(Class.forName("tudelft.smells.sensitiveequality.Item"));
        Object term250 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term251 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term253 = (int[]) newIntArray(6);
        setField(term236, term236.getClass(), "name", "EGtDIRbSSb");
        setIntField(term236, term236.getClass(), "qty", -616727354);
        setIntField(term251, term251.getClass(), "signum", 1);
        setIntElement(term253, 0, 27489);
        setIntElement(term253, 1, -274433180);
        setIntElement(term253, 2, 698548608);
        setIntElement(term253, 3, -1143703655);
        setIntElement(term253, 4, 1619765041);
        setIntElement(term253, 5, -418227111);
        setField(term251, term251.getClass(), "mag", term253);
        setIntField(term251, term251.getClass(), "bitCountPlusOne", 0);
        setIntField(term251, term251.getClass(), "bitLengthPlusOne", 0);
        setIntField(term251, term251.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term251, term251.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term250, term250.getClass(), "intVal", term251);
        setIntField(term250, term250.getClass(), "scale", 53);
        setIntField(term250, term250.getClass(), "precision", 0);
        setField(term250, term250.getClass(), "stringCache", null);
        setLongField(term250, term250.getClass(), "intCompact", -9223372036854775808L);
        setField(term236, term236.getClass(), "individualPrice", term250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.smells.sensitiveequality.Item");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term236, args);
    }

};



package legacyfighter.dietary.newproducts;

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
import static legacyfighter.dietary.newproducts.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OldProduct_decrementCounter_12049770051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333;

    public OldProduct_decrementCounter_12049770051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333 = newInstance(Class.forName("legacyfighter.dietary.newproducts.OldProduct"));
        Object term334 = newInstance(Class.forName("java.util.UUID"));
        Object term337 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Price"));
        Object term338 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term339 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term341 = (int[]) newIntArray(6);
        Object term355 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Description"));
        Object term380 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Counter"));
        setLongField(term334, term334.getClass(), "mostSigBits", 2442117782898005296L);
        setLongField(term334, term334.getClass(), "leastSigBits", 6375119433582206027L);
        setField(term333, term333.getClass(), "serialNumber", term334);
        setIntField(term339, term339.getClass(), "signum", 1);
        setIntElement(term341, 0, 27489);
        setIntElement(term341, 1, -274433180);
        setIntElement(term341, 2, 698548608);
        setIntElement(term341, 3, -1143703655);
        setIntElement(term341, 4, 1619765041);
        setIntElement(term341, 5, -418227111);
        setField(term339, term339.getClass(), "mag", term341);
        setIntField(term339, term339.getClass(), "bitCountPlusOne", 0);
        setIntField(term339, term339.getClass(), "bitLengthPlusOne", 0);
        setIntField(term339, term339.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term339, term339.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term338, term338.getClass(), "intVal", term339);
        setIntField(term338, term338.getClass(), "scale", 53);
        setIntField(term338, term338.getClass(), "precision", 0);
        setField(term338, term338.getClass(), "stringCache", null);
        setLongField(term338, term338.getClass(), "intCompact", -9223372036854775808L);
        setField(term337, term337.getClass(), "price", term338);
        setField(term333, term333.getClass(), "price", term337);
        setField(term355, term355.getClass(), "desc", "hRNSzYYIrc");
        setField(term355, term355.getClass(), "longDesc", "RMFIsYGgne");
        setField(term333, term333.getClass(), "desc", term355);
        setIntField(term380, term380.getClass(), "counter", -616727354);
        setField(term333, term333.getClass(), "counter", term380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.newproducts.OldProduct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "decrementCounter", argTypes, term333, args);
    }

};



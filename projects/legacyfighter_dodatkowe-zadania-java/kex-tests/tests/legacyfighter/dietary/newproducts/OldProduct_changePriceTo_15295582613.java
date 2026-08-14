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

public class OldProduct_changePriceTo_15295582613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term483;
     Object term532;

    public OldProduct_changePriceTo_15295582613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term483 = newInstance(Class.forName("legacyfighter.dietary.newproducts.OldProduct"));
        Object term484 = newInstance(Class.forName("java.util.UUID"));
        Object term487 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Price"));
        Object term488 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term489 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term491 = (int[]) newIntArray(6);
        Object term505 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Description"));
        Object term530 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Counter"));
        setLongField(term484, term484.getClass(), "mostSigBits", 5270370404989704783L);
        setLongField(term484, term484.getClass(), "leastSigBits", 7411271909051562686L);
        setField(term483, term483.getClass(), "serialNumber", term484);
        setIntField(term489, term489.getClass(), "signum", 1);
        setIntElement(term491, 0, 25264);
        setIntElement(term491, 1, 13306318);
        setIntElement(term491, 2, 145344007);
        setIntElement(term491, 3, -1015263393);
        setIntElement(term491, 4, -1366378930);
        setIntElement(term491, 5, 983206517);
        setField(term489, term489.getClass(), "mag", term491);
        setIntField(term489, term489.getClass(), "bitCountPlusOne", 0);
        setIntField(term489, term489.getClass(), "bitLengthPlusOne", 0);
        setIntField(term489, term489.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term489, term489.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term488, term488.getClass(), "intVal", term489);
        setIntField(term488, term488.getClass(), "scale", 53);
        setIntField(term488, term488.getClass(), "precision", 0);
        setField(term488, term488.getClass(), "stringCache", null);
        setLongField(term488, term488.getClass(), "intCompact", -9223372036854775808L);
        setField(term487, term487.getClass(), "price", term488);
        setField(term483, term483.getClass(), "price", term487);
        setField(term505, term505.getClass(), "desc", "MxlszYVzRf");
        setField(term505, term505.getClass(), "longDesc", "LQFpaHEwXR");
        setField(term483, term483.getClass(), "desc", term505);
        setIntField(term530, term530.getClass(), "counter", -2038273078);
        setField(term483, term483.getClass(), "counter", term530);
        term532 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term533 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term535 = (int[]) newIntArray(6);
        setIntField(term533, term533.getClass(), "signum", 1);
        setIntElement(term535, 0, 4157);
        setIntElement(term535, 1, -1258399411);
        setIntElement(term535, 2, -1445096589);
        setIntElement(term535, 3, 1602721280);
        setIntElement(term535, 4, 1738795194);
        setIntElement(term535, 5, -481877419);
        setField(term533, term533.getClass(), "mag", term535);
        setIntField(term533, term533.getClass(), "bitCountPlusOne", 0);
        setIntField(term533, term533.getClass(), "bitLengthPlusOne", 0);
        setIntField(term533, term533.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term533, term533.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term532, term532.getClass(), "intVal", term533);
        setIntField(term532, term532.getClass(), "scale", 52);
        setIntField(term532, term532.getClass(), "precision", 0);
        setField(term532, term532.getClass(), "stringCache", null);
        setLongField(term532, term532.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.newproducts.OldProduct");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term532;
        callMethod(klass, "changePriceTo", argTypes, term483, args);
    }

};



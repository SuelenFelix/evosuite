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

public class OldProduct_formatDesc_18464671975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660;

    public OldProduct_formatDesc_18464671975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term660 = newInstance(Class.forName("legacyfighter.dietary.newproducts.OldProduct"));
        Object term661 = newInstance(Class.forName("java.util.UUID"));
        Object term664 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Price"));
        Object term665 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term666 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term668 = (int[]) newIntArray(6);
        Object term682 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Description"));
        Object term707 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Counter"));
        setLongField(term661, term661.getClass(), "mostSigBits", -7237588299778557629L);
        setLongField(term661, term661.getClass(), "leastSigBits", 6967924379644551255L);
        setField(term660, term660.getClass(), "serialNumber", term661);
        setIntField(term666, term666.getClass(), "signum", 1);
        setIntElement(term668, 0, 579);
        setIntElement(term668, 1, -560540333);
        setIntElement(term668, 2, 1014435409);
        setIntElement(term668, 3, -1248929007);
        setIntElement(term668, 4, -42206956);
        setIntElement(term668, 5, 1817231305);
        setField(term666, term666.getClass(), "mag", term668);
        setIntField(term666, term666.getClass(), "bitCountPlusOne", 0);
        setIntField(term666, term666.getClass(), "bitLengthPlusOne", 0);
        setIntField(term666, term666.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term666, term666.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term665, term665.getClass(), "intVal", term666);
        setIntField(term665, term665.getClass(), "scale", 51);
        setIntField(term665, term665.getClass(), "precision", 0);
        setField(term665, term665.getClass(), "stringCache", null);
        setLongField(term665, term665.getClass(), "intCompact", -9223372036854775808L);
        setField(term664, term664.getClass(), "price", term665);
        setField(term660, term660.getClass(), "price", term664);
        setField(term682, term682.getClass(), "desc", "ZiaGIbnzTs");
        setField(term682, term682.getClass(), "longDesc", "tbcdzjIfER");
        setField(term660, term660.getClass(), "desc", term682);
        setIntField(term707, term707.getClass(), "counter", -1339778481);
        setField(term660, term660.getClass(), "counter", term707);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.newproducts.OldProduct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "formatDesc", argTypes, term660, args);
    }

};



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

public class OldProduct_getPrice_601133966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term735;

    public OldProduct_getPrice_601133966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term735 = newInstance(Class.forName("legacyfighter.dietary.newproducts.OldProduct"));
        Object term736 = newInstance(Class.forName("java.util.UUID"));
        Object term739 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Price"));
        Object term740 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term741 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term743 = (int[]) newIntArray(6);
        Object term757 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Description"));
        Object term782 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Counter"));
        setLongField(term736, term736.getClass(), "mostSigBits", -2813493605142626659L);
        setLongField(term736, term736.getClass(), "leastSigBits", -8885298608300233488L);
        setField(term735, term735.getClass(), "serialNumber", term736);
        setIntField(term741, term741.getClass(), "signum", 1);
        setIntElement(term743, 0, 35465);
        setIntElement(term743, 1, 1599162976);
        setIntElement(term743, 2, -1427811280);
        setIntElement(term743, 3, -224241601);
        setIntElement(term743, 4, -1115150417);
        setIntElement(term743, 5, 212641299);
        setField(term741, term741.getClass(), "mag", term743);
        setIntField(term741, term741.getClass(), "bitCountPlusOne", 0);
        setIntField(term741, term741.getClass(), "bitLengthPlusOne", 0);
        setIntField(term741, term741.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term741, term741.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term740, term740.getClass(), "intVal", term741);
        setIntField(term740, term740.getClass(), "scale", 53);
        setIntField(term740, term740.getClass(), "precision", 0);
        setField(term740, term740.getClass(), "stringCache", null);
        setLongField(term740, term740.getClass(), "intCompact", -9223372036854775808L);
        setField(term739, term739.getClass(), "price", term740);
        setField(term735, term735.getClass(), "price", term739);
        setField(term757, term757.getClass(), "desc", "HyxfbSQYBe");
        setField(term757, term757.getClass(), "longDesc", "pCTimMblYc");
        setField(term735, term735.getClass(), "desc", term757);
        setIntField(term782, term782.getClass(), "counter", 1725571209);
        setField(term735, term735.getClass(), "counter", term782);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.newproducts.OldProduct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term735, args);
    }

};



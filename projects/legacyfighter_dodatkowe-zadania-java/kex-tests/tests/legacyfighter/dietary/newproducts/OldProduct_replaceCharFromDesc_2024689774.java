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
import java.lang.Character;

public class OldProduct_replaceCharFromDesc_2024689774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term581;
     Object term630;
     Object term632;

    public OldProduct_replaceCharFromDesc_2024689774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term581 = newInstance(Class.forName("legacyfighter.dietary.newproducts.OldProduct"));
        Object term582 = newInstance(Class.forName("java.util.UUID"));
        Object term585 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Price"));
        Object term586 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term587 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term589 = (int[]) newIntArray(6);
        Object term603 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Description"));
        Object term628 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Counter"));
        setLongField(term582, term582.getClass(), "mostSigBits", 4872422362414183754L);
        setLongField(term582, term582.getClass(), "leastSigBits", 6811161968424632369L);
        setField(term581, term581.getClass(), "serialNumber", term582);
        setIntField(term587, term587.getClass(), "signum", 1);
        setIntElement(term589, 0, 2584);
        setIntElement(term589, 1, -1946484122);
        setIntElement(term589, 2, 1992026795);
        setIntElement(term589, 3, 1045205752);
        setIntElement(term589, 4, 613377469);
        setIntElement(term589, 5, -1848020175);
        setField(term587, term587.getClass(), "mag", term589);
        setIntField(term587, term587.getClass(), "bitCountPlusOne", 0);
        setIntField(term587, term587.getClass(), "bitLengthPlusOne", 0);
        setIntField(term587, term587.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term587, term587.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term586, term586.getClass(), "intVal", term587);
        setIntField(term586, term586.getClass(), "scale", 52);
        setIntField(term586, term586.getClass(), "precision", 0);
        setField(term586, term586.getClass(), "stringCache", null);
        setLongField(term586, term586.getClass(), "intCompact", -9223372036854775808L);
        setField(term585, term585.getClass(), "price", term586);
        setField(term581, term581.getClass(), "price", term585);
        setField(term603, term603.getClass(), "desc", "oVcInYnLWB");
        setField(term603, term603.getClass(), "longDesc", "aJlieCFVtF");
        setField(term581, term581.getClass(), "desc", term603);
        setIntField(term628, term628.getClass(), "counter", 1227103734);
        setField(term581, term581.getClass(), "counter", term628);
        term630 = new Character('E');
        term632 = new Character('B');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.newproducts.OldProduct");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term630;
        args[1] = term632;
        callMethod(klass, "replaceCharFromDesc", argTypes, term581, args);
    }

};



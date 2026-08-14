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

public class OldProduct_incrementCounter_16944812072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408;

    public OldProduct_incrementCounter_16944812072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term408 = newInstance(Class.forName("legacyfighter.dietary.newproducts.OldProduct"));
        Object term409 = newInstance(Class.forName("java.util.UUID"));
        Object term412 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Price"));
        Object term413 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term414 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term416 = (int[]) newIntArray(6);
        Object term430 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Description"));
        Object term455 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Counter"));
        setLongField(term409, term409.getClass(), "mostSigBits", -8257434502486459194L);
        setLongField(term409, term409.getClass(), "leastSigBits", -8400487765614892086L);
        setField(term408, term408.getClass(), "serialNumber", term409);
        setIntField(term414, term414.getClass(), "signum", 1);
        setIntElement(term416, 0, 1807);
        setIntElement(term416, 1, 1210968587);
        setIntElement(term416, 2, -857410878);
        setIntElement(term416, 3, 520383771);
        setIntElement(term416, 4, 2106706510);
        setIntElement(term416, 5, 1731185477);
        setField(term414, term414.getClass(), "mag", term416);
        setIntField(term414, term414.getClass(), "bitCountPlusOne", 0);
        setIntField(term414, term414.getClass(), "bitLengthPlusOne", 0);
        setIntField(term414, term414.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term414, term414.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term413, term413.getClass(), "intVal", term414);
        setIntField(term413, term413.getClass(), "scale", 52);
        setIntField(term413, term413.getClass(), "precision", 0);
        setField(term413, term413.getClass(), "stringCache", null);
        setLongField(term413, term413.getClass(), "intCompact", -9223372036854775808L);
        setField(term412, term412.getClass(), "price", term413);
        setField(term408, term408.getClass(), "price", term412);
        setField(term430, term430.getClass(), "desc", "NRdvgJlhkX");
        setField(term430, term430.getClass(), "longDesc", "uuaPigETmJ");
        setField(term408, term408.getClass(), "desc", term430);
        setIntField(term455, term455.getClass(), "counter", -1955890973);
        setField(term408, term408.getClass(), "counter", term455);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.newproducts.OldProduct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "incrementCounter", argTypes, term408, args);
    }

};



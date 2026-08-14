package tudelft.smells.readability;

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
import static tudelft.smells.readability.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Invoice_calculate_12639600141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301;

    public Invoice_calculate_12639600141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term359 = Class.forName((String) "tudelft.smells.readability.CustomerType");
        Field term358 = ((Class) term359).getDeclaredField((String) "COMPANY");
        ((Field) term358).setAccessible(true);
        Object enum1 = ((Field) term358).get((Object) null);
        term301 = newInstance(Class.forName("tudelft.smells.readability.Invoice"));
        Object term302 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term303 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term305 = (int[]) newIntArray(6);
        setIntField(term303, term303.getClass(), "signum", 1);
        setIntElement(term305, 0, 2364);
        setIntElement(term305, 1, -1446584625);
        setIntElement(term305, 2, 1957600567);
        setIntElement(term305, 3, -336418707);
        setIntElement(term305, 4, -1905211145);
        setIntElement(term305, 5, 86968353);
        setField(term303, term303.getClass(), "mag", term305);
        setIntField(term303, term303.getClass(), "bitCountPlusOne", 0);
        setIntField(term303, term303.getClass(), "bitLengthPlusOne", 0);
        setIntField(term303, term303.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term303, term303.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term302, term302.getClass(), "intVal", term303);
        setIntField(term302, term302.getClass(), "scale", 52);
        setIntField(term302, term302.getClass(), "precision", 0);
        setField(term302, term302.getClass(), "stringCache", null);
        setLongField(term302, term302.getClass(), "intCompact", -9223372036854775808L);
        setField(term301, term301.getClass(), "value", term302);
        setField(term301, term301.getClass(), "country", "sjlJAEtRrb");
        setField(term301, term301.getClass(), "customerType", enum1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.smells.readability.Invoice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculate", argTypes, term301, args);
    }

};



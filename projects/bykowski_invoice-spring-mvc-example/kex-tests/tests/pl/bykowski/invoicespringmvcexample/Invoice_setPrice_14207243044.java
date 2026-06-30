package pl.bykowski.invoicespringmvcexample;

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
import static pl.bykowski.invoicespringmvcexample.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Invoice_setPrice_14207243044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497;
     Object term533;

    public Invoice_setPrice_14207243044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term498 = new Long(6811161968424632369L);
        term497 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.Invoice"));
        Object term500 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term501 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term503 = (int[]) newIntArray(6);
        Object term517 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term497, term497.getClass(), "id", term498);
        setIntField(term501, term501.getClass(), "signum", 1);
        setIntElement(term503, 0, 27489);
        setIntElement(term503, 1, -274433180);
        setIntElement(term503, 2, 698548608);
        setIntElement(term503, 3, -1143703655);
        setIntElement(term503, 4, 1619765041);
        setIntElement(term503, 5, -418227111);
        setField(term501, term501.getClass(), "mag", term503);
        setIntField(term501, term501.getClass(), "bitCountPlusOne", 0);
        setIntField(term501, term501.getClass(), "bitLengthPlusOne", 0);
        setIntField(term501, term501.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term501, term501.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term500, term500.getClass(), "intVal", term501);
        setIntField(term500, term500.getClass(), "scale", 53);
        setIntField(term500, term500.getClass(), "precision", 0);
        setField(term500, term500.getClass(), "stringCache", null);
        setLongField(term500, term500.getClass(), "intCompact", -9223372036854775808L);
        setField(term497, term497.getClass(), "price", term500);
        setIntField(term517, term517.getClass(), "year", 2018);
        setShortField(term517, term517.getClass(), "month", (short) 1);
        setShortField(term517, term517.getClass(), "day", (short) 13);
        setField(term497, term497.getClass(), "date", term517);
        setField(term497, term497.getClass(), "name", "NRdvgJlhkX");
        term533 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term534 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term536 = (int[]) newIntArray(6);
        setIntField(term534, term534.getClass(), "signum", 1);
        setIntElement(term536, 0, 1807);
        setIntElement(term536, 1, 1210968587);
        setIntElement(term536, 2, -857410878);
        setIntElement(term536, 3, 520383771);
        setIntElement(term536, 4, 2106706510);
        setIntElement(term536, 5, 1731185477);
        setField(term534, term534.getClass(), "mag", term536);
        setIntField(term534, term534.getClass(), "bitCountPlusOne", 0);
        setIntField(term534, term534.getClass(), "bitLengthPlusOne", 0);
        setIntField(term534, term534.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term534, term534.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term533, term533.getClass(), "intVal", term534);
        setIntField(term533, term533.getClass(), "scale", 52);
        setIntField(term533, term533.getClass(), "precision", 0);
        setField(term533, term533.getClass(), "stringCache", null);
        setLongField(term533, term533.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pl.bykowski.invoicespringmvcexample.Invoice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term533;
        callMethod(klass, "setPrice", argTypes, term497, args);
    }

};



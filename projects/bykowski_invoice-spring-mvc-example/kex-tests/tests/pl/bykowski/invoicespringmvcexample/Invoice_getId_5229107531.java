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

public class Invoice_getId_5229107531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339;

    public Invoice_getId_5229107531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term340 = new Long(-8400487765614892086L);
        term339 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.Invoice"));
        Object term342 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term343 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term345 = (int[]) newIntArray(6);
        Object term359 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term339, term339.getClass(), "id", term340);
        setIntField(term343, term343.getClass(), "signum", 1);
        setIntElement(term345, 0, 3779);
        setIntElement(term345, 1, 1825499203);
        setIntElement(term345, 2, 189827582);
        setIntElement(term345, 3, 731025545);
        setIntElement(term345, 4, -475097163);
        setIntElement(term345, 5, 890127363);
        setField(term343, term343.getClass(), "mag", term345);
        setIntField(term343, term343.getClass(), "bitCountPlusOne", 0);
        setIntField(term343, term343.getClass(), "bitLengthPlusOne", 0);
        setIntField(term343, term343.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term343, term343.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term342, term342.getClass(), "intVal", term343);
        setIntField(term342, term342.getClass(), "scale", 52);
        setIntField(term342, term342.getClass(), "precision", 0);
        setField(term342, term342.getClass(), "stringCache", null);
        setLongField(term342, term342.getClass(), "intCompact", -9223372036854775808L);
        setField(term339, term339.getClass(), "price", term342);
        setIntField(term359, term359.getClass(), "year", 2021);
        setShortField(term359, term359.getClass(), "month", (short) 1);
        setShortField(term359, term359.getClass(), "day", (short) 18);
        setField(term339, term339.getClass(), "date", term359);
        setField(term339, term339.getClass(), "name", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pl.bykowski.invoicespringmvcexample.Invoice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term339, args);
    }

};



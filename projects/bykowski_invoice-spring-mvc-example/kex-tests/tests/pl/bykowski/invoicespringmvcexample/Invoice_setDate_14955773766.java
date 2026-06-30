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

public class Invoice_setDate_14955773766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term624;
     Object term660;

    public Invoice_setDate_14955773766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term625 = new Long(6967924379644551255L);
        term624 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.Invoice"));
        Object term627 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term628 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term630 = (int[]) newIntArray(6);
        Object term644 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term624, term624.getClass(), "id", term625);
        setIntField(term628, term628.getClass(), "signum", 1);
        setIntElement(term630, 0, 4157);
        setIntElement(term630, 1, -1258399411);
        setIntElement(term630, 2, -1445096589);
        setIntElement(term630, 3, 1602721280);
        setIntElement(term630, 4, 1738795194);
        setIntElement(term630, 5, -481877419);
        setField(term628, term628.getClass(), "mag", term630);
        setIntField(term628, term628.getClass(), "bitCountPlusOne", 0);
        setIntField(term628, term628.getClass(), "bitLengthPlusOne", 0);
        setIntField(term628, term628.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term628, term628.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term627, term627.getClass(), "intVal", term628);
        setIntField(term627, term627.getClass(), "scale", 52);
        setIntField(term627, term627.getClass(), "precision", 0);
        setField(term627, term627.getClass(), "stringCache", null);
        setLongField(term627, term627.getClass(), "intCompact", -9223372036854775808L);
        setField(term624, term624.getClass(), "price", term627);
        setIntField(term644, term644.getClass(), "year", 2017);
        setShortField(term644, term644.getClass(), "month", (short) 5);
        setShortField(term644, term644.getClass(), "day", (short) 21);
        setField(term624, term624.getClass(), "date", term644);
        setField(term624, term624.getClass(), "name", "MxlszYVzRf");
        term660 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term660, term660.getClass(), "year", 2022);
        setShortField(term660, term660.getClass(), "month", (short) 2);
        setShortField(term660, term660.getClass(), "day", (short) 25);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pl.bykowski.invoicespringmvcexample.Invoice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term660;
        callMethod(klass, "setDate", argTypes, term624, args);
    }

};



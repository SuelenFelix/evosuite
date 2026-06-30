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

public class Invoice_setId_9529525112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391;
     Object term427;

    public Invoice_setId_9529525112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term392 = new Long(5270370404989704783L);
        term391 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.Invoice"));
        Object term394 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term395 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term397 = (int[]) newIntArray(6);
        Object term411 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term391, term391.getClass(), "id", term392);
        setIntField(term395, term395.getClass(), "signum", 1);
        setIntElement(term397, 0, 3726);
        setIntElement(term397, 1, 1561510548);
        setIntElement(term397, 2, 756973629);
        setIntElement(term397, 3, -1169068666);
        setIntElement(term397, 4, -1772498162);
        setIntElement(term397, 5, -1207241473);
        setField(term395, term395.getClass(), "mag", term397);
        setIntField(term395, term395.getClass(), "bitCountPlusOne", 0);
        setIntField(term395, term395.getClass(), "bitLengthPlusOne", 0);
        setIntField(term395, term395.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term395, term395.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term394, term394.getClass(), "intVal", term395);
        setIntField(term394, term394.getClass(), "scale", 52);
        setIntField(term394, term394.getClass(), "precision", 0);
        setField(term394, term394.getClass(), "stringCache", null);
        setLongField(term394, term394.getClass(), "intCompact", -9223372036854775808L);
        setField(term391, term391.getClass(), "price", term394);
        setIntField(term411, term411.getClass(), "year", 2020);
        setShortField(term411, term411.getClass(), "month", (short) 11);
        setShortField(term411, term411.getClass(), "day", (short) 22);
        setField(term391, term391.getClass(), "date", term411);
        setField(term391, term391.getClass(), "name", "hRNSzYYIrc");
        term427 = new Long(7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pl.bykowski.invoicespringmvcexample.Invoice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term427;
        callMethod(klass, "setId", argTypes, term391, args);
    }

};



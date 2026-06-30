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

public class Invoice_getDate_2290406025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term572;

    public Invoice_getDate_2290406025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term573 = new Long(-7237588299778557629L);
        term572 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.Invoice"));
        Object term575 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term576 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term578 = (int[]) newIntArray(6);
        Object term592 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term572, term572.getClass(), "id", term573);
        setIntField(term576, term576.getClass(), "signum", 1);
        setIntElement(term578, 0, 25264);
        setIntElement(term578, 1, 13306318);
        setIntElement(term578, 2, 145344007);
        setIntElement(term578, 3, -1015263393);
        setIntElement(term578, 4, -1366378930);
        setIntElement(term578, 5, 983206517);
        setField(term576, term576.getClass(), "mag", term578);
        setIntField(term576, term576.getClass(), "bitCountPlusOne", 0);
        setIntField(term576, term576.getClass(), "bitLengthPlusOne", 0);
        setIntField(term576, term576.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term576, term576.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term575, term575.getClass(), "intVal", term576);
        setIntField(term575, term575.getClass(), "scale", 53);
        setIntField(term575, term575.getClass(), "precision", 0);
        setField(term575, term575.getClass(), "stringCache", null);
        setLongField(term575, term575.getClass(), "intCompact", -9223372036854775808L);
        setField(term572, term572.getClass(), "price", term575);
        setIntField(term592, term592.getClass(), "year", 2015);
        setShortField(term592, term592.getClass(), "month", (short) 4);
        setShortField(term592, term592.getClass(), "day", (short) 14);
        setField(term572, term572.getClass(), "date", term592);
        setField(term572, term572.getClass(), "name", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pl.bykowski.invoicespringmvcexample.Invoice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term572, args);
    }

};



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

public class Invoice_getPrice_6531561563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445;

    public Invoice_getPrice_6531561563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term446 = new Long(4872422362414183754L);
        term445 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.Invoice"));
        Object term448 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term449 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term451 = (int[]) newIntArray(6);
        Object term465 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term445, term445.getClass(), "id", term446);
        setIntField(term449, term449.getClass(), "signum", 1);
        setIntElement(term451, 0, 1954);
        setIntElement(term451, 1, -476668863);
        setIntElement(term451, 2, 661030673);
        setIntElement(term451, 3, 328061253);
        setIntElement(term451, 4, -431156338);
        setIntElement(term451, 5, 791621529);
        setField(term449, term449.getClass(), "mag", term451);
        setIntField(term449, term449.getClass(), "bitCountPlusOne", 0);
        setIntField(term449, term449.getClass(), "bitLengthPlusOne", 0);
        setIntField(term449, term449.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term449, term449.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term448, term448.getClass(), "intVal", term449);
        setIntField(term448, term448.getClass(), "scale", 52);
        setIntField(term448, term448.getClass(), "precision", 0);
        setField(term448, term448.getClass(), "stringCache", null);
        setLongField(term448, term448.getClass(), "intCompact", -9223372036854775808L);
        setField(term445, term445.getClass(), "price", term448);
        setIntField(term465, term465.getClass(), "year", 2015);
        setShortField(term465, term465.getClass(), "month", (short) 9);
        setShortField(term465, term465.getClass(), "day", (short) 19);
        setField(term445, term445.getClass(), "date", term465);
        setField(term445, term445.getClass(), "name", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pl.bykowski.invoicespringmvcexample.Invoice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term445, args);
    }

};



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

public class Invoice_setName_3707227568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732;

    public Invoice_setName_3707227568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term733 = new Long(-8885298608300233488L);
        term732 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.Invoice"));
        Object term735 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term736 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term738 = (int[]) newIntArray(6);
        Object term752 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term732, term732.getClass(), "id", term733);
        setIntField(term736, term736.getClass(), "signum", 1);
        setIntElement(term738, 0, 579);
        setIntElement(term738, 1, -560540333);
        setIntElement(term738, 2, 1014435409);
        setIntElement(term738, 3, -1248929007);
        setIntElement(term738, 4, -42206956);
        setIntElement(term738, 5, 1817231305);
        setField(term736, term736.getClass(), "mag", term738);
        setIntField(term736, term736.getClass(), "bitCountPlusOne", 0);
        setIntField(term736, term736.getClass(), "bitLengthPlusOne", 0);
        setIntField(term736, term736.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term736, term736.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term735, term735.getClass(), "intVal", term736);
        setIntField(term735, term735.getClass(), "scale", 51);
        setIntField(term735, term735.getClass(), "precision", 0);
        setField(term735, term735.getClass(), "stringCache", null);
        setLongField(term735, term735.getClass(), "intCompact", -9223372036854775808L);
        setField(term732, term732.getClass(), "price", term735);
        setIntField(term752, term752.getClass(), "year", 2026);
        setShortField(term752, term752.getClass(), "month", (short) 12);
        setShortField(term752, term752.getClass(), "day", (short) 13);
        setField(term732, term732.getClass(), "date", term752);
        setField(term732, term732.getClass(), "name", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pl.bykowski.invoicespringmvcexample.Invoice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aJlieCFVtF";
        callMethod(klass, "setName", argTypes, term732, args);
    }

};



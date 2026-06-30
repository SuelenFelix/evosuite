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

public class Invoice_getName_20905993247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term680;

    public Invoice_getName_20905993247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term681 = new Long(-2813493605142626659L);
        term680 = newInstance(Class.forName("pl.bykowski.invoicespringmvcexample.Invoice"));
        Object term683 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term684 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term686 = (int[]) newIntArray(6);
        Object term700 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term680, term680.getClass(), "id", term681);
        setIntField(term684, term684.getClass(), "signum", 1);
        setIntElement(term686, 0, 2584);
        setIntElement(term686, 1, -1946484122);
        setIntElement(term686, 2, 1992026795);
        setIntElement(term686, 3, 1045205752);
        setIntElement(term686, 4, 613377469);
        setIntElement(term686, 5, -1848020175);
        setField(term684, term684.getClass(), "mag", term686);
        setIntField(term684, term684.getClass(), "bitCountPlusOne", 0);
        setIntField(term684, term684.getClass(), "bitLengthPlusOne", 0);
        setIntField(term684, term684.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term684, term684.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term683, term683.getClass(), "intVal", term684);
        setIntField(term683, term683.getClass(), "scale", 52);
        setIntField(term683, term683.getClass(), "precision", 0);
        setField(term683, term683.getClass(), "stringCache", null);
        setLongField(term683, term683.getClass(), "intCompact", -9223372036854775808L);
        setField(term680, term680.getClass(), "price", term683);
        setIntField(term700, term700.getClass(), "year", 2017);
        setShortField(term700, term700.getClass(), "month", (short) 7);
        setShortField(term700, term700.getClass(), "day", (short) 22);
        setField(term680, term680.getClass(), "date", term700);
        setField(term680, term680.getClass(), "name", "LQFpaHEwXR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pl.bykowski.invoicespringmvcexample.Invoice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term680, args);
    }

};



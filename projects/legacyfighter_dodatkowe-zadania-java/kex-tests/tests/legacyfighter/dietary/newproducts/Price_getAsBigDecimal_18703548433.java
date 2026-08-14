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

public class Price_getAsBigDecimal_18703548433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;

    public Price_getAsBigDecimal_18703548433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Price"));
        Object term94 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term95 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term97 = (int[]) newIntArray(6);
        setIntField(term95, term95.getClass(), "signum", 1);
        setIntElement(term97, 0, 3726);
        setIntElement(term97, 1, 1561510548);
        setIntElement(term97, 2, 756973629);
        setIntElement(term97, 3, -1169068666);
        setIntElement(term97, 4, -1772498162);
        setIntElement(term97, 5, -1207241473);
        setField(term95, term95.getClass(), "mag", term97);
        setIntField(term95, term95.getClass(), "bitCountPlusOne", 0);
        setIntField(term95, term95.getClass(), "bitLengthPlusOne", 0);
        setIntField(term95, term95.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term95, term95.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term94, term94.getClass(), "intVal", term95);
        setIntField(term94, term94.getClass(), "scale", 52);
        setIntField(term94, term94.getClass(), "precision", 0);
        setField(term94, term94.getClass(), "stringCache", null);
        setLongField(term94, term94.getClass(), "intCompact", -9223372036854775808L);
        setField(term93, term93.getClass(), "price", term94);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.newproducts.Price");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAsBigDecimal", argTypes, term93, args);
    }

};



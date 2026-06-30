package space.gavinklfong.invest.forex.dtos;

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
import static space.gavinklfong.invest.forex.dtos.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Long;

public class ForexRateBookingReq_canEqual_61229674912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5255;
     Object term5306;

    public ForexRateBookingReq_canEqual_61229674912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5334 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term5333 = ((Class) term5334).getDeclaredField((String) "BUY");
        ((Field) term5333).setAccessible(true);
        Object enum14 = ((Field) term5333).get((Object) null);
        Long term5304 = new Long(-4325723315152823407L);
        term5255 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq"));
        Object term5280 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5281 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5283 = (int[]) newIntArray(6);
        setField(term5255, term5255.getClass(), "baseCurrency", "YRHGsAkhxb");
        setField(term5255, term5255.getClass(), "counterCurrency", "ffYhPOzlUs");
        setIntField(term5281, term5281.getClass(), "signum", 1);
        setIntElement(term5283, 0, 523);
        setIntElement(term5283, 1, -954467915);
        setIntElement(term5283, 2, 1892307494);
        setIntElement(term5283, 3, -1066736592);
        setIntElement(term5283, 4, 433326655);
        setIntElement(term5283, 5, -242716133);
        setField(term5281, term5281.getClass(), "mag", term5283);
        setIntField(term5281, term5281.getClass(), "bitCountPlusOne", 0);
        setIntField(term5281, term5281.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5281, term5281.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5281, term5281.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5280, term5280.getClass(), "intVal", term5281);
        setIntField(term5280, term5280.getClass(), "scale", 51);
        setIntField(term5280, term5280.getClass(), "precision", 0);
        setField(term5280, term5280.getClass(), "stringCache", null);
        setLongField(term5280, term5280.getClass(), "intCompact", -9223372036854775808L);
        setField(term5255, term5255.getClass(), "baseCurrencyAmount", term5280);
        setField(term5255, term5255.getClass(), "tradeAction", enum14);
        setField(term5255, term5255.getClass(), "customerId", term5304);
        term5306 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5306;
        callMethod(klass, "canEqual", argTypes, term5255, args);
    }

};



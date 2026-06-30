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

public class ForexRateBookingReq_setCounterCurrency_17680858207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3293;

    public ForexRateBookingReq_setCounterCurrency_17680858207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3384 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term3383 = ((Class) term3384).getDeclaredField((String) "SELL");
        ((Field) term3383).setAccessible(true);
        Object enum8 = ((Field) term3383).get((Object) null);
        Long term3343 = new Long(4872422362414183754L);
        term3293 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq"));
        Object term3318 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3319 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3321 = (int[]) newIntArray(6);
        setField(term3293, term3293.getClass(), "baseCurrency", "BndsHwAFMv");
        setField(term3293, term3293.getClass(), "counterCurrency", "GzFkzHGYFt");
        setIntField(term3319, term3319.getClass(), "signum", 1);
        setIntElement(term3321, 0, 1807);
        setIntElement(term3321, 1, 1210968587);
        setIntElement(term3321, 2, -857410878);
        setIntElement(term3321, 3, 520383771);
        setIntElement(term3321, 4, 2106706510);
        setIntElement(term3321, 5, 1731185477);
        setField(term3319, term3319.getClass(), "mag", term3321);
        setIntField(term3319, term3319.getClass(), "bitCountPlusOne", 0);
        setIntField(term3319, term3319.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3319, term3319.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3319, term3319.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3318, term3318.getClass(), "intVal", term3319);
        setIntField(term3318, term3318.getClass(), "scale", 52);
        setIntField(term3318, term3318.getClass(), "precision", 0);
        setField(term3318, term3318.getClass(), "stringCache", null);
        setLongField(term3318, term3318.getClass(), "intCompact", -9223372036854775808L);
        setField(term3293, term3293.getClass(), "baseCurrencyAmount", term3318);
        setField(term3293, term3293.getClass(), "tradeAction", enum8);
        setField(term3293, term3293.getClass(), "customerId", term3343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tShwQLRGNe";
        callMethod(klass, "setCounterCurrency", argTypes, term3293, args);
    }

};



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
import java.lang.Long;
import java.lang.Object;
import java.lang.Double;
import java.lang.String;

public class ForexRateBooking_getCounterCurrency_13364486767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16587;

    public ForexRateBooking_getCounterCurrency_13364486767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16588 = new Long(3825396310311739952L);
        Double term16617 = new Double(0.5306473989087822);
        Class<? extends Object> term16681 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term16680 = ((Class) term16681).getDeclaredField((String) "BUY");
        ((Field) term16680).setAccessible(true);
        Object enum39 = ((Field) term16680).get((Object) null);
        Long term16658 = new Long(-3838084482494604218L);
        term16587 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term16590 = newInstance(Class.forName("java.time.Instant"));
        Object term16626 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term16627 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term16629 = (int[]) newIntArray(6);
        Object term16655 = newInstance(Class.forName("java.time.Instant"));
        setField(term16587, term16587.getClass(), "id", term16588);
        setLongField(term16590, term16590.getClass(), "seconds", 1882638884L);
        setIntField(term16590, term16590.getClass(), "nanos", 364000000);
        setField(term16587, term16587.getClass(), "timestamp", term16590);
        setField(term16587, term16587.getClass(), "baseCurrency", "qCpEbQDHdF");
        setField(term16587, term16587.getClass(), "counterCurrency", "AHbZyFOmlo");
        setField(term16587, term16587.getClass(), "rate", term16617);
        setField(term16587, term16587.getClass(), "tradeAction", enum39);
        setIntField(term16627, term16627.getClass(), "signum", 1);
        setIntElement(term16629, 0, 6075);
        setIntElement(term16629, 1, 643134713);
        setIntElement(term16629, 2, 1498303159);
        setIntElement(term16629, 3, 2100111685);
        setIntElement(term16629, 4, -716193830);
        setIntElement(term16629, 5, -101865319);
        setField(term16627, term16627.getClass(), "mag", term16629);
        setIntField(term16627, term16627.getClass(), "bitCountPlusOne", 0);
        setIntField(term16627, term16627.getClass(), "bitLengthPlusOne", 0);
        setIntField(term16627, term16627.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term16627, term16627.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term16626, term16626.getClass(), "intVal", term16627);
        setIntField(term16626, term16626.getClass(), "scale", 52);
        setIntField(term16626, term16626.getClass(), "precision", 0);
        setField(term16626, term16626.getClass(), "stringCache", null);
        setLongField(term16626, term16626.getClass(), "intCompact", -9223372036854775808L);
        setField(term16587, term16587.getClass(), "baseCurrencyAmount", term16626);
        setField(term16587, term16587.getClass(), "bookingRef", "TwfWVQGiIj");
        setLongField(term16655, term16655.getClass(), "seconds", 1437757323L);
        setIntField(term16655, term16655.getClass(), "nanos", 580000000);
        setField(term16587, term16587.getClass(), "expiryTime", term16655);
        setField(term16587, term16587.getClass(), "customerId", term16658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCounterCurrency", argTypes, term16587, args);
    }

};



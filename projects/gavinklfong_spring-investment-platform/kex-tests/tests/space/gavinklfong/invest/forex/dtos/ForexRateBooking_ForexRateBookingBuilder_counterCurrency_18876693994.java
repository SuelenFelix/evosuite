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

public class ForexRateBooking_ForexRateBookingBuilder_counterCurrency_18876693994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35584;

    public ForexRateBooking_ForexRateBookingBuilder_counterCurrency_18876693994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term35585 = new Long(-1539859611880912454L);
        Double term35614 = new Double(0.5725602309856443);
        Class<? extends Object> term35691 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term35690 = ((Class) term35691).getDeclaredField((String) "SELL");
        ((Field) term35690).setAccessible(true);
        Object enum88 = ((Field) term35690).get((Object) null);
        Long term35656 = new Long(4100236067313034103L);
        term35584 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder"));
        Object term35587 = newInstance(Class.forName("java.time.Instant"));
        Object term35624 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term35625 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term35627 = (int[]) newIntArray(6);
        Object term35653 = newInstance(Class.forName("java.time.Instant"));
        setField(term35584, term35584.getClass(), "id", term35585);
        setLongField(term35587, term35587.getClass(), "seconds", 1589746751L);
        setIntField(term35587, term35587.getClass(), "nanos", 309000000);
        setField(term35584, term35584.getClass(), "timestamp", term35587);
        setField(term35584, term35584.getClass(), "baseCurrency", "cdHYQDgUZR");
        setField(term35584, term35584.getClass(), "counterCurrency", "KAORSSPSeV");
        setField(term35584, term35584.getClass(), "rate", term35614);
        setField(term35584, term35584.getClass(), "tradeAction", enum88);
        setIntField(term35625, term35625.getClass(), "signum", 1);
        setIntElement(term35627, 0, 21647);
        setIntElement(term35627, 1, 1735893587);
        setIntElement(term35627, 2, -186278954);
        setIntElement(term35627, 3, -1796424405);
        setIntElement(term35627, 4, 832618896);
        setIntElement(term35627, 5, 1306867747);
        setField(term35625, term35625.getClass(), "mag", term35627);
        setIntField(term35625, term35625.getClass(), "bitCountPlusOne", 0);
        setIntField(term35625, term35625.getClass(), "bitLengthPlusOne", 0);
        setIntField(term35625, term35625.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term35625, term35625.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term35624, term35624.getClass(), "intVal", term35625);
        setIntField(term35624, term35624.getClass(), "scale", 53);
        setIntField(term35624, term35624.getClass(), "precision", 0);
        setField(term35624, term35624.getClass(), "stringCache", null);
        setLongField(term35624, term35624.getClass(), "intCompact", -9223372036854775808L);
        setField(term35584, term35584.getClass(), "baseCurrencyAmount", term35624);
        setField(term35584, term35584.getClass(), "bookingRef", "UimMMORkzd");
        setLongField(term35653, term35653.getClass(), "seconds", 1291280367L);
        setIntField(term35653, term35653.getClass(), "nanos", 982000000);
        setField(term35584, term35584.getClass(), "expiryTime", term35653);
        setField(term35584, term35584.getClass(), "customerId", term35656);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "huVIXUWLtI";
        callMethod(klass, "counterCurrency", argTypes, term35584, args);
    }

};



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

public class ForexRateBooking_setExpiryTime_53853909222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22373;
     Object term22446;

    public ForexRateBooking_setExpiryTime_53853909222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22374 = new Long(-8876856890348836498L);
        Double term22403 = new Double(0.32554480512985284);
        Class<? extends Object> term22470 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term22469 = ((Class) term22470).getDeclaredField((String) "BUY");
        ((Field) term22469).setAccessible(true);
        Object enum55 = ((Field) term22469).get((Object) null);
        Long term22444 = new Long(846579494941632714L);
        term22373 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term22376 = newInstance(Class.forName("java.time.Instant"));
        Object term22412 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term22413 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term22415 = (int[]) newIntArray(6);
        Object term22441 = newInstance(Class.forName("java.time.Instant"));
        setField(term22373, term22373.getClass(), "id", term22374);
        setLongField(term22376, term22376.getClass(), "seconds", 1400691778L);
        setIntField(term22376, term22376.getClass(), "nanos", 698000000);
        setField(term22373, term22373.getClass(), "timestamp", term22376);
        setField(term22373, term22373.getClass(), "baseCurrency", "NHbOFFjyVK");
        setField(term22373, term22373.getClass(), "counterCurrency", "zaloBqlrSo");
        setField(term22373, term22373.getClass(), "rate", term22403);
        setField(term22373, term22373.getClass(), "tradeAction", enum55);
        setIntField(term22413, term22413.getClass(), "signum", 1);
        setIntElement(term22415, 0, 14189);
        setIntElement(term22415, 1, 785840466);
        setIntElement(term22415, 2, -643465696);
        setIntElement(term22415, 3, -1472118014);
        setIntElement(term22415, 4, -1221161484);
        setIntElement(term22415, 5, 1730786501);
        setField(term22413, term22413.getClass(), "mag", term22415);
        setIntField(term22413, term22413.getClass(), "bitCountPlusOne", 0);
        setIntField(term22413, term22413.getClass(), "bitLengthPlusOne", 0);
        setIntField(term22413, term22413.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term22413, term22413.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term22412, term22412.getClass(), "intVal", term22413);
        setIntField(term22412, term22412.getClass(), "scale", 53);
        setIntField(term22412, term22412.getClass(), "precision", 0);
        setField(term22412, term22412.getClass(), "stringCache", null);
        setLongField(term22412, term22412.getClass(), "intCompact", -9223372036854775808L);
        setField(term22373, term22373.getClass(), "baseCurrencyAmount", term22412);
        setField(term22373, term22373.getClass(), "bookingRef", "vvoLrMGCoN");
        setLongField(term22441, term22441.getClass(), "seconds", 1741444563L);
        setIntField(term22441, term22441.getClass(), "nanos", 811000000);
        setField(term22373, term22373.getClass(), "expiryTime", term22441);
        setField(term22373, term22373.getClass(), "customerId", term22444);
        term22446 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term22446, term22446.getClass(), "seconds", 1761994701L);
        setIntField(term22446, term22446.getClass(), "nanos", 322000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term22446;
        callMethod(klass, "setExpiryTime", argTypes, term22373, args);
    }

};



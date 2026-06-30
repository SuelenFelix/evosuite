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

public class ForexRateBooking_ForexRateBookingBuilder_baseCurrencyAmount_4148590247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36700;
     Object term36774;

    public ForexRateBooking_ForexRateBookingBuilder_baseCurrencyAmount_4148590247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term36701 = new Long(-8121849829073967555L);
        Double term36730 = new Double(0.22227423914231126);
        Class<? extends Object> term36812 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term36811 = ((Class) term36812).getDeclaredField((String) "SELL");
        ((Field) term36811).setAccessible(true);
        Object enum91 = ((Field) term36811).get((Object) null);
        Long term36772 = new Long(5219030281405653303L);
        term36700 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder"));
        Object term36703 = newInstance(Class.forName("java.time.Instant"));
        Object term36740 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term36741 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term36743 = (int[]) newIntArray(6);
        Object term36769 = newInstance(Class.forName("java.time.Instant"));
        setField(term36700, term36700.getClass(), "id", term36701);
        setLongField(term36703, term36703.getClass(), "seconds", 1369539267L);
        setIntField(term36703, term36703.getClass(), "nanos", 611000000);
        setField(term36700, term36700.getClass(), "timestamp", term36703);
        setField(term36700, term36700.getClass(), "baseCurrency", "tJzmOfcUnY");
        setField(term36700, term36700.getClass(), "counterCurrency", "TKlccZUpjz");
        setField(term36700, term36700.getClass(), "rate", term36730);
        setField(term36700, term36700.getClass(), "tradeAction", enum91);
        setIntField(term36741, term36741.getClass(), "signum", 1);
        setIntElement(term36743, 0, 11624);
        setIntElement(term36743, 1, 578034838);
        setIntElement(term36743, 2, -1341793795);
        setIntElement(term36743, 3, -1646117673);
        setIntElement(term36743, 4, -1867488856);
        setIntElement(term36743, 5, 800679379);
        setField(term36741, term36741.getClass(), "mag", term36743);
        setIntField(term36741, term36741.getClass(), "bitCountPlusOne", 0);
        setIntField(term36741, term36741.getClass(), "bitLengthPlusOne", 0);
        setIntField(term36741, term36741.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term36741, term36741.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term36740, term36740.getClass(), "intVal", term36741);
        setIntField(term36740, term36740.getClass(), "scale", 53);
        setIntField(term36740, term36740.getClass(), "precision", 0);
        setField(term36740, term36740.getClass(), "stringCache", null);
        setLongField(term36740, term36740.getClass(), "intCompact", -9223372036854775808L);
        setField(term36700, term36700.getClass(), "baseCurrencyAmount", term36740);
        setField(term36700, term36700.getClass(), "bookingRef", "GGzwMoHZXC");
        setLongField(term36769, term36769.getClass(), "seconds", 1510275079L);
        setIntField(term36769, term36769.getClass(), "nanos", 351000000);
        setField(term36700, term36700.getClass(), "expiryTime", term36769);
        setField(term36700, term36700.getClass(), "customerId", term36772);
        term36774 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term36775 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term36777 = (int[]) newIntArray(6);
        setIntField(term36775, term36775.getClass(), "signum", 1);
        setIntElement(term36777, 0, 26);
        setIntElement(term36777, 1, -510190044);
        setIntElement(term36777, 2, -2019485371);
        setIntElement(term36777, 3, -1939415235);
        setIntElement(term36777, 4, 583285455);
        setIntElement(term36777, 5, 1998243531);
        setField(term36775, term36775.getClass(), "mag", term36777);
        setIntField(term36775, term36775.getClass(), "bitCountPlusOne", 0);
        setIntField(term36775, term36775.getClass(), "bitLengthPlusOne", 0);
        setIntField(term36775, term36775.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term36775, term36775.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term36774, term36774.getClass(), "intVal", term36775);
        setIntField(term36774, term36774.getClass(), "scale", 50);
        setIntField(term36774, term36774.getClass(), "precision", 0);
        setField(term36774, term36774.getClass(), "stringCache", null);
        setLongField(term36774, term36774.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term36774;
        callMethod(klass, "baseCurrencyAmount", argTypes, term36700, args);
    }

};



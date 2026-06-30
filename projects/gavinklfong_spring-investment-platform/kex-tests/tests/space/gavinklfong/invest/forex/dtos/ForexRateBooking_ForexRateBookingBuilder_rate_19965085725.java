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

public class ForexRateBooking_ForexRateBookingBuilder_rate_19965085725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35970;
     Object term36044;

    public ForexRateBooking_ForexRateBookingBuilder_rate_19965085725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term35971 = new Long(1195529027276497124L);
        Double term36000 = new Double(0.5310967137636303);
        Class<? extends Object> term36067 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term36066 = ((Class) term36067).getDeclaredField((String) "SELL");
        ((Field) term36066).setAccessible(true);
        Object enum89 = ((Field) term36066).get((Object) null);
        Long term36042 = new Long(-2783999800714825789L);
        term35970 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder"));
        Object term35973 = newInstance(Class.forName("java.time.Instant"));
        Object term36010 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term36011 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term36013 = (int[]) newIntArray(6);
        Object term36039 = newInstance(Class.forName("java.time.Instant"));
        setField(term35970, term35970.getClass(), "id", term35971);
        setLongField(term35973, term35973.getClass(), "seconds", 1491181740L);
        setIntField(term35973, term35973.getClass(), "nanos", 539000000);
        setField(term35970, term35970.getClass(), "timestamp", term35973);
        setField(term35970, term35970.getClass(), "baseCurrency", "vhKzFyKPOT");
        setField(term35970, term35970.getClass(), "counterCurrency", "nQhIgWXdRc");
        setField(term35970, term35970.getClass(), "rate", term36000);
        setField(term35970, term35970.getClass(), "tradeAction", enum89);
        setIntField(term36011, term36011.getClass(), "signum", 1);
        setIntElement(term36013, 0, 603);
        setIntElement(term36013, 1, 1995754179);
        setIntElement(term36013, 2, -1797675876);
        setIntElement(term36013, 3, -758791830);
        setIntElement(term36013, 4, 1650264963);
        setIntElement(term36013, 5, 1414474999);
        setField(term36011, term36011.getClass(), "mag", term36013);
        setIntField(term36011, term36011.getClass(), "bitCountPlusOne", 0);
        setIntField(term36011, term36011.getClass(), "bitLengthPlusOne", 0);
        setIntField(term36011, term36011.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term36011, term36011.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term36010, term36010.getClass(), "intVal", term36011);
        setIntField(term36010, term36010.getClass(), "scale", 51);
        setIntField(term36010, term36010.getClass(), "precision", 0);
        setField(term36010, term36010.getClass(), "stringCache", null);
        setLongField(term36010, term36010.getClass(), "intCompact", -9223372036854775808L);
        setField(term35970, term35970.getClass(), "baseCurrencyAmount", term36010);
        setField(term35970, term35970.getClass(), "bookingRef", "EusenEbIoF");
        setLongField(term36039, term36039.getClass(), "seconds", 1461996881L);
        setIntField(term36039, term36039.getClass(), "nanos", 310000000);
        setField(term35970, term35970.getClass(), "expiryTime", term36039);
        setField(term35970, term35970.getClass(), "customerId", term36042);
        term36044 = new Double(0.6054109236809134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term36044;
        callMethod(klass, "rate", argTypes, term35970, args);
    }

};



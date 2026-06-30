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

public class ForexRateBooking_ForexRateBookingBuilder_customerId_203042053410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37832;
     Object term37906;

    public ForexRateBooking_ForexRateBookingBuilder_customerId_203042053410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term37833 = new Long(3427570961451840069L);
        Double term37862 = new Double(0.23129126164078717);
        Class<? extends Object> term37929 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term37928 = ((Class) term37929).getDeclaredField((String) "SELL");
        ((Field) term37928).setAccessible(true);
        Object enum94 = ((Field) term37928).get((Object) null);
        Long term37904 = new Long(4502292577098212311L);
        term37832 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder"));
        Object term37835 = newInstance(Class.forName("java.time.Instant"));
        Object term37872 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term37873 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term37875 = (int[]) newIntArray(6);
        Object term37901 = newInstance(Class.forName("java.time.Instant"));
        setField(term37832, term37832.getClass(), "id", term37833);
        setLongField(term37835, term37835.getClass(), "seconds", 1830753077L);
        setIntField(term37835, term37835.getClass(), "nanos", 357000000);
        setField(term37832, term37832.getClass(), "timestamp", term37835);
        setField(term37832, term37832.getClass(), "baseCurrency", "YsUtbngnRO");
        setField(term37832, term37832.getClass(), "counterCurrency", "JisaWUxcNb");
        setField(term37832, term37832.getClass(), "rate", term37862);
        setField(term37832, term37832.getClass(), "tradeAction", enum94);
        setIntField(term37873, term37873.getClass(), "signum", 1);
        setIntElement(term37875, 0, 6203);
        setIntElement(term37875, 1, -271272818);
        setIntElement(term37875, 2, 1804821170);
        setIntElement(term37875, 3, -574376818);
        setIntElement(term37875, 4, 1430103076);
        setIntElement(term37875, 5, -1121881081);
        setField(term37873, term37873.getClass(), "mag", term37875);
        setIntField(term37873, term37873.getClass(), "bitCountPlusOne", 0);
        setIntField(term37873, term37873.getClass(), "bitLengthPlusOne", 0);
        setIntField(term37873, term37873.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term37873, term37873.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term37872, term37872.getClass(), "intVal", term37873);
        setIntField(term37872, term37872.getClass(), "scale", 53);
        setIntField(term37872, term37872.getClass(), "precision", 0);
        setField(term37872, term37872.getClass(), "stringCache", null);
        setLongField(term37872, term37872.getClass(), "intCompact", -9223372036854775808L);
        setField(term37832, term37832.getClass(), "baseCurrencyAmount", term37872);
        setField(term37832, term37832.getClass(), "bookingRef", "NxgmYPzWCI");
        setLongField(term37901, term37901.getClass(), "seconds", 1618594705L);
        setIntField(term37901, term37901.getClass(), "nanos", 278000000);
        setField(term37832, term37832.getClass(), "expiryTime", term37901);
        setField(term37832, term37832.getClass(), "customerId", term37904);
        term37906 = new Long(-3730936709704460408L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term37906;
        callMethod(klass, "customerId", argTypes, term37832, args);
    }

};



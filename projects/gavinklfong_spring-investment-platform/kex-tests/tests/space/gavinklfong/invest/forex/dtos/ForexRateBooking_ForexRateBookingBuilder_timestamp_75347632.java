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

public class ForexRateBooking_ForexRateBookingBuilder_timestamp_75347632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34839;
     Object term34912;

    public ForexRateBooking_ForexRateBookingBuilder_timestamp_75347632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term34840 = new Long(-8603648071751666348L);
        Double term34869 = new Double(0.18717846301066243);
        Class<? extends Object> term34936 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term34935 = ((Class) term34936).getDeclaredField((String) "BUY");
        ((Field) term34935).setAccessible(true);
        Object enum86 = ((Field) term34935).get((Object) null);
        Long term34910 = new Long(-7884871963229073324L);
        term34839 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder"));
        Object term34842 = newInstance(Class.forName("java.time.Instant"));
        Object term34878 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term34879 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term34881 = (int[]) newIntArray(6);
        Object term34907 = newInstance(Class.forName("java.time.Instant"));
        setField(term34839, term34839.getClass(), "id", term34840);
        setLongField(term34842, term34842.getClass(), "seconds", 1465782799L);
        setIntField(term34842, term34842.getClass(), "nanos", 700000000);
        setField(term34839, term34839.getClass(), "timestamp", term34842);
        setField(term34839, term34839.getClass(), "baseCurrency", "WPxXsahPRq");
        setField(term34839, term34839.getClass(), "counterCurrency", "IENRuqmwUU");
        setField(term34839, term34839.getClass(), "rate", term34869);
        setField(term34839, term34839.getClass(), "tradeAction", enum86);
        setIntField(term34879, term34879.getClass(), "signum", 1);
        setIntElement(term34881, 0, 314);
        setIntElement(term34881, 1, 59411772);
        setIntElement(term34881, 2, 1710341337);
        setIntElement(term34881, 3, -2063763524);
        setIntElement(term34881, 4, 347921884);
        setIntElement(term34881, 5, 1590826931);
        setField(term34879, term34879.getClass(), "mag", term34881);
        setIntField(term34879, term34879.getClass(), "bitCountPlusOne", 0);
        setIntField(term34879, term34879.getClass(), "bitLengthPlusOne", 0);
        setIntField(term34879, term34879.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term34879, term34879.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term34878, term34878.getClass(), "intVal", term34879);
        setIntField(term34878, term34878.getClass(), "scale", 52);
        setIntField(term34878, term34878.getClass(), "precision", 0);
        setField(term34878, term34878.getClass(), "stringCache", null);
        setLongField(term34878, term34878.getClass(), "intCompact", -9223372036854775808L);
        setField(term34839, term34839.getClass(), "baseCurrencyAmount", term34878);
        setField(term34839, term34839.getClass(), "bookingRef", "GsWxOwXvSu");
        setLongField(term34907, term34907.getClass(), "seconds", 1597421765L);
        setIntField(term34907, term34907.getClass(), "nanos", 774000000);
        setField(term34839, term34839.getClass(), "expiryTime", term34907);
        setField(term34839, term34839.getClass(), "customerId", term34910);
        term34912 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term34912, term34912.getClass(), "seconds", 1354735325L);
        setIntField(term34912, term34912.getClass(), "nanos", 477000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term34912;
        callMethod(klass, "timestamp", argTypes, term34839, args);
    }

};



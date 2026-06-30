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

public class ForexRateBooking_ForexRateBookingBuilder_baseCurrency_2726210543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35202;

    public ForexRateBooking_ForexRateBookingBuilder_baseCurrency_2726210543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term35203 = new Long(-8649738738252714180L);
        Double term35232 = new Double(0.5335953039331021);
        Class<? extends Object> term35308 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term35307 = ((Class) term35308).getDeclaredField((String) "BUY");
        ((Field) term35307).setAccessible(true);
        Object enum87 = ((Field) term35307).get((Object) null);
        Long term35273 = new Long(-7278883608542636188L);
        term35202 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder"));
        Object term35205 = newInstance(Class.forName("java.time.Instant"));
        Object term35241 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term35242 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term35244 = (int[]) newIntArray(6);
        Object term35270 = newInstance(Class.forName("java.time.Instant"));
        setField(term35202, term35202.getClass(), "id", term35203);
        setLongField(term35205, term35205.getClass(), "seconds", 1415426053L);
        setIntField(term35205, term35205.getClass(), "nanos", 422000000);
        setField(term35202, term35202.getClass(), "timestamp", term35205);
        setField(term35202, term35202.getClass(), "baseCurrency", "bKBSncrMEZ");
        setField(term35202, term35202.getClass(), "counterCurrency", "yeSXGqQExb");
        setField(term35202, term35202.getClass(), "rate", term35232);
        setField(term35202, term35202.getClass(), "tradeAction", enum87);
        setIntField(term35242, term35242.getClass(), "signum", 1);
        setIntElement(term35244, 0, 2481);
        setIntElement(term35244, 1, 565097047);
        setIntElement(term35244, 2, 48361716);
        setIntElement(term35244, 3, -644681228);
        setIntElement(term35244, 4, -1562232204);
        setIntElement(term35244, 5, -622313005);
        setField(term35242, term35242.getClass(), "mag", term35244);
        setIntField(term35242, term35242.getClass(), "bitCountPlusOne", 0);
        setIntField(term35242, term35242.getClass(), "bitLengthPlusOne", 0);
        setIntField(term35242, term35242.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term35242, term35242.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term35241, term35241.getClass(), "intVal", term35242);
        setIntField(term35241, term35241.getClass(), "scale", 52);
        setIntField(term35241, term35241.getClass(), "precision", 0);
        setField(term35241, term35241.getClass(), "stringCache", null);
        setLongField(term35241, term35241.getClass(), "intCompact", -9223372036854775808L);
        setField(term35202, term35202.getClass(), "baseCurrencyAmount", term35241);
        setField(term35202, term35202.getClass(), "bookingRef", "uXYcXVYJZM");
        setLongField(term35270, term35270.getClass(), "seconds", 1359786657L);
        setIntField(term35270, term35270.getClass(), "nanos", 69000000);
        setField(term35202, term35202.getClass(), "expiryTime", term35270);
        setField(term35202, term35202.getClass(), "customerId", term35273);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BJhjdJUhkz";
        callMethod(klass, "baseCurrency", argTypes, term35202, args);
    }

};



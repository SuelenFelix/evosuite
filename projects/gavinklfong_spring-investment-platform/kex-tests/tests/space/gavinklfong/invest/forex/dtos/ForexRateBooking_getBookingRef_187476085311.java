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

public class ForexRateBooking_getBookingRef_187476085311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18031;

    public ForexRateBooking_getBookingRef_187476085311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18032 = new Long(-8658027316505137504L);
        Double term18061 = new Double(0.5308350402051779);
        Class<? extends Object> term18126 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term18125 = ((Class) term18126).getDeclaredField((String) "SELL");
        ((Field) term18125).setAccessible(true);
        Object enum43 = ((Field) term18125).get((Object) null);
        Long term18103 = new Long(414749984815662075L);
        term18031 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term18034 = newInstance(Class.forName("java.time.Instant"));
        Object term18071 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term18072 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term18074 = (int[]) newIntArray(6);
        Object term18100 = newInstance(Class.forName("java.time.Instant"));
        setField(term18031, term18031.getClass(), "id", term18032);
        setLongField(term18034, term18034.getClass(), "seconds", 1347400561L);
        setIntField(term18034, term18034.getClass(), "nanos", 385000000);
        setField(term18031, term18031.getClass(), "timestamp", term18034);
        setField(term18031, term18031.getClass(), "baseCurrency", "ShIELyuULw");
        setField(term18031, term18031.getClass(), "counterCurrency", "IpQuOGMgmj");
        setField(term18031, term18031.getClass(), "rate", term18061);
        setField(term18031, term18031.getClass(), "tradeAction", enum43);
        setIntField(term18072, term18072.getClass(), "signum", 1);
        setIntElement(term18074, 0, 401);
        setIntElement(term18074, 1, -590196483);
        setIntElement(term18074, 2, 2126931709);
        setIntElement(term18074, 3, 1543000854);
        setIntElement(term18074, 4, 1590753847);
        setIntElement(term18074, 5, 1431251521);
        setField(term18072, term18072.getClass(), "mag", term18074);
        setIntField(term18072, term18072.getClass(), "bitCountPlusOne", 0);
        setIntField(term18072, term18072.getClass(), "bitLengthPlusOne", 0);
        setIntField(term18072, term18072.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term18072, term18072.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term18071, term18071.getClass(), "intVal", term18072);
        setIntField(term18071, term18071.getClass(), "scale", 51);
        setIntField(term18071, term18071.getClass(), "precision", 0);
        setField(term18071, term18071.getClass(), "stringCache", null);
        setLongField(term18071, term18071.getClass(), "intCompact", -9223372036854775808L);
        setField(term18031, term18031.getClass(), "baseCurrencyAmount", term18071);
        setField(term18031, term18031.getClass(), "bookingRef", "pJbnHTYrxn");
        setLongField(term18100, term18100.getClass(), "seconds", 1502158153L);
        setIntField(term18100, term18100.getClass(), "nanos", 899000000);
        setField(term18031, term18031.getClass(), "expiryTime", term18100);
        setField(term18031, term18031.getClass(), "customerId", term18103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBookingRef", argTypes, term18031, args);
    }

};



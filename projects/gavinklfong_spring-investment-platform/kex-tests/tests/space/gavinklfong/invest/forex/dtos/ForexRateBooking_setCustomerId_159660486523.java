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

public class ForexRateBooking_setCustomerId_159660486523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22736;
     Object term22809;

    public ForexRateBooking_setCustomerId_159660486523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22737 = new Long(6689117472719450333L);
        Double term22766 = new Double(0.8924855581421237);
        Class<? extends Object> term22832 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term22831 = ((Class) term22832).getDeclaredField((String) "BUY");
        ((Field) term22831).setAccessible(true);
        Object enum56 = ((Field) term22831).get((Object) null);
        Long term22807 = new Long(5836128569274066678L);
        term22736 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term22739 = newInstance(Class.forName("java.time.Instant"));
        Object term22775 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term22776 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term22778 = (int[]) newIntArray(6);
        Object term22804 = newInstance(Class.forName("java.time.Instant"));
        setField(term22736, term22736.getClass(), "id", term22737);
        setLongField(term22739, term22739.getClass(), "seconds", 1695425269L);
        setIntField(term22739, term22739.getClass(), "nanos", 458000000);
        setField(term22736, term22736.getClass(), "timestamp", term22739);
        setField(term22736, term22736.getClass(), "baseCurrency", "pXdglvyrQe");
        setField(term22736, term22736.getClass(), "counterCurrency", "OcfNzHYdki");
        setField(term22736, term22736.getClass(), "rate", term22766);
        setField(term22736, term22736.getClass(), "tradeAction", enum56);
        setIntField(term22776, term22776.getClass(), "signum", 1);
        setIntElement(term22778, 0, 5418);
        setIntElement(term22778, 1, -1490108926);
        setIntElement(term22778, 2, 356739776);
        setIntElement(term22778, 3, 1247175154);
        setIntElement(term22778, 4, 1434844017);
        setIntElement(term22778, 5, 1364278305);
        setField(term22776, term22776.getClass(), "mag", term22778);
        setIntField(term22776, term22776.getClass(), "bitCountPlusOne", 0);
        setIntField(term22776, term22776.getClass(), "bitLengthPlusOne", 0);
        setIntField(term22776, term22776.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term22776, term22776.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term22775, term22775.getClass(), "intVal", term22776);
        setIntField(term22775, term22775.getClass(), "scale", 52);
        setIntField(term22775, term22775.getClass(), "precision", 0);
        setField(term22775, term22775.getClass(), "stringCache", null);
        setLongField(term22775, term22775.getClass(), "intCompact", -9223372036854775808L);
        setField(term22736, term22736.getClass(), "baseCurrencyAmount", term22775);
        setField(term22736, term22736.getClass(), "bookingRef", "uPuCVuZYOI");
        setLongField(term22804, term22804.getClass(), "seconds", 1362780563L);
        setIntField(term22804, term22804.getClass(), "nanos", 394000000);
        setField(term22736, term22736.getClass(), "expiryTime", term22804);
        setField(term22736, term22736.getClass(), "customerId", term22807);
        term22809 = new Long(-2177368829816872572L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term22809;
        callMethod(klass, "setCustomerId", argTypes, term22736, args);
    }

};



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

public class ForexRateBooking_setTimestamp_131470710615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19485;
     Object term19559;

    public ForexRateBooking_setTimestamp_131470710615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19486 = new Long(682356318767179819L);
        Double term19515 = new Double(0.36226058076369927);
        Class<? extends Object> term19583 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term19582 = ((Class) term19583).getDeclaredField((String) "SELL");
        ((Field) term19582).setAccessible(true);
        Object enum47 = ((Field) term19582).get((Object) null);
        Long term19557 = new Long(-7291743527973326814L);
        term19485 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term19488 = newInstance(Class.forName("java.time.Instant"));
        Object term19525 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term19526 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term19528 = (int[]) newIntArray(6);
        Object term19554 = newInstance(Class.forName("java.time.Instant"));
        setField(term19485, term19485.getClass(), "id", term19486);
        setLongField(term19488, term19488.getClass(), "seconds", 1442370534L);
        setIntField(term19488, term19488.getClass(), "nanos", 632000000);
        setField(term19485, term19485.getClass(), "timestamp", term19488);
        setField(term19485, term19485.getClass(), "baseCurrency", "SIODFGaQhr");
        setField(term19485, term19485.getClass(), "counterCurrency", "qYzsiuXOgS");
        setField(term19485, term19485.getClass(), "rate", term19515);
        setField(term19485, term19485.getClass(), "tradeAction", enum47);
        setIntField(term19526, term19526.getClass(), "signum", 1);
        setIntElement(term19528, 0, 54169);
        setIntElement(term19528, 1, -119706842);
        setIntElement(term19528, 2, 282847504);
        setIntElement(term19528, 3, 2006296120);
        setIntElement(term19528, 4, 1230329280);
        setIntElement(term19528, 5, -824672783);
        setField(term19526, term19526.getClass(), "mag", term19528);
        setIntField(term19526, term19526.getClass(), "bitCountPlusOne", 0);
        setIntField(term19526, term19526.getClass(), "bitLengthPlusOne", 0);
        setIntField(term19526, term19526.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term19526, term19526.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term19525, term19525.getClass(), "intVal", term19526);
        setIntField(term19525, term19525.getClass(), "scale", 53);
        setIntField(term19525, term19525.getClass(), "precision", 0);
        setField(term19525, term19525.getClass(), "stringCache", null);
        setLongField(term19525, term19525.getClass(), "intCompact", -9223372036854775808L);
        setField(term19485, term19485.getClass(), "baseCurrencyAmount", term19525);
        setField(term19485, term19485.getClass(), "bookingRef", "bxrCBbrrct");
        setLongField(term19554, term19554.getClass(), "seconds", 1659994192L);
        setIntField(term19554, term19554.getClass(), "nanos", 918000000);
        setField(term19485, term19485.getClass(), "expiryTime", term19554);
        setField(term19485, term19485.getClass(), "customerId", term19557);
        term19559 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term19559, term19559.getClass(), "seconds", 1876872800L);
        setIntField(term19559, term19559.getClass(), "nanos", 559000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term19559;
        callMethod(klass, "setTimestamp", argTypes, term19485, args);
    }

};



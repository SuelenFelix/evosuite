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

public class ForexRateBooking_getBaseCurrencyAmount_98853456510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17667;

    public ForexRateBooking_getBaseCurrencyAmount_98853456510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17668 = new Long(-1610676979013636850L);
        Double term17697 = new Double(0.016575281023182953);
        Class<? extends Object> term17762 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term17761 = ((Class) term17762).getDeclaredField((String) "SELL");
        ((Field) term17761).setAccessible(true);
        Object enum42 = ((Field) term17761).get((Object) null);
        Long term17739 = new Long(2062173786000223358L);
        term17667 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term17670 = newInstance(Class.forName("java.time.Instant"));
        Object term17707 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term17708 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term17710 = (int[]) newIntArray(6);
        Object term17736 = newInstance(Class.forName("java.time.Instant"));
        setField(term17667, term17667.getClass(), "id", term17668);
        setLongField(term17670, term17670.getClass(), "seconds", 1538078916L);
        setIntField(term17670, term17670.getClass(), "nanos", 394000000);
        setField(term17667, term17667.getClass(), "timestamp", term17670);
        setField(term17667, term17667.getClass(), "baseCurrency", "OcJCIDNIXA");
        setField(term17667, term17667.getClass(), "counterCurrency", "XfRABIFVEp");
        setField(term17667, term17667.getClass(), "rate", term17697);
        setField(term17667, term17667.getClass(), "tradeAction", enum42);
        setIntField(term17708, term17708.getClass(), "signum", 1);
        setIntElement(term17710, 0, 17747);
        setIntElement(term17710, 1, 222971343);
        setIntElement(term17710, 2, 1645407127);
        setIntElement(term17710, 3, 211829796);
        setIntElement(term17710, 4, 1665135280);
        setIntElement(term17710, 5, -264762539);
        setField(term17708, term17708.getClass(), "mag", term17710);
        setIntField(term17708, term17708.getClass(), "bitCountPlusOne", 0);
        setIntField(term17708, term17708.getClass(), "bitLengthPlusOne", 0);
        setIntField(term17708, term17708.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term17708, term17708.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term17707, term17707.getClass(), "intVal", term17708);
        setIntField(term17707, term17707.getClass(), "scale", 53);
        setIntField(term17707, term17707.getClass(), "precision", 0);
        setField(term17707, term17707.getClass(), "stringCache", null);
        setLongField(term17707, term17707.getClass(), "intCompact", -9223372036854775808L);
        setField(term17667, term17667.getClass(), "baseCurrencyAmount", term17707);
        setField(term17667, term17667.getClass(), "bookingRef", "MHGKyEnwKc");
        setLongField(term17736, term17736.getClass(), "seconds", 1744090065L);
        setIntField(term17736, term17736.getClass(), "nanos", 937000000);
        setField(term17667, term17667.getClass(), "expiryTime", term17736);
        setField(term17667, term17667.getClass(), "customerId", term17739);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseCurrencyAmount", argTypes, term17667, args);
    }

};



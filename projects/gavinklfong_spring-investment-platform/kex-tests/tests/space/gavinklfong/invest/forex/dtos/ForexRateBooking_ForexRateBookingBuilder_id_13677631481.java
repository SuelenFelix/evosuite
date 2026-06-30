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

public class ForexRateBooking_ForexRateBookingBuilder_id_13677631481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34473;
     Object term34547;

    public ForexRateBooking_ForexRateBookingBuilder_id_13677631481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term34474 = new Long(-4360569253593381888L);
        Double term34503 = new Double(0.07901636960861558);
        Class<? extends Object> term34570 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term34569 = ((Class) term34570).getDeclaredField((String) "SELL");
        ((Field) term34569).setAccessible(true);
        Object enum85 = ((Field) term34569).get((Object) null);
        Long term34545 = new Long(1457594663983990440L);
        term34473 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder"));
        Object term34476 = newInstance(Class.forName("java.time.Instant"));
        Object term34513 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term34514 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term34516 = (int[]) newIntArray(6);
        Object term34542 = newInstance(Class.forName("java.time.Instant"));
        setField(term34473, term34473.getClass(), "id", term34474);
        setLongField(term34476, term34476.getClass(), "seconds", 1467783054L);
        setIntField(term34476, term34476.getClass(), "nanos", 847000000);
        setField(term34473, term34473.getClass(), "timestamp", term34476);
        setField(term34473, term34473.getClass(), "baseCurrency", "CVRGEomOth");
        setField(term34473, term34473.getClass(), "counterCurrency", "vSeruUyNWX");
        setField(term34473, term34473.getClass(), "rate", term34503);
        setField(term34473, term34473.getClass(), "tradeAction", enum85);
        setIntField(term34514, term34514.getClass(), "signum", 1);
        setIntElement(term34516, 0, 35496);
        setIntElement(term34516, 1, -1356195229);
        setIntElement(term34516, 2, 1492605667);
        setIntElement(term34516, 3, -1897708288);
        setIntElement(term34516, 4, 889059809);
        setIntElement(term34516, 5, -1687526073);
        setField(term34514, term34514.getClass(), "mag", term34516);
        setIntField(term34514, term34514.getClass(), "bitCountPlusOne", 0);
        setIntField(term34514, term34514.getClass(), "bitLengthPlusOne", 0);
        setIntField(term34514, term34514.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term34514, term34514.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term34513, term34513.getClass(), "intVal", term34514);
        setIntField(term34513, term34513.getClass(), "scale", 53);
        setIntField(term34513, term34513.getClass(), "precision", 0);
        setField(term34513, term34513.getClass(), "stringCache", null);
        setLongField(term34513, term34513.getClass(), "intCompact", -9223372036854775808L);
        setField(term34473, term34473.getClass(), "baseCurrencyAmount", term34513);
        setField(term34473, term34473.getClass(), "bookingRef", "UkKvaeJfEC");
        setLongField(term34542, term34542.getClass(), "seconds", 1825608844L);
        setIntField(term34542, term34542.getClass(), "nanos", 992000000);
        setField(term34473, term34473.getClass(), "expiryTime", term34542);
        setField(term34473, term34473.getClass(), "customerId", term34545);
        term34547 = new Long(3452833434644634217L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term34547;
        callMethod(klass, "id", argTypes, term34473, args);
    }

};



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

public class ForexRateBooking_ForexRateBookingBuilder_expiryTime_1294028059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37469;
     Object term37542;

    public ForexRateBooking_ForexRateBookingBuilder_expiryTime_1294028059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term37470 = new Long(-8892586408602479513L);
        Double term37499 = new Double(0.8490790645379176);
        Class<? extends Object> term37566 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term37565 = ((Class) term37566).getDeclaredField((String) "BUY");
        ((Field) term37565).setAccessible(true);
        Object enum93 = ((Field) term37565).get((Object) null);
        Long term37540 = new Long(4616440478358528406L);
        term37469 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder"));
        Object term37472 = newInstance(Class.forName("java.time.Instant"));
        Object term37508 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term37509 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term37511 = (int[]) newIntArray(6);
        Object term37537 = newInstance(Class.forName("java.time.Instant"));
        setField(term37469, term37469.getClass(), "id", term37470);
        setLongField(term37472, term37472.getClass(), "seconds", 1319541754L);
        setIntField(term37472, term37472.getClass(), "nanos", 821000000);
        setField(term37469, term37469.getClass(), "timestamp", term37472);
        setField(term37469, term37469.getClass(), "baseCurrency", "lKrEAkypza");
        setField(term37469, term37469.getClass(), "counterCurrency", "KtuuNAqGCQ");
        setField(term37469, term37469.getClass(), "rate", term37499);
        setField(term37469, term37469.getClass(), "tradeAction", enum93);
        setIntField(term37509, term37509.getClass(), "signum", 1);
        setIntElement(term37511, 0, 38433);
        setIntElement(term37511, 1, 590969225);
        setIntElement(term37511, 2, -928327376);
        setIntElement(term37511, 3, -1652643905);
        setIntElement(term37511, 4, 1376127699);
        setIntElement(term37511, 5, -658266009);
        setField(term37509, term37509.getClass(), "mag", term37511);
        setIntField(term37509, term37509.getClass(), "bitCountPlusOne", 0);
        setIntField(term37509, term37509.getClass(), "bitLengthPlusOne", 0);
        setIntField(term37509, term37509.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term37509, term37509.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term37508, term37508.getClass(), "intVal", term37509);
        setIntField(term37508, term37508.getClass(), "scale", 53);
        setIntField(term37508, term37508.getClass(), "precision", 0);
        setField(term37508, term37508.getClass(), "stringCache", null);
        setLongField(term37508, term37508.getClass(), "intCompact", -9223372036854775808L);
        setField(term37469, term37469.getClass(), "baseCurrencyAmount", term37508);
        setField(term37469, term37469.getClass(), "bookingRef", "OGQsfjmReM");
        setLongField(term37537, term37537.getClass(), "seconds", 1431655415L);
        setIntField(term37537, term37537.getClass(), "nanos", 283000000);
        setField(term37469, term37469.getClass(), "expiryTime", term37537);
        setField(term37469, term37469.getClass(), "customerId", term37540);
        term37542 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term37542, term37542.getClass(), "seconds", 1714975302L);
        setIntField(term37542, term37542.getClass(), "nanos", 670000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term37542;
        callMethod(klass, "expiryTime", argTypes, term37469, args);
    }

};



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

public class ForexRateBooking_ForexRateBookingBuilder_toString_146491565712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38562;

    public ForexRateBooking_ForexRateBookingBuilder_toString_146491565712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term38563 = new Long(-5724112525188606013L);
        Double term38592 = new Double(0.5597136413549945);
        Class<? extends Object> term38657 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term38656 = ((Class) term38657).getDeclaredField((String) "SELL");
        ((Field) term38656).setAccessible(true);
        Object enum96 = ((Field) term38656).get((Object) null);
        Long term38634 = new Long(-6100012593724108983L);
        term38562 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder"));
        Object term38565 = newInstance(Class.forName("java.time.Instant"));
        Object term38602 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term38603 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term38605 = (int[]) newIntArray(6);
        Object term38631 = newInstance(Class.forName("java.time.Instant"));
        setField(term38562, term38562.getClass(), "id", term38563);
        setLongField(term38565, term38565.getClass(), "seconds", 1695470381L);
        setIntField(term38565, term38565.getClass(), "nanos", 249000000);
        setField(term38562, term38562.getClass(), "timestamp", term38565);
        setField(term38562, term38562.getClass(), "baseCurrency", "FlHzxEfFzI");
        setField(term38562, term38562.getClass(), "counterCurrency", "aSATgQUpoe");
        setField(term38562, term38562.getClass(), "rate", term38592);
        setField(term38562, term38562.getClass(), "tradeAction", enum96);
        setIntField(term38603, term38603.getClass(), "signum", 1);
        setIntElement(term38605, 0, 49072);
        setIntElement(term38605, 1, -1590020421);
        setIntElement(term38605, 2, 1518381502);
        setIntElement(term38605, 3, 615555008);
        setIntElement(term38605, 4, 2137903933);
        setIntElement(term38605, 5, -1709235211);
        setField(term38603, term38603.getClass(), "mag", term38605);
        setIntField(term38603, term38603.getClass(), "bitCountPlusOne", 0);
        setIntField(term38603, term38603.getClass(), "bitLengthPlusOne", 0);
        setIntField(term38603, term38603.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term38603, term38603.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term38602, term38602.getClass(), "intVal", term38603);
        setIntField(term38602, term38602.getClass(), "scale", 53);
        setIntField(term38602, term38602.getClass(), "precision", 0);
        setField(term38602, term38602.getClass(), "stringCache", null);
        setLongField(term38602, term38602.getClass(), "intCompact", -9223372036854775808L);
        setField(term38562, term38562.getClass(), "baseCurrencyAmount", term38602);
        setField(term38562, term38562.getClass(), "bookingRef", "VkPSXewZfB");
        setLongField(term38631, term38631.getClass(), "seconds", 1342877876L);
        setIntField(term38631, term38631.getClass(), "nanos", 146000000);
        setField(term38562, term38562.getClass(), "expiryTime", term38631);
        setField(term38562, term38562.getClass(), "customerId", term38634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term38562, args);
    }

};



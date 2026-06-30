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

public class ForexRateBooking_ForexRateBookingBuilder_bookingRef_10929816228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37087;

    public ForexRateBooking_ForexRateBookingBuilder_bookingRef_10929816228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term37088 = new Long(-8471550651709805183L);
        Double term37117 = new Double(0.06480976831423468);
        Class<? extends Object> term37193 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term37192 = ((Class) term37193).getDeclaredField((String) "BUY");
        ((Field) term37192).setAccessible(true);
        Object enum92 = ((Field) term37192).get((Object) null);
        Long term37158 = new Long(-948292411727204525L);
        term37087 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder"));
        Object term37090 = newInstance(Class.forName("java.time.Instant"));
        Object term37126 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term37127 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term37129 = (int[]) newIntArray(6);
        Object term37155 = newInstance(Class.forName("java.time.Instant"));
        setField(term37087, term37087.getClass(), "id", term37088);
        setLongField(term37090, term37090.getClass(), "seconds", 1335389252L);
        setIntField(term37090, term37090.getClass(), "nanos", 58000000);
        setField(term37087, term37087.getClass(), "timestamp", term37090);
        setField(term37087, term37087.getClass(), "baseCurrency", "IpmgwHTgnG");
        setField(term37087, term37087.getClass(), "counterCurrency", "tIpkeYIezR");
        setField(term37087, term37087.getClass(), "rate", term37117);
        setField(term37087, term37087.getClass(), "tradeAction", enum92);
        setIntField(term37127, term37127.getClass(), "signum", 1);
        setIntElement(term37129, 0, 7921);
        setIntElement(term37129, 1, -198958322);
        setIntElement(term37129, 2, -1895675647);
        setIntElement(term37129, 3, 1119851022);
        setIntElement(term37129, 4, 400433148);
        setIntElement(term37129, 5, 1453429411);
        setField(term37127, term37127.getClass(), "mag", term37129);
        setIntField(term37127, term37127.getClass(), "bitCountPlusOne", 0);
        setIntField(term37127, term37127.getClass(), "bitLengthPlusOne", 0);
        setIntField(term37127, term37127.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term37127, term37127.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term37126, term37126.getClass(), "intVal", term37127);
        setIntField(term37126, term37126.getClass(), "scale", 53);
        setIntField(term37126, term37126.getClass(), "precision", 0);
        setField(term37126, term37126.getClass(), "stringCache", null);
        setLongField(term37126, term37126.getClass(), "intCompact", -9223372036854775808L);
        setField(term37087, term37087.getClass(), "baseCurrencyAmount", term37126);
        setField(term37087, term37087.getClass(), "bookingRef", "YkZtEtthvz");
        setLongField(term37155, term37155.getClass(), "seconds", 1616833468L);
        setIntField(term37155, term37155.getClass(), "nanos", 678000000);
        setField(term37087, term37087.getClass(), "expiryTime", term37155);
        setField(term37087, term37087.getClass(), "customerId", term37158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dwlZSxlXOo";
        callMethod(klass, "bookingRef", argTypes, term37087, args);
    }

};



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

public class ForexRateBooking_canEqual_190170629125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23463;
     Object term23536;

    public ForexRateBooking_canEqual_190170629125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23464 = new Long(7247160664318067468L);
        Double term23493 = new Double(0.53094494792755);
        Class<? extends Object> term23558 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term23557 = ((Class) term23558).getDeclaredField((String) "BUY");
        ((Field) term23557).setAccessible(true);
        Object enum58 = ((Field) term23557).get((Object) null);
        Long term23534 = new Long(2135754395358000892L);
        term23463 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term23466 = newInstance(Class.forName("java.time.Instant"));
        Object term23502 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term23503 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term23505 = (int[]) newIntArray(6);
        Object term23531 = newInstance(Class.forName("java.time.Instant"));
        setField(term23463, term23463.getClass(), "id", term23464);
        setLongField(term23466, term23466.getClass(), "seconds", 1802995433L);
        setIntField(term23466, term23466.getClass(), "nanos", 545000000);
        setField(term23463, term23463.getClass(), "timestamp", term23466);
        setField(term23463, term23463.getClass(), "baseCurrency", "iCCsaLHohG");
        setField(term23463, term23463.getClass(), "counterCurrency", "NJhGgctbdj");
        setField(term23463, term23463.getClass(), "rate", term23493);
        setField(term23463, term23463.getClass(), "tradeAction", enum58);
        setIntField(term23503, term23503.getClass(), "signum", 1);
        setIntElement(term23505, 0, 22082);
        setIntElement(term23505, 1, 1395466520);
        setIntElement(term23505, 2, 1219322549);
        setIntElement(term23505, 3, -433505347);
        setIntElement(term23505, 4, -1990993705);
        setIntElement(term23505, 5, 1447937989);
        setField(term23503, term23503.getClass(), "mag", term23505);
        setIntField(term23503, term23503.getClass(), "bitCountPlusOne", 0);
        setIntField(term23503, term23503.getClass(), "bitLengthPlusOne", 0);
        setIntField(term23503, term23503.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term23503, term23503.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term23502, term23502.getClass(), "intVal", term23503);
        setIntField(term23502, term23502.getClass(), "scale", 53);
        setIntField(term23502, term23502.getClass(), "precision", 0);
        setField(term23502, term23502.getClass(), "stringCache", null);
        setLongField(term23502, term23502.getClass(), "intCompact", -9223372036854775808L);
        setField(term23463, term23463.getClass(), "baseCurrencyAmount", term23502);
        setField(term23463, term23463.getClass(), "bookingRef", "MYWYUeLGOp");
        setLongField(term23531, term23531.getClass(), "seconds", 1843214817L);
        setIntField(term23531, term23531.getClass(), "nanos", 357000000);
        setField(term23463, term23463.getClass(), "expiryTime", term23531);
        setField(term23463, term23463.getClass(), "customerId", term23534);
        term23536 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23536;
        callMethod(klass, "canEqual", argTypes, term23463, args);
    }

};



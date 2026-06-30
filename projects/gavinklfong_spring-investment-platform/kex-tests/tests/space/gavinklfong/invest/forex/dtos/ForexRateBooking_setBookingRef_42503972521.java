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

public class ForexRateBooking_setBookingRef_42503972521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21987;

    public ForexRateBooking_setBookingRef_42503972521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21988 = new Long(4474998035090263139L);
        Double term22017 = new Double(0.29874017652881824);
        Class<? extends Object> term22094 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term22093 = ((Class) term22094).getDeclaredField((String) "SELL");
        ((Field) term22093).setAccessible(true);
        Object enum54 = ((Field) term22093).get((Object) null);
        Long term22059 = new Long(2848819812340321742L);
        term21987 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term21990 = newInstance(Class.forName("java.time.Instant"));
        Object term22027 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term22028 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term22030 = (int[]) newIntArray(6);
        Object term22056 = newInstance(Class.forName("java.time.Instant"));
        setField(term21987, term21987.getClass(), "id", term21988);
        setLongField(term21990, term21990.getClass(), "seconds", 1633004775L);
        setIntField(term21990, term21990.getClass(), "nanos", 487000000);
        setField(term21987, term21987.getClass(), "timestamp", term21990);
        setField(term21987, term21987.getClass(), "baseCurrency", "jDmhBrIoDa");
        setField(term21987, term21987.getClass(), "counterCurrency", "SPtPatHeOm");
        setField(term21987, term21987.getClass(), "rate", term22017);
        setField(term21987, term21987.getClass(), "tradeAction", enum54);
        setIntField(term22028, term22028.getClass(), "signum", 1);
        setIntElement(term22030, 0, 39719);
        setIntElement(term22030, 1, 312741950);
        setIntElement(term22030, 2, 1687566412);
        setIntElement(term22030, 3, 1397743036);
        setIntElement(term22030, 4, -1072974636);
        setIntElement(term22030, 5, 1992870963);
        setField(term22028, term22028.getClass(), "mag", term22030);
        setIntField(term22028, term22028.getClass(), "bitCountPlusOne", 0);
        setIntField(term22028, term22028.getClass(), "bitLengthPlusOne", 0);
        setIntField(term22028, term22028.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term22028, term22028.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term22027, term22027.getClass(), "intVal", term22028);
        setIntField(term22027, term22027.getClass(), "scale", 53);
        setIntField(term22027, term22027.getClass(), "precision", 0);
        setField(term22027, term22027.getClass(), "stringCache", null);
        setLongField(term22027, term22027.getClass(), "intCompact", -9223372036854775808L);
        setField(term21987, term21987.getClass(), "baseCurrencyAmount", term22027);
        setField(term21987, term21987.getClass(), "bookingRef", "ywmcuThdfL");
        setLongField(term22056, term22056.getClass(), "seconds", 1819191638L);
        setIntField(term22056, term22056.getClass(), "nanos", 549000000);
        setField(term21987, term21987.getClass(), "expiryTime", term22056);
        setField(term21987, term21987.getClass(), "customerId", term22059);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GBOEuByOfr";
        callMethod(klass, "setBookingRef", argTypes, term21987, args);
    }

};



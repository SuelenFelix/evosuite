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

public class ForexRateBooking_getRate_13129075898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16947;

    public ForexRateBooking_getRate_13129075898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16948 = new Long(3892018155439224435L);
        Double term16977 = new Double(0.022483645678509023);
        Class<? extends Object> term17041 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term17040 = ((Class) term17041).getDeclaredField((String) "BUY");
        ((Field) term17040).setAccessible(true);
        Object enum40 = ((Field) term17040).get((Object) null);
        Long term17018 = new Long(5953383087795962419L);
        term16947 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term16950 = newInstance(Class.forName("java.time.Instant"));
        Object term16986 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term16987 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term16989 = (int[]) newIntArray(6);
        Object term17015 = newInstance(Class.forName("java.time.Instant"));
        setField(term16947, term16947.getClass(), "id", term16948);
        setLongField(term16950, term16950.getClass(), "seconds", 1668569229L);
        setIntField(term16950, term16950.getClass(), "nanos", 825000000);
        setField(term16947, term16947.getClass(), "timestamp", term16950);
        setField(term16947, term16947.getClass(), "baseCurrency", "gUvcueTURF");
        setField(term16947, term16947.getClass(), "counterCurrency", "EwQBhZjCIT");
        setField(term16947, term16947.getClass(), "rate", term16977);
        setField(term16947, term16947.getClass(), "tradeAction", enum40);
        setIntField(term16987, term16987.getClass(), "signum", 1);
        setIntElement(term16989, 0, 45083);
        setIntElement(term16989, 1, 1788905768);
        setIntElement(term16989, 2, 372010598);
        setIntElement(term16989, 3, 225971366);
        setIntElement(term16989, 4, -1505336223);
        setIntElement(term16989, 5, 707279667);
        setField(term16987, term16987.getClass(), "mag", term16989);
        setIntField(term16987, term16987.getClass(), "bitCountPlusOne", 0);
        setIntField(term16987, term16987.getClass(), "bitLengthPlusOne", 0);
        setIntField(term16987, term16987.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term16987, term16987.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term16986, term16986.getClass(), "intVal", term16987);
        setIntField(term16986, term16986.getClass(), "scale", 53);
        setIntField(term16986, term16986.getClass(), "precision", 0);
        setField(term16986, term16986.getClass(), "stringCache", null);
        setLongField(term16986, term16986.getClass(), "intCompact", -9223372036854775808L);
        setField(term16947, term16947.getClass(), "baseCurrencyAmount", term16986);
        setField(term16947, term16947.getClass(), "bookingRef", "aSkmSwTnEw");
        setLongField(term17015, term17015.getClass(), "seconds", 1725122217L);
        setIntField(term17015, term17015.getClass(), "nanos", 647000000);
        setField(term16947, term16947.getClass(), "expiryTime", term17015);
        setField(term16947, term16947.getClass(), "customerId", term17018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRate", argTypes, term16947, args);
    }

};



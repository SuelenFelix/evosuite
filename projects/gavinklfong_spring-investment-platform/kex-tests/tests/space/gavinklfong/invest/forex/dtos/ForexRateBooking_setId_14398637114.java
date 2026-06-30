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

public class ForexRateBooking_setId_14398637114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19119;
     Object term19193;

    public ForexRateBooking_setId_14398637114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19120 = new Long(-6723783499250797216L);
        Double term19149 = new Double(0.0022646783892913414);
        Class<? extends Object> term19216 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term19215 = ((Class) term19216).getDeclaredField((String) "SELL");
        ((Field) term19215).setAccessible(true);
        Object enum46 = ((Field) term19215).get((Object) null);
        Long term19191 = new Long(41775768178052008L);
        term19119 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term19122 = newInstance(Class.forName("java.time.Instant"));
        Object term19159 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term19160 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term19162 = (int[]) newIntArray(6);
        Object term19188 = newInstance(Class.forName("java.time.Instant"));
        setField(term19119, term19119.getClass(), "id", term19120);
        setLongField(term19122, term19122.getClass(), "seconds", 1496859828L);
        setIntField(term19122, term19122.getClass(), "nanos", 764000000);
        setField(term19119, term19119.getClass(), "timestamp", term19122);
        setField(term19119, term19119.getClass(), "baseCurrency", "WVRMUmrljA");
        setField(term19119, term19119.getClass(), "counterCurrency", "NTlKJDDWlk");
        setField(term19119, term19119.getClass(), "rate", term19149);
        setField(term19119, term19119.getClass(), "tradeAction", enum46);
        setIntField(term19160, term19160.getClass(), "signum", 1);
        setIntElement(term19162, 0, 51942);
        setIntElement(term19162, 1, 623316686);
        setIntElement(term19162, 2, 758747438);
        setIntElement(term19162, 3, 2029636074);
        setIntElement(term19162, 4, -1602927345);
        setIntElement(term19162, 5, -449705627);
        setField(term19160, term19160.getClass(), "mag", term19162);
        setIntField(term19160, term19160.getClass(), "bitCountPlusOne", 0);
        setIntField(term19160, term19160.getClass(), "bitLengthPlusOne", 0);
        setIntField(term19160, term19160.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term19160, term19160.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term19159, term19159.getClass(), "intVal", term19160);
        setIntField(term19159, term19159.getClass(), "scale", 53);
        setIntField(term19159, term19159.getClass(), "precision", 0);
        setField(term19159, term19159.getClass(), "stringCache", null);
        setLongField(term19159, term19159.getClass(), "intCompact", -9223372036854775808L);
        setField(term19119, term19119.getClass(), "baseCurrencyAmount", term19159);
        setField(term19119, term19119.getClass(), "bookingRef", "vOuMEpOQAg");
        setLongField(term19188, term19188.getClass(), "seconds", 1691868468L);
        setIntField(term19188, term19188.getClass(), "nanos", 367000000);
        setField(term19119, term19119.getClass(), "expiryTime", term19188);
        setField(term19119, term19119.getClass(), "customerId", term19191);
        term19193 = new Long(6682528376118987775L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term19193;
        callMethod(klass, "setId", argTypes, term19119, args);
    }

};



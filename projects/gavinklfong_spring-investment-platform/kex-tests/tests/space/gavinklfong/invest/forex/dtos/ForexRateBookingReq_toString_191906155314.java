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
import java.lang.Object;
import java.lang.String;
import java.lang.Long;

public class ForexRateBookingReq_toString_191906155314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5916;

    public ForexRateBookingReq_toString_191906155314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5994 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term5993 = ((Class) term5994).getDeclaredField((String) "BUY");
        ((Field) term5993).setAccessible(true);
        Object enum16 = ((Field) term5993).get((Object) null);
        Long term5965 = new Long(-5476826692763582090L);
        term5916 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq"));
        Object term5941 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5942 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5944 = (int[]) newIntArray(6);
        setField(term5916, term5916.getClass(), "baseCurrency", "nHXjMycHlU");
        setField(term5916, term5916.getClass(), "counterCurrency", "ieCtQFdkii");
        setIntField(term5942, term5942.getClass(), "signum", 1);
        setIntElement(term5944, 0, 48108);
        setIntElement(term5944, 1, 419671270);
        setIntElement(term5944, 2, 909082732);
        setIntElement(term5944, 3, 2078883588);
        setIntElement(term5944, 4, 1670017529);
        setIntElement(term5944, 5, -2116499193);
        setField(term5942, term5942.getClass(), "mag", term5944);
        setIntField(term5942, term5942.getClass(), "bitCountPlusOne", 0);
        setIntField(term5942, term5942.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5942, term5942.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5942, term5942.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5941, term5941.getClass(), "intVal", term5942);
        setIntField(term5941, term5941.getClass(), "scale", 53);
        setIntField(term5941, term5941.getClass(), "precision", 0);
        setField(term5941, term5941.getClass(), "stringCache", null);
        setLongField(term5941, term5941.getClass(), "intCompact", -9223372036854775808L);
        setField(term5916, term5916.getClass(), "baseCurrencyAmount", term5941);
        setField(term5916, term5916.getClass(), "tradeAction", enum16);
        setField(term5916, term5916.getClass(), "customerId", term5965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5916, args);
    }

};



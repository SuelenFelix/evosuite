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

public class ForexRateBookingReq_getTradeAction_3378381724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2279;

    public ForexRateBookingReq_getTradeAction_3378381724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2357 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term2356 = ((Class) term2357).getDeclaredField((String) "BUY");
        ((Field) term2356).setAccessible(true);
        Object enum5 = ((Field) term2356).get((Object) null);
        Long term2328 = new Long(-8400487765614892086L);
        term2279 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq"));
        Object term2304 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2305 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2307 = (int[]) newIntArray(6);
        setField(term2279, term2279.getClass(), "baseCurrency", "IDCWpPLRkE");
        setField(term2279, term2279.getClass(), "counterCurrency", "nyiiPDVjAc");
        setIntField(term2305, term2305.getClass(), "signum", 1);
        setIntElement(term2307, 0, 3726);
        setIntElement(term2307, 1, 1561510548);
        setIntElement(term2307, 2, 756973629);
        setIntElement(term2307, 3, -1169068666);
        setIntElement(term2307, 4, -1772498162);
        setIntElement(term2307, 5, -1207241473);
        setField(term2305, term2305.getClass(), "mag", term2307);
        setIntField(term2305, term2305.getClass(), "bitCountPlusOne", 0);
        setIntField(term2305, term2305.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2305, term2305.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2305, term2305.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2304, term2304.getClass(), "intVal", term2305);
        setIntField(term2304, term2304.getClass(), "scale", 52);
        setIntField(term2304, term2304.getClass(), "precision", 0);
        setField(term2304, term2304.getClass(), "stringCache", null);
        setLongField(term2304, term2304.getClass(), "intCompact", -9223372036854775808L);
        setField(term2279, term2279.getClass(), "baseCurrencyAmount", term2304);
        setField(term2279, term2279.getClass(), "tradeAction", enum5);
        setField(term2279, term2279.getClass(), "customerId", term2328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTradeAction", argTypes, term2279, args);
    }

};



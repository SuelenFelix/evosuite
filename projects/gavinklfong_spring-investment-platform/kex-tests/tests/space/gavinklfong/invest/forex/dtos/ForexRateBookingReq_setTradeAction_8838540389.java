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

public class ForexRateBookingReq_setTradeAction_8838540389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4002;
     Object enum11;

    public ForexRateBookingReq_setTradeAction_8838540389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4088 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term4087 = ((Class) term4088).getDeclaredField((String) "BUY");
        ((Field) term4087).setAccessible(true);
        Object enum10 = ((Field) term4087).get((Object) null);
        Long term4051 = new Long(-7237588299778557629L);
        term4002 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq"));
        Object term4027 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4028 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4030 = (int[]) newIntArray(6);
        setField(term4002, term4002.getClass(), "baseCurrency", "jDtqGUpnZN");
        setField(term4002, term4002.getClass(), "counterCurrency", "nGKItKLYNC");
        setIntField(term4028, term4028.getClass(), "signum", 1);
        setIntElement(term4030, 0, 2584);
        setIntElement(term4030, 1, -1946484122);
        setIntElement(term4030, 2, 1992026795);
        setIntElement(term4030, 3, 1045205752);
        setIntElement(term4030, 4, 613377469);
        setIntElement(term4030, 5, -1848020175);
        setField(term4028, term4028.getClass(), "mag", term4030);
        setIntField(term4028, term4028.getClass(), "bitCountPlusOne", 0);
        setIntField(term4028, term4028.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4028, term4028.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4028, term4028.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4027, term4027.getClass(), "intVal", term4028);
        setIntField(term4027, term4027.getClass(), "scale", 52);
        setIntField(term4027, term4027.getClass(), "precision", 0);
        setField(term4027, term4027.getClass(), "stringCache", null);
        setLongField(term4027, term4027.getClass(), "intCompact", -9223372036854775808L);
        setField(term4002, term4002.getClass(), "baseCurrencyAmount", term4027);
        setField(term4002, term4002.getClass(), "tradeAction", enum10);
        setField(term4002, term4002.getClass(), "customerId", term4051);
        Class<? extends Object> term4339 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term4338 = ((Class) term4339).getDeclaredField((String) "SELL");
        ((Field) term4338).setAccessible(true);
        enum11 = ((Field) term4338).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("space.gavinklfong.invest.forex.dtos.TradeAction");
        Object[] args = new Object[1];
        args[0] = enum11;
        callMethod(klass, "setTradeAction", argTypes, term4002, args);
    }

};



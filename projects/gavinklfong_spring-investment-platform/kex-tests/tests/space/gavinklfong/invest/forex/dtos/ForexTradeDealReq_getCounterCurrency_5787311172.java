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
import java.lang.Double;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;

public class ForexTradeDealReq_getCounterCurrency_5787311172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39290;

    public ForexTradeDealReq_getCounterCurrency_5787311172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term39315 = new Double(0.5407563152320285);
        Class<? extends Object> term39377 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term39376 = ((Class) term39377).getDeclaredField((String) "SELL");
        ((Field) term39376).setAccessible(true);
        Object enum98 = ((Field) term39376).get((Object) null);
        Long term39342 = new Long(4699157009689333952L);
        term39290 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq"));
        Object term39325 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term39326 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term39328 = (int[]) newIntArray(6);
        setField(term39290, term39290.getClass(), "baseCurrency", "WdCiTDUKqn");
        setField(term39290, term39290.getClass(), "counterCurrency", "PSizQDoxxe");
        setField(term39290, term39290.getClass(), "rate", term39315);
        setField(term39290, term39290.getClass(), "tradeAction", enum98);
        setIntField(term39326, term39326.getClass(), "signum", 1);
        setIntElement(term39328, 0, 38624);
        setIntElement(term39328, 1, 309695410);
        setIntElement(term39328, 2, -232104128);
        setIntElement(term39328, 3, -678495211);
        setIntElement(term39328, 4, 1894913177);
        setIntElement(term39328, 5, -137978105);
        setField(term39326, term39326.getClass(), "mag", term39328);
        setIntField(term39326, term39326.getClass(), "bitCountPlusOne", 0);
        setIntField(term39326, term39326.getClass(), "bitLengthPlusOne", 0);
        setIntField(term39326, term39326.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term39326, term39326.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term39325, term39325.getClass(), "intVal", term39326);
        setIntField(term39325, term39325.getClass(), "scale", 53);
        setIntField(term39325, term39325.getClass(), "precision", 0);
        setField(term39325, term39325.getClass(), "stringCache", null);
        setLongField(term39325, term39325.getClass(), "intCompact", -9223372036854775808L);
        setField(term39290, term39290.getClass(), "baseCurrencyAmount", term39325);
        setField(term39290, term39290.getClass(), "customerId", term39342);
        setField(term39290, term39290.getClass(), "rateBookingRef", "mKaHyMybrK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCounterCurrency", argTypes, term39290, args);
    }

};



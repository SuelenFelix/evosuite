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

public class ForexTradeDealReq_setCounterCurrency_7448391239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41794;

    public ForexTradeDealReq_setCounterCurrency_7448391239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term41819 = new Double(0.5329919447422633);
        Class<? extends Object> term41892 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term41891 = ((Class) term41892).getDeclaredField((String) "BUY");
        ((Field) term41891).setAccessible(true);
        Object enum105 = ((Field) term41891).get((Object) null);
        Long term41845 = new Long(-6673920710396545553L);
        term41794 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq"));
        Object term41828 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term41829 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term41831 = (int[]) newIntArray(6);
        setField(term41794, term41794.getClass(), "baseCurrency", "VSaNnhMpRc");
        setField(term41794, term41794.getClass(), "counterCurrency", "QNjNTLlUaV");
        setField(term41794, term41794.getClass(), "rate", term41819);
        setField(term41794, term41794.getClass(), "tradeAction", enum105);
        setIntField(term41829, term41829.getClass(), "signum", 1);
        setIntElement(term41831, 0, 45);
        setIntElement(term41831, 1, 305660304);
        setIntElement(term41831, 2, 1236506887);
        setIntElement(term41831, 3, 699077442);
        setIntElement(term41831, 4, 339912878);
        setIntElement(term41831, 5, 253484639);
        setField(term41829, term41829.getClass(), "mag", term41831);
        setIntField(term41829, term41829.getClass(), "bitCountPlusOne", 0);
        setIntField(term41829, term41829.getClass(), "bitLengthPlusOne", 0);
        setIntField(term41829, term41829.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term41829, term41829.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term41828, term41828.getClass(), "intVal", term41829);
        setIntField(term41828, term41828.getClass(), "scale", 51);
        setIntField(term41828, term41828.getClass(), "precision", 0);
        setField(term41828, term41828.getClass(), "stringCache", null);
        setLongField(term41828, term41828.getClass(), "intCompact", -9223372036854775808L);
        setField(term41794, term41794.getClass(), "baseCurrencyAmount", term41828);
        setField(term41794, term41794.getClass(), "customerId", term41845);
        setField(term41794, term41794.getClass(), "rateBookingRef", "hIYsRyOZxk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RjNoEywJbC";
        callMethod(klass, "setCounterCurrency", argTypes, term41794, args);
    }

};



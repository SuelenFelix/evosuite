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

public class ForexTradeDealReq_setBaseCurrencyAmount_210573647812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42882;
     Object term42947;

    public ForexTradeDealReq_setBaseCurrencyAmount_210573647812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term42907 = new Double(0.2962868255626906);
        Class<? extends Object> term42985 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term42984 = ((Class) term42985).getDeclaredField((String) "BUY");
        ((Field) term42984).setAccessible(true);
        Object enum108 = ((Field) term42984).get((Object) null);
        Long term42933 = new Long(-8327432141027603933L);
        term42882 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq"));
        Object term42916 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term42917 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term42919 = (int[]) newIntArray(6);
        setField(term42882, term42882.getClass(), "baseCurrency", "wsysQLGFnl");
        setField(term42882, term42882.getClass(), "counterCurrency", "ckQLZGFjMX");
        setField(term42882, term42882.getClass(), "rate", term42907);
        setField(term42882, term42882.getClass(), "tradeAction", enum108);
        setIntField(term42917, term42917.getClass(), "signum", 1);
        setIntElement(term42919, 0, 42643);
        setIntElement(term42919, 1, 1081144233);
        setIntElement(term42919, 2, -1527105819);
        setIntElement(term42919, 3, -1056732389);
        setIntElement(term42919, 4, -975530795);
        setIntElement(term42919, 5, 1404469529);
        setField(term42917, term42917.getClass(), "mag", term42919);
        setIntField(term42917, term42917.getClass(), "bitCountPlusOne", 0);
        setIntField(term42917, term42917.getClass(), "bitLengthPlusOne", 0);
        setIntField(term42917, term42917.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term42917, term42917.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term42916, term42916.getClass(), "intVal", term42917);
        setIntField(term42916, term42916.getClass(), "scale", 53);
        setIntField(term42916, term42916.getClass(), "precision", 0);
        setField(term42916, term42916.getClass(), "stringCache", null);
        setLongField(term42916, term42916.getClass(), "intCompact", -9223372036854775808L);
        setField(term42882, term42882.getClass(), "baseCurrencyAmount", term42916);
        setField(term42882, term42882.getClass(), "customerId", term42933);
        setField(term42882, term42882.getClass(), "rateBookingRef", "qphdrqUtNx");
        term42947 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term42948 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term42950 = (int[]) newIntArray(6);
        setIntField(term42948, term42948.getClass(), "signum", 1);
        setIntElement(term42950, 0, 6183);
        setIntElement(term42950, 1, -1288141416);
        setIntElement(term42950, 2, -1991195641);
        setIntElement(term42950, 3, 79561134);
        setIntElement(term42950, 4, -1952437637);
        setIntElement(term42950, 5, 668681799);
        setField(term42948, term42948.getClass(), "mag", term42950);
        setIntField(term42948, term42948.getClass(), "bitCountPlusOne", 0);
        setIntField(term42948, term42948.getClass(), "bitLengthPlusOne", 0);
        setIntField(term42948, term42948.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term42948, term42948.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term42947, term42947.getClass(), "intVal", term42948);
        setIntField(term42947, term42947.getClass(), "scale", 53);
        setIntField(term42947, term42947.getClass(), "precision", 0);
        setField(term42947, term42947.getClass(), "stringCache", null);
        setLongField(term42947, term42947.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term42947;
        callMethod(klass, "setBaseCurrencyAmount", argTypes, term42882, args);
    }

};



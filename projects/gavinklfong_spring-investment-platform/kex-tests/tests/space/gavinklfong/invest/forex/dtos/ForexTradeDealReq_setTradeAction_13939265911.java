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

public class ForexTradeDealReq_setTradeAction_13939265911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42526;
     Object enum107;

    public ForexTradeDealReq_setTradeAction_13939265911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term42551 = new Double(0.6693176553622628);
        Class<? extends Object> term42613 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term42612 = ((Class) term42613).getDeclaredField((String) "SELL");
        ((Field) term42612).setAccessible(true);
        enum107 = ((Field) term42612).get((Object) null);
        Long term42578 = new Long(6698455537431331246L);
        term42526 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq"));
        Object term42561 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term42562 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term42564 = (int[]) newIntArray(6);
        setField(term42526, term42526.getClass(), "baseCurrency", "wwAwLLcLPp");
        setField(term42526, term42526.getClass(), "counterCurrency", "nHpMKOmlpQ");
        setField(term42526, term42526.getClass(), "rate", term42551);
        setField(term42526, term42526.getClass(), "tradeAction", enum107);
        setIntField(term42562, term42562.getClass(), "signum", 1);
        setIntElement(term42564, 0, 6588);
        setIntElement(term42564, 1, 808371359);
        setIntElement(term42564, 2, -1051862333);
        setIntElement(term42564, 3, 2007257221);
        setIntElement(term42564, 4, -277001517);
        setIntElement(term42564, 5, 1103363245);
        setField(term42562, term42562.getClass(), "mag", term42564);
        setIntField(term42562, term42562.getClass(), "bitCountPlusOne", 0);
        setIntField(term42562, term42562.getClass(), "bitLengthPlusOne", 0);
        setIntField(term42562, term42562.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term42562, term42562.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term42561, term42561.getClass(), "intVal", term42562);
        setIntField(term42561, term42561.getClass(), "scale", 52);
        setIntField(term42561, term42561.getClass(), "precision", 0);
        setField(term42561, term42561.getClass(), "stringCache", null);
        setLongField(term42561, term42561.getClass(), "intCompact", -9223372036854775808L);
        setField(term42526, term42526.getClass(), "baseCurrencyAmount", term42561);
        setField(term42526, term42526.getClass(), "customerId", term42578);
        setField(term42526, term42526.getClass(), "rateBookingRef", "fKhrQsJToZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("space.gavinklfong.invest.forex.dtos.TradeAction");
        Object[] args = new Object[1];
        args[0] = enum107;
        callMethod(klass, "setTradeAction", argTypes, term42526, args);
    }

};



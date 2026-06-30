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

public class ForexTradeDeal_setTradeAction_110388428916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31500;
     Object enum77;

    public ForexTradeDeal_setTradeAction_110388428916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31501 = new Long(-4023935540989049732L);
        Double term31549 = new Double(0.6428742553484879);
        Class<? extends Object> term31608 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term31607 = ((Class) term31608).getDeclaredField((String) "BUY");
        ((Field) term31607).setAccessible(true);
        enum77 = ((Field) term31607).get((Object) null);
        Long term31575 = new Long(855932984568615096L);
        term31500 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term31515 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31516 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31520 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31558 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term31559 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term31561 = (int[]) newIntArray(6);
        setField(term31500, term31500.getClass(), "id", term31501);
        setField(term31500, term31500.getClass(), "dealRef", "qUtkFGMNUV");
        setIntField(term31516, term31516.getClass(), "year", 2021);
        setShortField(term31516, term31516.getClass(), "month", (short) 8);
        setShortField(term31516, term31516.getClass(), "day", (short) 12);
        setField(term31515, term31515.getClass(), "date", term31516);
        setByteField(term31520, term31520.getClass(), "hour", (byte) 2);
        setByteField(term31520, term31520.getClass(), "minute", (byte) 17);
        setByteField(term31520, term31520.getClass(), "second", (byte) 51);
        setIntField(term31520, term31520.getClass(), "nano", 207375141);
        setField(term31515, term31515.getClass(), "time", term31520);
        setField(term31500, term31500.getClass(), "timestamp", term31515);
        setField(term31500, term31500.getClass(), "baseCurrency", "mGRiYhnMcR");
        setField(term31500, term31500.getClass(), "counterCurrency", "NFlvfJCVPO");
        setField(term31500, term31500.getClass(), "rate", term31549);
        setField(term31500, term31500.getClass(), "tradeAction", enum77);
        setIntField(term31559, term31559.getClass(), "signum", 1);
        setIntElement(term31561, 0, 186);
        setIntElement(term31561, 1, -904763891);
        setIntElement(term31561, 2, 1070176067);
        setIntElement(term31561, 3, 1699334566);
        setIntElement(term31561, 4, 706694897);
        setIntElement(term31561, 5, -870914817);
        setField(term31559, term31559.getClass(), "mag", term31561);
        setIntField(term31559, term31559.getClass(), "bitCountPlusOne", 0);
        setIntField(term31559, term31559.getClass(), "bitLengthPlusOne", 0);
        setIntField(term31559, term31559.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term31559, term31559.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term31558, term31558.getClass(), "intVal", term31559);
        setIntField(term31558, term31558.getClass(), "scale", 53);
        setIntField(term31558, term31558.getClass(), "precision", 0);
        setField(term31558, term31558.getClass(), "stringCache", null);
        setLongField(term31558, term31558.getClass(), "intCompact", -9223372036854775808L);
        setField(term31500, term31500.getClass(), "baseCurrencyAmount", term31558);
        setField(term31500, term31500.getClass(), "customerId", term31575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("space.gavinklfong.invest.forex.dtos.TradeAction");
        Object[] args = new Object[1];
        args[0] = enum77;
        callMethod(klass, "setTradeAction", argTypes, term31500, args);
    }

};



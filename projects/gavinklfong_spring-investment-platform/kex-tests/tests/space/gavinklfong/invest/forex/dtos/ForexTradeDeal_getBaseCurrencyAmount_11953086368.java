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

public class ForexTradeDeal_getBaseCurrencyAmount_11953086368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28504;

    public ForexTradeDeal_getBaseCurrencyAmount_11953086368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28505 = new Long(-4822736661741380518L);
        Double term28553 = new Double(0.04640022995603543);
        Class<? extends Object> term28612 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term28611 = ((Class) term28612).getDeclaredField((String) "BUY");
        ((Field) term28611).setAccessible(true);
        Object enum69 = ((Field) term28611).get((Object) null);
        Long term28579 = new Long(-5386201758403679145L);
        term28504 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term28519 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28520 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28524 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28562 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term28563 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term28565 = (int[]) newIntArray(6);
        setField(term28504, term28504.getClass(), "id", term28505);
        setField(term28504, term28504.getClass(), "dealRef", "lgQkrXANyI");
        setIntField(term28520, term28520.getClass(), "year", 2020);
        setShortField(term28520, term28520.getClass(), "month", (short) 7);
        setShortField(term28520, term28520.getClass(), "day", (short) 24);
        setField(term28519, term28519.getClass(), "date", term28520);
        setByteField(term28524, term28524.getClass(), "hour", (byte) 0);
        setByteField(term28524, term28524.getClass(), "minute", (byte) 59);
        setByteField(term28524, term28524.getClass(), "second", (byte) 56);
        setIntField(term28524, term28524.getClass(), "nano", 320219201);
        setField(term28519, term28519.getClass(), "time", term28524);
        setField(term28504, term28504.getClass(), "timestamp", term28519);
        setField(term28504, term28504.getClass(), "baseCurrency", "MeTmRZXErV");
        setField(term28504, term28504.getClass(), "counterCurrency", "jNxbVmoZgq");
        setField(term28504, term28504.getClass(), "rate", term28553);
        setField(term28504, term28504.getClass(), "tradeAction", enum69);
        setIntField(term28563, term28563.getClass(), "signum", 1);
        setIntElement(term28565, 0, 43482);
        setIntElement(term28565, 1, -526476822);
        setIntElement(term28565, 2, 630360651);
        setIntElement(term28565, 3, 911878589);
        setIntElement(term28565, 4, -1204105074);
        setIntElement(term28565, 5, 1750111527);
        setField(term28563, term28563.getClass(), "mag", term28565);
        setIntField(term28563, term28563.getClass(), "bitCountPlusOne", 0);
        setIntField(term28563, term28563.getClass(), "bitLengthPlusOne", 0);
        setIntField(term28563, term28563.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term28563, term28563.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term28562, term28562.getClass(), "intVal", term28563);
        setIntField(term28562, term28562.getClass(), "scale", 53);
        setIntField(term28562, term28562.getClass(), "precision", 0);
        setField(term28562, term28562.getClass(), "stringCache", null);
        setLongField(term28562, term28562.getClass(), "intCompact", -9223372036854775808L);
        setField(term28504, term28504.getClass(), "baseCurrencyAmount", term28562);
        setField(term28504, term28504.getClass(), "customerId", term28579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseCurrencyAmount", argTypes, term28504, args);
    }

};



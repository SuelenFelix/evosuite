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

public class ForexTradeDeal_getCounterCurrency_15432227475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27402;

    public ForexTradeDeal_getCounterCurrency_15432227475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27403 = new Long(-685023850445639859L);
        Double term27451 = new Double(0.40598298281353484);
        Class<? extends Object> term27510 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term27509 = ((Class) term27510).getDeclaredField((String) "SELL");
        ((Field) term27509).setAccessible(true);
        Object enum66 = ((Field) term27509).get((Object) null);
        Long term27477 = new Long(-6950146046121430355L);
        term27402 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term27417 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27418 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27422 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27461 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term27462 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term27464 = (int[]) newIntArray(5);
        setField(term27402, term27402.getClass(), "id", term27403);
        setField(term27402, term27402.getClass(), "dealRef", "xClUIcPECX");
        setIntField(term27418, term27418.getClass(), "year", 2015);
        setShortField(term27418, term27418.getClass(), "month", (short) 9);
        setShortField(term27418, term27418.getClass(), "day", (short) 16);
        setField(term27417, term27417.getClass(), "date", term27418);
        setByteField(term27422, term27422.getClass(), "hour", (byte) 6);
        setByteField(term27422, term27422.getClass(), "minute", (byte) 19);
        setByteField(term27422, term27422.getClass(), "second", (byte) 42);
        setIntField(term27422, term27422.getClass(), "nano", 630084975);
        setField(term27417, term27417.getClass(), "time", term27422);
        setField(term27402, term27402.getClass(), "timestamp", term27417);
        setField(term27402, term27402.getClass(), "baseCurrency", "avhRaGZaBF");
        setField(term27402, term27402.getClass(), "counterCurrency", "JkgoRtImdE");
        setField(term27402, term27402.getClass(), "rate", term27451);
        setField(term27402, term27402.getClass(), "tradeAction", enum66);
        setIntField(term27462, term27462.getClass(), "signum", 1);
        setIntElement(term27464, 0, 48710373);
        setIntElement(term27464, 1, 64890798);
        setIntElement(term27464, 2, -659971698);
        setIntElement(term27464, 3, -1913216384);
        setIntElement(term27464, 4, 1839951589);
        setField(term27462, term27462.getClass(), "mag", term27464);
        setIntField(term27462, term27462.getClass(), "bitCountPlusOne", 0);
        setIntField(term27462, term27462.getClass(), "bitLengthPlusOne", 0);
        setIntField(term27462, term27462.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term27462, term27462.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term27461, term27461.getClass(), "intVal", term27462);
        setIntField(term27461, term27461.getClass(), "scale", 48);
        setIntField(term27461, term27461.getClass(), "precision", 0);
        setField(term27461, term27461.getClass(), "stringCache", null);
        setLongField(term27461, term27461.getClass(), "intCompact", -9223372036854775808L);
        setField(term27402, term27402.getClass(), "baseCurrencyAmount", term27461);
        setField(term27402, term27402.getClass(), "customerId", term27477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCounterCurrency", argTypes, term27402, args);
    }

};



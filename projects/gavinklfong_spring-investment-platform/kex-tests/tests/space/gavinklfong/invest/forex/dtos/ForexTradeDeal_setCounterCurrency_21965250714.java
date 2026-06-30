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

public class ForexTradeDeal_setCounterCurrency_21965250714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30744;

    public ForexTradeDeal_setCounterCurrency_21965250714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30745 = new Long(-2255965562447970862L);
        Double term30793 = new Double(0.4355627280318103);
        Class<? extends Object> term30864 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term30863 = ((Class) term30864).getDeclaredField((String) "BUY");
        ((Field) term30863).setAccessible(true);
        Object enum75 = ((Field) term30863).get((Object) null);
        Long term30819 = new Long(148047808219672941L);
        term30744 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term30759 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30760 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30764 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30802 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term30803 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term30805 = (int[]) newIntArray(6);
        setField(term30744, term30744.getClass(), "id", term30745);
        setField(term30744, term30744.getClass(), "dealRef", "HpZXWDPhlg");
        setIntField(term30760, term30760.getClass(), "year", 2028);
        setShortField(term30760, term30760.getClass(), "month", (short) 10);
        setShortField(term30760, term30760.getClass(), "day", (short) 1);
        setField(term30759, term30759.getClass(), "date", term30760);
        setByteField(term30764, term30764.getClass(), "hour", (byte) 17);
        setByteField(term30764, term30764.getClass(), "minute", (byte) 29);
        setByteField(term30764, term30764.getClass(), "second", (byte) 30);
        setIntField(term30764, term30764.getClass(), "nano", 845472306);
        setField(term30759, term30759.getClass(), "time", term30764);
        setField(term30744, term30744.getClass(), "timestamp", term30759);
        setField(term30744, term30744.getClass(), "baseCurrency", "lBOokzEPfe");
        setField(term30744, term30744.getClass(), "counterCurrency", "dtGZCsKXbW");
        setField(term30744, term30744.getClass(), "rate", term30793);
        setField(term30744, term30744.getClass(), "tradeAction", enum75);
        setIntField(term30803, term30803.getClass(), "signum", 1);
        setIntElement(term30805, 0, 3343);
        setIntElement(term30805, 1, 1456376648);
        setIntElement(term30805, 2, 1910233449);
        setIntElement(term30805, 3, 263192112);
        setIntElement(term30805, 4, -1531392990);
        setIntElement(term30805, 5, -213663359);
        setField(term30803, term30803.getClass(), "mag", term30805);
        setIntField(term30803, term30803.getClass(), "bitCountPlusOne", 0);
        setIntField(term30803, term30803.getClass(), "bitLengthPlusOne", 0);
        setIntField(term30803, term30803.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term30803, term30803.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term30802, term30802.getClass(), "intVal", term30803);
        setIntField(term30802, term30802.getClass(), "scale", 52);
        setIntField(term30802, term30802.getClass(), "precision", 0);
        setField(term30802, term30802.getClass(), "stringCache", null);
        setLongField(term30802, term30802.getClass(), "intCompact", -9223372036854775808L);
        setField(term30744, term30744.getClass(), "baseCurrencyAmount", term30802);
        setField(term30744, term30744.getClass(), "customerId", term30819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bdyhHbDAmJ";
        callMethod(klass, "setCounterCurrency", argTypes, term30744, args);
    }

};



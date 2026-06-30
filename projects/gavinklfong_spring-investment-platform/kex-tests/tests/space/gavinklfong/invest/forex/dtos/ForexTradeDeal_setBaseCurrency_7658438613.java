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

public class ForexTradeDeal_setBaseCurrency_7658438613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30358;

    public ForexTradeDeal_setBaseCurrency_7658438613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30359 = new Long(-1804015692891701666L);
        Double term30407 = new Double(0.6142723998707854);
        Class<? extends Object> term30478 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term30477 = ((Class) term30478).getDeclaredField((String) "BUY");
        ((Field) term30477).setAccessible(true);
        Object enum74 = ((Field) term30477).get((Object) null);
        Long term30433 = new Long(-6432617521836576658L);
        term30358 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term30373 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30374 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30378 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30416 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term30417 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term30419 = (int[]) newIntArray(6);
        setField(term30358, term30358.getClass(), "id", term30359);
        setField(term30358, term30358.getClass(), "dealRef", "cSHGbqKqlN");
        setIntField(term30374, term30374.getClass(), "year", 2023);
        setShortField(term30374, term30374.getClass(), "month", (short) 9);
        setShortField(term30374, term30374.getClass(), "day", (short) 23);
        setField(term30373, term30373.getClass(), "date", term30374);
        setByteField(term30378, term30378.getClass(), "hour", (byte) 12);
        setByteField(term30378, term30378.getClass(), "minute", (byte) 55);
        setByteField(term30378, term30378.getClass(), "second", (byte) 58);
        setIntField(term30378, term30378.getClass(), "nano", 159178396);
        setField(term30373, term30373.getClass(), "time", term30378);
        setField(term30358, term30358.getClass(), "timestamp", term30373);
        setField(term30358, term30358.getClass(), "baseCurrency", "pFAfANnxup");
        setField(term30358, term30358.getClass(), "counterCurrency", "FbSIUZyBXZ");
        setField(term30358, term30358.getClass(), "rate", term30407);
        setField(term30358, term30358.getClass(), "tradeAction", enum74);
        setIntField(term30417, term30417.getClass(), "signum", 1);
        setIntElement(term30419, 0, 46);
        setIntElement(term30419, 1, 1302024911);
        setIntElement(term30419, 2, 897622581);
        setIntElement(term30419, 3, -292675792);
        setIntElement(term30419, 4, 1807181852);
        setIntElement(term30419, 5, 286838441);
        setField(term30417, term30417.getClass(), "mag", term30419);
        setIntField(term30417, term30417.getClass(), "bitCountPlusOne", 0);
        setIntField(term30417, term30417.getClass(), "bitLengthPlusOne", 0);
        setIntField(term30417, term30417.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term30417, term30417.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term30416, term30416.getClass(), "intVal", term30417);
        setIntField(term30416, term30416.getClass(), "scale", 50);
        setIntField(term30416, term30416.getClass(), "precision", 0);
        setField(term30416, term30416.getClass(), "stringCache", null);
        setLongField(term30416, term30416.getClass(), "intCompact", -9223372036854775808L);
        setField(term30358, term30358.getClass(), "baseCurrencyAmount", term30416);
        setField(term30358, term30358.getClass(), "customerId", term30433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mhQDwIyrRi";
        callMethod(klass, "setBaseCurrency", argTypes, term30358, args);
    }

};



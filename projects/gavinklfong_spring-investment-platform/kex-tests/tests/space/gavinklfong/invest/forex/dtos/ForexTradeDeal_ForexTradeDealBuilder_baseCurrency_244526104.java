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

public class ForexTradeDeal_ForexTradeDealBuilder_baseCurrency_244526104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7720;

    public ForexTradeDeal_ForexTradeDealBuilder_baseCurrency_244526104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7721 = new Long(-4365849114644724155L);
        Double term7769 = new Double(0.544608645520025);
        Class<? extends Object> term7840 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term7839 = ((Class) term7840).getDeclaredField((String) "BUY");
        ((Field) term7839).setAccessible(true);
        Object enum21 = ((Field) term7839).get((Object) null);
        Long term7795 = new Long(2486810210675247493L);
        term7720 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder"));
        Object term7735 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7736 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7740 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7778 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term7779 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7781 = (int[]) newIntArray(6);
        setField(term7720, term7720.getClass(), "id", term7721);
        setField(term7720, term7720.getClass(), "dealRef", "KoyGrUJeJW");
        setIntField(term7736, term7736.getClass(), "year", 2022);
        setShortField(term7736, term7736.getClass(), "month", (short) 2);
        setShortField(term7736, term7736.getClass(), "day", (short) 26);
        setField(term7735, term7735.getClass(), "date", term7736);
        setByteField(term7740, term7740.getClass(), "hour", (byte) 11);
        setByteField(term7740, term7740.getClass(), "minute", (byte) 42);
        setByteField(term7740, term7740.getClass(), "second", (byte) 15);
        setIntField(term7740, term7740.getClass(), "nano", 377731937);
        setField(term7735, term7735.getClass(), "time", term7740);
        setField(term7720, term7720.getClass(), "timestamp", term7735);
        setField(term7720, term7720.getClass(), "baseCurrency", "HqBOwkVqjD");
        setField(term7720, term7720.getClass(), "counterCurrency", "MAcUBcBckh");
        setField(term7720, term7720.getClass(), "rate", term7769);
        setField(term7720, term7720.getClass(), "tradeAction", enum21);
        setIntField(term7779, term7779.getClass(), "signum", 1);
        setIntElement(term7781, 0, 5017);
        setIntElement(term7781, 1, 1138264108);
        setIntElement(term7781, 2, 138609451);
        setIntElement(term7781, 3, -559929925);
        setIntElement(term7781, 4, -1000035065);
        setIntElement(term7781, 5, 1199074337);
        setField(term7779, term7779.getClass(), "mag", term7781);
        setIntField(term7779, term7779.getClass(), "bitCountPlusOne", 0);
        setIntField(term7779, term7779.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7779, term7779.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7779, term7779.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7778, term7778.getClass(), "intVal", term7779);
        setIntField(term7778, term7778.getClass(), "scale", 52);
        setIntField(term7778, term7778.getClass(), "precision", 0);
        setField(term7778, term7778.getClass(), "stringCache", null);
        setLongField(term7778, term7778.getClass(), "intCompact", -9223372036854775808L);
        setField(term7720, term7720.getClass(), "baseCurrencyAmount", term7778);
        setField(term7720, term7720.getClass(), "customerId", term7795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVgzLbrsFr";
        callMethod(klass, "baseCurrency", argTypes, term7720, args);
    }

};



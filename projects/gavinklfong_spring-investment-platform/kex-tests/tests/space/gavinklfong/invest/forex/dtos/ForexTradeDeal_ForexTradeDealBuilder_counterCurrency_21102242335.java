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

public class ForexTradeDeal_ForexTradeDealBuilder_counterCurrency_21102242335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8106;

    public ForexTradeDeal_ForexTradeDealBuilder_counterCurrency_21102242335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8107 = new Long(7009926388951271268L);
        Double term8155 = new Double(0.28570734989730284);
        Class<? extends Object> term8227 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term8226 = ((Class) term8227).getDeclaredField((String) "SELL");
        ((Field) term8226).setAccessible(true);
        Object enum22 = ((Field) term8226).get((Object) null);
        Long term8182 = new Long(-7672528020740371001L);
        term8106 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder"));
        Object term8121 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8122 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8126 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8165 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term8166 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8168 = (int[]) newIntArray(6);
        setField(term8106, term8106.getClass(), "id", term8107);
        setField(term8106, term8106.getClass(), "dealRef", "vQVyKLdtaz");
        setIntField(term8122, term8122.getClass(), "year", 2026);
        setShortField(term8122, term8122.getClass(), "month", (short) 12);
        setShortField(term8122, term8122.getClass(), "day", (short) 14);
        setField(term8121, term8121.getClass(), "date", term8122);
        setByteField(term8126, term8126.getClass(), "hour", (byte) 16);
        setByteField(term8126, term8126.getClass(), "minute", (byte) 34);
        setByteField(term8126, term8126.getClass(), "second", (byte) 9);
        setIntField(term8126, term8126.getClass(), "nano", 518326996);
        setField(term8121, term8121.getClass(), "time", term8126);
        setField(term8106, term8106.getClass(), "timestamp", term8121);
        setField(term8106, term8106.getClass(), "baseCurrency", "OWKQODBLzb");
        setField(term8106, term8106.getClass(), "counterCurrency", "wGmYcqUkgE");
        setField(term8106, term8106.getClass(), "rate", term8155);
        setField(term8106, term8106.getClass(), "tradeAction", enum22);
        setIntField(term8166, term8166.getClass(), "signum", 1);
        setIntElement(term8168, 0, 31263);
        setIntElement(term8168, 1, -1965314916);
        setIntElement(term8168, 2, -443046697);
        setIntElement(term8168, 3, -1268253260);
        setIntElement(term8168, 4, -877110081);
        setIntElement(term8168, 5, -1376525969);
        setField(term8166, term8166.getClass(), "mag", term8168);
        setIntField(term8166, term8166.getClass(), "bitCountPlusOne", 0);
        setIntField(term8166, term8166.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8166, term8166.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8166, term8166.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8165, term8165.getClass(), "intVal", term8166);
        setIntField(term8165, term8165.getClass(), "scale", 53);
        setIntField(term8165, term8165.getClass(), "precision", 0);
        setField(term8165, term8165.getClass(), "stringCache", null);
        setLongField(term8165, term8165.getClass(), "intCompact", -9223372036854775808L);
        setField(term8106, term8106.getClass(), "baseCurrencyAmount", term8165);
        setField(term8106, term8106.getClass(), "customerId", term8182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "idgaQsnJpQ";
        callMethod(klass, "counterCurrency", argTypes, term8106, args);
    }

};



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

public class ForexTradeDeal_ForexTradeDealBuilder_toString_175270576911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10355;

    public ForexTradeDeal_ForexTradeDealBuilder_toString_175270576911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10356 = new Long(-8708192233349544946L);
        Double term10404 = new Double(0.5183269973490326);
        Class<? extends Object> term10463 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term10462 = ((Class) term10463).getDeclaredField((String) "BUY");
        ((Field) term10462).setAccessible(true);
        Object enum28 = ((Field) term10462).get((Object) null);
        Long term10430 = new Long(5907001541142728739L);
        term10355 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder"));
        Object term10370 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10371 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10375 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10413 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term10414 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term10416 = (int[]) newIntArray(6);
        setField(term10355, term10355.getClass(), "id", term10356);
        setField(term10355, term10355.getClass(), "dealRef", "XqgfKFvPSD");
        setIntField(term10371, term10371.getClass(), "year", 2018);
        setShortField(term10371, term10371.getClass(), "month", (short) 9);
        setShortField(term10371, term10371.getClass(), "day", (short) 28);
        setField(term10370, term10370.getClass(), "date", term10371);
        setByteField(term10375, term10375.getClass(), "hour", (byte) 3);
        setByteField(term10375, term10375.getClass(), "minute", (byte) 37);
        setByteField(term10375, term10375.getClass(), "second", (byte) 46);
        setIntField(term10375, term10375.getClass(), "nano", 763326845);
        setField(term10370, term10370.getClass(), "time", term10375);
        setField(term10355, term10355.getClass(), "timestamp", term10370);
        setField(term10355, term10355.getClass(), "baseCurrency", "JiVRgTZvKc");
        setField(term10355, term10355.getClass(), "counterCurrency", "XPKmummaqg");
        setField(term10355, term10355.getClass(), "rate", term10404);
        setField(term10355, term10355.getClass(), "tradeAction", enum28);
        setIntField(term10414, term10414.getClass(), "signum", 1);
        setIntElement(term10416, 0, 51722);
        setIntElement(term10416, 1, 1822015379);
        setIntElement(term10416, 2, 1030733959);
        setIntElement(term10416, 3, 1299891196);
        setIntElement(term10416, 4, 1679751767);
        setIntElement(term10416, 5, -572989409);
        setField(term10414, term10414.getClass(), "mag", term10416);
        setIntField(term10414, term10414.getClass(), "bitCountPlusOne", 0);
        setIntField(term10414, term10414.getClass(), "bitLengthPlusOne", 0);
        setIntField(term10414, term10414.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term10414, term10414.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term10413, term10413.getClass(), "intVal", term10414);
        setIntField(term10413, term10413.getClass(), "scale", 53);
        setIntField(term10413, term10413.getClass(), "precision", 0);
        setField(term10413, term10413.getClass(), "stringCache", null);
        setLongField(term10413, term10413.getClass(), "intCompact", -9223372036854775808L);
        setField(term10355, term10355.getClass(), "baseCurrencyAmount", term10413);
        setField(term10355, term10355.getClass(), "customerId", term10430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10355, args);
    }

};



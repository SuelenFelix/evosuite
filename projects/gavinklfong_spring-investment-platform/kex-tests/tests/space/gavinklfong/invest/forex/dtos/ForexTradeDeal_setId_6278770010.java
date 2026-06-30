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

public class ForexTradeDeal_setId_6278770010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29232;
     Object term29309;

    public ForexTradeDeal_setId_6278770010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29233 = new Long(2297097306706899827L);
        Double term29281 = new Double(0.40635376375558196);
        Class<? extends Object> term29342 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term29341 = ((Class) term29342).getDeclaredField((String) "BUY");
        ((Field) term29341).setAccessible(true);
        Object enum71 = ((Field) term29341).get((Object) null);
        Long term29307 = new Long(-900457279156388404L);
        term29232 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term29247 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29248 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29252 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29290 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term29291 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term29293 = (int[]) newIntArray(6);
        setField(term29232, term29232.getClass(), "id", term29233);
        setField(term29232, term29232.getClass(), "dealRef", "IoSfuKDFRe");
        setIntField(term29248, term29248.getClass(), "year", 2023);
        setShortField(term29248, term29248.getClass(), "month", (short) 3);
        setShortField(term29248, term29248.getClass(), "day", (short) 7);
        setField(term29247, term29247.getClass(), "date", term29248);
        setByteField(term29252, term29252.getClass(), "hour", (byte) 21);
        setByteField(term29252, term29252.getClass(), "minute", (byte) 15);
        setByteField(term29252, term29252.getClass(), "second", (byte) 43);
        setIntField(term29252, term29252.getClass(), "nano", 639721472);
        setField(term29247, term29247.getClass(), "time", term29252);
        setField(term29232, term29232.getClass(), "timestamp", term29247);
        setField(term29232, term29232.getClass(), "baseCurrency", "AWYyZiNfsm");
        setField(term29232, term29232.getClass(), "counterCurrency", "ITRRYiuDwH");
        setField(term29232, term29232.getClass(), "rate", term29281);
        setField(term29232, term29232.getClass(), "tradeAction", enum71);
        setIntField(term29291, term29291.getClass(), "signum", 1);
        setIntElement(term29293, 0, 24786);
        setIntElement(term29293, 1, -537812620);
        setIntElement(term29293, 2, 1638771399);
        setIntElement(term29293, 3, 1615160984);
        setIntElement(term29293, 4, 1090385711);
        setIntElement(term29293, 5, 20627819);
        setField(term29291, term29291.getClass(), "mag", term29293);
        setIntField(term29291, term29291.getClass(), "bitCountPlusOne", 0);
        setIntField(term29291, term29291.getClass(), "bitLengthPlusOne", 0);
        setIntField(term29291, term29291.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term29291, term29291.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term29290, term29290.getClass(), "intVal", term29291);
        setIntField(term29290, term29290.getClass(), "scale", 53);
        setIntField(term29290, term29290.getClass(), "precision", 0);
        setField(term29290, term29290.getClass(), "stringCache", null);
        setLongField(term29290, term29290.getClass(), "intCompact", -9223372036854775808L);
        setField(term29232, term29232.getClass(), "baseCurrencyAmount", term29290);
        setField(term29232, term29232.getClass(), "customerId", term29307);
        term29309 = new Long(1084801489398441516L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term29309;
        callMethod(klass, "setId", argTypes, term29232, args);
    }

};



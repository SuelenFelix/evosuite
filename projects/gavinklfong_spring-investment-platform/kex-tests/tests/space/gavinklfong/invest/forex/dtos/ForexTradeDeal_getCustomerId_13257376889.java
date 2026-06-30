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

public class ForexTradeDeal_getCustomerId_13257376889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28868;

    public ForexTradeDeal_getCustomerId_13257376889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28869 = new Long(-7268507582722666254L);
        Double term28917 = new Double(0.9123572866833729);
        Class<? extends Object> term28976 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term28975 = ((Class) term28976).getDeclaredField((String) "BUY");
        ((Field) term28975).setAccessible(true);
        Object enum70 = ((Field) term28975).get((Object) null);
        Long term28943 = new Long(5671808784468963649L);
        term28868 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term28883 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28884 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28888 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28926 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term28927 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term28929 = (int[]) newIntArray(6);
        setField(term28868, term28868.getClass(), "id", term28869);
        setField(term28868, term28868.getClass(), "dealRef", "PvmBHIXaMY");
        setIntField(term28884, term28884.getClass(), "year", 2014);
        setShortField(term28884, term28884.getClass(), "month", (short) 7);
        setShortField(term28884, term28884.getClass(), "day", (short) 13);
        setField(term28883, term28883.getClass(), "date", term28884);
        setByteField(term28888, term28888.getClass(), "hour", (byte) 21);
        setByteField(term28888, term28888.getClass(), "minute", (byte) 46);
        setByteField(term28888, term28888.getClass(), "second", (byte) 0);
        setIntField(term28888, term28888.getClass(), "nano", 887884128);
        setField(term28883, term28883.getClass(), "time", term28888);
        setField(term28868, term28868.getClass(), "timestamp", term28883);
        setField(term28868, term28868.getClass(), "baseCurrency", "hulYxtowxw");
        setField(term28868, term28868.getClass(), "counterCurrency", "GNEmuHPNcU");
        setField(term28868, term28868.getClass(), "rate", term28917);
        setField(term28868, term28868.getClass(), "tradeAction", enum70);
        setIntField(term28927, term28927.getClass(), "signum", 1);
        setIntElement(term28929, 0, 154);
        setIntElement(term28929, 1, -190767620);
        setIntElement(term28929, 2, 1384068716);
        setIntElement(term28929, 3, -1306517818);
        setIntElement(term28929, 4, 1608452838);
        setIntElement(term28929, 5, -1191314303);
        setField(term28927, term28927.getClass(), "mag", term28929);
        setIntField(term28927, term28927.getClass(), "bitCountPlusOne", 0);
        setIntField(term28927, term28927.getClass(), "bitLengthPlusOne", 0);
        setIntField(term28927, term28927.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term28927, term28927.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term28926, term28926.getClass(), "intVal", term28927);
        setIntField(term28926, term28926.getClass(), "scale", 53);
        setIntField(term28926, term28926.getClass(), "precision", 0);
        setField(term28926, term28926.getClass(), "stringCache", null);
        setLongField(term28926, term28926.getClass(), "intCompact", -9223372036854775808L);
        setField(term28868, term28868.getClass(), "baseCurrencyAmount", term28926);
        setField(term28868, term28868.getClass(), "customerId", term28943);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomerId", argTypes, term28868, args);
    }

};



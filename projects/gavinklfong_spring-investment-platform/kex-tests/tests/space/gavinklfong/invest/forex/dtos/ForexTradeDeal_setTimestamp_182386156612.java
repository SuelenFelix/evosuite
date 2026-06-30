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

public class ForexTradeDeal_setTimestamp_182386156612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29984;
     Object term30061;

    public ForexTradeDeal_setTimestamp_182386156612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29985 = new Long(8313800941204938919L);
        Double term30033 = new Double(0.2446504549754045);
        Class<? extends Object> term30102 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term30101 = ((Class) term30102).getDeclaredField((String) "BUY");
        ((Field) term30101).setAccessible(true);
        Object enum73 = ((Field) term30101).get((Object) null);
        Long term30059 = new Long(-1214968196781083707L);
        term29984 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term29999 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30000 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30004 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30042 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term30043 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term30045 = (int[]) newIntArray(6);
        setField(term29984, term29984.getClass(), "id", term29985);
        setField(term29984, term29984.getClass(), "dealRef", "nKZKnxWYCK");
        setIntField(term30000, term30000.getClass(), "year", 2027);
        setShortField(term30000, term30000.getClass(), "month", (short) 8);
        setShortField(term30000, term30000.getClass(), "day", (short) 26);
        setField(term29999, term29999.getClass(), "date", term30000);
        setByteField(term30004, term30004.getClass(), "hour", (byte) 5);
        setByteField(term30004, term30004.getClass(), "minute", (byte) 11);
        setByteField(term30004, term30004.getClass(), "second", (byte) 9);
        setIntField(term30004, term30004.getClass(), "nano", 219245092);
        setField(term29999, term29999.getClass(), "time", term30004);
        setField(term29984, term29984.getClass(), "timestamp", term29999);
        setField(term29984, term29984.getClass(), "baseCurrency", "JOqQxuzRuZ");
        setField(term29984, term29984.getClass(), "counterCurrency", "RSaoipUlsg");
        setField(term29984, term29984.getClass(), "rate", term30033);
        setField(term29984, term29984.getClass(), "tradeAction", enum73);
        setIntField(term30043, term30043.getClass(), "signum", 1);
        setIntElement(term30045, 0, 41376);
        setIntElement(term30045, 1, 842109249);
        setIntElement(term30045, 2, 1543605109);
        setIntElement(term30045, 3, -2086772896);
        setIntElement(term30045, 4, 1084436163);
        setIntElement(term30045, 5, -159037963);
        setField(term30043, term30043.getClass(), "mag", term30045);
        setIntField(term30043, term30043.getClass(), "bitCountPlusOne", 0);
        setIntField(term30043, term30043.getClass(), "bitLengthPlusOne", 0);
        setIntField(term30043, term30043.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term30043, term30043.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term30042, term30042.getClass(), "intVal", term30043);
        setIntField(term30042, term30042.getClass(), "scale", 53);
        setIntField(term30042, term30042.getClass(), "precision", 0);
        setField(term30042, term30042.getClass(), "stringCache", null);
        setLongField(term30042, term30042.getClass(), "intCompact", -9223372036854775808L);
        setField(term29984, term29984.getClass(), "baseCurrencyAmount", term30042);
        setField(term29984, term29984.getClass(), "customerId", term30059);
        term30061 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30062 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30066 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30062, term30062.getClass(), "year", 2025);
        setShortField(term30062, term30062.getClass(), "month", (short) 3);
        setShortField(term30062, term30062.getClass(), "day", (short) 9);
        setField(term30061, term30061.getClass(), "date", term30062);
        setByteField(term30066, term30066.getClass(), "hour", (byte) 5);
        setByteField(term30066, term30066.getClass(), "minute", (byte) 49);
        setByteField(term30066, term30066.getClass(), "second", (byte) 12);
        setIntField(term30066, term30066.getClass(), "nano", 791695028);
        setField(term30061, term30061.getClass(), "time", term30066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term30061;
        callMethod(klass, "setTimestamp", argTypes, term29984, args);
    }

};



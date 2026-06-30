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

public class ForexTradeDeal_setCustomerId_138983079418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32255;
     Object term32332;

    public ForexTradeDeal_setCustomerId_138983079418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32256 = new Long(8802866251294305945L);
        Double term32304 = new Double(0.44268490778872205);
        Class<? extends Object> term32365 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term32364 = ((Class) term32365).getDeclaredField((String) "BUY");
        ((Field) term32364).setAccessible(true);
        Object enum79 = ((Field) term32364).get((Object) null);
        Long term32330 = new Long(4513004407927379358L);
        term32255 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term32270 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32271 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32275 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32313 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term32314 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term32316 = (int[]) newIntArray(6);
        setField(term32255, term32255.getClass(), "id", term32256);
        setField(term32255, term32255.getClass(), "dealRef", "zgKiINdgNu");
        setIntField(term32271, term32271.getClass(), "year", 2016);
        setShortField(term32271, term32271.getClass(), "month", (short) 6);
        setShortField(term32271, term32271.getClass(), "day", (short) 15);
        setField(term32270, term32270.getClass(), "date", term32271);
        setByteField(term32275, term32275.getClass(), "hour", (byte) 21);
        setByteField(term32275, term32275.getClass(), "minute", (byte) 23);
        setByteField(term32275, term32275.getClass(), "second", (byte) 23);
        setIntField(term32275, term32275.getClass(), "nano", 433372070);
        setField(term32270, term32270.getClass(), "time", term32275);
        setField(term32255, term32255.getClass(), "timestamp", term32270);
        setField(term32255, term32255.getClass(), "baseCurrency", "zLMTXDQHYH");
        setField(term32255, term32255.getClass(), "counterCurrency", "PqywFWJlpE");
        setField(term32255, term32255.getClass(), "rate", term32304);
        setField(term32255, term32255.getClass(), "tradeAction", enum79);
        setIntField(term32314, term32314.getClass(), "signum", 1);
        setIntElement(term32316, 0, 61066);
        setIntElement(term32316, 1, 1460049099);
        setIntElement(term32316, 2, -1451563573);
        setIntElement(term32316, 3, -3429064);
        setIntElement(term32316, 4, 462198911);
        setIntElement(term32316, 5, -1869206977);
        setField(term32314, term32314.getClass(), "mag", term32316);
        setIntField(term32314, term32314.getClass(), "bitCountPlusOne", 0);
        setIntField(term32314, term32314.getClass(), "bitLengthPlusOne", 0);
        setIntField(term32314, term32314.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term32314, term32314.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term32313, term32313.getClass(), "intVal", term32314);
        setIntField(term32313, term32313.getClass(), "scale", 53);
        setIntField(term32313, term32313.getClass(), "precision", 0);
        setField(term32313, term32313.getClass(), "stringCache", null);
        setLongField(term32313, term32313.getClass(), "intCompact", -9223372036854775808L);
        setField(term32255, term32255.getClass(), "baseCurrencyAmount", term32313);
        setField(term32255, term32255.getClass(), "customerId", term32330);
        term32332 = new Long(-7115418542247301000L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term32332;
        callMethod(klass, "setCustomerId", argTypes, term32255, args);
    }

};



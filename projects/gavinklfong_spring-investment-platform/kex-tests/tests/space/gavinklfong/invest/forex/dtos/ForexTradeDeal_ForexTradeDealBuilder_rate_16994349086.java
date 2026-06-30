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

public class ForexTradeDeal_ForexTradeDealBuilder_rate_16994349086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8496;
     Object term8574;

    public ForexTradeDeal_ForexTradeDealBuilder_rate_16994349086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8497 = new Long(-4502405999831680926L);
        Double term8545 = new Double(0.40176586625454525);
        Class<? extends Object> term8607 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term8606 = ((Class) term8607).getDeclaredField((String) "SELL");
        ((Field) term8606).setAccessible(true);
        Object enum23 = ((Field) term8606).get((Object) null);
        Long term8572 = new Long(1967728129628047933L);
        term8496 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder"));
        Object term8511 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8512 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8516 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8555 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term8556 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8558 = (int[]) newIntArray(6);
        setField(term8496, term8496.getClass(), "id", term8497);
        setField(term8496, term8496.getClass(), "dealRef", "VgZnGoIFwQ");
        setIntField(term8512, term8512.getClass(), "year", 2025);
        setShortField(term8512, term8512.getClass(), "month", (short) 4);
        setShortField(term8512, term8512.getClass(), "day", (short) 24);
        setField(term8511, term8511.getClass(), "date", term8512);
        setByteField(term8516, term8516.getClass(), "hour", (byte) 18);
        setByteField(term8516, term8516.getClass(), "minute", (byte) 11);
        setByteField(term8516, term8516.getClass(), "second", (byte) 40);
        setIntField(term8516, term8516.getClass(), "nano", 137454929);
        setField(term8511, term8511.getClass(), "time", term8516);
        setField(term8496, term8496.getClass(), "timestamp", term8511);
        setField(term8496, term8496.getClass(), "baseCurrency", "jUbSRrkrYZ");
        setField(term8496, term8496.getClass(), "counterCurrency", "bWWfajKbEX");
        setField(term8496, term8496.getClass(), "rate", term8545);
        setField(term8496, term8496.getClass(), "tradeAction", enum23);
        setIntField(term8556, term8556.getClass(), "signum", 1);
        setIntElement(term8558, 0, 5883);
        setIntElement(term8558, 1, 833709085);
        setIntElement(term8558, 2, 749794735);
        setIntElement(term8558, 3, 825830368);
        setIntElement(term8558, 4, 935494074);
        setIntElement(term8558, 5, -2012885541);
        setField(term8556, term8556.getClass(), "mag", term8558);
        setIntField(term8556, term8556.getClass(), "bitCountPlusOne", 0);
        setIntField(term8556, term8556.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8556, term8556.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8556, term8556.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8555, term8555.getClass(), "intVal", term8556);
        setIntField(term8555, term8555.getClass(), "scale", 52);
        setIntField(term8555, term8555.getClass(), "precision", 0);
        setField(term8555, term8555.getClass(), "stringCache", null);
        setLongField(term8555, term8555.getClass(), "intCompact", -9223372036854775808L);
        setField(term8496, term8496.getClass(), "baseCurrencyAmount", term8555);
        setField(term8496, term8496.getClass(), "customerId", term8572);
        term8574 = new Double(0.2641345529914265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term8574;
        callMethod(klass, "rate", argTypes, term8496, args);
    }

};



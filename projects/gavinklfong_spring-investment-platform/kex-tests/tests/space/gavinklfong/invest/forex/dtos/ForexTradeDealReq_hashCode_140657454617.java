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
import java.lang.Double;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;

public class ForexTradeDealReq_hashCode_140657454617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44695;

    public ForexTradeDealReq_hashCode_140657454617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term44720 = new Double(0.25997329921466494);
        Class<? extends Object> term44782 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term44781 = ((Class) term44782).getDeclaredField((String) "SELL");
        ((Field) term44781).setAccessible(true);
        Object enum113 = ((Field) term44781).get((Object) null);
        Long term44747 = new Long(4394651392080968777L);
        term44695 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq"));
        Object term44730 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term44731 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term44733 = (int[]) newIntArray(6);
        setField(term44695, term44695.getClass(), "baseCurrency", "FiYYLuailz");
        setField(term44695, term44695.getClass(), "counterCurrency", "XebAeSnCKZ");
        setField(term44695, term44695.getClass(), "rate", term44720);
        setField(term44695, term44695.getClass(), "tradeAction", enum113);
        setIntField(term44731, term44731.getClass(), "signum", 1);
        setIntElement(term44733, 0, 4844);
        setIntElement(term44733, 1, 1822993645);
        setIntElement(term44733, 2, -2018210365);
        setIntElement(term44733, 3, 1180040502);
        setIntElement(term44733, 4, -1117718570);
        setIntElement(term44733, 5, -861944479);
        setField(term44731, term44731.getClass(), "mag", term44733);
        setIntField(term44731, term44731.getClass(), "bitCountPlusOne", 0);
        setIntField(term44731, term44731.getClass(), "bitLengthPlusOne", 0);
        setIntField(term44731, term44731.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term44731, term44731.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term44730, term44730.getClass(), "intVal", term44731);
        setIntField(term44730, term44730.getClass(), "scale", 52);
        setIntField(term44730, term44730.getClass(), "precision", 0);
        setField(term44730, term44730.getClass(), "stringCache", null);
        setLongField(term44730, term44730.getClass(), "intCompact", -9223372036854775808L);
        setField(term44695, term44695.getClass(), "baseCurrencyAmount", term44730);
        setField(term44695, term44695.getClass(), "customerId", term44747);
        setField(term44695, term44695.getClass(), "rateBookingRef", "GeddnXjHGy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term44695, args);
    }

};



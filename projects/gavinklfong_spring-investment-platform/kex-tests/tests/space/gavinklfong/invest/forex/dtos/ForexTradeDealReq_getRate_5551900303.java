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

public class ForexTradeDealReq_getRate_5551900303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39646;

    public ForexTradeDealReq_getRate_5551900303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term39671 = new Double(0.9485929668765458);
        Class<? extends Object> term39733 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term39732 = ((Class) term39733).getDeclaredField((String) "SELL");
        ((Field) term39732).setAccessible(true);
        Object enum99 = ((Field) term39732).get((Object) null);
        Long term39698 = new Long(-78240609295693193L);
        term39646 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq"));
        Object term39681 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term39682 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term39684 = (int[]) newIntArray(6);
        setField(term39646, term39646.getClass(), "baseCurrency", "AyrEXuGrEj");
        setField(term39646, term39646.getClass(), "counterCurrency", "yevIIoVYHq");
        setField(term39646, term39646.getClass(), "rate", term39671);
        setField(term39646, term39646.getClass(), "tradeAction", enum99);
        setIntField(term39682, term39682.getClass(), "signum", 1);
        setIntElement(term39684, 0, 34888);
        setIntElement(term39684, 1, 2106466829);
        setIntElement(term39684, 2, 1905755743);
        setIntElement(term39684, 3, -1362404503);
        setIntElement(term39684, 4, 260214781);
        setIntElement(term39684, 5, 1325358101);
        setField(term39682, term39682.getClass(), "mag", term39684);
        setIntField(term39682, term39682.getClass(), "bitCountPlusOne", 0);
        setIntField(term39682, term39682.getClass(), "bitLengthPlusOne", 0);
        setIntField(term39682, term39682.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term39682, term39682.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term39681, term39681.getClass(), "intVal", term39682);
        setIntField(term39681, term39681.getClass(), "scale", 53);
        setIntField(term39681, term39681.getClass(), "precision", 0);
        setField(term39681, term39681.getClass(), "stringCache", null);
        setLongField(term39681, term39681.getClass(), "intCompact", -9223372036854775808L);
        setField(term39646, term39646.getClass(), "baseCurrencyAmount", term39681);
        setField(term39646, term39646.getClass(), "customerId", term39698);
        setField(term39646, term39646.getClass(), "rateBookingRef", "UuYWMTqWTV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRate", argTypes, term39646, args);
    }

};



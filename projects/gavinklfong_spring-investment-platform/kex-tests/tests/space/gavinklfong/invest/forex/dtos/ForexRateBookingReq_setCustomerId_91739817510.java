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
import java.lang.Object;
import java.lang.String;
import java.lang.Long;

public class ForexRateBookingReq_setCustomerId_91739817510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4592;
     Object term4643;

    public ForexRateBookingReq_setCustomerId_91739817510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4672 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term4671 = ((Class) term4672).getDeclaredField((String) "BUY");
        ((Field) term4671).setAccessible(true);
        Object enum12 = ((Field) term4671).get((Object) null);
        Long term4641 = new Long(6967924379644551255L);
        term4592 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq"));
        Object term4617 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4618 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4620 = (int[]) newIntArray(6);
        setField(term4592, term4592.getClass(), "baseCurrency", "UiUYnPrcCi");
        setField(term4592, term4592.getClass(), "counterCurrency", "UoYtihxVaS");
        setIntField(term4618, term4618.getClass(), "signum", 1);
        setIntElement(term4620, 0, 579);
        setIntElement(term4620, 1, -560540333);
        setIntElement(term4620, 2, 1014435409);
        setIntElement(term4620, 3, -1248929007);
        setIntElement(term4620, 4, -42206956);
        setIntElement(term4620, 5, 1817231305);
        setField(term4618, term4618.getClass(), "mag", term4620);
        setIntField(term4618, term4618.getClass(), "bitCountPlusOne", 0);
        setIntField(term4618, term4618.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4618, term4618.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4618, term4618.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4617, term4617.getClass(), "intVal", term4618);
        setIntField(term4617, term4617.getClass(), "scale", 51);
        setIntField(term4617, term4617.getClass(), "precision", 0);
        setField(term4617, term4617.getClass(), "stringCache", null);
        setLongField(term4617, term4617.getClass(), "intCompact", -9223372036854775808L);
        setField(term4592, term4592.getClass(), "baseCurrencyAmount", term4617);
        setField(term4592, term4592.getClass(), "tradeAction", enum12);
        setField(term4592, term4592.getClass(), "customerId", term4641);
        term4643 = new Long(-2813493605142626659L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4643;
        callMethod(klass, "setCustomerId", argTypes, term4592, args);
    }

};



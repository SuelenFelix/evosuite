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

public class ForexRateBookingReq_getCustomerId_6620006395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2607;

    public ForexRateBookingReq_getCustomerId_6620006395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2686 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term2685 = ((Class) term2686).getDeclaredField((String) "SELL");
        ((Field) term2685).setAccessible(true);
        Object enum6 = ((Field) term2685).get((Object) null);
        Long term2657 = new Long(5270370404989704783L);
        term2607 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq"));
        Object term2632 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2633 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2635 = (int[]) newIntArray(6);
        setField(term2607, term2607.getClass(), "baseCurrency", "aKnKipADSo");
        setField(term2607, term2607.getClass(), "counterCurrency", "wSQxaModmm");
        setIntField(term2633, term2633.getClass(), "signum", 1);
        setIntElement(term2635, 0, 1954);
        setIntElement(term2635, 1, -476668863);
        setIntElement(term2635, 2, 661030673);
        setIntElement(term2635, 3, 328061253);
        setIntElement(term2635, 4, -431156338);
        setIntElement(term2635, 5, 791621529);
        setField(term2633, term2633.getClass(), "mag", term2635);
        setIntField(term2633, term2633.getClass(), "bitCountPlusOne", 0);
        setIntField(term2633, term2633.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2633, term2633.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2633, term2633.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2632, term2632.getClass(), "intVal", term2633);
        setIntField(term2632, term2632.getClass(), "scale", 52);
        setIntField(term2632, term2632.getClass(), "precision", 0);
        setField(term2632, term2632.getClass(), "stringCache", null);
        setLongField(term2632, term2632.getClass(), "intCompact", -9223372036854775808L);
        setField(term2607, term2607.getClass(), "baseCurrencyAmount", term2632);
        setField(term2607, term2607.getClass(), "tradeAction", enum6);
        setField(term2607, term2607.getClass(), "customerId", term2657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomerId", argTypes, term2607, args);
    }

};



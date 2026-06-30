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

public class ForexRateBookingReq_ForexRateBookingReqBuilder_build_1885992836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12745;

    public ForexRateBookingReq_ForexRateBookingReqBuilder_build_1885992836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12823 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term12822 = ((Class) term12823).getDeclaredField((String) "BUY");
        ((Field) term12822).setAccessible(true);
        Object enum34 = ((Field) term12822).get((Object) null);
        Long term12794 = new Long(-2170847986967241072L);
        term12745 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq$ForexRateBookingReqBuilder"));
        Object term12770 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term12771 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term12773 = (int[]) newIntArray(6);
        setField(term12745, term12745.getClass(), "baseCurrency", "XOiDvlDhdc");
        setField(term12745, term12745.getClass(), "counterCurrency", "AdxvLJhNLe");
        setIntField(term12771, term12771.getClass(), "signum", 1);
        setIntElement(term12773, 0, 66623);
        setIntElement(term12773, 1, -721879507);
        setIntElement(term12773, 2, 685392094);
        setIntElement(term12773, 3, -309014712);
        setIntElement(term12773, 4, -2143218141);
        setIntElement(term12773, 5, -724344211);
        setField(term12771, term12771.getClass(), "mag", term12773);
        setIntField(term12771, term12771.getClass(), "bitCountPlusOne", 0);
        setIntField(term12771, term12771.getClass(), "bitLengthPlusOne", 0);
        setIntField(term12771, term12771.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term12771, term12771.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term12770, term12770.getClass(), "intVal", term12771);
        setIntField(term12770, term12770.getClass(), "scale", 53);
        setIntField(term12770, term12770.getClass(), "precision", 0);
        setField(term12770, term12770.getClass(), "stringCache", null);
        setLongField(term12770, term12770.getClass(), "intCompact", -9223372036854775808L);
        setField(term12745, term12745.getClass(), "baseCurrencyAmount", term12770);
        setField(term12745, term12745.getClass(), "tradeAction", enum34);
        setField(term12745, term12745.getClass(), "customerId", term12794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq$ForexRateBookingReqBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term12745, args);
    }

};



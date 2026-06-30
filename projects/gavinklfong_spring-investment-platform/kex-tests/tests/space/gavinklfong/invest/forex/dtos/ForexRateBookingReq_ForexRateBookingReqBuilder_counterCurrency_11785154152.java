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

public class ForexRateBookingReq_ForexRateBookingReqBuilder_counterCurrency_11785154152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11370;

    public ForexRateBookingReq_ForexRateBookingReqBuilder_counterCurrency_11785154152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11461 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term11460 = ((Class) term11461).getDeclaredField((String) "SELL");
        ((Field) term11460).setAccessible(true);
        Object enum30 = ((Field) term11460).get((Object) null);
        Long term11420 = new Long(-2068172595987555756L);
        term11370 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq$ForexRateBookingReqBuilder"));
        Object term11395 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11396 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term11398 = (int[]) newIntArray(6);
        setField(term11370, term11370.getClass(), "baseCurrency", "yGtHPyvYiQ");
        setField(term11370, term11370.getClass(), "counterCurrency", "MvRIxilFMJ");
        setIntField(term11396, term11396.getClass(), "signum", 1);
        setIntElement(term11398, 0, 786);
        setIntElement(term11398, 1, 1645098337);
        setIntElement(term11398, 2, -1661047007);
        setIntElement(term11398, 3, 638909622);
        setIntElement(term11398, 4, 5733837);
        setIntElement(term11398, 5, 1325345559);
        setField(term11396, term11396.getClass(), "mag", term11398);
        setIntField(term11396, term11396.getClass(), "bitCountPlusOne", 0);
        setIntField(term11396, term11396.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11396, term11396.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11396, term11396.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11395, term11395.getClass(), "intVal", term11396);
        setIntField(term11395, term11395.getClass(), "scale", 52);
        setIntField(term11395, term11395.getClass(), "precision", 0);
        setField(term11395, term11395.getClass(), "stringCache", null);
        setLongField(term11395, term11395.getClass(), "intCompact", -9223372036854775808L);
        setField(term11370, term11370.getClass(), "baseCurrencyAmount", term11395);
        setField(term11370, term11370.getClass(), "tradeAction", enum30);
        setField(term11370, term11370.getClass(), "customerId", term11420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq$ForexRateBookingReqBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iNwOJRBEjp";
        callMethod(klass, "counterCurrency", argTypes, term11370, args);
    }

};



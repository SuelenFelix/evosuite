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

public class ForexRateBookingReq_ForexRateBookingReqBuilder_baseCurrencyAmount_2942949603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11724;
     Object term11776;

    public ForexRateBookingReq_ForexRateBookingReqBuilder_baseCurrencyAmount_2942949603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11820 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term11819 = ((Class) term11820).getDeclaredField((String) "SELL");
        ((Field) term11819).setAccessible(true);
        Object enum31 = ((Field) term11819).get((Object) null);
        Long term11774 = new Long(-6292278961887936280L);
        term11724 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq$ForexRateBookingReqBuilder"));
        Object term11749 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11750 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term11752 = (int[]) newIntArray(6);
        setField(term11724, term11724.getClass(), "baseCurrency", "XylxrMBraH");
        setField(term11724, term11724.getClass(), "counterCurrency", "pORebkoRdD");
        setIntField(term11750, term11750.getClass(), "signum", 1);
        setIntElement(term11752, 0, 25426);
        setIntElement(term11752, 1, -543058641);
        setIntElement(term11752, 2, -2089171980);
        setIntElement(term11752, 3, -1455996494);
        setIntElement(term11752, 4, 401076257);
        setIntElement(term11752, 5, 615822889);
        setField(term11750, term11750.getClass(), "mag", term11752);
        setIntField(term11750, term11750.getClass(), "bitCountPlusOne", 0);
        setIntField(term11750, term11750.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11750, term11750.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11750, term11750.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11749, term11749.getClass(), "intVal", term11750);
        setIntField(term11749, term11749.getClass(), "scale", 53);
        setIntField(term11749, term11749.getClass(), "precision", 0);
        setField(term11749, term11749.getClass(), "stringCache", null);
        setLongField(term11749, term11749.getClass(), "intCompact", -9223372036854775808L);
        setField(term11724, term11724.getClass(), "baseCurrencyAmount", term11749);
        setField(term11724, term11724.getClass(), "tradeAction", enum31);
        setField(term11724, term11724.getClass(), "customerId", term11774);
        term11776 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11777 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term11779 = (int[]) newIntArray(6);
        setIntField(term11777, term11777.getClass(), "signum", 1);
        setIntElement(term11779, 0, 465);
        setIntElement(term11779, 1, -1390153706);
        setIntElement(term11779, 2, -2072151250);
        setIntElement(term11779, 3, -351773634);
        setIntElement(term11779, 4, -2080264737);
        setIntElement(term11779, 5, -362538513);
        setField(term11777, term11777.getClass(), "mag", term11779);
        setIntField(term11777, term11777.getClass(), "bitCountPlusOne", 0);
        setIntField(term11777, term11777.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11777, term11777.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11777, term11777.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11776, term11776.getClass(), "intVal", term11777);
        setIntField(term11776, term11776.getClass(), "scale", 51);
        setIntField(term11776, term11776.getClass(), "precision", 0);
        setField(term11776, term11776.getClass(), "stringCache", null);
        setLongField(term11776, term11776.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq$ForexRateBookingReqBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term11776;
        callMethod(klass, "baseCurrencyAmount", argTypes, term11724, args);
    }

};



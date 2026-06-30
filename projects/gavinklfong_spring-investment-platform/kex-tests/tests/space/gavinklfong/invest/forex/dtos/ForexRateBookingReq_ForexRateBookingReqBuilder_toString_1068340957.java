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

public class ForexRateBookingReq_ForexRateBookingReqBuilder_toString_1068340957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13073;

    public ForexRateBookingReq_ForexRateBookingReqBuilder_toString_1068340957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13150 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term13149 = ((Class) term13150).getDeclaredField((String) "SELL");
        ((Field) term13149).setAccessible(true);
        Object enum35 = ((Field) term13149).get((Object) null);
        Long term13122 = new Long(4044358158040652353L);
        term13073 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq$ForexRateBookingReqBuilder"));
        Object term13098 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term13099 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term13101 = (int[]) newIntArray(5);
        setField(term13073, term13073.getClass(), "baseCurrency", "lHfTrWKMPk");
        setField(term13073, term13073.getClass(), "counterCurrency", "JDaAnsVTGV");
        setIntField(term13099, term13099.getClass(), "signum", 1);
        setIntElement(term13101, 0, 1965699107);
        setIntElement(term13101, 1, 276112590);
        setIntElement(term13101, 2, 1355446503);
        setIntElement(term13101, 3, 1278820088);
        setIntElement(term13101, 4, -472848849);
        setField(term13099, term13099.getClass(), "mag", term13101);
        setIntField(term13099, term13099.getClass(), "bitCountPlusOne", 0);
        setIntField(term13099, term13099.getClass(), "bitLengthPlusOne", 0);
        setIntField(term13099, term13099.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term13099, term13099.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term13098, term13098.getClass(), "intVal", term13099);
        setIntField(term13098, term13098.getClass(), "scale", 49);
        setIntField(term13098, term13098.getClass(), "precision", 0);
        setField(term13098, term13098.getClass(), "stringCache", null);
        setLongField(term13098, term13098.getClass(), "intCompact", -9223372036854775808L);
        setField(term13073, term13073.getClass(), "baseCurrencyAmount", term13098);
        setField(term13073, term13073.getClass(), "tradeAction", enum35);
        setField(term13073, term13073.getClass(), "customerId", term13122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq$ForexRateBookingReqBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13073, args);
    }

};



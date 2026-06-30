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

public class ForexRateBookingReq_getCounterCurrency_4445155802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1623;

    public ForexRateBookingReq_getCounterCurrency_4445155802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1701 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term1700 = ((Class) term1701).getDeclaredField((String) "BUY");
        ((Field) term1700).setAccessible(true);
        Object enum3 = ((Field) term1700).get((Object) null);
        Long term1672 = new Long(6375119433582206027L);
        term1623 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq"));
        Object term1648 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1649 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1651 = (int[]) newIntArray(6);
        setField(term1623, term1623.getClass(), "baseCurrency", "SbAoxhfrkn");
        setField(term1623, term1623.getClass(), "counterCurrency", "kuTXqwMtDB");
        setIntField(term1649, term1649.getClass(), "signum", 1);
        setIntElement(term1651, 0, 2364);
        setIntElement(term1651, 1, -1446584625);
        setIntElement(term1651, 2, 1957600567);
        setIntElement(term1651, 3, -336418707);
        setIntElement(term1651, 4, -1905211145);
        setIntElement(term1651, 5, 86968353);
        setField(term1649, term1649.getClass(), "mag", term1651);
        setIntField(term1649, term1649.getClass(), "bitCountPlusOne", 0);
        setIntField(term1649, term1649.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1649, term1649.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1649, term1649.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1648, term1648.getClass(), "intVal", term1649);
        setIntField(term1648, term1648.getClass(), "scale", 52);
        setIntField(term1648, term1648.getClass(), "precision", 0);
        setField(term1648, term1648.getClass(), "stringCache", null);
        setLongField(term1648, term1648.getClass(), "intCompact", -9223372036854775808L);
        setField(term1623, term1623.getClass(), "baseCurrencyAmount", term1648);
        setField(term1623, term1623.getClass(), "tradeAction", enum3);
        setField(term1623, term1623.getClass(), "customerId", term1672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCounterCurrency", argTypes, term1623, args);
    }

};



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

public class ForexTradeDealReq_ForexTradeDealReqBuilder_counterCurrency_17620822812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46499;

    public ForexTradeDealReq_ForexTradeDealReqBuilder_counterCurrency_17620822812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term46524 = new Double(0.1849998667663698);
        Class<? extends Object> term46597 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term46596 = ((Class) term46597).getDeclaredField((String) "BUY");
        ((Field) term46596).setAccessible(true);
        Object enum117 = ((Field) term46596).get((Object) null);
        Long term46550 = new Long(4199886998224701110L);
        term46499 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder"));
        Object term46533 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term46534 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term46536 = (int[]) newIntArray(6);
        setField(term46499, term46499.getClass(), "baseCurrency", "bycpZjxXFn");
        setField(term46499, term46499.getClass(), "counterCurrency", "jQWttOAiwL");
        setField(term46499, term46499.getClass(), "rate", term46524);
        setField(term46499, term46499.getClass(), "tradeAction", enum117);
        setIntField(term46534, term46534.getClass(), "signum", 1);
        setIntElement(term46536, 0, 6508);
        setIntElement(term46536, 1, 1200229428);
        setIntElement(term46536, 2, -1132813401);
        setIntElement(term46536, 3, 99296900);
        setIntElement(term46536, 4, 934370401);
        setIntElement(term46536, 5, 1784464583);
        setField(term46534, term46534.getClass(), "mag", term46536);
        setIntField(term46534, term46534.getClass(), "bitCountPlusOne", 0);
        setIntField(term46534, term46534.getClass(), "bitLengthPlusOne", 0);
        setIntField(term46534, term46534.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term46534, term46534.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term46533, term46533.getClass(), "intVal", term46534);
        setIntField(term46533, term46533.getClass(), "scale", 52);
        setIntField(term46533, term46533.getClass(), "precision", 0);
        setField(term46533, term46533.getClass(), "stringCache", null);
        setLongField(term46533, term46533.getClass(), "intCompact", -9223372036854775808L);
        setField(term46499, term46499.getClass(), "baseCurrencyAmount", term46533);
        setField(term46499, term46499.getClass(), "customerId", term46550);
        setField(term46499, term46499.getClass(), "rateBookingRef", "DzKFxEuEEC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CAMnvfDLJL";
        callMethod(klass, "counterCurrency", argTypes, term46499, args);
    }

};



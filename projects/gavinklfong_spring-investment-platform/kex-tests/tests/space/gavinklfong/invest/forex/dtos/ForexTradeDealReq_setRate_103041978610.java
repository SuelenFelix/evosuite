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

public class ForexTradeDealReq_setRate_103041978610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42168;
     Object term42234;

    public ForexTradeDealReq_setRate_103041978610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term42193 = new Double(0.7046974927834232);
        Class<? extends Object> term42257 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term42256 = ((Class) term42257).getDeclaredField((String) "SELL");
        ((Field) term42256).setAccessible(true);
        Object enum106 = ((Field) term42256).get((Object) null);
        Long term42220 = new Long(3412644969878030772L);
        term42168 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq"));
        Object term42203 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term42204 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term42206 = (int[]) newIntArray(6);
        setField(term42168, term42168.getClass(), "baseCurrency", "RTTvrwwhou");
        setField(term42168, term42168.getClass(), "counterCurrency", "lRORwXipuk");
        setField(term42168, term42168.getClass(), "rate", term42193);
        setField(term42168, term42168.getClass(), "tradeAction", enum106);
        setIntField(term42204, term42204.getClass(), "signum", 1);
        setIntElement(term42206, 0, 592);
        setIntElement(term42206, 1, -1976202164);
        setIntElement(term42206, 2, -346702363);
        setIntElement(term42206, 3, 1568772698);
        setIntElement(term42206, 4, 1804282203);
        setIntElement(term42206, 5, -1747426199);
        setField(term42204, term42204.getClass(), "mag", term42206);
        setIntField(term42204, term42204.getClass(), "bitCountPlusOne", 0);
        setIntField(term42204, term42204.getClass(), "bitLengthPlusOne", 0);
        setIntField(term42204, term42204.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term42204, term42204.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term42203, term42203.getClass(), "intVal", term42204);
        setIntField(term42203, term42203.getClass(), "scale", 52);
        setIntField(term42203, term42203.getClass(), "precision", 0);
        setField(term42203, term42203.getClass(), "stringCache", null);
        setLongField(term42203, term42203.getClass(), "intCompact", -9223372036854775808L);
        setField(term42168, term42168.getClass(), "baseCurrencyAmount", term42203);
        setField(term42168, term42168.getClass(), "customerId", term42220);
        setField(term42168, term42168.getClass(), "rateBookingRef", "fVdTcjgHdw");
        term42234 = new Double(0.6896952303224777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term42234;
        callMethod(klass, "setRate", argTypes, term42168, args);
    }

};



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

public class ForexRateBookingReq_ForexRateBookingReqBuilder_tradeAction_16715230114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12079;
     Object enum32;

    public ForexRateBookingReq_ForexRateBookingReqBuilder_tradeAction_16715230114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12158 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term12157 = ((Class) term12158).getDeclaredField((String) "SELL");
        ((Field) term12157).setAccessible(true);
        enum32 = ((Field) term12157).get((Object) null);
        Long term12129 = new Long(-6645965768855543712L);
        term12079 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq$ForexRateBookingReqBuilder"));
        Object term12104 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term12105 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term12107 = (int[]) newIntArray(6);
        setField(term12079, term12079.getClass(), "baseCurrency", "mXGCWJDOqA");
        setField(term12079, term12079.getClass(), "counterCurrency", "dpNsDgfPso");
        setIntField(term12105, term12105.getClass(), "signum", 1);
        setIntElement(term12107, 0, 19519);
        setIntElement(term12107, 1, -1182278371);
        setIntElement(term12107, 2, -1767261549);
        setIntElement(term12107, 3, 1466667712);
        setIntElement(term12107, 4, 124168962);
        setIntElement(term12107, 5, -1752295351);
        setField(term12105, term12105.getClass(), "mag", term12107);
        setIntField(term12105, term12105.getClass(), "bitCountPlusOne", 0);
        setIntField(term12105, term12105.getClass(), "bitLengthPlusOne", 0);
        setIntField(term12105, term12105.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term12105, term12105.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term12104, term12104.getClass(), "intVal", term12105);
        setIntField(term12104, term12104.getClass(), "scale", 53);
        setIntField(term12104, term12104.getClass(), "precision", 0);
        setField(term12104, term12104.getClass(), "stringCache", null);
        setLongField(term12104, term12104.getClass(), "intCompact", -9223372036854775808L);
        setField(term12079, term12079.getClass(), "baseCurrencyAmount", term12104);
        setField(term12079, term12079.getClass(), "tradeAction", enum32);
        setField(term12079, term12079.getClass(), "customerId", term12129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq$ForexRateBookingReqBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("space.gavinklfong.invest.forex.dtos.TradeAction");
        Object[] args = new Object[1];
        args[0] = enum32;
        callMethod(klass, "tradeAction", argTypes, term12079, args);
    }

};



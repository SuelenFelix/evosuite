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

public class ForexTradeDealReq_ForexTradeDealReqBuilder_tradeAction_3171534114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47227;
     Object enum119;

    public ForexTradeDealReq_ForexTradeDealReqBuilder_tradeAction_3171534114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term47252 = new Double(0.9765248027281291);
        Class<? extends Object> term47313 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term47312 = ((Class) term47313).getDeclaredField((String) "BUY");
        ((Field) term47312).setAccessible(true);
        enum119 = ((Field) term47312).get((Object) null);
        Long term47278 = new Long(-2338103433822116635L);
        term47227 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder"));
        Object term47261 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term47262 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term47264 = (int[]) newIntArray(6);
        setField(term47227, term47227.getClass(), "baseCurrency", "uzmqjnOUXu");
        setField(term47227, term47227.getClass(), "counterCurrency", "xeyjTOCOJb");
        setField(term47227, term47227.getClass(), "rate", term47252);
        setField(term47227, term47227.getClass(), "tradeAction", enum119);
        setIntField(term47262, term47262.getClass(), "signum", 1);
        setIntElement(term47264, 0, 23270);
        setIntElement(term47264, 1, -1515076358);
        setIntElement(term47264, 2, -614868568);
        setIntElement(term47264, 3, -2057053008);
        setIntElement(term47264, 4, -719340387);
        setIntElement(term47264, 5, 934892047);
        setField(term47262, term47262.getClass(), "mag", term47264);
        setIntField(term47262, term47262.getClass(), "bitCountPlusOne", 0);
        setIntField(term47262, term47262.getClass(), "bitLengthPlusOne", 0);
        setIntField(term47262, term47262.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term47262, term47262.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term47261, term47261.getClass(), "intVal", term47262);
        setIntField(term47261, term47261.getClass(), "scale", 53);
        setIntField(term47261, term47261.getClass(), "precision", 0);
        setField(term47261, term47261.getClass(), "stringCache", null);
        setLongField(term47261, term47261.getClass(), "intCompact", -9223372036854775808L);
        setField(term47227, term47227.getClass(), "baseCurrencyAmount", term47261);
        setField(term47227, term47227.getClass(), "customerId", term47278);
        setField(term47227, term47227.getClass(), "rateBookingRef", "DGRqjjdhzy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("space.gavinklfong.invest.forex.dtos.TradeAction");
        Object[] args = new Object[1];
        args[0] = enum119;
        callMethod(klass, "tradeAction", argTypes, term47227, args);
    }

};



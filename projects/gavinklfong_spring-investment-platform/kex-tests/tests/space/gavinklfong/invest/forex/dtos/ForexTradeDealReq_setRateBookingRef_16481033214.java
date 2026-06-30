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

public class ForexTradeDealReq_setRateBookingRef_16481033214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43615;

    public ForexTradeDealReq_setRateBookingRef_16481033214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term43640 = new Double(0.9957585718901875);
        Class<? extends Object> term43713 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term43712 = ((Class) term43713).getDeclaredField((String) "BUY");
        ((Field) term43712).setAccessible(true);
        Object enum110 = ((Field) term43712).get((Object) null);
        Long term43666 = new Long(-1000830646340880796L);
        term43615 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq"));
        Object term43649 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term43650 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term43652 = (int[]) newIntArray(6);
        setField(term43615, term43615.getClass(), "baseCurrency", "goAoCMhKBu");
        setField(term43615, term43615.getClass(), "counterCurrency", "BWxJSgKHRT");
        setField(term43615, term43615.getClass(), "rate", term43640);
        setField(term43615, term43615.getClass(), "tradeAction", enum110);
        setIntField(term43650, term43650.getClass(), "signum", 1);
        setIntElement(term43652, 0, 5015);
        setIntElement(term43652, 1, -2096277412);
        setIntElement(term43652, 2, 2073517978);
        setIntElement(term43652, 3, -609403951);
        setIntElement(term43652, 4, -1144251174);
        setIntElement(term43652, 5, 836896391);
        setField(term43650, term43650.getClass(), "mag", term43652);
        setIntField(term43650, term43650.getClass(), "bitCountPlusOne", 0);
        setIntField(term43650, term43650.getClass(), "bitLengthPlusOne", 0);
        setIntField(term43650, term43650.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term43650, term43650.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term43649, term43649.getClass(), "intVal", term43650);
        setIntField(term43649, term43649.getClass(), "scale", 52);
        setIntField(term43649, term43649.getClass(), "precision", 0);
        setField(term43649, term43649.getClass(), "stringCache", null);
        setLongField(term43649, term43649.getClass(), "intCompact", -9223372036854775808L);
        setField(term43615, term43615.getClass(), "baseCurrencyAmount", term43649);
        setField(term43615, term43615.getClass(), "customerId", term43666);
        setField(term43615, term43615.getClass(), "rateBookingRef", "AGXoIndFnm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mwmFMNEzkK";
        callMethod(klass, "setRateBookingRef", argTypes, term43615, args);
    }

};



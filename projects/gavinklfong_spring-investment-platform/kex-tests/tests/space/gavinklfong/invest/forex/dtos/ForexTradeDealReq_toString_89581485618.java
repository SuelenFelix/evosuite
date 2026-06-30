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

public class ForexTradeDealReq_toString_89581485618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45051;

    public ForexTradeDealReq_toString_89581485618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term45076 = new Double(0.7814864708383836);
        Class<? extends Object> term45138 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term45137 = ((Class) term45138).getDeclaredField((String) "SELL");
        ((Field) term45137).setAccessible(true);
        Object enum114 = ((Field) term45137).get((Object) null);
        Long term45103 = new Long(-7310273014364148916L);
        term45051 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq"));
        Object term45086 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term45087 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term45089 = (int[]) newIntArray(6);
        setField(term45051, term45051.getClass(), "baseCurrency", "vLTbaoAxBm");
        setField(term45051, term45051.getClass(), "counterCurrency", "BXTjEyEZxD");
        setField(term45051, term45051.getClass(), "rate", term45076);
        setField(term45051, term45051.getClass(), "tradeAction", enum114);
        setIntField(term45087, term45087.getClass(), "signum", 1);
        setIntElement(term45089, 0, 41462);
        setIntElement(term45089, 1, 1645815436);
        setIntElement(term45089, 2, 594352318);
        setIntElement(term45089, 3, 1136796217);
        setIntElement(term45089, 4, -1550458667);
        setIntElement(term45089, 5, -1239563853);
        setField(term45087, term45087.getClass(), "mag", term45089);
        setIntField(term45087, term45087.getClass(), "bitCountPlusOne", 0);
        setIntField(term45087, term45087.getClass(), "bitLengthPlusOne", 0);
        setIntField(term45087, term45087.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term45087, term45087.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term45086, term45086.getClass(), "intVal", term45087);
        setIntField(term45086, term45086.getClass(), "scale", 53);
        setIntField(term45086, term45086.getClass(), "precision", 0);
        setField(term45086, term45086.getClass(), "stringCache", null);
        setLongField(term45086, term45086.getClass(), "intCompact", -9223372036854775808L);
        setField(term45051, term45051.getClass(), "baseCurrencyAmount", term45086);
        setField(term45051, term45051.getClass(), "customerId", term45103);
        setField(term45051, term45051.getClass(), "rateBookingRef", "oKhVzOKUFW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term45051, args);
    }

};



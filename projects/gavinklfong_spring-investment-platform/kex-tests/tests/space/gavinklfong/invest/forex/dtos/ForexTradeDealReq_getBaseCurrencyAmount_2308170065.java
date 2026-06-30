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

public class ForexTradeDealReq_getBaseCurrencyAmount_2308170065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40352;

    public ForexTradeDealReq_getBaseCurrencyAmount_2308170065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term40377 = new Double(0.25025774487844066);
        Class<? extends Object> term40438 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term40437 = ((Class) term40438).getDeclaredField((String) "BUY");
        ((Field) term40437).setAccessible(true);
        Object enum101 = ((Field) term40437).get((Object) null);
        Long term40403 = new Long(-1677189124507026637L);
        term40352 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq"));
        Object term40386 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term40387 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term40389 = (int[]) newIntArray(6);
        setField(term40352, term40352.getClass(), "baseCurrency", "rwKoAngzCu");
        setField(term40352, term40352.getClass(), "counterCurrency", "VUkRVwROTl");
        setField(term40352, term40352.getClass(), "rate", term40377);
        setField(term40352, term40352.getClass(), "tradeAction", enum101);
        setIntField(term40387, term40387.getClass(), "signum", 1);
        setIntElement(term40389, 0, 469);
        setIntElement(term40389, 1, -1798990536);
        setIntElement(term40389, 2, -229587314);
        setIntElement(term40389, 3, -1263753229);
        setIntElement(term40389, 4, -1775330786);
        setIntElement(term40389, 5, 585507887);
        setField(term40387, term40387.getClass(), "mag", term40389);
        setIntField(term40387, term40387.getClass(), "bitCountPlusOne", 0);
        setIntField(term40387, term40387.getClass(), "bitLengthPlusOne", 0);
        setIntField(term40387, term40387.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term40387, term40387.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term40386, term40386.getClass(), "intVal", term40387);
        setIntField(term40386, term40386.getClass(), "scale", 51);
        setIntField(term40386, term40386.getClass(), "precision", 0);
        setField(term40386, term40386.getClass(), "stringCache", null);
        setLongField(term40386, term40386.getClass(), "intCompact", -9223372036854775808L);
        setField(term40352, term40352.getClass(), "baseCurrencyAmount", term40386);
        setField(term40352, term40352.getClass(), "customerId", term40403);
        setField(term40352, term40352.getClass(), "rateBookingRef", "UDlkdccCRn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseCurrencyAmount", argTypes, term40352, args);
    }

};



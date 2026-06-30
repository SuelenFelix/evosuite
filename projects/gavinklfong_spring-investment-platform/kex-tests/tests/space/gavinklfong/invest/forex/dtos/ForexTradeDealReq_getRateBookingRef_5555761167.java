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

public class ForexTradeDealReq_getRateBookingRef_5555761167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41060;

    public ForexTradeDealReq_getRateBookingRef_5555761167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term41085 = new Double(0.2440697646709713);
        Class<? extends Object> term41147 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term41146 = ((Class) term41147).getDeclaredField((String) "SELL");
        ((Field) term41146).setAccessible(true);
        Object enum103 = ((Field) term41146).get((Object) null);
        Long term41112 = new Long(-4030863184426321096L);
        term41060 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq"));
        Object term41095 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term41096 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term41098 = (int[]) newIntArray(6);
        setField(term41060, term41060.getClass(), "baseCurrency", "pXxkiXgQnq");
        setField(term41060, term41060.getClass(), "counterCurrency", "tKmrUDURku");
        setField(term41060, term41060.getClass(), "rate", term41085);
        setField(term41060, term41060.getClass(), "tradeAction", enum103);
        setIntField(term41096, term41096.getClass(), "signum", 1);
        setIntElement(term41098, 0, 26990);
        setIntElement(term41098, 1, -1946725362);
        setIntElement(term41098, 2, -885893824);
        setIntElement(term41098, 3, -54066084);
        setIntElement(term41098, 4, 573015575);
        setIntElement(term41098, 5, -1226356449);
        setField(term41096, term41096.getClass(), "mag", term41098);
        setIntField(term41096, term41096.getClass(), "bitCountPlusOne", 0);
        setIntField(term41096, term41096.getClass(), "bitLengthPlusOne", 0);
        setIntField(term41096, term41096.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term41096, term41096.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term41095, term41095.getClass(), "intVal", term41096);
        setIntField(term41095, term41095.getClass(), "scale", 53);
        setIntField(term41095, term41095.getClass(), "precision", 0);
        setField(term41095, term41095.getClass(), "stringCache", null);
        setLongField(term41095, term41095.getClass(), "intCompact", -9223372036854775808L);
        setField(term41060, term41060.getClass(), "baseCurrencyAmount", term41095);
        setField(term41060, term41060.getClass(), "customerId", term41112);
        setField(term41060, term41060.getClass(), "rateBookingRef", "JeZbrwZmsP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateBookingRef", argTypes, term41060, args);
    }

};



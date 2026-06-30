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

public class ForexTradeDealReq_equals_185526122115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43989;
     Object term44054;

    public ForexTradeDealReq_equals_185526122115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term44014 = new Double(0.16755811343784477);
        Class<? extends Object> term44076 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term44075 = ((Class) term44076).getDeclaredField((String) "BUY");
        ((Field) term44075).setAccessible(true);
        Object enum111 = ((Field) term44075).get((Object) null);
        Long term44040 = new Long(5973526439563541711L);
        term43989 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq"));
        Object term44023 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term44024 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term44026 = (int[]) newIntArray(6);
        setField(term43989, term43989.getClass(), "baseCurrency", "kVAmKknVln");
        setField(term43989, term43989.getClass(), "counterCurrency", "MRFLbEGYKG");
        setField(term43989, term43989.getClass(), "rate", term44014);
        setField(term43989, term43989.getClass(), "tradeAction", enum111);
        setIntField(term44024, term44024.getClass(), "signum", 1);
        setIntElement(term44026, 0, 5212);
        setIntElement(term44026, 1, -1890432896);
        setIntElement(term44026, 2, 1927619460);
        setIntElement(term44026, 3, 338024890);
        setIntElement(term44026, 4, -781875953);
        setIntElement(term44026, 5, -1581483311);
        setField(term44024, term44024.getClass(), "mag", term44026);
        setIntField(term44024, term44024.getClass(), "bitCountPlusOne", 0);
        setIntField(term44024, term44024.getClass(), "bitLengthPlusOne", 0);
        setIntField(term44024, term44024.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term44024, term44024.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term44023, term44023.getClass(), "intVal", term44024);
        setIntField(term44023, term44023.getClass(), "scale", 52);
        setIntField(term44023, term44023.getClass(), "precision", 0);
        setField(term44023, term44023.getClass(), "stringCache", null);
        setLongField(term44023, term44023.getClass(), "intCompact", -9223372036854775808L);
        setField(term43989, term43989.getClass(), "baseCurrencyAmount", term44023);
        setField(term43989, term43989.getClass(), "customerId", term44040);
        setField(term43989, term43989.getClass(), "rateBookingRef", "BYrGukTyof");
        term44054 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term44054;
        callMethod(klass, "equals", argTypes, term43989, args);
    }

};



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
import java.lang.Long;
import java.lang.Object;
import java.lang.Double;
import java.lang.String;

public class ForexRateBooking_setBaseCurrency_13018968516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19852;

    public ForexRateBooking_setBaseCurrency_13018968516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19853 = new Long(-5963439350418910964L);
        Double term19882 = new Double(0.03699061125289671);
        Class<? extends Object> term19958 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term19957 = ((Class) term19958).getDeclaredField((String) "BUY");
        ((Field) term19957).setAccessible(true);
        Object enum48 = ((Field) term19957).get((Object) null);
        Long term19923 = new Long(9013624480170062917L);
        term19852 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term19855 = newInstance(Class.forName("java.time.Instant"));
        Object term19891 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term19892 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term19894 = (int[]) newIntArray(6);
        Object term19920 = newInstance(Class.forName("java.time.Instant"));
        setField(term19852, term19852.getClass(), "id", term19853);
        setLongField(term19855, term19855.getClass(), "seconds", 1304532099L);
        setIntField(term19855, term19855.getClass(), "nanos", 366000000);
        setField(term19852, term19852.getClass(), "timestamp", term19855);
        setField(term19852, term19852.getClass(), "baseCurrency", "CKWpJaaaxX");
        setField(term19852, term19852.getClass(), "counterCurrency", "UBRmXJmfrt");
        setField(term19852, term19852.getClass(), "rate", term19882);
        setField(term19852, term19852.getClass(), "tradeAction", enum48);
        setIntField(term19892, term19892.getClass(), "signum", 1);
        setIntElement(term19894, 0, 46953);
        setIntElement(term19894, 1, 959700722);
        setIntElement(term19894, 2, -735566206);
        setIntElement(term19894, 3, 1326839338);
        setIntElement(term19894, 4, -1874212242);
        setIntElement(term19894, 5, -146800463);
        setField(term19892, term19892.getClass(), "mag", term19894);
        setIntField(term19892, term19892.getClass(), "bitCountPlusOne", 0);
        setIntField(term19892, term19892.getClass(), "bitLengthPlusOne", 0);
        setIntField(term19892, term19892.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term19892, term19892.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term19891, term19891.getClass(), "intVal", term19892);
        setIntField(term19891, term19891.getClass(), "scale", 53);
        setIntField(term19891, term19891.getClass(), "precision", 0);
        setField(term19891, term19891.getClass(), "stringCache", null);
        setLongField(term19891, term19891.getClass(), "intCompact", -9223372036854775808L);
        setField(term19852, term19852.getClass(), "baseCurrencyAmount", term19891);
        setField(term19852, term19852.getClass(), "bookingRef", "WZzvmIHhzZ");
        setLongField(term19920, term19920.getClass(), "seconds", 1488725902L);
        setIntField(term19920, term19920.getClass(), "nanos", 101000000);
        setField(term19852, term19852.getClass(), "expiryTime", term19920);
        setField(term19852, term19852.getClass(), "customerId", term19923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "doQLHkjpNm";
        callMethod(klass, "setBaseCurrency", argTypes, term19852, args);
    }

};



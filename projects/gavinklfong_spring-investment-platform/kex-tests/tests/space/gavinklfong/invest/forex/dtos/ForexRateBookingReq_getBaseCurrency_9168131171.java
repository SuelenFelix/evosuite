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

public class ForexRateBookingReq_getBaseCurrency_9168131171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1295;

    public ForexRateBookingReq_getBaseCurrency_9168131171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1373 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term1372 = ((Class) term1373).getDeclaredField((String) "BUY");
        ((Field) term1372).setAccessible(true);
        Object enum2 = ((Field) term1372).get((Object) null);
        Long term1344 = new Long(2442117782898005296L);
        term1295 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq"));
        Object term1320 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1321 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1323 = (int[]) newIntArray(6);
        setField(term1295, term1295.getClass(), "baseCurrency", "dWRymuLBtr");
        setField(term1295, term1295.getClass(), "counterCurrency", "AijpHYOFuy");
        setIntField(term1321, term1321.getClass(), "signum", 1);
        setIntElement(term1323, 0, 9058);
        setIntElement(term1323, 1, 1365043541);
        setIntElement(term1323, 2, 1239861896);
        setIntElement(term1323, 3, -1338148297);
        setIntElement(term1323, 4, -418263970);
        setIntElement(term1323, 5, -265097411);
        setField(term1321, term1321.getClass(), "mag", term1323);
        setIntField(term1321, term1321.getClass(), "bitCountPlusOne", 0);
        setIntField(term1321, term1321.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1321, term1321.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1321, term1321.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1320, term1320.getClass(), "intVal", term1321);
        setIntField(term1320, term1320.getClass(), "scale", 53);
        setIntField(term1320, term1320.getClass(), "precision", 0);
        setField(term1320, term1320.getClass(), "stringCache", null);
        setLongField(term1320, term1320.getClass(), "intCompact", -9223372036854775808L);
        setField(term1295, term1295.getClass(), "baseCurrencyAmount", term1320);
        setField(term1295, term1295.getClass(), "tradeAction", enum2);
        setField(term1295, term1295.getClass(), "customerId", term1344);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseCurrency", argTypes, term1295, args);
    }

};



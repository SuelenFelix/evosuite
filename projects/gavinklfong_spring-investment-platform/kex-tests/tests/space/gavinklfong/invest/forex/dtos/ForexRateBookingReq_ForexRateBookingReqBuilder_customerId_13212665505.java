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

public class ForexRateBookingReq_ForexRateBookingReqBuilder_customerId_13212665505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12411;
     Object term12463;

    public ForexRateBookingReq_ForexRateBookingReqBuilder_customerId_13212665505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12492 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term12491 = ((Class) term12492).getDeclaredField((String) "SELL");
        ((Field) term12491).setAccessible(true);
        Object enum33 = ((Field) term12491).get((Object) null);
        Long term12461 = new Long(4784595517102746672L);
        term12411 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq$ForexRateBookingReqBuilder"));
        Object term12436 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term12437 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term12439 = (int[]) newIntArray(6);
        setField(term12411, term12411.getClass(), "baseCurrency", "hCWPJQKpdc");
        setField(term12411, term12411.getClass(), "counterCurrency", "WzMEhMXkKx");
        setIntField(term12437, term12437.getClass(), "signum", 1);
        setIntElement(term12439, 0, 43112);
        setIntElement(term12439, 1, 702459169);
        setIntElement(term12439, 2, 1058217529);
        setIntElement(term12439, 3, -393994438);
        setIntElement(term12439, 4, 1792052543);
        setIntElement(term12439, 5, 196757249);
        setField(term12437, term12437.getClass(), "mag", term12439);
        setIntField(term12437, term12437.getClass(), "bitCountPlusOne", 0);
        setIntField(term12437, term12437.getClass(), "bitLengthPlusOne", 0);
        setIntField(term12437, term12437.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term12437, term12437.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term12436, term12436.getClass(), "intVal", term12437);
        setIntField(term12436, term12436.getClass(), "scale", 53);
        setIntField(term12436, term12436.getClass(), "precision", 0);
        setField(term12436, term12436.getClass(), "stringCache", null);
        setLongField(term12436, term12436.getClass(), "intCompact", -9223372036854775808L);
        setField(term12411, term12411.getClass(), "baseCurrencyAmount", term12436);
        setField(term12411, term12411.getClass(), "tradeAction", enum33);
        setField(term12411, term12411.getClass(), "customerId", term12461);
        term12463 = new Long(-7612550318181586304L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq$ForexRateBookingReqBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12463;
        callMethod(klass, "customerId", argTypes, term12411, args);
    }

};



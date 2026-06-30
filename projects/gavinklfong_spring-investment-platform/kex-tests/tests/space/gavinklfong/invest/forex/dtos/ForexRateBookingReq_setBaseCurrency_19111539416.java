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

public class ForexRateBookingReq_setBaseCurrency_19111539416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2939;

    public ForexRateBookingReq_setBaseCurrency_19111539416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3030 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term3029 = ((Class) term3030).getDeclaredField((String) "SELL");
        ((Field) term3029).setAccessible(true);
        Object enum7 = ((Field) term3029).get((Object) null);
        Long term2989 = new Long(7411271909051562686L);
        term2939 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq"));
        Object term2964 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2965 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2967 = (int[]) newIntArray(6);
        setField(term2939, term2939.getClass(), "baseCurrency", "UlajhuVLaP");
        setField(term2939, term2939.getClass(), "counterCurrency", "gGSMzuGICf");
        setIntField(term2965, term2965.getClass(), "signum", 1);
        setIntElement(term2967, 0, 27489);
        setIntElement(term2967, 1, -274433180);
        setIntElement(term2967, 2, 698548608);
        setIntElement(term2967, 3, -1143703655);
        setIntElement(term2967, 4, 1619765041);
        setIntElement(term2967, 5, -418227111);
        setField(term2965, term2965.getClass(), "mag", term2967);
        setIntField(term2965, term2965.getClass(), "bitCountPlusOne", 0);
        setIntField(term2965, term2965.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2965, term2965.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2965, term2965.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2964, term2964.getClass(), "intVal", term2965);
        setIntField(term2964, term2964.getClass(), "scale", 53);
        setIntField(term2964, term2964.getClass(), "precision", 0);
        setField(term2964, term2964.getClass(), "stringCache", null);
        setLongField(term2964, term2964.getClass(), "intCompact", -9223372036854775808L);
        setField(term2939, term2939.getClass(), "baseCurrencyAmount", term2964);
        setField(term2939, term2939.getClass(), "tradeAction", enum7);
        setField(term2939, term2939.getClass(), "customerId", term2989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hxCBltsObl";
        callMethod(klass, "setBaseCurrency", argTypes, term2939, args);
    }

};



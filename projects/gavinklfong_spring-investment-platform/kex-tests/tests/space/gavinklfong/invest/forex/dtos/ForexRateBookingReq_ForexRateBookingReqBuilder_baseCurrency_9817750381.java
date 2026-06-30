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

public class ForexRateBookingReq_ForexRateBookingReqBuilder_baseCurrency_9817750381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11016;

    public ForexRateBookingReq_ForexRateBookingReqBuilder_baseCurrency_9817750381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11107 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term11106 = ((Class) term11107).getDeclaredField((String) "SELL");
        ((Field) term11106).setAccessible(true);
        Object enum29 = ((Field) term11106).get((Object) null);
        Long term11066 = new Long(4178434741742309755L);
        term11016 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq$ForexRateBookingReqBuilder"));
        Object term11041 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term11042 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term11044 = (int[]) newIntArray(6);
        setField(term11016, term11016.getClass(), "baseCurrency", "SJiQaLvSKv");
        setField(term11016, term11016.getClass(), "counterCurrency", "OEXDRUKcFl");
        setIntField(term11042, term11042.getClass(), "signum", 1);
        setIntElement(term11044, 0, 7298);
        setIntElement(term11044, 1, -1245459431);
        setIntElement(term11044, 2, 154872706);
        setIntElement(term11044, 3, -869635639);
        setIntElement(term11044, 4, 1023248111);
        setIntElement(term11044, 5, 1345698053);
        setField(term11042, term11042.getClass(), "mag", term11044);
        setIntField(term11042, term11042.getClass(), "bitCountPlusOne", 0);
        setIntField(term11042, term11042.getClass(), "bitLengthPlusOne", 0);
        setIntField(term11042, term11042.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term11042, term11042.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term11041, term11041.getClass(), "intVal", term11042);
        setIntField(term11041, term11041.getClass(), "scale", 53);
        setIntField(term11041, term11041.getClass(), "precision", 0);
        setField(term11041, term11041.getClass(), "stringCache", null);
        setLongField(term11041, term11041.getClass(), "intCompact", -9223372036854775808L);
        setField(term11016, term11016.getClass(), "baseCurrencyAmount", term11041);
        setField(term11016, term11016.getClass(), "tradeAction", enum29);
        setField(term11016, term11016.getClass(), "customerId", term11066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq$ForexRateBookingReqBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RYdKCNNMBR";
        callMethod(klass, "baseCurrency", argTypes, term11016, args);
    }

};



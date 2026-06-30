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

public class ForexTradeDealReq_ForexTradeDealReqBuilder_baseCurrency_3725945621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46125;

    public ForexTradeDealReq_ForexTradeDealReqBuilder_baseCurrency_3725945621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term46150 = new Double(0.6382060245198228);
        Class<? extends Object> term46223 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term46222 = ((Class) term46223).getDeclaredField((String) "BUY");
        ((Field) term46222).setAccessible(true);
        Object enum116 = ((Field) term46222).get((Object) null);
        Long term46176 = new Long(9205327385733285058L);
        term46125 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder"));
        Object term46159 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term46160 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term46162 = (int[]) newIntArray(6);
        setField(term46125, term46125.getClass(), "baseCurrency", "ZUdnQXfzCI");
        setField(term46125, term46125.getClass(), "counterCurrency", "EULDrUNQvw");
        setField(term46125, term46125.getClass(), "rate", term46150);
        setField(term46125, term46125.getClass(), "tradeAction", enum116);
        setIntField(term46160, term46160.getClass(), "signum", 1);
        setIntElement(term46162, 0, 8520);
        setIntElement(term46162, 1, 1750619857);
        setIntElement(term46162, 2, 1245203202);
        setIntElement(term46162, 3, 23260370);
        setIntElement(term46162, 4, 1909850143);
        setIntElement(term46162, 5, -1222477353);
        setField(term46160, term46160.getClass(), "mag", term46162);
        setIntField(term46160, term46160.getClass(), "bitCountPlusOne", 0);
        setIntField(term46160, term46160.getClass(), "bitLengthPlusOne", 0);
        setIntField(term46160, term46160.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term46160, term46160.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term46159, term46159.getClass(), "intVal", term46160);
        setIntField(term46159, term46159.getClass(), "scale", 53);
        setIntField(term46159, term46159.getClass(), "precision", 0);
        setField(term46159, term46159.getClass(), "stringCache", null);
        setLongField(term46159, term46159.getClass(), "intCompact", -9223372036854775808L);
        setField(term46125, term46125.getClass(), "baseCurrencyAmount", term46159);
        setField(term46125, term46125.getClass(), "customerId", term46176);
        setField(term46125, term46125.getClass(), "rateBookingRef", "BtvAvsJSei");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vqnBkkxoIa";
        callMethod(klass, "baseCurrency", argTypes, term46125, args);
    }

};



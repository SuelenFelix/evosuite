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

public class ForexTradeDealReq_ForexTradeDealReqBuilder_customerId_16193311466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47954;
     Object term48019;

    public ForexTradeDealReq_ForexTradeDealReqBuilder_customerId_16193311466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term47979 = new Double(0.9457448635091538);
        Class<? extends Object> term48042 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term48041 = ((Class) term48042).getDeclaredField((String) "BUY");
        ((Field) term48041).setAccessible(true);
        Object enum121 = ((Field) term48041).get((Object) null);
        Long term48005 = new Long(5731563613239387113L);
        term47954 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder"));
        Object term47988 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term47989 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term47991 = (int[]) newIntArray(6);
        setField(term47954, term47954.getClass(), "baseCurrency", "sEphiduvkv");
        setField(term47954, term47954.getClass(), "counterCurrency", "PbLgCSAHce");
        setField(term47954, term47954.getClass(), "rate", term47979);
        setField(term47954, term47954.getClass(), "tradeAction", enum121);
        setIntField(term47989, term47989.getClass(), "signum", 1);
        setIntElement(term47991, 0, 6391);
        setIntElement(term47991, 1, -1628071338);
        setIntElement(term47991, 2, -1238803914);
        setIntElement(term47991, 3, 742941092);
        setIntElement(term47991, 4, 2133816019);
        setIntElement(term47991, 5, 2104639263);
        setField(term47989, term47989.getClass(), "mag", term47991);
        setIntField(term47989, term47989.getClass(), "bitCountPlusOne", 0);
        setIntField(term47989, term47989.getClass(), "bitLengthPlusOne", 0);
        setIntField(term47989, term47989.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term47989, term47989.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term47988, term47988.getClass(), "intVal", term47989);
        setIntField(term47988, term47988.getClass(), "scale", 52);
        setIntField(term47988, term47988.getClass(), "precision", 0);
        setField(term47988, term47988.getClass(), "stringCache", null);
        setLongField(term47988, term47988.getClass(), "intCompact", -9223372036854775808L);
        setField(term47954, term47954.getClass(), "baseCurrencyAmount", term47988);
        setField(term47954, term47954.getClass(), "customerId", term48005);
        setField(term47954, term47954.getClass(), "rateBookingRef", "NWldOLAbqk");
        term48019 = new Long(3381333711768010594L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term48019;
        callMethod(klass, "customerId", argTypes, term47954, args);
    }

};



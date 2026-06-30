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

public class ForexTradeDealReq_ForexTradeDealReqBuilder_rateBookingRef_3652113827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48308;

    public ForexTradeDealReq_ForexTradeDealReqBuilder_rateBookingRef_3652113827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term48333 = new Double(0.3238255203811462);
        Class<? extends Object> term48407 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term48406 = ((Class) term48407).getDeclaredField((String) "SELL");
        ((Field) term48406).setAccessible(true);
        Object enum122 = ((Field) term48406).get((Object) null);
        Long term48360 = new Long(3580984732036213717L);
        term48308 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder"));
        Object term48343 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term48344 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term48346 = (int[]) newIntArray(6);
        setField(term48308, term48308.getClass(), "baseCurrency", "qnYaYSpDwO");
        setField(term48308, term48308.getClass(), "counterCurrency", "dgbFDCdHtj");
        setField(term48308, term48308.getClass(), "rate", term48333);
        setField(term48308, term48308.getClass(), "tradeAction", enum122);
        setIntField(term48344, term48344.getClass(), "signum", 1);
        setIntElement(term48346, 0, 6173);
        setIntElement(term48346, 1, 562809740);
        setIntElement(term48346, 2, -358672753);
        setIntElement(term48346, 3, -2099004149);
        setIntElement(term48346, 4, -138083837);
        setIntElement(term48346, 5, -49092823);
        setField(term48344, term48344.getClass(), "mag", term48346);
        setIntField(term48344, term48344.getClass(), "bitCountPlusOne", 0);
        setIntField(term48344, term48344.getClass(), "bitLengthPlusOne", 0);
        setIntField(term48344, term48344.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term48344, term48344.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term48343, term48343.getClass(), "intVal", term48344);
        setIntField(term48343, term48343.getClass(), "scale", 52);
        setIntField(term48343, term48343.getClass(), "precision", 0);
        setField(term48343, term48343.getClass(), "stringCache", null);
        setLongField(term48343, term48343.getClass(), "intCompact", -9223372036854775808L);
        setField(term48308, term48308.getClass(), "baseCurrencyAmount", term48343);
        setField(term48308, term48308.getClass(), "customerId", term48360);
        setField(term48308, term48308.getClass(), "rateBookingRef", "EKpdCBubDE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zMsSLTfGhl";
        callMethod(klass, "rateBookingRef", argTypes, term48308, args);
    }

};



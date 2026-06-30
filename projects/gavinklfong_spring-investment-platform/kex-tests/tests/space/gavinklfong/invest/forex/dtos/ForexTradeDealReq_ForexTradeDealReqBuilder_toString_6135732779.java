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

public class ForexTradeDealReq_ForexTradeDealReqBuilder_toString_6135732779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49038;

    public ForexTradeDealReq_ForexTradeDealReqBuilder_toString_6135732779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term49063 = new Double(0.2382345237223229);
        Class<? extends Object> term49124 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term49123 = ((Class) term49124).getDeclaredField((String) "BUY");
        ((Field) term49123).setAccessible(true);
        Object enum124 = ((Field) term49123).get((Object) null);
        Long term49089 = new Long(-3954795081650780841L);
        term49038 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder"));
        Object term49072 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term49073 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term49075 = (int[]) newIntArray(6);
        setField(term49038, term49038.getClass(), "baseCurrency", "vMsWjuPTnO");
        setField(term49038, term49038.getClass(), "counterCurrency", "zHvfKaOstO");
        setField(term49038, term49038.getClass(), "rate", term49063);
        setField(term49038, term49038.getClass(), "tradeAction", enum124);
        setIntField(term49073, term49073.getClass(), "signum", 1);
        setIntElement(term49075, 0, 6005);
        setIntElement(term49075, 1, 2119642468);
        setIntElement(term49075, 2, -200653665);
        setIntElement(term49075, 3, 1577073583);
        setIntElement(term49075, 4, -1633535576);
        setIntElement(term49075, 5, -1469436473);
        setField(term49073, term49073.getClass(), "mag", term49075);
        setIntField(term49073, term49073.getClass(), "bitCountPlusOne", 0);
        setIntField(term49073, term49073.getClass(), "bitLengthPlusOne", 0);
        setIntField(term49073, term49073.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term49073, term49073.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term49072, term49072.getClass(), "intVal", term49073);
        setIntField(term49072, term49072.getClass(), "scale", 52);
        setIntField(term49072, term49072.getClass(), "precision", 0);
        setField(term49072, term49072.getClass(), "stringCache", null);
        setLongField(term49072, term49072.getClass(), "intCompact", -9223372036854775808L);
        setField(term49038, term49038.getClass(), "baseCurrencyAmount", term49072);
        setField(term49038, term49038.getClass(), "customerId", term49089);
        setField(term49038, term49038.getClass(), "rateBookingRef", "tOszriqETr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term49038, args);
    }

};



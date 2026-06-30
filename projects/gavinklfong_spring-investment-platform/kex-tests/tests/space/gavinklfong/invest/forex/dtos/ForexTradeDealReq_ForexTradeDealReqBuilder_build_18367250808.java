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

public class ForexTradeDealReq_ForexTradeDealReqBuilder_build_18367250808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48686;

    public ForexTradeDealReq_ForexTradeDealReqBuilder_build_18367250808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term48711 = new Double(0.2843894095932772);
        Class<? extends Object> term48772 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term48771 = ((Class) term48772).getDeclaredField((String) "BUY");
        ((Field) term48771).setAccessible(true);
        Object enum123 = ((Field) term48771).get((Object) null);
        Long term48737 = new Long(5330761990446327930L);
        term48686 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder"));
        Object term48720 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term48721 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term48723 = (int[]) newIntArray(6);
        setField(term48686, term48686.getClass(), "baseCurrency", "bEmHScVZaQ");
        setField(term48686, term48686.getClass(), "counterCurrency", "TcuXODkzBV");
        setField(term48686, term48686.getClass(), "rate", term48711);
        setField(term48686, term48686.getClass(), "tradeAction", enum123);
        setIntField(term48721, term48721.getClass(), "signum", 1);
        setIntElement(term48723, 0, 44562);
        setIntElement(term48723, 1, -552691550);
        setIntElement(term48723, 2, -988378668);
        setIntElement(term48723, 3, 2129171988);
        setIntElement(term48723, 4, 275449890);
        setIntElement(term48723, 5, -1667109665);
        setField(term48721, term48721.getClass(), "mag", term48723);
        setIntField(term48721, term48721.getClass(), "bitCountPlusOne", 0);
        setIntField(term48721, term48721.getClass(), "bitLengthPlusOne", 0);
        setIntField(term48721, term48721.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term48721, term48721.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term48720, term48720.getClass(), "intVal", term48721);
        setIntField(term48720, term48720.getClass(), "scale", 53);
        setIntField(term48720, term48720.getClass(), "precision", 0);
        setField(term48720, term48720.getClass(), "stringCache", null);
        setLongField(term48720, term48720.getClass(), "intCompact", -9223372036854775808L);
        setField(term48686, term48686.getClass(), "baseCurrencyAmount", term48720);
        setField(term48686, term48686.getClass(), "customerId", term48737);
        setField(term48686, term48686.getClass(), "rateBookingRef", "coJPjrBZNe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq$ForexTradeDealReqBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term48686, args);
    }

};



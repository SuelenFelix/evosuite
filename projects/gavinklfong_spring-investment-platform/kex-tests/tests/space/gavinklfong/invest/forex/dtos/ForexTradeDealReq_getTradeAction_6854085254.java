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

public class ForexTradeDealReq_getTradeAction_6854085254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40002;

    public ForexTradeDealReq_getTradeAction_6854085254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term40027 = new Double(0.5179319342588155);
        Class<? extends Object> term40087 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term40086 = ((Class) term40087).getDeclaredField((String) "BUY");
        ((Field) term40086).setAccessible(true);
        Object enum100 = ((Field) term40086).get((Object) null);
        Long term40052 = new Long(3090901538358721367L);
        term40002 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq"));
        Object term40036 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term40037 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term40039 = (int[]) newIntArray(5);
        setField(term40002, term40002.getClass(), "baseCurrency", "DSFGlcaXUb");
        setField(term40002, term40002.getClass(), "counterCurrency", "sHMXNUzNeM");
        setField(term40002, term40002.getClass(), "rate", term40027);
        setField(term40002, term40002.getClass(), "tradeAction", enum100);
        setIntField(term40037, term40037.getClass(), "signum", 1);
        setIntElement(term40039, 0, -2115074141);
        setIntElement(term40039, 1, 254548962);
        setIntElement(term40039, 2, 908962);
        setIntElement(term40039, 3, -1317619852);
        setIntElement(term40039, 4, -1598991849);
        setField(term40037, term40037.getClass(), "mag", term40039);
        setIntField(term40037, term40037.getClass(), "bitCountPlusOne", 0);
        setIntField(term40037, term40037.getClass(), "bitLengthPlusOne", 0);
        setIntField(term40037, term40037.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term40037, term40037.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term40036, term40036.getClass(), "intVal", term40037);
        setIntField(term40036, term40036.getClass(), "scale", 49);
        setIntField(term40036, term40036.getClass(), "precision", 0);
        setField(term40036, term40036.getClass(), "stringCache", null);
        setLongField(term40036, term40036.getClass(), "intCompact", -9223372036854775808L);
        setField(term40002, term40002.getClass(), "baseCurrencyAmount", term40036);
        setField(term40002, term40002.getClass(), "customerId", term40052);
        setField(term40002, term40002.getClass(), "rateBookingRef", "gPzGDOEPPw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTradeAction", argTypes, term40002, args);
    }

};



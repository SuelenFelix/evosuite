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

public class ForexTradeDealReq_canEqual_163554344616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44342;
     Object term44407;

    public ForexTradeDealReq_canEqual_163554344616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term44367 = new Double(0.9090793968999221);
        Class<? extends Object> term44429 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term44428 = ((Class) term44429).getDeclaredField((String) "BUY");
        ((Field) term44428).setAccessible(true);
        Object enum112 = ((Field) term44428).get((Object) null);
        Long term44393 = new Long(5246058710498845622L);
        term44342 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq"));
        Object term44376 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term44377 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term44379 = (int[]) newIntArray(6);
        setField(term44342, term44342.getClass(), "baseCurrency", "jiCGTTzKGB");
        setField(term44342, term44342.getClass(), "counterCurrency", "MqICFYzDJj");
        setField(term44342, term44342.getClass(), "rate", term44367);
        setField(term44342, term44342.getClass(), "tradeAction", enum112);
        setIntField(term44377, term44377.getClass(), "signum", 1);
        setIntElement(term44379, 0, 5053);
        setIntElement(term44379, 1, 1826539329);
        setIntElement(term44379, 2, 1807123606);
        setIntElement(term44379, 3, 1853194802);
        setIntElement(term44379, 4, -1961552265);
        setIntElement(term44379, 5, -1120545247);
        setField(term44377, term44377.getClass(), "mag", term44379);
        setIntField(term44377, term44377.getClass(), "bitCountPlusOne", 0);
        setIntField(term44377, term44377.getClass(), "bitLengthPlusOne", 0);
        setIntField(term44377, term44377.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term44377, term44377.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term44376, term44376.getClass(), "intVal", term44377);
        setIntField(term44376, term44376.getClass(), "scale", 52);
        setIntField(term44376, term44376.getClass(), "precision", 0);
        setField(term44376, term44376.getClass(), "stringCache", null);
        setLongField(term44376, term44376.getClass(), "intCompact", -9223372036854775808L);
        setField(term44342, term44342.getClass(), "baseCurrencyAmount", term44376);
        setField(term44342, term44342.getClass(), "customerId", term44393);
        setField(term44342, term44342.getClass(), "rateBookingRef", "YgQvdcBQKw");
        term44407 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term44407;
        callMethod(klass, "canEqual", argTypes, term44342, args);
    }

};



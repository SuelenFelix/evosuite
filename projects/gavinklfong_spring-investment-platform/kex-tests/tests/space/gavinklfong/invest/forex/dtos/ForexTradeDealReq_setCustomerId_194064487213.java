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

public class ForexTradeDealReq_setCustomerId_194064487213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43257;
     Object term43323;

    public ForexTradeDealReq_setCustomerId_194064487213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term43282 = new Double(0.25474180574060834);
        Class<? extends Object> term43346 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term43345 = ((Class) term43346).getDeclaredField((String) "SELL");
        ((Field) term43345).setAccessible(true);
        Object enum109 = ((Field) term43345).get((Object) null);
        Long term43309 = new Long(-433040798405298080L);
        term43257 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq"));
        Object term43292 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term43293 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term43295 = (int[]) newIntArray(6);
        setField(term43257, term43257.getClass(), "baseCurrency", "bwlLFAfNWx");
        setField(term43257, term43257.getClass(), "counterCurrency", "JWodNQzjjV");
        setField(term43257, term43257.getClass(), "rate", term43282);
        setField(term43257, term43257.getClass(), "tradeAction", enum109);
        setIntField(term43293, term43293.getClass(), "signum", 1);
        setIntElement(term43295, 0, 44898);
        setIntElement(term43295, 1, 2032004599);
        setIntElement(term43295, 2, -1413901291);
        setIntElement(term43295, 3, -381856305);
        setIntElement(term43295, 4, -1332278579);
        setIntElement(term43295, 5, -172200131);
        setField(term43293, term43293.getClass(), "mag", term43295);
        setIntField(term43293, term43293.getClass(), "bitCountPlusOne", 0);
        setIntField(term43293, term43293.getClass(), "bitLengthPlusOne", 0);
        setIntField(term43293, term43293.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term43293, term43293.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term43292, term43292.getClass(), "intVal", term43293);
        setIntField(term43292, term43292.getClass(), "scale", 53);
        setIntField(term43292, term43292.getClass(), "precision", 0);
        setField(term43292, term43292.getClass(), "stringCache", null);
        setLongField(term43292, term43292.getClass(), "intCompact", -9223372036854775808L);
        setField(term43257, term43257.getClass(), "baseCurrencyAmount", term43292);
        setField(term43257, term43257.getClass(), "customerId", term43309);
        setField(term43257, term43257.getClass(), "rateBookingRef", "CAgxWjhxNf");
        term43323 = new Long(-1505191021111100819L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term43323;
        callMethod(klass, "setCustomerId", argTypes, term43257, args);
    }

};



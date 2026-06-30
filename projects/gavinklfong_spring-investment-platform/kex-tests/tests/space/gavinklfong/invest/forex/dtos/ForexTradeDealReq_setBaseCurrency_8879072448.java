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

public class ForexTradeDealReq_setBaseCurrency_8879072448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41416;

    public ForexTradeDealReq_setBaseCurrency_8879072448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term41441 = new Double(0.7977455176064363);
        Class<? extends Object> term41515 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term41514 = ((Class) term41515).getDeclaredField((String) "SELL");
        ((Field) term41514).setAccessible(true);
        Object enum104 = ((Field) term41514).get((Object) null);
        Long term41468 = new Long(-8010214112439224349L);
        term41416 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq"));
        Object term41451 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term41452 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term41454 = (int[]) newIntArray(6);
        setField(term41416, term41416.getClass(), "baseCurrency", "bxyfeicqrK");
        setField(term41416, term41416.getClass(), "counterCurrency", "vBnWPlsZMk");
        setField(term41416, term41416.getClass(), "rate", term41441);
        setField(term41416, term41416.getClass(), "tradeAction", enum104);
        setIntField(term41452, term41452.getClass(), "signum", 1);
        setIntElement(term41454, 0, 53820);
        setIntElement(term41454, 1, -1124101344);
        setIntElement(term41454, 2, 1092377450);
        setIntElement(term41454, 3, -917177031);
        setIntElement(term41454, 4, 815783149);
        setIntElement(term41454, 5, -389108897);
        setField(term41452, term41452.getClass(), "mag", term41454);
        setIntField(term41452, term41452.getClass(), "bitCountPlusOne", 0);
        setIntField(term41452, term41452.getClass(), "bitLengthPlusOne", 0);
        setIntField(term41452, term41452.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term41452, term41452.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term41451, term41451.getClass(), "intVal", term41452);
        setIntField(term41451, term41451.getClass(), "scale", 53);
        setIntField(term41451, term41451.getClass(), "precision", 0);
        setField(term41451, term41451.getClass(), "stringCache", null);
        setLongField(term41451, term41451.getClass(), "intCompact", -9223372036854775808L);
        setField(term41416, term41416.getClass(), "baseCurrencyAmount", term41451);
        setField(term41416, term41416.getClass(), "customerId", term41468);
        setField(term41416, term41416.getClass(), "rateBookingRef", "fIZsWucfXz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IApvtmfhnq";
        callMethod(klass, "setBaseCurrency", argTypes, term41416, args);
    }

};



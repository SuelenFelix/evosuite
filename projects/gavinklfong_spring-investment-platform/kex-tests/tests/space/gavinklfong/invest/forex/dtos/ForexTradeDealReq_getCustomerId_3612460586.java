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

public class ForexTradeDealReq_getCustomerId_3612460586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40704;

    public ForexTradeDealReq_getCustomerId_3612460586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term40729 = new Double(0.1858089882752998);
        Class<? extends Object> term40791 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term40790 = ((Class) term40791).getDeclaredField((String) "SELL");
        ((Field) term40790).setAccessible(true);
        Object enum102 = ((Field) term40790).get((Object) null);
        Long term40756 = new Long(4795660804170399986L);
        term40704 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq"));
        Object term40739 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term40740 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term40742 = (int[]) newIntArray(6);
        setField(term40704, term40704.getClass(), "baseCurrency", "McpzErOcYb");
        setField(term40704, term40704.getClass(), "counterCurrency", "jqrVEUvYEz");
        setField(term40704, term40704.getClass(), "rate", term40729);
        setField(term40704, term40704.getClass(), "tradeAction", enum102);
        setIntField(term40740, term40740.getClass(), "signum", 1);
        setIntElement(term40742, 0, 8733);
        setIntElement(term40742, 1, -899673469);
        setIntElement(term40742, 2, 1327188740);
        setIntElement(term40742, 3, -1565450664);
        setIntElement(term40742, 4, 1468506903);
        setIntElement(term40742, 5, 1321335865);
        setField(term40740, term40740.getClass(), "mag", term40742);
        setIntField(term40740, term40740.getClass(), "bitCountPlusOne", 0);
        setIntField(term40740, term40740.getClass(), "bitLengthPlusOne", 0);
        setIntField(term40740, term40740.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term40740, term40740.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term40739, term40739.getClass(), "intVal", term40740);
        setIntField(term40739, term40739.getClass(), "scale", 53);
        setIntField(term40739, term40739.getClass(), "precision", 0);
        setField(term40739, term40739.getClass(), "stringCache", null);
        setLongField(term40739, term40739.getClass(), "intCompact", -9223372036854775808L);
        setField(term40704, term40704.getClass(), "baseCurrencyAmount", term40739);
        setField(term40704, term40704.getClass(), "customerId", term40756);
        setField(term40704, term40704.getClass(), "rateBookingRef", "QITgiBrmfj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomerId", argTypes, term40704, args);
    }

};



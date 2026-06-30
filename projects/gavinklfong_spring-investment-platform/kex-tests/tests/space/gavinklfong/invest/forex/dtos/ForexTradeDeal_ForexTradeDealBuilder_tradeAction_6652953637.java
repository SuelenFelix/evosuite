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
import java.lang.Long;
import java.lang.Object;
import java.lang.Double;
import java.lang.String;

public class ForexTradeDeal_ForexTradeDealBuilder_tradeAction_6652953637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8866;
     Object enum24;

    public ForexTradeDeal_ForexTradeDealBuilder_tradeAction_6652953637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8867 = new Long(2120084523938730454L);
        Double term8915 = new Double(0.36923381893433327);
        Class<? extends Object> term8975 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term8974 = ((Class) term8975).getDeclaredField((String) "SELL");
        ((Field) term8974).setAccessible(true);
        enum24 = ((Field) term8974).get((Object) null);
        Long term8942 = new Long(6855071767938501807L);
        term8866 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder"));
        Object term8881 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8882 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8886 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8925 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term8926 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8928 = (int[]) newIntArray(6);
        setField(term8866, term8866.getClass(), "id", term8867);
        setField(term8866, term8866.getClass(), "dealRef", "cAPeiZHKGJ");
        setIntField(term8882, term8882.getClass(), "year", 2024);
        setShortField(term8882, term8882.getClass(), "month", (short) 1);
        setShortField(term8882, term8882.getClass(), "day", (short) 24);
        setField(term8881, term8881.getClass(), "date", term8882);
        setByteField(term8886, term8886.getClass(), "hour", (byte) 20);
        setByteField(term8886, term8886.getClass(), "minute", (byte) 28);
        setByteField(term8886, term8886.getClass(), "second", (byte) 39);
        setIntField(term8886, term8886.getClass(), "nano", 952728177);
        setField(term8881, term8881.getClass(), "time", term8886);
        setField(term8866, term8866.getClass(), "timestamp", term8881);
        setField(term8866, term8866.getClass(), "baseCurrency", "LvJFtLBaxj");
        setField(term8866, term8866.getClass(), "counterCurrency", "PHvxnGHptP");
        setField(term8866, term8866.getClass(), "rate", term8915);
        setField(term8866, term8866.getClass(), "tradeAction", enum24);
        setIntField(term8926, term8926.getClass(), "signum", 1);
        setIntElement(term8928, 0, 29895);
        setIntElement(term8928, 1, 1752172477);
        setIntElement(term8928, 2, 1964732279);
        setIntElement(term8928, 3, 382594040);
        setIntElement(term8928, 4, 1485746598);
        setIntElement(term8928, 5, -1795307845);
        setField(term8926, term8926.getClass(), "mag", term8928);
        setIntField(term8926, term8926.getClass(), "bitCountPlusOne", 0);
        setIntField(term8926, term8926.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8926, term8926.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8926, term8926.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8925, term8925.getClass(), "intVal", term8926);
        setIntField(term8925, term8925.getClass(), "scale", 53);
        setIntField(term8925, term8925.getClass(), "precision", 0);
        setField(term8925, term8925.getClass(), "stringCache", null);
        setLongField(term8925, term8925.getClass(), "intCompact", -9223372036854775808L);
        setField(term8866, term8866.getClass(), "baseCurrencyAmount", term8925);
        setField(term8866, term8866.getClass(), "customerId", term8942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("space.gavinklfong.invest.forex.dtos.TradeAction");
        Object[] args = new Object[1];
        args[0] = enum24;
        callMethod(klass, "tradeAction", argTypes, term8866, args);
    }

};



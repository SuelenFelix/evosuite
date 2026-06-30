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

public class ForexTradeDeal_ForexTradeDealBuilder_dealRef_18434762912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6956;

    public ForexTradeDeal_ForexTradeDealBuilder_dealRef_18434762912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6957 = new Long(-4920224193275732920L);
        Double term7005 = new Double(0.3455959125047594);
        Class<? extends Object> term7077 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term7076 = ((Class) term7077).getDeclaredField((String) "SELL");
        ((Field) term7076).setAccessible(true);
        Object enum19 = ((Field) term7076).get((Object) null);
        Long term7032 = new Long(8428634514691209827L);
        term6956 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder"));
        Object term6971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6976 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7015 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term7016 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7018 = (int[]) newIntArray(6);
        setField(term6956, term6956.getClass(), "id", term6957);
        setField(term6956, term6956.getClass(), "dealRef", "kBdSllIBVz");
        setIntField(term6972, term6972.getClass(), "year", 2021);
        setShortField(term6972, term6972.getClass(), "month", (short) 1);
        setShortField(term6972, term6972.getClass(), "day", (short) 18);
        setField(term6971, term6971.getClass(), "date", term6972);
        setByteField(term6976, term6976.getClass(), "hour", (byte) 13);
        setByteField(term6976, term6976.getClass(), "minute", (byte) 38);
        setByteField(term6976, term6976.getClass(), "second", (byte) 26);
        setIntField(term6976, term6976.getClass(), "nano", 544608644);
        setField(term6971, term6971.getClass(), "time", term6976);
        setField(term6956, term6956.getClass(), "timestamp", term6971);
        setField(term6956, term6956.getClass(), "baseCurrency", "TJmVBGfTML");
        setField(term6956, term6956.getClass(), "counterCurrency", "tPlsykYBqO");
        setField(term6956, term6956.getClass(), "rate", term7005);
        setField(term6956, term6956.getClass(), "tradeAction", enum19);
        setIntField(term7016, term7016.getClass(), "signum", 1);
        setIntElement(term7018, 0, 190);
        setIntElement(term7018, 1, 842222845);
        setIntElement(term7018, 2, 1366336864);
        setIntElement(term7018, 3, -295316729);
        setIntElement(term7018, 4, 1173791667);
        setIntElement(term7018, 5, -522535689);
        setField(term7016, term7016.getClass(), "mag", term7018);
        setIntField(term7016, term7016.getClass(), "bitCountPlusOne", 0);
        setIntField(term7016, term7016.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7016, term7016.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7016, term7016.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7015, term7015.getClass(), "intVal", term7016);
        setIntField(term7015, term7015.getClass(), "scale", 51);
        setIntField(term7015, term7015.getClass(), "precision", 0);
        setField(term7015, term7015.getClass(), "stringCache", null);
        setLongField(term7015, term7015.getClass(), "intCompact", -9223372036854775808L);
        setField(term6956, term6956.getClass(), "baseCurrencyAmount", term7015);
        setField(term6956, term6956.getClass(), "customerId", term7032);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bLPjGVBhlX";
        callMethod(klass, "dealRef", argTypes, term6956, args);
    }

};



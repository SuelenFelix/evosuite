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

public class ForexTradeDeal_getId_3672540581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25938;

    public ForexTradeDeal_getId_3672540581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25939 = new Long(-9040825890007374809L);
        Double term25987 = new Double(0.9022041121474429);
        Class<? extends Object> term26047 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term26046 = ((Class) term26047).getDeclaredField((String) "SELL");
        ((Field) term26046).setAccessible(true);
        Object enum62 = ((Field) term26046).get((Object) null);
        Long term26014 = new Long(1368340889161782793L);
        term25938 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term25953 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25954 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25958 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25997 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term25998 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term26000 = (int[]) newIntArray(6);
        setField(term25938, term25938.getClass(), "id", term25939);
        setField(term25938, term25938.getClass(), "dealRef", "TXyHhqeCjR");
        setIntField(term25954, term25954.getClass(), "year", 2012);
        setShortField(term25954, term25954.getClass(), "month", (short) 9);
        setShortField(term25954, term25954.getClass(), "day", (short) 11);
        setField(term25953, term25953.getClass(), "date", term25954);
        setByteField(term25958, term25958.getClass(), "hour", (byte) 22);
        setByteField(term25958, term25958.getClass(), "minute", (byte) 10);
        setByteField(term25958, term25958.getClass(), "second", (byte) 8);
        setIntField(term25958, term25958.getClass(), "nano", 380008862);
        setField(term25953, term25953.getClass(), "time", term25958);
        setField(term25938, term25938.getClass(), "timestamp", term25953);
        setField(term25938, term25938.getClass(), "baseCurrency", "lZIgPZPgTu");
        setField(term25938, term25938.getClass(), "counterCurrency", "iuCxnHGMoW");
        setField(term25938, term25938.getClass(), "rate", term25987);
        setField(term25938, term25938.getClass(), "tradeAction", enum62);
        setIntField(term25998, term25998.getClass(), "signum", 1);
        setIntElement(term26000, 0, 7649);
        setIntElement(term26000, 1, 120641445);
        setIntElement(term26000, 2, -1986140741);
        setIntElement(term26000, 3, 1331770530);
        setIntElement(term26000, 4, -585745696);
        setIntElement(term26000, 5, 1596049471);
        setField(term25998, term25998.getClass(), "mag", term26000);
        setIntField(term25998, term25998.getClass(), "bitCountPlusOne", 0);
        setIntField(term25998, term25998.getClass(), "bitLengthPlusOne", 0);
        setIntField(term25998, term25998.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term25998, term25998.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term25997, term25997.getClass(), "intVal", term25998);
        setIntField(term25997, term25997.getClass(), "scale", 53);
        setIntField(term25997, term25997.getClass(), "precision", 0);
        setField(term25997, term25997.getClass(), "stringCache", null);
        setLongField(term25997, term25997.getClass(), "intCompact", -9223372036854775808L);
        setField(term25938, term25938.getClass(), "baseCurrencyAmount", term25997);
        setField(term25938, term25938.getClass(), "customerId", term26014);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term25938, args);
    }

};



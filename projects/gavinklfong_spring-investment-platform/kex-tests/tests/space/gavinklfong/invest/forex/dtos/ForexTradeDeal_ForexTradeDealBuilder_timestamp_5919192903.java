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

public class ForexTradeDeal_ForexTradeDealBuilder_timestamp_5919192903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7346;
     Object term7423;

    public ForexTradeDeal_ForexTradeDealBuilder_timestamp_5919192903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7347 = new Long(-2585684163342970173L);
        Double term7395 = new Double(0.5523635872663106);
        Class<? extends Object> term7464 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term7463 = ((Class) term7464).getDeclaredField((String) "BUY");
        ((Field) term7463).setAccessible(true);
        Object enum20 = ((Field) term7463).get((Object) null);
        Long term7421 = new Long(8059786003080744426L);
        term7346 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder"));
        Object term7361 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7362 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7366 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7404 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term7405 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7407 = (int[]) newIntArray(6);
        setField(term7346, term7346.getClass(), "id", term7347);
        setField(term7346, term7346.getClass(), "dealRef", "whBvTVIIlC");
        setIntField(term7362, term7362.getClass(), "year", 2015);
        setShortField(term7362, term7362.getClass(), "month", (short) 9);
        setShortField(term7362, term7362.getClass(), "day", (short) 19);
        setField(term7361, term7361.getClass(), "date", term7362);
        setByteField(term7366, term7366.getClass(), "hour", (byte) 9);
        setByteField(term7366, term7366.getClass(), "minute", (byte) 4);
        setByteField(term7366, term7366.getClass(), "second", (byte) 10);
        setIntField(term7366, term7366.getClass(), "nano", 401765865);
        setField(term7361, term7361.getClass(), "time", term7366);
        setField(term7346, term7346.getClass(), "timestamp", term7361);
        setField(term7346, term7346.getClass(), "baseCurrency", "IgRJUzaCwW");
        setField(term7346, term7346.getClass(), "counterCurrency", "JUmudUmaaV");
        setField(term7346, term7346.getClass(), "rate", term7395);
        setField(term7346, term7346.getClass(), "tradeAction", enum20);
        setIntField(term7405, term7405.getClass(), "signum", 1);
        setIntElement(term7407, 0, 4404);
        setIntElement(term7407, 1, 763521092);
        setIntElement(term7407, 2, 665076742);
        setIntElement(term7407, 3, 66292673);
        setIntElement(term7407, 4, 275037375);
        setIntElement(term7407, 5, 1545486489);
        setField(term7405, term7405.getClass(), "mag", term7407);
        setIntField(term7405, term7405.getClass(), "bitCountPlusOne", 0);
        setIntField(term7405, term7405.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7405, term7405.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7405, term7405.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7404, term7404.getClass(), "intVal", term7405);
        setIntField(term7404, term7404.getClass(), "scale", 52);
        setIntField(term7404, term7404.getClass(), "precision", 0);
        setField(term7404, term7404.getClass(), "stringCache", null);
        setLongField(term7404, term7404.getClass(), "intCompact", -9223372036854775808L);
        setField(term7346, term7346.getClass(), "baseCurrencyAmount", term7404);
        setField(term7346, term7346.getClass(), "customerId", term7421);
        term7423 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7424 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7428 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term7424, term7424.getClass(), "year", 2015);
        setShortField(term7424, term7424.getClass(), "month", (short) 4);
        setShortField(term7424, term7424.getClass(), "day", (short) 14);
        setField(term7423, term7423.getClass(), "date", term7424);
        setByteField(term7428, term7428.getClass(), "hour", (byte) 18);
        setByteField(term7428, term7428.getClass(), "minute", (byte) 24);
        setByteField(term7428, term7428.getClass(), "second", (byte) 32);
        setIntField(term7428, term7428.getClass(), "nano", 369233818);
        setField(term7423, term7423.getClass(), "time", term7428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term7423;
        callMethod(klass, "timestamp", argTypes, term7346, args);
    }

};



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

public class ForexTradeDeal_getBaseCurrency_10709252104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27038;

    public ForexTradeDeal_getBaseCurrency_10709252104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27039 = new Long(1215116475929634177L);
        Double term27087 = new Double(0.008025683154629148);
        Class<? extends Object> term27146 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term27145 = ((Class) term27146).getDeclaredField((String) "BUY");
        ((Field) term27145).setAccessible(true);
        Object enum65 = ((Field) term27145).get((Object) null);
        Long term27113 = new Long(1597484336218508869L);
        term27038 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term27053 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27054 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27058 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27096 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term27097 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term27099 = (int[]) newIntArray(6);
        setField(term27038, term27038.getClass(), "id", term27039);
        setField(term27038, term27038.getClass(), "dealRef", "RxbhrFBjkO");
        setIntField(term27054, term27054.getClass(), "year", 2017);
        setShortField(term27054, term27054.getClass(), "month", (short) 6);
        setShortField(term27054, term27054.getClass(), "day", (short) 8);
        setField(term27053, term27053.getClass(), "date", term27054);
        setByteField(term27058, term27058.getClass(), "hour", (byte) 0);
        setByteField(term27058, term27058.getClass(), "minute", (byte) 18);
        setByteField(term27058, term27058.getClass(), "second", (byte) 55);
        setIntField(term27058, term27058.getClass(), "nano", 680586717);
        setField(term27053, term27053.getClass(), "time", term27058);
        setField(term27038, term27038.getClass(), "timestamp", term27053);
        setField(term27038, term27038.getClass(), "baseCurrency", "aanyiAOJCl");
        setField(term27038, term27038.getClass(), "counterCurrency", "VDokbsCuqq");
        setField(term27038, term27038.getClass(), "rate", term27087);
        setField(term27038, term27038.getClass(), "tradeAction", enum65);
        setIntField(term27097, term27097.getClass(), "signum", 1);
        setIntElement(term27099, 0, 17);
        setIntElement(term27099, 1, 844956453);
        setIntElement(term27099, 2, -1392510658);
        setIntElement(term27099, 3, 845698942);
        setIntElement(term27099, 4, 222942389);
        setIntElement(term27099, 5, 492734931);
        setField(term27097, term27097.getClass(), "mag", term27099);
        setIntField(term27097, term27097.getClass(), "bitCountPlusOne", 0);
        setIntField(term27097, term27097.getClass(), "bitLengthPlusOne", 0);
        setIntField(term27097, term27097.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term27097, term27097.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term27096, term27096.getClass(), "intVal", term27097);
        setIntField(term27096, term27096.getClass(), "scale", 51);
        setIntField(term27096, term27096.getClass(), "precision", 0);
        setField(term27096, term27096.getClass(), "stringCache", null);
        setLongField(term27096, term27096.getClass(), "intCompact", -9223372036854775808L);
        setField(term27038, term27038.getClass(), "baseCurrencyAmount", term27096);
        setField(term27038, term27038.getClass(), "customerId", term27113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseCurrency", argTypes, term27038, args);
    }

};



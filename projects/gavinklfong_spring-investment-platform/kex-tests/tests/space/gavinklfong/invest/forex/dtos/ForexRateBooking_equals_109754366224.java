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

public class ForexRateBooking_equals_109754366224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23098;
     Object term23172;

    public ForexRateBooking_equals_109754366224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23099 = new Long(-8463029266761149071L);
        Double term23128 = new Double(0.32237559209193944);
        Class<? extends Object> term23194 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term23193 = ((Class) term23194).getDeclaredField((String) "SELL");
        ((Field) term23193).setAccessible(true);
        Object enum57 = ((Field) term23193).get((Object) null);
        Long term23170 = new Long(3133860696238261492L);
        term23098 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term23101 = newInstance(Class.forName("java.time.Instant"));
        Object term23138 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term23139 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term23141 = (int[]) newIntArray(6);
        Object term23167 = newInstance(Class.forName("java.time.Instant"));
        setField(term23098, term23098.getClass(), "id", term23099);
        setLongField(term23101, term23101.getClass(), "seconds", 1853963979L);
        setIntField(term23101, term23101.getClass(), "nanos", 281000000);
        setField(term23098, term23098.getClass(), "timestamp", term23101);
        setField(term23098, term23098.getClass(), "baseCurrency", "TweMFhxNdj");
        setField(term23098, term23098.getClass(), "counterCurrency", "NBrvVzvQHe");
        setField(term23098, term23098.getClass(), "rate", term23128);
        setField(term23098, term23098.getClass(), "tradeAction", enum57);
        setIntField(term23139, term23139.getClass(), "signum", 1);
        setIntElement(term23141, 0, 14436);
        setIntElement(term23141, 1, 1277115304);
        setIntElement(term23141, 2, 1896567034);
        setIntElement(term23141, 3, 629750953);
        setIntElement(term23141, 4, -70610838);
        setIntElement(term23141, 5, 186324175);
        setField(term23139, term23139.getClass(), "mag", term23141);
        setIntField(term23139, term23139.getClass(), "bitCountPlusOne", 0);
        setIntField(term23139, term23139.getClass(), "bitLengthPlusOne", 0);
        setIntField(term23139, term23139.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term23139, term23139.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term23138, term23138.getClass(), "intVal", term23139);
        setIntField(term23138, term23138.getClass(), "scale", 53);
        setIntField(term23138, term23138.getClass(), "precision", 0);
        setField(term23138, term23138.getClass(), "stringCache", null);
        setLongField(term23138, term23138.getClass(), "intCompact", -9223372036854775808L);
        setField(term23098, term23098.getClass(), "baseCurrencyAmount", term23138);
        setField(term23098, term23098.getClass(), "bookingRef", "FjOiNAfBOc");
        setLongField(term23167, term23167.getClass(), "seconds", 1795936337L);
        setIntField(term23167, term23167.getClass(), "nanos", 628000000);
        setField(term23098, term23098.getClass(), "expiryTime", term23167);
        setField(term23098, term23098.getClass(), "customerId", term23170);
        term23172 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23172;
        callMethod(klass, "equals", argTypes, term23098, args);
    }

};



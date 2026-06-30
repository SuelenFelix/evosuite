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
import java.lang.Double;
import java.lang.String;
import java.lang.Object;

public class ForexRateBooking_init_28782076129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24544;
     Object term24546;
     Object term24573;
     Object enum61;
     Object term24582;
     Object term24611;
     Object term24614;

    public ForexRateBooking_init_28782076129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24544 = new Long(-1832940336320585644L);
        term24546 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term24546, term24546.getClass(), "seconds", 1466008719L);
        setIntField(term24546, term24546.getClass(), "nanos", 289000000);
        term24573 = new Double(0.1544348383112728);
        Class<? extends Object> term24637 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term24636 = ((Class) term24637).getDeclaredField((String) "BUY");
        ((Field) term24636).setAccessible(true);
        enum61 = ((Field) term24636).get((Object) null);
        term24582 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term24583 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term24585 = (int[]) newIntArray(6);
        setIntField(term24583, term24583.getClass(), "signum", 1);
        setIntElement(term24585, 0, 62);
        setIntElement(term24585, 1, 1926050566);
        setIntElement(term24585, 2, 166138449);
        setIntElement(term24585, 3, -296190172);
        setIntElement(term24585, 4, 164104395);
        setIntElement(term24585, 5, -1791129947);
        setField(term24583, term24583.getClass(), "mag", term24585);
        setIntField(term24583, term24583.getClass(), "bitCountPlusOne", 0);
        setIntField(term24583, term24583.getClass(), "bitLengthPlusOne", 0);
        setIntField(term24583, term24583.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term24583, term24583.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term24582, term24582.getClass(), "intVal", term24583);
        setIntField(term24582, term24582.getClass(), "scale", 50);
        setIntField(term24582, term24582.getClass(), "precision", 0);
        setField(term24582, term24582.getClass(), "stringCache", null);
        setLongField(term24582, term24582.getClass(), "intCompact", -9223372036854775808L);
        term24611 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term24611, term24611.getClass(), "seconds", 1535838449L);
        setIntField(term24611, term24611.getClass(), "nanos", 65000000);
        term24614 = new Long(-8033714905181142681L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.time.Instant");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.Double");
        argTypes[5] = Class.forName("space.gavinklfong.invest.forex.dtos.TradeAction");
        argTypes[6] = Class.forName("java.math.BigDecimal");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.time.Instant");
        argTypes[9] = Class.forName("java.lang.Long");
        Object[] args = new Object[10];
        args[0] = term24544;
        args[1] = term24546;
        args[2] = "urCiQnUFBM";
        args[3] = "EKjQdtKxAM";
        args[4] = term24573;
        args[5] = enum61;
        args[6] = term24582;
        args[7] = "TXZAIPQJHt";
        args[8] = term24611;
        args[9] = term24614;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



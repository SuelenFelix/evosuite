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
import java.lang.Object;
import java.lang.String;
import java.lang.Long;

public class ForexRateBookingReq_init_125656447516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6268;
     Object enum17;
     Object term6292;

    public ForexRateBookingReq_init_125656447516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6268 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6269 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6271 = (int[]) newIntArray(6);
        setIntField(term6269, term6269.getClass(), "signum", 1);
        setIntElement(term6271, 0, 65188);
        setIntElement(term6271, 1, 1319681440);
        setIntElement(term6271, 2, -739534113);
        setIntElement(term6271, 3, -1337808284);
        setIntElement(term6271, 4, 786647436);
        setIntElement(term6271, 5, -1827169985);
        setField(term6269, term6269.getClass(), "mag", term6271);
        setIntField(term6269, term6269.getClass(), "bitCountPlusOne", 0);
        setIntField(term6269, term6269.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6269, term6269.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6269, term6269.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6268, term6268.getClass(), "intVal", term6269);
        setIntField(term6268, term6268.getClass(), "scale", 53);
        setIntField(term6268, term6268.getClass(), "precision", 0);
        setField(term6268, term6268.getClass(), "stringCache", null);
        setLongField(term6268, term6268.getClass(), "intCompact", -9223372036854775808L);
        Class<? extends Object> term6321 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term6320 = ((Class) term6321).getDeclaredField((String) "BUY");
        ((Field) term6320).setAccessible(true);
        enum17 = ((Field) term6320).get((Object) null);
        term6292 = new Long(-872011222785455006L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.math.BigDecimal");
        argTypes[3] = Class.forName("space.gavinklfong.invest.forex.dtos.TradeAction");
        argTypes[4] = Class.forName("java.lang.Long");
        Object[] args = new Object[5];
        args[0] = "dEnhdmILtU";
        args[1] = "hoicvmsovO";
        args[2] = term6268;
        args[3] = enum17;
        args[4] = term6292;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



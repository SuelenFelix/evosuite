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

public class ForexTradeDeal_init_208766242924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34087;
     Object term34101;
     Object term34135;
     Object enum84;
     Object term34144;
     Object term34161;

    public ForexTradeDeal_init_208766242924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34087 = new Long(5381386339318883012L);
        term34101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34106 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term34102, term34102.getClass(), "year", 2024);
        setShortField(term34102, term34102.getClass(), "month", (short) 4);
        setShortField(term34102, term34102.getClass(), "day", (short) 24);
        setField(term34101, term34101.getClass(), "date", term34102);
        setByteField(term34106, term34106.getClass(), "hour", (byte) 7);
        setByteField(term34106, term34106.getClass(), "minute", (byte) 2);
        setByteField(term34106, term34106.getClass(), "second", (byte) 51);
        setIntField(term34106, term34106.getClass(), "nano", 635502964);
        setField(term34101, term34101.getClass(), "time", term34106);
        term34135 = new Double(0.7636130748477434);
        Class<? extends Object> term34194 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term34193 = ((Class) term34194).getDeclaredField((String) "BUY");
        ((Field) term34193).setAccessible(true);
        enum84 = ((Field) term34193).get((Object) null);
        term34144 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term34145 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term34147 = (int[]) newIntArray(6);
        setIntField(term34145, term34145.getClass(), "signum", 1);
        setIntElement(term34147, 0, 1056);
        setIntElement(term34147, 1, -1348431746);
        setIntElement(term34147, 2, 1563452894);
        setIntElement(term34147, 3, 52960741);
        setIntElement(term34147, 4, 942359214);
        setIntElement(term34147, 5, 1116745735);
        setField(term34145, term34145.getClass(), "mag", term34147);
        setIntField(term34145, term34145.getClass(), "bitCountPlusOne", 0);
        setIntField(term34145, term34145.getClass(), "bitLengthPlusOne", 0);
        setIntField(term34145, term34145.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term34145, term34145.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term34144, term34144.getClass(), "intVal", term34145);
        setIntField(term34144, term34144.getClass(), "scale", 52);
        setIntField(term34144, term34144.getClass(), "precision", 0);
        setField(term34144, term34144.getClass(), "stringCache", null);
        setLongField(term34144, term34144.getClass(), "intCompact", -9223372036854775808L);
        term34161 = new Long(-1333707622307134180L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.time.LocalDateTime");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.Double");
        argTypes[6] = Class.forName("space.gavinklfong.invest.forex.dtos.TradeAction");
        argTypes[7] = Class.forName("java.math.BigDecimal");
        argTypes[8] = Class.forName("java.lang.Long");
        Object[] args = new Object[9];
        args[0] = term34087;
        args[1] = "QtrylgCLiF";
        args[2] = term34101;
        args[3] = "orEuhCStGM";
        args[4] = "HhEaSXWvrY";
        args[5] = term34135;
        args[6] = enum84;
        args[7] = term34144;
        args[8] = term34161;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



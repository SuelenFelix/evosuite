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

public class ForexTradeDealReq_init_39279355020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45431;
     Object enum115;
     Object term45440;
     Object term45457;

    public ForexTradeDealReq_init_39279355020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45431 = new Double(0.5657654165545906);
        Class<? extends Object> term45492 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term45491 = ((Class) term45492).getDeclaredField((String) "BUY");
        ((Field) term45491).setAccessible(true);
        enum115 = ((Field) term45491).get((Object) null);
        term45440 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term45441 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term45443 = (int[]) newIntArray(6);
        setIntField(term45441, term45441.getClass(), "signum", 1);
        setIntElement(term45443, 0, 2103);
        setIntElement(term45443, 1, -898138387);
        setIntElement(term45443, 2, -657389228);
        setIntElement(term45443, 3, -1900843118);
        setIntElement(term45443, 4, -1252508066);
        setIntElement(term45443, 5, 1196798517);
        setField(term45441, term45441.getClass(), "mag", term45443);
        setIntField(term45441, term45441.getClass(), "bitCountPlusOne", 0);
        setIntField(term45441, term45441.getClass(), "bitLengthPlusOne", 0);
        setIntField(term45441, term45441.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term45441, term45441.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term45440, term45440.getClass(), "intVal", term45441);
        setIntField(term45440, term45440.getClass(), "scale", 52);
        setIntField(term45440, term45440.getClass(), "precision", 0);
        setField(term45440, term45440.getClass(), "stringCache", null);
        setLongField(term45440, term45440.getClass(), "intCompact", -9223372036854775808L);
        term45457 = new Long(8863790908271299748L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDealReq");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Double");
        argTypes[3] = Class.forName("space.gavinklfong.invest.forex.dtos.TradeAction");
        argTypes[4] = Class.forName("java.math.BigDecimal");
        argTypes[5] = Class.forName("java.lang.Long");
        argTypes[6] = Class.forName("java.lang.String");
        Object[] args = new Object[7];
        args[0] = "mNHyqmOAFy";
        args[1] = "UxgSdhxPCH";
        args[2] = term45431;
        args[3] = enum115;
        args[4] = term45440;
        args[5] = term45457;
        args[6] = "DAujxZPHJC";
        Object instance = callConstructor(klass, argTypes, args);
    }

};



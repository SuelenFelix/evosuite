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

public class ForexTradeDeal_setRate_6592815615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31130;
     Object term31208;

    public ForexTradeDeal_setRate_6592815615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31131 = new Long(7489064039921396098L);
        Double term31179 = new Double(0.841460835734741);
        Class<? extends Object> term31241 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term31240 = ((Class) term31241).getDeclaredField((String) "SELL");
        ((Field) term31240).setAccessible(true);
        Object enum76 = ((Field) term31240).get((Object) null);
        Long term31206 = new Long(6843866297465638866L);
        term31130 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        Object term31145 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31150 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31189 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term31190 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term31192 = (int[]) newIntArray(6);
        setField(term31130, term31130.getClass(), "id", term31131);
        setField(term31130, term31130.getClass(), "dealRef", "BBXiTNHqGE");
        setIntField(term31146, term31146.getClass(), "year", 2027);
        setShortField(term31146, term31146.getClass(), "month", (short) 2);
        setShortField(term31146, term31146.getClass(), "day", (short) 19);
        setField(term31145, term31145.getClass(), "date", term31146);
        setByteField(term31150, term31150.getClass(), "hour", (byte) 17);
        setByteField(term31150, term31150.getClass(), "minute", (byte) 37);
        setByteField(term31150, term31150.getClass(), "second", (byte) 27);
        setIntField(term31150, term31150.getClass(), "nano", 920380537);
        setField(term31145, term31145.getClass(), "time", term31150);
        setField(term31130, term31130.getClass(), "timestamp", term31145);
        setField(term31130, term31130.getClass(), "baseCurrency", "IEYhJmgCVd");
        setField(term31130, term31130.getClass(), "counterCurrency", "KSJeYkkvpk");
        setField(term31130, term31130.getClass(), "rate", term31179);
        setField(term31130, term31130.getClass(), "tradeAction", enum76);
        setIntField(term31190, term31190.getClass(), "signum", 1);
        setIntElement(term31192, 0, 29163);
        setIntElement(term31192, 1, -367943220);
        setIntElement(term31192, 2, -1268770484);
        setIntElement(term31192, 3, -1631757095);
        setIntElement(term31192, 4, 1946902054);
        setIntElement(term31192, 5, 285170999);
        setField(term31190, term31190.getClass(), "mag", term31192);
        setIntField(term31190, term31190.getClass(), "bitCountPlusOne", 0);
        setIntField(term31190, term31190.getClass(), "bitLengthPlusOne", 0);
        setIntField(term31190, term31190.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term31190, term31190.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term31189, term31189.getClass(), "intVal", term31190);
        setIntField(term31189, term31189.getClass(), "scale", 53);
        setIntField(term31189, term31189.getClass(), "precision", 0);
        setField(term31189, term31189.getClass(), "stringCache", null);
        setLongField(term31189, term31189.getClass(), "intCompact", -9223372036854775808L);
        setField(term31130, term31130.getClass(), "baseCurrencyAmount", term31189);
        setField(term31130, term31130.getClass(), "customerId", term31206);
        term31208 = new Double(0.7859316615744082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term31208;
        callMethod(klass, "setRate", argTypes, term31130, args);
    }

};


